package interfaces;

import Controlador.Controlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResetPassword extends javax.swing.JFrame {

    private final Controlador controlador;

    public ResetPassword(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
        this.setTitle("Recuperar - Recupera tu contrasena");
        this.setLocationRelativeTo(null);
        configurarEventos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCorreoElectronico_Celular = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        Fondo_Cancelar = new javax.swing.JLabel();
        Fondo_Usuario = new javax.swing.JLabel();
        Fondo_Correo = new javax.swing.JLabel();
        Fondo_Enviar = new javax.swing.JLabel();
        Imagen_01 = new javax.swing.JLabel();
        WhiteBackground = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("¡Recupera tu cuenta!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 45));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Se te enviara tu contrasena.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtCorreoElectronico_Celular.setBackground(new java.awt.Color(0,0,0,0));
        txtCorreoElectronico_Celular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCorreoElectronico_Celular.setText("Ingrese el Correo Electrónico o Nro. Celular");
        txtCorreoElectronico_Celular.setBorder(null);
        txtCorreoElectronico_Celular.setOpaque(false);
        txtCorreoElectronico_Celular.setPreferredSize(new java.awt.Dimension(330, 35));
        txtCorreoElectronico_Celular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoElectronico_CelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoElectronico_CelularFocusLost(evt);
            }
        });
        jPanel1.add(txtCorreoElectronico_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 320, -1));

        txtUsuario.setBackground(new java.awt.Color(0,0,0,0));
        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUsuario.setText("Ingrese Nro. Documento");
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        txtUsuario.setPreferredSize(new java.awt.Dimension(330, 35));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, -1));

        btnEnviar.setBackground(new java.awt.Color(0, 0, 0));
        btnEnviar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEnviar.setText("Enviar");
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 110, 35));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 110, 35));

        Fondo_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient3.png"))); // NOI18N
        jPanel1.add(Fondo_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 110, 35));

        Fondo_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient2.png"))); // NOI18N
        Fondo_Usuario.setToolTipText("");
        jPanel1.add(Fondo_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        Fondo_Correo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient2.png"))); // NOI18N
        Fondo_Correo.setToolTipText("");
        jPanel1.add(Fondo_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        Fondo_Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient3.png"))); // NOI18N
        jPanel1.add(Fondo_Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 110, 35));

        Imagen_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ResetPassword_Icon.png"))); // NOI18N
        jPanel1.add(Imagen_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 60, 35));

        WhiteBackground.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout WhiteBackgroundLayout = new javax.swing.GroupLayout(WhiteBackground);
        WhiteBackground.setLayout(WhiteBackgroundLayout);
        WhiteBackgroundLayout.setHorizontalGroup(
            WhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        WhiteBackgroundLayout.setVerticalGroup(
            WhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jPanel1.add(WhiteBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 265));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ResetPassword_Background.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 305));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarEventos() {

        btnCancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Login Login = new Login(controlador);
                Login.setVisible(true);
                Login.setLocationRelativeTo(null);
                dispose();

            }
        });

        btnEnviar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                String usuario = txtUsuario.getText();
                String correo_celular = txtCorreoElectronico_Celular.getText();
                controlador.recuperarCuenta(usuario, correo_celular);

            }
        });

    }


    private void txtCorreoElectronico_CelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoElectronico_CelularFocusGained
        if (txtCorreoElectronico_Celular.getText().equals("Ingrese el Correo Electrónico o Nro. Celular")) {
            txtCorreoElectronico_Celular.setText(null);
        }
    }//GEN-LAST:event_txtCorreoElectronico_CelularFocusGained

    private void txtCorreoElectronico_CelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoElectronico_CelularFocusLost
        if (txtCorreoElectronico_Celular.getText().equals("")) {
            txtCorreoElectronico_Celular.setText("Ingrese el Correo Electrónico o Nro. Celular");
        }
    }//GEN-LAST:event_txtCorreoElectronico_CelularFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if (txtUsuario.getText().equals("Ingrese Nro. Documento")) {
            txtUsuario.setText(null);
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().equals("")) {
            txtUsuario.setText("Ingrese Nro. Documento");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Fondo_Cancelar;
    private javax.swing.JLabel Fondo_Correo;
    private javax.swing.JLabel Fondo_Enviar;
    private javax.swing.JLabel Fondo_Usuario;
    private javax.swing.JLabel Imagen_01;
    private javax.swing.JPanel WhiteBackground;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCorreoElectronico_Celular;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
