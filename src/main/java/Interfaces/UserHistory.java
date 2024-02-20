package interfaces;

import Controlador.Controlador;
import modelo.BuyHistory;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public final class UserHistory extends javax.swing.JFrame {

    private final Controlador controlador;
    private final Cliente cliente;
    private final DefaultTableModel modelo = new DefaultTableModel();

    public UserHistory(Controlador controlador, Cliente cliente) {
        initComponents();
        this.controlador = controlador;
        this.cliente = cliente;
        setLocationRelativeTo(null);
        setTitle("Cassiel EIRL - Interfaz de Historial");
        configurarEventos();
        ObtenerUsuario();
        LlenarColumnas();
        LlenarHistorial();

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
        FondoRegistro = new javax.swing.JLabel();
        FondoPerfil = new javax.swing.JLabel();
        FondoCerrarSesion = new javax.swing.JLabel();
        FondoComprar = new javax.swing.JLabel();
        Fondo_Registro = new javax.swing.JPanel();
        Fondo_Comprar = new javax.swing.JPanel();
        Fondo_Perfil = new javax.swing.JPanel();
        BarraVertical = new javax.swing.JPanel();
        Barra_Horizontal = new javax.swing.JPanel();
        Fondo_CerrarSesion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        txtPrimerApellido = new javax.swing.JLabel();
        txtNroDocumento = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JLabel();
        ZonaTexto = new javax.swing.JPanel();
        txtHistorial = new javax.swing.JLabel();
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
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 235, 100, 35));

        btnCerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 465, 120, 35));

        btnRegistro.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistro.setText("Registro");
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, 35));

        FondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_Gradient01.png"))); // NOI18N
        jPanel1.add(FondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        FondoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_Gradient01.png"))); // NOI18N
        jPanel1.add(FondoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        FondoCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_Gradient02.png"))); // NOI18N
        jPanel1.add(FondoCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 465, -1, -1));

        FondoComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_Gradient01.png"))); // NOI18N
        jPanel1.add(FondoComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 235, -1, -1));

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

        Barra_Horizontal.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Barra_HorizontalLayout = new javax.swing.GroupLayout(Barra_Horizontal);
        Barra_Horizontal.setLayout(Barra_HorizontalLayout);
        Barra_HorizontalLayout.setHorizontalGroup(
            Barra_HorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        Barra_HorizontalLayout.setVerticalGroup(
            Barra_HorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(Barra_Horizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 625, 2));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 105, 625, 415));

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

        ZonaTexto.setBackground(new java.awt.Color(255, 255, 255));
        ZonaTexto.setForeground(new java.awt.Color(255, 255, 255));
        ZonaTexto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHistorial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtHistorial.setText("Historial de Compra");
        ZonaTexto.add(txtHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(ZonaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 625, 60));

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

    public void LlenarColumnas() {
        ArrayList<Object> nombreColumna = new ArrayList(Arrays.asList("VENDEDOR", "DETALLE", "TOTAL", "FECHA"));
        nombreColumna.forEach(modelo::addColumn);
        tableProductos.setModel(modelo);
    }

    public void ObtenerUsuario() {

        txtPrimerNombre.setText(cliente.getFirstName());

        txtPrimerApellido.setText(cliente.getLastname());

        txtNroDocumento.setText(cliente.getDocumentNumber());

    }

    public void LlenarHistorial() {
        try {
            for (BuyHistory DatoNivel : controlador.VerHistorial("SELECT CONCAT(p.PrimerNombre, ' ', p.PrimerApellido) AS Vendedor, Detalle, Total, DATE(FechaHoraVenta) AS Fecha from Venta v INNER JOIN Personal p ON v.Id_Vendedor = p.NroDocumento WHERE v.Id_Cliente = " + cliente.getDocumentNumber() + " ORDER BY Fecha DESC")) {
                modelo.addRow(new Object[]{DatoNivel.getVendedor(),
                    DatoNivel.getDetalle(),
                    DatoNivel.getTotal(),
                    DatoNivel.getFecha()
                });
            }
            tableProductos.setModel(modelo);
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error llenar JTable " + sqle);
        }
    }

    private void configurarEventos() {

        btnCerrarSesion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Login LogIn = new Login(controlador);
                LogIn.setVisible(true);
                LogIn.setLocationRelativeTo(null);
                dispose();
            }
        });

        btnComprar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                UserShopping Usershopping = new UserShopping(controlador, cliente);
                Usershopping.setVisible(true);
                Usershopping.setLocationRelativeTo(null);
                dispose();
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel BarraVertical;
    private javax.swing.JPanel Barra_Horizontal;
    private javax.swing.JLabel FondoCerrarSesion;
    private javax.swing.JLabel FondoComprar;
    private javax.swing.JLabel FondoPerfil;
    private javax.swing.JLabel FondoRegistro;
    private javax.swing.JPanel Fondo_CerrarSesion;
    private javax.swing.JPanel Fondo_Comprar;
    private javax.swing.JPanel Fondo_Perfil;
    private javax.swing.JPanel Fondo_Registro;
    private javax.swing.JPanel ZonaTexto;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnComprar;
    private javax.swing.JLabel btnPerfil;
    private javax.swing.JLabel btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProductos;
    private javax.swing.JLabel txtHistorial;
    private javax.swing.JLabel txtNroDocumento;
    private javax.swing.JLabel txtPrimerApellido;
    private javax.swing.JLabel txtPrimerNombre;
    // End of variables declaration//GEN-END:variables

}
