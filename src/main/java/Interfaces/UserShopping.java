package interfaces;

import Controlador.Controlador;
import modelo.Producto;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public final class UserShopping extends javax.swing.JFrame {

    private final Controlador controlador;
    private final SpinnerModel Main = new SpinnerNumberModel(0, 0, 0, 0);
    private final DefaultTableModel modelo = new DefaultTableModel();
    private final DecimalFormat df = new DecimalFormat("###.##");
    private final Cliente cliente;

    public UserShopping(Controlador controlador, Cliente cliente) {
        initComponents();
        this.controlador = controlador;
        this.cliente = cliente;
        setLocationRelativeTo(null);
        setTitle("Cassiel EIRL - Interfaz de Compra");
        CogerDatos();
        ObtenerUsuario();
        boxProducto.setEnabled(false);
        spnCantidad.setModel(Main);
        LlenarColumnas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JLabel();
        btnComprar = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JLabel();
        btnComprar2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();
        FondoEliminar = new javax.swing.JLabel();
        FondoAgregar = new javax.swing.JLabel();
        FondoComprar2 = new javax.swing.JLabel();
        FondoRegistro = new javax.swing.JLabel();
        FondoPerfil = new javax.swing.JLabel();
        FondoCerrarSesion = new javax.swing.JLabel();
        FondoComprar = new javax.swing.JLabel();
        Fondo_Agregar = new javax.swing.JPanel();
        Fondo_Eliminar = new javax.swing.JPanel();
        Fondo_Comprar2 = new javax.swing.JPanel();
        Fondo_Registro = new javax.swing.JPanel();
        Fondo_Comprar = new javax.swing.JPanel();
        Fondo_Perfil = new javax.swing.JPanel();
        BarraVertical = new javax.swing.JPanel();
        Fondo_CerrarSesion = new javax.swing.JPanel();
        Seleccion = new javax.swing.JPanel();
        boxTipoProducto = new javax.swing.JComboBox<>();
        boxProducto = new javax.swing.JComboBox<>();
        spnCantidad = new javax.swing.JSpinner();
        txtCarrito = new javax.swing.JLabel();
        txtDetalleProducto = new javax.swing.JLabel();
        txtStock = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        Fondo_Cantidad = new javax.swing.JLabel();
        Fondo_Stock = new javax.swing.JLabel();
        Fondo_Precio = new javax.swing.JLabel();
        Fondo_DetalleProducto = new javax.swing.JLabel();
        Detalle = new javax.swing.JPanel();
        txtSubTotal = new javax.swing.JLabel();
        txtIGV = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        Fondo_SubTotal = new javax.swing.JLabel();
        Fondo_IGV = new javax.swing.JLabel();
        Fondo_Total = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        Imagen = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JLabel();
        txtNroDocumento = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(845, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        btnPerfil.setBackground(new java.awt.Color(0, 0, 0));
        btnPerfil.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPerfil.setText("Perfil");
        jPanel1.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, 35));

        btnComprar.setBackground(new java.awt.Color(0, 0, 0));
        btnComprar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnComprar.setText("Comprar");
        jPanel1.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 235, 100, 35));

        btnCerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 465, 120, 35));

        btnRegistro.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistro.setText("Registro");
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, 35));

        btnComprar2.setBackground(new java.awt.Color(0, 0, 0));
        btnComprar2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnComprar2.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnComprar2.setText("Comprar");
        btnComprar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprar2MouseClicked(evt);
            }
        });
        jPanel1.add(btnComprar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 465, 120, 35));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 345, 120, 35));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 405, 120, 35));

        FondoEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_Gradient02.png"))); // NOI18N
        jPanel1.add(FondoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 405, -1, -1));

        FondoAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_Gradient02.png"))); // NOI18N
        jPanel1.add(FondoAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 345, -1, -1));

        FondoComprar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_Gradient02.png"))); // NOI18N
        jPanel1.add(FondoComprar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 465, -1, -1));

        FondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_Gradient01.png"))); // NOI18N
        jPanel1.add(FondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        FondoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_Gradient01.png"))); // NOI18N
        jPanel1.add(FondoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        FondoCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_Gradient02.png"))); // NOI18N
        jPanel1.add(FondoCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 465, -1, -1));

        FondoComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_Gradient01.png"))); // NOI18N
        jPanel1.add(FondoComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 235, -1, -1));

        Fondo_Agregar.setBackground(new java.awt.Color(255, 255, 255));
        Fondo_Agregar.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Fondo_AgregarLayout = new javax.swing.GroupLayout(Fondo_Agregar);
        Fondo_Agregar.setLayout(Fondo_AgregarLayout);
        Fondo_AgregarLayout.setHorizontalGroup(
            Fondo_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        Fondo_AgregarLayout.setVerticalGroup(
            Fondo_AgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Fondo_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 340, 130, 45));

        Fondo_Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        Fondo_Eliminar.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Fondo_EliminarLayout = new javax.swing.GroupLayout(Fondo_Eliminar);
        Fondo_Eliminar.setLayout(Fondo_EliminarLayout);
        Fondo_EliminarLayout.setHorizontalGroup(
            Fondo_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        Fondo_EliminarLayout.setVerticalGroup(
            Fondo_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Fondo_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 400, 130, 45));

        Fondo_Comprar2.setBackground(new java.awt.Color(255, 255, 255));
        Fondo_Comprar2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Fondo_Comprar2Layout = new javax.swing.GroupLayout(Fondo_Comprar2);
        Fondo_Comprar2.setLayout(Fondo_Comprar2Layout);
        Fondo_Comprar2Layout.setHorizontalGroup(
            Fondo_Comprar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        Fondo_Comprar2Layout.setVerticalGroup(
            Fondo_Comprar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Fondo_Comprar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 460, 130, 45));

        Fondo_Registro.setBackground(new java.awt.Color(255, 255, 255));
        Fondo_Registro.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Fondo_RegistroLayout = new javax.swing.GroupLayout(Fondo_Registro);
        Fondo_Registro.setLayout(Fondo_RegistroLayout);
        Fondo_RegistroLayout.setHorizontalGroup(
            Fondo_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        Fondo_RegistroLayout.setVerticalGroup(
            Fondo_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Fondo_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 295, 110, 45));

        Fondo_Comprar.setBackground(new java.awt.Color(255, 255, 255));
        Fondo_Comprar.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Fondo_ComprarLayout = new javax.swing.GroupLayout(Fondo_Comprar);
        Fondo_Comprar.setLayout(Fondo_ComprarLayout);
        Fondo_ComprarLayout.setHorizontalGroup(
            Fondo_ComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        Fondo_ComprarLayout.setVerticalGroup(
            Fondo_ComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Fondo_Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 230, 110, 45));

        Fondo_Perfil.setBackground(new java.awt.Color(255, 255, 255));
        Fondo_Perfil.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Fondo_PerfilLayout = new javax.swing.GroupLayout(Fondo_Perfil);
        Fondo_Perfil.setLayout(Fondo_PerfilLayout);
        Fondo_PerfilLayout.setHorizontalGroup(
            Fondo_PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        Fondo_PerfilLayout.setVerticalGroup(
            Fondo_PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Fondo_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 165, 110, 45));

        javax.swing.GroupLayout BarraVerticalLayout = new javax.swing.GroupLayout(BarraVertical);
        BarraVertical.setLayout(BarraVerticalLayout);
        BarraVerticalLayout.setHorizontalGroup(
            BarraVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        BarraVerticalLayout.setVerticalGroup(
            BarraVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(BarraVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 2, 500));

        Fondo_CerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        Fondo_CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Fondo_CerrarSesionLayout = new javax.swing.GroupLayout(Fondo_CerrarSesion);
        Fondo_CerrarSesion.setLayout(Fondo_CerrarSesionLayout);
        Fondo_CerrarSesionLayout.setHorizontalGroup(
            Fondo_CerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        Fondo_CerrarSesionLayout.setVerticalGroup(
            Fondo_CerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel1.add(Fondo_CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 460, 130, 45));

        Seleccion.setBackground(new java.awt.Color(255, 255, 255));
        Seleccion.setForeground(new java.awt.Color(255, 255, 255));
        Seleccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Producto" }));
        boxTipoProducto.setMinimumSize(new java.awt.Dimension(160, 35));
        boxTipoProducto.setPreferredSize(new java.awt.Dimension(160, 35));
        boxTipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoProductoActionPerformed(evt);
            }
        });
        Seleccion.add(boxTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        boxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el Producto" }));
        boxProducto.setPreferredSize(new java.awt.Dimension(160, 35));
        boxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxProductoActionPerformed(evt);
            }
        });
        Seleccion.add(boxProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        spnCantidad.setOpaque(false);
        Seleccion.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 35));

        txtCarrito.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtCarrito.setText("Carrito de Compra");
        Seleccion.add(txtCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtDetalleProducto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDetalleProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDetalleProducto.setText("Descripcion:");
        Seleccion.add(txtDetalleProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 100, 410, 35));

        txtStock.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtStock.setText("Stock: 0 uds.");
        Seleccion.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 120, 35));

        txtPrecio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio.setText("Precio: S/0.00");
        Seleccion.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 50, 120, 35));

        txtCantidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCantidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCantidad.setText("Cantidad:");
        Seleccion.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, 155, 35));

        Fondo_Cantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_Cantidad.setToolTipText("");
        Seleccion.add(Fondo_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        Fondo_Stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_Stock.setToolTipText("");
        Seleccion.add(Fondo_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 120, -1));

        Fondo_Precio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_Precio.setToolTipText("");
        Seleccion.add(Fondo_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 50, 120, -1));

        Fondo_DetalleProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Shipping_Gradient01.png"))); // NOI18N
        Fondo_DetalleProducto.setToolTipText("");
        Seleccion.add(Fondo_DetalleProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 415, -1));

        jPanel1.add(Seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 625, 155));

        Detalle.setBackground(new java.awt.Color(255, 255, 255));
        Detalle.setForeground(new java.awt.Color(255, 255, 255));
        Detalle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSubTotal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSubTotal.setText("SubTotal: S/0.00");
        Detalle.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 280, 140, 35));

        txtIGV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtIGV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtIGV.setText("IGV: S/0.00");
        Detalle.add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 140, 35));

        txtTotal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotal.setText("Total: S/0.00");
        Detalle.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 280, 140, 35));

        Fondo_SubTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_SubTotal.setToolTipText("");
        Detalle.add(Fondo_SubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 145, -1));

        Fondo_IGV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_IGV.setToolTipText("");
        Detalle.add(Fondo_IGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 145, -1));

        Fondo_Total.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_Total.setToolTipText("");
        Detalle.add(Fondo_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 280, 145, -1));

        tableProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int col){
                return false;
            }
        };
        tableProductos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableProductos);

        Detalle.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 475, 270));

        jPanel1.add(Detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 195, 475, 325));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CarShop.png"))); // NOI18N
        jPanel1.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 195, -1, -1));

        txtPrimerApellido.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPrimerApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrimerApellido.setText("Primer Apellido");
        jPanel1.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 418, 130, -1));

        txtNroDocumento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtNroDocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNroDocumento.setText("Nro. Documento");
        jPanel1.add(txtNroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 360, 130, -1));

        txtPrimerNombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPrimerNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrimerNombre.setText("Primer Nombre");
        jPanel1.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 390, 130, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_Background.png"))); // NOI18N
        Background.setPreferredSize(new java.awt.Dimension(845, 540));
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 845, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxTipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoProductoActionPerformed
        boxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Seleccione el Producto"}));
        boxProducto.setEnabled(false);
        txtStock.setText("Stock: 0 uds.");
        txtPrecio.setText("Precio: S/0.00");
        txtDetalleProducto.setText("Descripcion:");
        spnCantidad.setModel(Main);
        if (!(boxTipoProducto.getSelectedItem().equals("Tipo de Producto"))) {
            boxProducto.setEnabled(true);
            try {
                ArrayList<String> Productos = controlador.VerDatos("Nombre_Producto", "select Id_Producto, Nombre_Producto, tp.Tipo_Producto, Stock, PrecioUnitario from Producto p inner join Tipo_Producto tp on tp.Id_Tipo_Producto = p.Tipo_Producto where tp.Tipo_Producto = '" + boxTipoProducto.getSelectedItem() + "'");
                if (!Productos.isEmpty()) {
                    Productos.forEach(boxProducto::addItem);
                } else {
                    boxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Sin producto disponible"}));
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserShopping.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_boxTipoProductoActionPerformed

    private void boxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxProductoActionPerformed
        if (!(boxProducto.getSelectedItem().equals("Seleccione el Producto")) && !(boxProducto.getSelectedItem().equals("Sin producto disponible"))) {
            boxProducto.setEnabled(true);
            try {
                ArrayList<String> Stock = controlador.VerDatos("Stock", "select Stock from Producto where Nombre_Producto = '" + boxProducto.getSelectedItem() + "'");
                ArrayList<String> Precio = controlador.VerDatos("PrecioUnitario", "select PrecioUnitario from Producto where Nombre_Producto = '" + boxProducto.getSelectedItem() + "'");
                ArrayList<String> Descripcion = controlador.VerDatos("Descripcion", "select Descripcion from Producto where Nombre_Producto = '" + boxProducto.getSelectedItem() + "'");
                if ((!Stock.isEmpty()) && (!Precio.isEmpty())) {
                    for (String Disponibilidad : Stock) {
                        txtStock.setText("Stock: " + Disponibilidad + " uds.");
                        if (Integer.parseInt(Disponibilidad) > 0) {
                            SpinnerModel Modelo = new SpinnerNumberModel(1, 1, Integer.parseInt(Disponibilidad), 1);
                            spnCantidad.setModel(Modelo);
                        } else {
                            spnCantidad.setModel(Main);
                        }
                    }
                    for (String Costo : Precio) {
                        txtPrecio.setText("Precio: S/" + Costo);
                    }
                    for (String Detalle : Descripcion) {
                        txtDetalleProducto.setText("Descripcion: " + Detalle);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserShopping.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            txtStock.setText("Stock: 0 uds.");
            txtPrecio.setText("Precio: S/0.00");
            txtDetalleProducto.setText("Descripcion:");
            spnCantidad.setModel(Main);
        }
    }//GEN-LAST:event_boxProductoActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        if (!(txtStock.getText().equals("Stock: 0 uds."))) {
            ArrayList<String> Existentes = new ArrayList();
            int i;
            for (i = 0; i < tableProductos.getRowCount(); i++) {
                Existentes.add(String.valueOf(tableProductos.getValueAt(i, 1)));
            }
            if (Existentes.contains(String.valueOf(boxProducto.getSelectedItem()))) {
                JOptionPane.showMessageDialog(null, "Elemento ya existente en tu lista");
            } else {
                try {
                    Integer Cantidad = (Integer) spnCantidad.getValue();

                    for (Producto DatoNivel : controlador.VerProducto("SELECT Id_Producto, Nombre_Producto, tp.Tipo_Producto, PrecioUnitario FROM Producto p INNER JOIN Tipo_Producto tp ON p.Tipo_Producto = tp.Id_Tipo_Producto WHERE Nombre_Producto ='" + boxProducto.getSelectedItem() + "'")) {
                        modelo.addRow(new Object[]{DatoNivel.getId_Producto(),
                            DatoNivel.getNombre_Producto(),
                            DatoNivel.getTipo_Producto(),
                            Cantidad,
                            DatoNivel.getPrecio_Unitario(),
                            Double.valueOf(df.format(Cantidad * DatoNivel.getPrecio_Unitario()))
                        });
                    }
                    tableProductos.setModel(modelo);
                } catch (NumberFormatException | SQLException sqle) {
                    JOptionPane.showMessageDialog(null, "Error llenar JTable " + sqle);
                }

                double Total = 0;
                int filas = tableProductos.getRowCount();
                for (i = 0; i < filas; i++) {
                    double valor = (Double) tableProductos.getValueAt(i, 5);
                    Total += valor;
                }
                txtSubTotal.setText("SubTotal: S/" + String.valueOf(df.format(Total * 0.82)));
                txtIGV.setText("IGV: S/" + String.valueOf(df.format(Total * 0.18)));
                txtTotal.setText("Total: S/" + String.valueOf(df.format(Total)));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay stock disponible");
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (tableProductos.getSelectedRow() >= 0) {
            modelo.removeRow(tableProductos.getSelectedRow());
            tableProductos.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún elemento");
        }

        double Total = 0;
        int filas = tableProductos.getRowCount();

        for (int i = 0; i < filas; i++) {
            double valor = (Double) tableProductos.getValueAt(i, 5);
            Total += valor;
        }
        txtSubTotal.setText("SubTotal: S/" + String.valueOf(Total * 0.82));
        txtIGV.setText("IGV: S/" + String.valueOf(Total * 0.18));
        txtTotal.setText("Total: S/" + String.valueOf(Total));
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        Login LogIn = new Login(controlador);
        LogIn.setVisible(true);
        LogIn.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnComprar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar2MouseClicked
        int filas = tableProductos.getRowCount();
        if (filas > 0) {
            String Id_Cliente = cliente.getDocumentNumber();
            double Total = 0;
            String Id_Vendedor = "1072710136";
            String Detalle = "";
            int i;
            for (i = 0; i < filas; i++) {
                String Stock = "";
                int j;
                for (j = 0; j < txtStock.getText().length(); j++) {
                    if (Character.isDigit(txtStock.getText().charAt(j))) {
                        Stock += txtStock.getText().charAt(j);
                    }
                }
                Detalle += String.valueOf(tableProductos.getValueAt(i, 0)) + " * " + String.valueOf(tableProductos.getValueAt(i, 3));
                Total += Double.parseDouble(String.valueOf(tableProductos.getValueAt(i, 5)));
                controlador.Actualizar("Producto", "Stock", "Id_Producto", String.valueOf(Integer.parseInt(Stock) - Integer.parseInt(String.valueOf(tableProductos.getValueAt(i, 3)))), String.valueOf(tableProductos.getValueAt(i, 0)));
                if (i != (filas - 1)) {
                    Detalle += "; ";
                }
            }
            controlador.Compra(Id_Cliente, Id_Vendedor, Detalle, Total);
            modelo.setRowCount(0);
            txtStock.setText("Stock: 0 uds.");
            txtPrecio.setText("Precio: S/0.00");
            txtDetalleProducto.setText("Descripcion:");
            tableProductos.setModel(modelo);
            spnCantidad.setModel(Main);
            txtSubTotal.setText("SubTotal: S/0.00");
            txtTotal.setText("Total: S/0.00");
            txtIGV.setText("IGV: S/0.00");
            boxTipoProducto.setSelectedIndex(0);
            boxProducto.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha registrado ningun artículo");
        }
    }//GEN-LAST:event_btnComprar2MouseClicked

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked
        UserHistory HistorialUsuario = new UserHistory(controlador, cliente);
        HistorialUsuario.setVisible(true);
        HistorialUsuario.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnRegistroMouseClicked

    public void CogerDatos() {
        try {
            ArrayList<String> Tipo_Producto = controlador.VerDatos("Tipo_Producto", "SELECT Tipo_Producto FROM Tipo_Producto");
            for (String Tipos : Tipo_Producto) {
                boxTipoProducto.addItem(Tipos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserShopping.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void LlenarColumnas() {
        ArrayList<Object> nombreColumna = new ArrayList<>(Arrays.asList(
                "ID PRODUCTO", "NOMBRE PRODUCTO", "TIPO PRODUCTO", "CANTIDAD", "PRECIO UNITARIO", "TOTAL"
        ));
        nombreColumna.forEach(modelo::addColumn);
        tableProductos.setModel(modelo);
    }

    public void ObtenerUsuario() {
        txtPrimerNombre.setText(cliente.getFirstName());
        txtPrimerApellido.setText(cliente.getLastname());
        txtNroDocumento.setText(cliente.getDocumentNumber());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel BarraVertical;
    private javax.swing.JPanel Detalle;
    private javax.swing.JLabel FondoAgregar;
    private javax.swing.JLabel FondoCerrarSesion;
    private javax.swing.JLabel FondoComprar;
    private javax.swing.JLabel FondoComprar2;
    private javax.swing.JLabel FondoEliminar;
    private javax.swing.JLabel FondoPerfil;
    private javax.swing.JLabel FondoRegistro;
    private javax.swing.JPanel Fondo_Agregar;
    private javax.swing.JLabel Fondo_Cantidad;
    private javax.swing.JPanel Fondo_CerrarSesion;
    private javax.swing.JPanel Fondo_Comprar;
    private javax.swing.JPanel Fondo_Comprar2;
    private javax.swing.JLabel Fondo_DetalleProducto;
    private javax.swing.JPanel Fondo_Eliminar;
    private javax.swing.JLabel Fondo_IGV;
    private javax.swing.JPanel Fondo_Perfil;
    private javax.swing.JLabel Fondo_Precio;
    private javax.swing.JPanel Fondo_Registro;
    private javax.swing.JLabel Fondo_Stock;
    private javax.swing.JLabel Fondo_SubTotal;
    private javax.swing.JLabel Fondo_Total;
    private javax.swing.JLabel Imagen;
    private javax.swing.JPanel Seleccion;
    private javax.swing.JComboBox<String> boxProducto;
    private javax.swing.JComboBox<String> boxTipoProducto;
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnComprar;
    private javax.swing.JLabel btnComprar2;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnPerfil;
    private javax.swing.JLabel btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tableProductos;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCarrito;
    private javax.swing.JLabel txtDetalleProducto;
    private javax.swing.JLabel txtIGV;
    private javax.swing.JLabel txtNroDocumento;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtPrimerApellido;
    private javax.swing.JLabel txtPrimerNombre;
    private javax.swing.JLabel txtStock;
    private javax.swing.JLabel txtSubTotal;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables

}
