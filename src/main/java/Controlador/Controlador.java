package Controlador;

import interfaces.DecisionAdministrador;
import interfaces.Login;
import interfaces.UserShopping;
import interfaces.RecordSales;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.BuyHistory;
import modelo.ModeloConexion;
import modelo.OperacionesBDModelo;
import modelo.Producto;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Personal;

public class Controlador {

    private final ModeloConexion modeloConexion;
    private final OperacionesBDModelo operacionesBDModelo;

    public Controlador(ModeloConexion modeloConexion) {
        this.modeloConexion = modeloConexion;
        this.operacionesBDModelo = new OperacionesBDModelo(modeloConexion.getConexion());
    }

    public void iniciar() {
        modeloConexion.establecerConexion();
        SwingUtilities.invokeLater(() -> {
            Login login = new Login(new Controlador(modeloConexion));
            login.setVisible(true);
            login.setLocationRelativeTo(null);
        });
    }

    public void iniciarSesion(Cliente cliente, Personal personal) {
        try {
            if(operacionesBDModelo.ValidarCliente(cliente)||operacionesBDModelo.ValidarPersonal(personal)!=null){
                Login.cerrarVentanalogin();
            if (operacionesBDModelo.ValidarCliente(cliente)) {
                Cliente clienteLogeado = operacionesBDModelo.TraerDatosCliente(cliente);
                UserShopping CompraUsuario = new UserShopping(new Controlador(modeloConexion), clienteLogeado);
                CompraUsuario.setVisible(true);
                CompraUsuario.setLocationRelativeTo(null);
                
                
            } else if ((operacionesBDModelo.ValidarPersonal(personal)).equals("Vendedor")) {
                RecordSales RecordSales = new RecordSales(new Controlador(modeloConexion), Integer.parseInt(personal.getDocumentNumber()));
                RecordSales.setVisible(true);
                RecordSales.setLocationRelativeTo(null);
                
            } else if (operacionesBDModelo.ValidarPersonal(personal).equals("Gerente")) {
                DecisionAdministrador decisionAdministrador = new DecisionAdministrador(new Controlador(modeloConexion));
                decisionAdministrador.setVisible(true);
                decisionAdministrador.setLocationRelativeTo(null);
                
            } }
            else{
             JOptionPane.showMessageDialog(null, "Contrasena o usuario Incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);   
             Login.mantenerAbiertaVentanalogin();            
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
    }

    public void RegistrarCliente(Cliente cliente) {
        if (operacionesBDModelo.isRegistrarCliente(cliente)) {
            JOptionPane.showMessageDialog(null, "Cliente Exitosamente Creado");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo crear el usuario");
        }
    }

    public void registrarEmpleado(Personal personal) {
        if (operacionesBDModelo.isRegistrarPersonal(personal)) {
            JOptionPane.showMessageDialog(null, "Empleado Exitosamente Creado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No Se Pudo Crear el empleado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Compra(String Id_Cliente, String Id_Vendedor, String Detalle, double Total) {
        if (operacionesBDModelo.RegistrarCompra(Id_Cliente, Id_Vendedor, Detalle, Total)) {
            JOptionPane.showMessageDialog(null, "Gracias por su Compra");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la Compra");
        }
    }

    public void Actualizar(String Tabla, String Columna_Cambiar, String Columna_Referencia, String DatoActualizar, String DatoReferencia) {
        if (operacionesBDModelo.Update(Tabla, Columna_Cambiar, Columna_Referencia, DatoActualizar, DatoReferencia)) {
            System.out.println("Se actualizaron los datos");
        } else {
            System.out.println("Error :(");
        }
    }

    public void recuperarCuenta(String usuario, String correo_celular) {
        try {
            if (operacionesBDModelo.OlvideContrasena(usuario, correo_celular)) {
                JOptionPane.showMessageDialog(null, "Tu contrasena es " + String.valueOf(operacionesBDModelo.recuperarContrasena(usuario)));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
    }

    public ArrayList<String> VerDatos(String columna, String consulta) throws SQLException {
        return operacionesBDModelo.RecuperarDatos(columna, consulta);
    }

    public ArrayList<Producto> VerProducto(String consulta) throws SQLException {
        return operacionesBDModelo.LlenarProducto(consulta);
    }

    public ArrayList<BuyHistory> VerHistorial(String consulta) throws SQLException {
        return operacionesBDModelo.LlenarHistorial(consulta);
    }

    public ArrayList<String> llenarDatosComboBoxtipoProducto() throws SQLException {
        return operacionesBDModelo.traerColumnnaTipoProducto();
    }

    //OPERACIONES PRODUCTO
    public void traerDatosTablaProductos(DefaultTableModel modelo, JTable tblProducto) {

        modelo.setRowCount(0);

        modelo.setColumnIdentifiers(new String[]{"Codigo", "Tipo Producto", "Nombre Producto", "Descripcion", "Precio", "Stock"});
        tblProducto.setModel(modelo);

        try {
            operacionesBDModelo.LlenarTablaProducto().forEach(producto
                    -> modelo.addRow(new Object[]{producto.getId_Producto(), producto.getTipo_Producto(),
                producto.getNombre_Producto(), producto.getDescripcion(),
                producto.getPrecio_Unitario(), producto.getStock()})
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al llenar JTable: " + e);
        }
    }

    public void registrerProduct(Producto producto) {
        if (operacionesBDModelo.isRegistrarProducto(producto)) {
            JOptionPane.showMessageDialog(null, "Se Registro Exitosamente el Producto", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Registrar el Producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarProducto(Producto producto) {
        if (operacionesBDModelo.isActualizarProducto(producto)) {
            JOptionPane.showMessageDialog(null, "Se Actualizo Exitosamente el Producto", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Actualizar el Producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarProducto(Producto producto) {

        if (operacionesBDModelo.isEliminarProducto(producto)) {
            JOptionPane.showMessageDialog(null, "Se Elimino Exitosamente el Producto", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo Eliminar el Producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void getBuscarDatosUsuario(JTextField dni, JTextField nombre, JTextField apellido, JTextField numero){
        operacionesBDModelo.getUsuario(dni, nombre, apellido, numero);
    }
    
    public void getBuscarDatosProducto(JTextField prodcuto, JTextField nombre,JTextField cantidad ,JTextField stock){
        operacionesBDModelo.getBuscarProducto(prodcuto, nombre, cantidad, stock);
    }
    
    public void agregarTablaVenta(DefaultTableModel modelo, JTable tabla, JTextField producto,JTextField txtcantidad) {
        modelo.setColumnIdentifiers(new String[]{"ID","Nombre","Descripcion","Precio U.","Cantidad","Total"});
        tabla.setModel(modelo);
        
        try {
            operacionesBDModelo.llenarTablaVenta(producto, txtcantidad).forEach(venta ->
                modelo.addRow(new Object[]{venta.getIdProducto(), venta.getNombreProducto(), venta.getDescripcion(),
                    venta.getPrecioUnitario(), venta.getCantidad(), venta.getTotal()})
            );
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void registrarVenta(JTable tabla, JTextField cliente, int usuario) {
        System.out.println(operacionesBDModelo.deTablaAArray(tabla));
        operacionesBDModelo.deArrayAMYSQL(operacionesBDModelo.deTablaAArray(tabla), cliente, usuario);
    }
    
    public void actualizarStock(int stock, String producto){
        operacionesBDModelo.cambiarStock(stock, producto);
    }
}
