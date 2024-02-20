package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class OperacionesBDModelo {

    private final Connection conexion;

    public OperacionesBDModelo(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean ValidarCliente(Cliente cliente) throws SQLException {
        String consulta = "SELECT * FROM Cliente WHERE NroDocumento = ? AND Contrasena = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, cliente.getDocumentNumber());
            statement.setString(2, cliente.getPassword());

            ResultSet resultSet = statement.executeQuery();
            return resultSet.next(); // Devuelve true si hay al menos una fila (usuario y contraseña válidos)
        }
         catch (SQLException e) {
            System.out.println("Error SQL " + e);
            return false;
        }
    }

    public boolean isRegistrarPersonal(Personal personal) {

        try {
            // SQL para la inserción de datos
            String sql = "INSERT INTO personal (PrimerNombre,PrimerApellido,CorreoElectronico,TipoDocumento,NroDocumento,NroCelular,Contrasena,Genero,Tipo_Personal) VALUES (?,?,?,?,?,?,?,?,?)";

            int filasAfectadas;
            // Establecer los valores de los parámetros
            try ( // Crear la declaración preparada con parámetros
                    PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                // Establecer los valores de los parámetros
                preparedStatement.setString(1, personal.getFirstName());
                preparedStatement.setString(2, personal.getLastname());
                preparedStatement.setString(3, personal.getEmail());
                preparedStatement.setString(4, personal.getDocumentType());
                preparedStatement.setString(5, personal.getDocumentNumber());
                preparedStatement.setString(6, personal.getCellphoneNumber());
                preparedStatement.setString(7, personal.getPassword());
                preparedStatement.setString(8, personal.getGender());
                preparedStatement.setString(9, personal.getPersonalType());
                // Ejecutar la inserción
                filasAfectadas = preparedStatement.executeUpdate();
                // Cerrar la declaración preparada
            }

            // Verificar si se insertaron filas correctamente
            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println("Error SQL " + e);
            return false;
        }

    }

    public Cliente TraerDatosCliente(Cliente cliente) {
        Cliente usuarioLogeado = null;

        String consulta = "SELECT PrimerNombre, PrimerApellido, NroDocumento FROM cliente WHERE NroDocumento = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, cliente.getDocumentNumber());

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String primerNombre = resultSet.getString("PrimerNombre");
                String primerApellido = resultSet.getString("PrimerApellido");
                String numeroDocumento = resultSet.getString("NroDocumento");

                usuarioLogeado = new Cliente(primerNombre, primerApellido, numeroDocumento);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return usuarioLogeado;
    }

    public boolean Update(String Tabla, String Columna_Cambiar, String Columna_Referencia, String DatoActualizar, String DatoReferencia) {
        try {
            // SQL para la inserción de datos
            String sql = "UPDATE " + Tabla + " SET " + Columna_Cambiar + " = ? WHERE " + Columna_Referencia + " = ? ";

            int filasAfectadas;
            // Establecer los valores de los parámetros
            try ( // Crear la declaración preparada con parámetros
                    PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                // Establecer los valores de los parámetros
                preparedStatement.setString(1, DatoActualizar);
                preparedStatement.setString(2, DatoReferencia);
                // Ejecutar la inserción
                filasAfectadas = preparedStatement.executeUpdate();
                // Cerrar la declaración preparada
            }

            // Verificar si se insertaron filas correctamente
            return filasAfectadas > 0;

        } catch (SQLException e) {
            System.out.println("error SQL : " + e);
            return false;
        }
    }

    public String ValidarPersonal(Personal personal) throws SQLException {
        String tipoPersonal = null;
        String consulta = "SELECT Tipo_Personal FROM personal WHERE NroDocumento= ? AND Contrasena = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, personal.getDocumentNumber());
            statement.setString(2, personal.getPassword());

            try (ResultSet resultSet = statement.executeQuery()) {
                tipoPersonal = resultSet.next() ? resultSet.getString("Tipo_Personal") : null;
            }

        } 
        return tipoPersonal;
    }

    public ArrayList<String> RecuperarDatos(String columna, String consulta) throws SQLException {
        ArrayList<String> Datos = new ArrayList();
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Datos.add(resultSet.getString(columna));
            }
        }
        return Datos;
    }

    public ArrayList<String> traerColumnnaTipoProducto() throws SQLException {
        String consulta = "SELECT Tipo_Producto FROM tipo_producto";
        ArrayList<String> TipoProducto = new ArrayList<>();
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                TipoProducto.add(resultSet.getString("Tipo_Producto"));
            }
        }
        return TipoProducto;
    }

    public boolean OlvideContrasena(String usuario, String correo_celular) throws SQLException {
        String consulta = "SELECT * FROM Cliente WHERE NroDocumento = ? AND (NroCelular = ? OR CorreoElectronico = ?)";
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, usuario);
            statement.setString(2, correo_celular);
            statement.setString(3, correo_celular);

            ResultSet resultSet = statement.executeQuery();
            return resultSet.next(); // Devuelve true si hay al menos una fila (usuario y contraseña válidos)
        }
    }

    public String recuperarContrasena(String usuario) throws SQLException {

        String consulta = "SELECT * FROM Cliente WHERE NroDocumento = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, usuario);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String Contrasena = resultSet.getString("Contrasena");
                return Contrasena;
            }
        }

        return null;
    }

    public boolean isRegistrarCliente(Cliente cliente) {
        try {
            // SQL para la inserción de datos
            String sql = "INSERT INTO Cliente (PrimerNombre,PrimerApellido,CorreoElectronico,TipoDocumento,NroDocumento,NroCelular,Contrasena,Genero) VALUES (?,?,?,?,?,?,?,?)";

            int filasAfectadas;
            // Establecer los valores de los parámetros
            try ( // Crear la declaración preparada con parámetros
                    PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                // Establecer los valores de los parámetros
                preparedStatement.setString(1, cliente.getFirstName());
                preparedStatement.setString(2, cliente.getLastname());
                preparedStatement.setString(3, cliente.getEmail());
                preparedStatement.setString(4, cliente.getDocumentType());
                preparedStatement.setString(5, cliente.getDocumentNumber());
                preparedStatement.setString(6, cliente.getCellphoneNumber());
                preparedStatement.setString(7, cliente.getPassword());
                preparedStatement.setString(8, cliente.getGender());
                // Ejecutar la inserción
                filasAfectadas = preparedStatement.executeUpdate();
                // Cerrar la declaración preparada
            }

            // Verificar si se insertaron filas correctamente
            return filasAfectadas > 0;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean RegistrarCompra(String Id_Cliente, String Id_Vendedor, String Detalle, double Total) {
        try {
            // SQL para la inserción de datos
            String sql = "INSERT INTO Venta (Id_Cliente, Id_Vendedor, Detalle, Total) VALUES (?,?,?,?)";

            int filasAfectadas;
            // Establecer los valores de los parámetros
            try ( // Crear la declaración preparada con parámetros
                    PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                // Establecer los valores de los parámetros
                preparedStatement.setString(1, Id_Cliente);
                preparedStatement.setString(2, Id_Vendedor);
                preparedStatement.setString(3, Detalle);
                preparedStatement.setDouble(4, Total);
                // Ejecutar la inserción
                filasAfectadas = preparedStatement.executeUpdate();
                // Cerrar la declaración preparada
            }

            // Verificar si se insertaron filas correctamente
            return filasAfectadas > 0;

        } catch (SQLException e) {
            return false;
        }

    }

    public boolean isRegistrarProducto(Producto producto) {
        try {
            // SQL para la inserción de datos
            String sql = "INSERT INTO Producto (Id_Producto,Nombre_Producto,Tipo_Producto,Descripcion,Stock,PrecioUnitario) VALUES (?,?,?,?,?,?)";

            int filasAfectadas;
            // Establecer los valores de los parámetros
            try ( // Crear la declaración preparada con parámetros
                    PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                // Establecer los valores de los parámetros
                preparedStatement.setString(1, producto.getId_Producto());
                preparedStatement.setString(2, producto.getNombre_Producto());
                preparedStatement.setInt(3, producto.getIdTipoProducto());
                preparedStatement.setString(4, producto.getDescripcion());
                preparedStatement.setInt(5, producto.getStock());
                preparedStatement.setDouble(6, producto.getPrecio_Unitario());
                // Ejecutar la inserción
                filasAfectadas = preparedStatement.executeUpdate();
                // Cerrar la declaración preparada
            }

            // Verificar si se insertaron filas correctamente
            return filasAfectadas > 0;

        } catch (SQLException e) {
            return false;
        }
    }

    public boolean isActualizarProducto(Producto producto) {
        int filasAfectadas;
        String consulta = "UPDATE Producto SET Nombre_Producto=?, Tipo_Producto=?, Descripcion=?, Stock=? ,PrecioUnitario=? WHERE Id_Producto=?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {
            preparedStatement.setString(1, producto.getNombre_Producto());
            preparedStatement.setInt(2, producto.getIdTipoProducto());
            preparedStatement.setString(3, producto.getDescripcion());
            preparedStatement.setInt(4, producto.getStock());
            preparedStatement.setDouble(5, producto.getPrecio_Unitario());
            preparedStatement.setString(6, producto.getId_Producto());
            // Ejecutar la inserción
            filasAfectadas = preparedStatement.executeUpdate();
            // Cerrar la declaración preparada

            // Verificar si se insertaron filas correctamente
            return filasAfectadas > 0;
        } catch (SQLException ex) {
            System.out.println("Error SQL....." + ex);
            return false;
        }
    }

    public boolean isEliminarProducto(Producto producto) {
        int filasAfectadas;
        String consulta = "DELETE FROM Producto WHERE id_Producto= ? ";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {
            preparedStatement.setString(1, producto.getId_Producto());
            // Ejecutar la elminacion
            filasAfectadas = preparedStatement.executeUpdate();

            // Verificar si se eliminaron filas correctamente
            return filasAfectadas > 0;
        } catch (SQLException ex) {
            System.out.println("Error SQL....." + ex);
            return false;
        }

    }

    public ArrayList<Producto> LlenarTablaProducto() {
        String consulta = " SELECT id_Producto,tp.Tipo_Producto,Nombre_Producto,Descripcion,PrecioUnitario,Stock FROM Producto p INNER JOIN Tipo_Producto tp ON tp.Id_Tipo_Producto = p.Tipo_Producto";

        ArrayList<Producto> tablaProducto = new ArrayList();
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            ResultSet resultSet = statement.executeQuery(consulta);
            tablaProducto.removeAll(tablaProducto);
            while (resultSet.next()) {
                String Id_Producto = resultSet.getString("Id_Producto");
                String Tipo_Producto = resultSet.getString("Tipo_Producto");
                String Nombre_Producto = resultSet.getString("Nombre_Producto");
                String descripcion = resultSet.getString("Descripcion");
                double PrecioUnitario = resultSet.getDouble("PrecioUnitario");
                int stock = resultSet.getInt("Stock");
                tablaProducto.add(new Producto(Id_Producto, Nombre_Producto, Tipo_Producto, PrecioUnitario, descripcion, stock));
            }
        } catch (SQLException sqle) {
            System.out.println("Error SQL....." + sqle);
        }
        System.out.println(tablaProducto);
        return tablaProducto;
    }

    public ArrayList<Producto> LlenarProducto(String consulta) throws SQLException {
        ArrayList<Producto> RegistrarProducto = new ArrayList();
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            ResultSet resultSet = statement.executeQuery(consulta);
            RegistrarProducto.removeAll(RegistrarProducto);
            while (resultSet.next()) {
                String Id_Producto = resultSet.getString("Id_Producto");
                String Nombre_Producto = resultSet.getString("Nombre_Producto");
                String Tipo_Producto = resultSet.getString("Tipo_Producto");
                double PrecioUnitario = resultSet.getDouble("PrecioUnitario");
                RegistrarProducto.add(new Producto(Id_Producto, Nombre_Producto, Tipo_Producto, PrecioUnitario));
            }
        } catch (SQLException sqle) {
            System.out.println("Error SQL....." + sqle);
        }
        return RegistrarProducto;
    }

    public ArrayList<BuyHistory> LlenarHistorial(String consulta) throws SQLException {
        ArrayList<BuyHistory> RegistrarHistorial = new ArrayList();
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            ResultSet resultSet = statement.executeQuery(consulta);
            RegistrarHistorial.removeAll(RegistrarHistorial);
            while (resultSet.next()) {
                String Vendedor = resultSet.getString("Vendedor");
                String Detalle = resultSet.getString("Detalle");
                String Total = resultSet.getString("Total");
                String Fecha = resultSet.getString("Fecha");
                RegistrarHistorial.add(new BuyHistory(Vendedor, Detalle, Total, Fecha));
            }
        } catch (SQLException sqle) {
            System.out.println("Error SQL....." + sqle);
        }
        return RegistrarHistorial;
    }
    
    public void getUsuario(JTextField dni, JTextField nombre, JTextField apellido, JTextField numero){
        String consulta = "select PrimerNombre, PrimerApellido, NroCelular from Cliente where NroDocumento = " + dni.getText();
        try (PreparedStatement cs = conexion.prepareStatement(consulta);){
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                nombre.setText(rs.getString("PrimerNombre"));
                apellido.setText(rs.getString("PrimerApellido"));
                numero.setText(rs.getString("NroCelular"));
                dni.setEditable(false);
                nombre.setEditable(false);
                apellido.setEditable(false);
                numero.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado o no existente.");
                nombre.setText("");
                apellido.setText("");
                numero.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    
    public void getBuscarProducto(JTextField producto, JTextField nombre,JTextField cantidad, JTextField stock){
        String consulta = "select Nombre_Producto, Stock from Producto where Id_Producto= (?);";
        try (PreparedStatement cs = conexion.prepareStatement(consulta);){
            cs.setString(1, producto.getText().toString());
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                nombre.setText(rs.getString("Nombre_Producto"));
                stock.setText(rs.getString("Stock"));
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado o no existente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public ArrayList<Venta> llenarTablaVenta(JTextField producto, JTextField txtcantidad){
        String consulta = "select Nombre_Producto, Descripcion, Stock, PrecioUnitario from Producto where Id_Producto= ? ";
        ArrayList<Venta> tablaVenta = new ArrayList();
        
        try (PreparedStatement cs = conexion.prepareStatement(consulta)) {
            cs.setString(1, producto.getText());
            ResultSet rs = cs.executeQuery();
            tablaVenta.removeAll(tablaVenta);
            while (rs.next()) {
                String idProducto = producto.getText();
                String nombreProducto = rs.getString("Nombre_Producto");
                String descripcion = rs.getString("Descripcion");
                double precioUnitario = rs.getDouble("PrecioUnitario");
                int cantidad = Integer.parseInt(txtcantidad.getText());
                double total = precioUnitario * cantidad;
                tablaVenta.add(new Venta(idProducto, nombreProducto, descripcion, precioUnitario, cantidad, total));
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL " + ex);
        }
        return tablaVenta;
    }    
    
    public ArrayList<ArrayList<Object>> deTablaAArray(JTable table) {
        ArrayList<ArrayList<Object>> listaVenta = new ArrayList<>();

        for (int i = 0; i < table.getRowCount(); i++) {
            ArrayList<Object> rowList = new ArrayList<>();
            for (int j = 0; j < table.getColumnCount(); j++) {
                rowList.add(table.getValueAt(i, j));
            }
            listaVenta.add(rowList);
        }
        return listaVenta;
    }
    
    public void deArrayAMYSQL(ArrayList<ArrayList<Object>> listaVenta, JTextField cliente, int usuario) {
        String consulta = "insert into Venta(Id_Cliente, Id_Vendedor, Detalle,Total) values (?, ?, ?, ?)";
        try(PreparedStatement st = conexion.prepareStatement(consulta)){
            for (ArrayList<Object> fila : listaVenta) {
                // Establecer los parámetros de la consulta
                st.setInt(1, Integer.parseInt(cliente.getText()));
                st.setInt(2, usuario);
                st.setString(3, (String) fila.get(2));
                st.setDouble(4, (double) fila.get(5));
                st.executeUpdate();
            }
        } catch (SQLException ex) {
             System.out.println("Error: " + ex);
        }
    }
    
    public void cambiarStock(int stock, String producto){
        String consulta = "update Producto set Stock = Stock - ? where Id_Producto = ?";
        try (PreparedStatement ps = conexion.prepareStatement(consulta)) {
            ps.setInt(1, stock);
            ps.setString(2,producto);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
    }
    
    
}


