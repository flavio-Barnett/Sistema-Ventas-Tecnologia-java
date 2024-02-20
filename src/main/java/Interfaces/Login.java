package interfaces;

import Controlador.Controlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelo.Cliente;
import modelo.Personal;

public class Login extends javax.swing.JFrame {
    private static boolean cerrarVentaLogin=false;
    private final Controlador controlador;

    public Login(Controlador controlador) {
        this.controlador = controlador;
        this.setTitle("Inicio de Sesión");
        this.setLocationRelativeTo(null);
        initComponents();
        configurarEventos();
        txtContrasena.setEchoChar((char) 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_LogIn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JLabel();
        btnRecuperar = new javax.swing.JLabel();
        btnShowHide = new javax.swing.JToggleButton();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        Fondo_ShowHide = new javax.swing.JLabel();
        Fondo_Usuario = new javax.swing.JLabel();
        Fondo_Contrasena = new javax.swing.JLabel();
        Fondo_Login = new javax.swing.JLabel();
        Imagen_01 = new javax.swing.JLabel();
        Imagen_02 = new javax.swing.JLabel();
        Line = new javax.swing.JLabel();
        WhiteBackground = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(845, 540));

        Panel_LogIn.setBackground(new java.awt.Color(0, 204, 204));
        Panel_LogIn.setPreferredSize(new java.awt.Dimension(130, 100));
        Panel_LogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("¡Bienvenid@!");
        Panel_LogIn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Ingrese para continuar");
        Panel_LogIn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¿No tienes cuenta?");
        Panel_LogIn.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 435, -1, -1));

        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Iniciar Sesion");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_LogIn.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 250, 40));

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_LogIn.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 435, -1, -1));

        btnRecuperar.setBackground(new java.awt.Color(0, 0, 0));
        btnRecuperar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRecuperar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRecuperar.setText("- ¿Olvidaste tu contrasena? -");
        btnRecuperar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_LogIn.add(btnRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 247, -1));

        btnShowHide.setBackground(new java.awt.Color(0,0,0,0));
        btnShowHide.setForeground(new java.awt.Color(0,0,0,0));
        btnShowHide.setBorder(null);
        btnShowHide.setBorderPainted(false);
        btnShowHide.setContentAreaFilled(false);
        btnShowHide.setOpaque(false);
        btnShowHide.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnShowHideItemStateChanged(evt);
            }
        });
        Panel_LogIn.add(btnShowHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 310, 40, 35));

        txtUsuario.setBackground(new java.awt.Color(0,0,0,0));
        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("Nro Documento");
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        Panel_LogIn.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 250, 30));

        txtContrasena.setBackground(new java.awt.Color(0,0,0,0));
        txtContrasena.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtContrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasena.setText("Contrasena");
        txtContrasena.setBorder(null);
        txtContrasena.setOpaque(false);
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusLost(evt);
            }
        });
        Panel_LogIn.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 255, 35));

        Fondo_ShowHide.setBackground(new java.awt.Color(0,0,0,0));
        Fondo_ShowHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Show.png"))); // NOI18N
        Fondo_ShowHide.setOpaque(false);
        Panel_LogIn.add(Fondo_ShowHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 313, -1, -1));

        Fondo_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_Gradient1.png"))); // NOI18N
        Panel_LogIn.add(Fondo_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 260, 40));

        Fondo_Contrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_Gradient1.png"))); // NOI18N
        Panel_LogIn.add(Fondo_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        Fondo_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_Gradient2.png"))); // NOI18N
        Panel_LogIn.add(Fondo_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 240, 60));

        Imagen_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_Main.png"))); // NOI18N
        Panel_LogIn.add(Imagen_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 430, 470));

        Imagen_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_MainIcon.png"))); // NOI18N
        Panel_LogIn.add(Imagen_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 110, 100));

        Line.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Line.setText("_________________");
        Panel_LogIn.add(Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        WhiteBackground.setBackground(new java.awt.Color(255, 255, 255));
        WhiteBackground.setForeground(new java.awt.Color(255, 255, 255));
        WhiteBackground.setPreferredSize(new java.awt.Dimension(255, 540));

        javax.swing.GroupLayout WhiteBackgroundLayout = new javax.swing.GroupLayout(WhiteBackground);
        WhiteBackground.setLayout(WhiteBackgroundLayout);
        WhiteBackgroundLayout.setHorizontalGroup(
            WhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );
        WhiteBackgroundLayout.setVerticalGroup(
            WhiteBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Panel_LogIn.add(WhiteBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 295, 500));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_Background.png"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(845, 540));
        Panel_LogIn.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarEventos() {

        btnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String usuario = txtUsuario.getText();
                String contrasena = String.valueOf(txtContrasena.getPassword());
                Cliente cliente = new Cliente(usuario, contrasena);
                Personal personal = new Personal(usuario, contrasena);
                controlador.iniciarSesion(cliente, personal);
                if(cerrarVentaLogin)dispose();
            }
        });

        btnRecuperar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ResetPassword ResetPassword = new ResetPassword(controlador);
                ResetPassword.setVisible(true);
                ResetPassword.setLocationRelativeTo(null);
                dispose();

            }
        });

        btnRegistrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RegistroCliente registroCliente = new RegistroCliente(controlador);
                registroCliente.setVisible(true);
                registroCliente.setLocationRelativeTo(null);
                dispose();
            }
        });

    }
    
    

    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
        if (txtContrasena.getText().equals("")) {
            txtContrasena.setText("Contrasena");
        }
    }//GEN-LAST:event_txtContrasenaFocusLost

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        if (txtContrasena.getText().equals("Contrasena")) {
            txtContrasena.setText(null);
        }
    }//GEN-LAST:event_txtContrasenaFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().equals("")) {
            txtUsuario.setText("Nro Documento");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if (txtUsuario.getText().equals("Nro Documento")) {
            txtUsuario.setText(null);
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void btnShowHideItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnShowHideItemStateChanged
        int estado = evt.getStateChange();
        if (estado == evt.SELECTED) {
            Fondo_ShowHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hide.png")));
            txtContrasena.setEchoChar('*');
        } else {
            Fondo_ShowHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Show.png")));
            txtContrasena.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_btnShowHideItemStateChanged

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) || txtUsuario.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    public static void cerrarVentanalogin(){
        Login.cerrarVentaLogin=true;}
    public static void mantenerAbiertaVentanalogin(){
        Login.cerrarVentaLogin=false;  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo_Contrasena;
    private javax.swing.JLabel Fondo_Login;
    private javax.swing.JLabel Fondo_ShowHide;
    private javax.swing.JLabel Fondo_Usuario;
    private javax.swing.JLabel Imagen_01;
    private javax.swing.JLabel Imagen_02;
    private javax.swing.JLabel Line;
    private javax.swing.JPanel Panel_LogIn;
    private javax.swing.JPanel WhiteBackground;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnRecuperar;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JToggleButton btnShowHide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
