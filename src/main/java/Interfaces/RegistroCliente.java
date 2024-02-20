package interfaces;

import java.awt.Color;
import Controlador.Controlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.AbstractButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Cliente;

public class RegistroCliente extends javax.swing.JFrame {

    private final Controlador controlador;

    public RegistroCliente(Controlador controlador) {
        this.controlador = controlador;
        this.setTitle("Registro - Crea tu cuenta");
        this.setLocationRelativeTo(null);
        initComponents();
        configurarEventos();
        txtContrasena.setEchoChar((char) 0);
        txtNroDocumento.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnSexo = new javax.swing.ButtonGroup();
        Panel_SignUp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFemenino = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JLabel();
        btnShowHide = new javax.swing.JToggleButton();
        boxTipoDocumento = new javax.swing.JComboBox<>();
        txtPrimerNombre = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtNroDocumento = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        Fondo_ShowHide = new javax.swing.JLabel();
        Fondo_Nombre = new javax.swing.JLabel();
        Fondo_Apellido = new javax.swing.JLabel();
        Fondo_Correo = new javax.swing.JLabel();
        Fondo_TipoDocumento = new javax.swing.JLabel();
        Fondo_NroDocumento = new javax.swing.JLabel();
        Fondo_NroCelular = new javax.swing.JLabel();
        Fondo_Contrasena = new javax.swing.JLabel();
        Fondo_Registrar = new javax.swing.JLabel();
        Fondo_Sexo = new javax.swing.JLabel();
        Imagen_01 = new javax.swing.JLabel();
        Line = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SignUp_Background = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Panel_SignUp.setBackground(new java.awt.Color(0, 204, 204));
        Panel_SignUp.setForeground(new java.awt.Color(255, 255, 255));
        Panel_SignUp.setPreferredSize(new java.awt.Dimension(400, 440));
        Panel_SignUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("¡Crea tu cuenta!");
        Panel_SignUp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tus datos seran confidenciales");
        jLabel2.setToolTipText("");
        Panel_SignUp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Sexo de Nacimiento");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_SignUp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 320, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("- ¿Ya tienes una cuenta? -");
        Panel_SignUp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 190, -1));

        rbtnMasculino.setBackground(new java.awt.Color(0,0,0,0));
        rbtnSexo.add(rbtnMasculino);
        rbtnMasculino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnMasculino.setText("Masculino");
        rbtnMasculino.setOpaque(false);
        Panel_SignUp.add(rbtnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, 35));

        rbtnFemenino.setBackground(new java.awt.Color(0,0,0,0));
        rbtnSexo.add(rbtnFemenino);
        rbtnFemenino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnFemenino.setText("Femenino");
        rbtnFemenino.setOpaque(false);
        Panel_SignUp.add(rbtnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, 35));

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_SignUp.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 160, 35));

        btnIniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_SignUp.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, -1));

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
        Panel_SignUp.add(btnShowHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 270, 35, 35));

        boxTipoDocumento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        boxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Documento", "DNI", "Carne de Extranjeria", "Carne CPP", "Carne PTP", "Pasaporte" }));
        boxTipoDocumento.setBorder(null);
        boxTipoDocumento.setName(""); // NOI18N
        boxTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoDocumentoActionPerformed(evt);
            }
        });
        Panel_SignUp.add(boxTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 35));

        txtPrimerNombre.setBackground(new java.awt.Color(0,0,0,0));
        txtPrimerNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPrimerNombre.setText("Primer Nombre");
        txtPrimerNombre.setBorder(null);
        txtPrimerNombre.setOpaque(false);
        txtPrimerNombre.setPreferredSize(new java.awt.Dimension(160, 35));
        txtPrimerNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrimerNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrimerNombreFocusLost(evt);
            }
        });
        txtPrimerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimerNombreKeyTyped(evt);
            }
        });
        Panel_SignUp.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 150, 155, -1));

        txtPrimerApellido.setBackground(new java.awt.Color(0,0,0,0));
        txtPrimerApellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPrimerApellido.setText("Primer Apellido");
        txtPrimerApellido.setBorder(null);
        txtPrimerApellido.setOpaque(false);
        txtPrimerApellido.setPreferredSize(new java.awt.Dimension(160, 35));
        txtPrimerApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrimerApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrimerApellidoFocusLost(evt);
            }
        });
        txtPrimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimerApellidoKeyTyped(evt);
            }
        });
        Panel_SignUp.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 150, 155, -1));

        txtCorreoElectronico.setBackground(new java.awt.Color(0,0,0,0));
        txtCorreoElectronico.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCorreoElectronico.setText("Correo Electronico");
        txtCorreoElectronico.setBorder(null);
        txtCorreoElectronico.setOpaque(false);
        txtCorreoElectronico.setPreferredSize(new java.awt.Dimension(330, 35));
        txtCorreoElectronico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoElectronicoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoElectronicoFocusLost(evt);
            }
        });
        Panel_SignUp.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 190, 325, -1));

        txtNroDocumento.setBackground(new java.awt.Color(0,0,0,0));
        txtNroDocumento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNroDocumento.setText("Nro. Documento");
        txtNroDocumento.setBorder(null);
        txtNroDocumento.setOpaque(false);
        txtNroDocumento.setPreferredSize(new java.awt.Dimension(160, 35));
        txtNroDocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNroDocumentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNroDocumentoFocusLost(evt);
            }
        });
        txtNroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroDocumentoKeyTyped(evt);
            }
        });
        Panel_SignUp.add(txtNroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 230, 155, -1));

        txtCelular.setBackground(new java.awt.Color(0,0,0,0));
        txtCelular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCelular.setText("Nro. Celular");
        txtCelular.setBorder(null);
        txtCelular.setOpaque(false);
        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        Panel_SignUp.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 270, 155, 35));

        txtContrasena.setBackground(new java.awt.Color(0,0,0,0));
        txtContrasena.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
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
        Panel_SignUp.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 270, 155, 35));

        Fondo_ShowHide.setBackground(new java.awt.Color(0,0,0,0));
        Fondo_ShowHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Show.png"))); // NOI18N
        Fondo_ShowHide.setOpaque(false);
        Panel_SignUp.add(Fondo_ShowHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 272, -1, -1));

        Fondo_Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_Nombre.setToolTipText("");
        Panel_SignUp.add(Fondo_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        Fondo_Apellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_Apellido.setToolTipText("");
        Panel_SignUp.add(Fondo_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        Fondo_Correo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient2.png"))); // NOI18N
        Fondo_Correo.setToolTipText("");
        Panel_SignUp.add(Fondo_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        Fondo_TipoDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient3.png"))); // NOI18N
        Panel_SignUp.add(Fondo_TipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        Fondo_NroDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_NroDocumento.setToolTipText("");
        Panel_SignUp.add(Fondo_NroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        Fondo_NroCelular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_NroCelular.setToolTipText("");
        Panel_SignUp.add(Fondo_NroCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        Fondo_Contrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        Fondo_Contrasena.setToolTipText("");
        Panel_SignUp.add(Fondo_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        Fondo_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient3.png"))); // NOI18N
        Panel_SignUp.add(Fondo_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        Fondo_Sexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient2.png"))); // NOI18N
        Fondo_Sexo.setToolTipText("");
        Panel_SignUp.add(Fondo_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        Imagen_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_MainIcon.png"))); // NOI18N
        Panel_SignUp.add(Imagen_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        Line.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Line.setText("______________________");
        Panel_SignUp.add(Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        Panel_SignUp.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 560));

        SignUp_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Background.png"))); // NOI18N
        Panel_SignUp.add(SignUp_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jToggleButton1.setText("jToggleButton1");
        Panel_SignUp.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_SignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_SignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarEventos() {
        btnRegistrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int errores = validarDatos();

                if (errores == 0) {
                    registrarCliente();
                } else {
                    mostrarMensajeError("Verifica los datos ingresados, por favor.");
                }

            }
        });

        btnIniciarSesion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Login LogIn = new Login(controlador);
                LogIn.setVisible(true);
                LogIn.setLocationRelativeTo(null);
                dispose();

            }
        });

    }

    private int validarDatos() {
        int errores = 0;

        errores += esCampoInvalido(txtPrimerNombre, "Primer Nombre");
        errores += esCampoInvalido(txtPrimerApellido, "Primer Apellido");
        errores += noTerminaCon(txtCorreoElectronico, "@gmail.com");
        errores += esSeleccionInvalida(boxTipoDocumento, "Tipo de Documento") ? 1 : 0;
        errores += esLongitudInvalida("DNI", txtNroDocumento, 8) ? 1 : 0;
        errores += esLongitudInvalida("Carne de Extranjeria", txtNroDocumento, 9) ? 1 : 0;
        errores += esLongitudInvalida("Carne CPP", txtNroDocumento, 9) ? 1 : 0;
        errores += esLongitudInvalida("Carne PTP", txtNroDocumento, 9) ? 1 : 0;
        errores += esLongitudInvalida("Pasaporte", txtNroDocumento, 10) ? 1 : 0;
        errores += noIniciaCon(txtCelular, '9', 9) ? 1 : 0;
        errores += esContrasenaInvalida(txtContrasena, 8, "Contrasena") ? 1 : 0;
        errores += noHaySeleccion(rbtnMasculino, rbtnFemenino) ? 1 : 0;

        return errores;
    }

    private void registrarCliente() {
        String firstName = txtPrimerNombre.getText();
        String lastName = txtPrimerApellido.getText();
        String email = txtCorreoElectronico.getText();
        String documentType = boxTipoDocumento.getSelectedItem().toString();
        String documentNumber = txtNroDocumento.getText();
        String cellphoneNumber = txtCelular.getText();
        String password = txtContrasena.getText();
        String gender = rbtnFemenino.isSelected() ? "Femenino" : "Masculino";
        controlador.RegistrarCliente(new Cliente(firstName, lastName, email, documentType, documentNumber, cellphoneNumber, password, gender));
    }

    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

// Metodos de validacion
    private int esCampoInvalido(JTextField campo, String valorEsperado) {
        return campo.getText().equals(valorEsperado) ? 1 : 0;
    }

    private int noTerminaCon(JTextField campo, String sufijoEsperado) {
        return campo.getText().endsWith(sufijoEsperado) ? 0 : 1;
    }

    private boolean esSeleccionInvalida(JComboBox<String> comboBox, String valorEsperado) {
        return comboBox.getSelectedItem().equals(valorEsperado);
    }

    private boolean esLongitudInvalida(String tipoDocumento, JTextField campo, int longitudEsperada) {
        return esSeleccionInvalida(boxTipoDocumento, tipoDocumento) && campo.getText().length() != longitudEsperada;
    }

    private boolean noIniciaCon(JTextField campo, char caracterEsperado, int longitudEsperada) {
        String valor = campo.getText();
        return valor.length() == longitudEsperada && valor.charAt(0) != caracterEsperado;
    }

    private boolean esContrasenaInvalida(JTextField campo, int longitudMinima, String valorNoPermitido) {
        String valor = campo.getText();
        return valor.length() < longitudMinima || valor.equals(valorNoPermitido);
    }

    private boolean noHaySeleccion(AbstractButton... botones) {
        return Arrays.stream(botones).noneMatch(AbstractButton::isSelected);
    }


    private void txtPrimerNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerNombreFocusGained
        if (txtPrimerNombre.getText().toLowerCase().equals("primer nombre")) {
            txtPrimerNombre.setText(null);
        }
    }//GEN-LAST:event_txtPrimerNombreFocusGained

    private void txtPrimerNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerNombreFocusLost
        if (txtPrimerNombre.getText().equals("")) {
            txtPrimerNombre.setText("Primer Nombre");
        }

        if (!(txtPrimerNombre.getText().equals("Primer Nombre"))) {
            String Nombre = txtPrimerNombre.getText();
            txtPrimerNombre.setText(String.valueOf(Nombre.charAt(0)).toUpperCase() + Nombre.substring(1, Nombre.length()).toLowerCase());
        }
    }//GEN-LAST:event_txtPrimerNombreFocusLost


    private void txtPrimerApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerApellidoFocusGained
        if (txtPrimerApellido.getText().toLowerCase().equals("primer apellido"))
            txtPrimerApellido.setText(null);
    }//GEN-LAST:event_txtPrimerApellidoFocusGained

    private void txtPrimerApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrimerApellidoFocusLost
        if (txtPrimerApellido.getText().equals("")) {
            txtPrimerApellido.setText("Primer Apellido");
        }

        if (!(txtPrimerApellido.getText().equals("Primer Apellido"))) {
            String Apellido = txtPrimerApellido.getText();
            txtPrimerApellido.setText(String.valueOf(Apellido.charAt(0)).toUpperCase() + Apellido.substring(1, Apellido.length()).toLowerCase());
        }
    }//GEN-LAST:event_txtPrimerApellidoFocusLost

    private void txtCorreoElectronicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoFocusLost
        if (txtCorreoElectronico.getText().equals("")) {
            txtCorreoElectronico.setText("Correo Electronico");
            txtCorreoElectronico.setForeground(Color.BLACK);
        } else if (txtCorreoElectronico.getText().endsWith("@gmail.com") == false) {
            txtCorreoElectronico.setForeground(Color.RED);
        } else if (txtCorreoElectronico.getText().endsWith("@gmail.com") == true) {
            txtCorreoElectronico.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtCorreoElectronicoFocusLost

    private void txtCorreoElectronicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoFocusGained
        if (txtCorreoElectronico.getText().equals("Correo Electronico")) {
            txtCorreoElectronico.setText(null);
        }
    }//GEN-LAST:event_txtCorreoElectronicoFocusGained

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        if (txtCelular.getText().equals("") || (txtCelular.getText().trim().length() != 9)) {
            txtCelular.setText("Nro. Celular");
            txtCelular.setForeground(Color.BLACK);
        } else if (txtCelular.getText().charAt(0) != '9') {
            txtCelular.setForeground(Color.RED);
        } else if (txtCelular.getText().charAt(0) == '9') {
            txtCelular.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtCelularFocusLost

    private void txtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusGained
        if (txtCelular.getText().equals("Nro. Celular")) {
            txtCelular.setText(null);
        }
    }//GEN-LAST:event_txtCelularFocusGained

    private void txtNroDocumentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNroDocumentoFocusGained
        if (txtNroDocumento.getText().equals("Nro. Documento")) {
            txtNroDocumento.setText(null);
        }
    }//GEN-LAST:event_txtNroDocumentoFocusGained

    private void txtNroDocumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNroDocumentoFocusLost
        if (txtNroDocumento.getText().equals("")) {
            txtNroDocumento.setText("Nro. Documento");
        } else if (boxTipoDocumento.getSelectedItem().equals("DNI")) {
            if (txtNroDocumento.getText().trim().length() != 8) {
                txtNroDocumento.setForeground(Color.RED);
            } else {
                txtNroDocumento.setForeground(Color.BLACK);
            }
        } else if ((boxTipoDocumento.getSelectedItem().equals("Carne de Extranjeria")) || (boxTipoDocumento.getSelectedItem().equals("Carne CPP")) || (boxTipoDocumento.getSelectedItem().equals("Carne PTP"))) {
            if (txtNroDocumento.getText().trim().length() != 9) {
                txtNroDocumento.setForeground(Color.RED);
            } else {
                txtNroDocumento.setForeground(Color.BLACK);
            }
        } else if (boxTipoDocumento.getSelectedItem().equals("Pasaporte")) {
            if (txtNroDocumento.getText().trim().length() != 10) {
                txtNroDocumento.setForeground(Color.RED);
            } else {
                txtNroDocumento.setForeground(Color.BLACK);
            }
        }
    }//GEN-LAST:event_txtNroDocumentoFocusLost

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if ((!numeros) || (txtCelular.getText().trim().length() == 9))
            evt.consume();
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtPrimerNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerNombreKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (!(minusculas || mayusculas || espacio))
            evt.consume();
    }//GEN-LAST:event_txtPrimerNombreKeyTyped

    private void txtPrimerApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerApellidoKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (!(minusculas || mayusculas || espacio))
            evt.consume();
    }//GEN-LAST:event_txtPrimerApellidoKeyTyped

    private void txtNroDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDocumentoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (boxTipoDocumento.getSelectedItem().equals("DNI")) {
            if ((txtNroDocumento.getText().trim().length() == 8) || (!numeros)) {
                evt.consume();
            }
        } else if ((boxTipoDocumento.getSelectedItem().equals("Carne de Extranjeria")) || (boxTipoDocumento.getSelectedItem().equals("Carne CPP")) || (boxTipoDocumento.getSelectedItem().equals("Carne PTP"))) {
            if ((txtNroDocumento.getText().trim().length() == 9) || (!numeros)) {
                evt.consume();
            }
        } else if (boxTipoDocumento.getSelectedItem().equals("Pasaporte")) {
            if (txtNroDocumento.getText().trim().length() == 10) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtNroDocumentoKeyTyped

    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
        if ((txtContrasena.getText().equals("")) || (txtContrasena.getText().trim().length() < 8))
            txtContrasena.setText("Contrasena");
    }//GEN-LAST:event_txtContrasenaFocusLost

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        if (txtContrasena.getText().equals("Contrasena"))
            txtContrasena.setText(null);
    }//GEN-LAST:event_txtContrasenaFocusGained

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

    private void boxTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoDocumentoActionPerformed
        boolean validacionComboBox = !boxTipoDocumento.getSelectedItem().equals("Tipo de Documento");
        txtNroDocumento.setEnabled(validacionComboBox);
    }//GEN-LAST:event_boxTipoDocumentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_Apellido;
    private javax.swing.JLabel Fondo_Contrasena;
    private javax.swing.JLabel Fondo_Correo;
    private javax.swing.JLabel Fondo_Nombre;
    private javax.swing.JLabel Fondo_NroCelular;
    private javax.swing.JLabel Fondo_NroDocumento;
    private javax.swing.JLabel Fondo_Registrar;
    private javax.swing.JLabel Fondo_Sexo;
    private javax.swing.JLabel Fondo_ShowHide;
    private javax.swing.JLabel Fondo_TipoDocumento;
    private javax.swing.JLabel Imagen_01;
    private javax.swing.JLabel Line;
    private javax.swing.JPanel Panel_SignUp;
    private javax.swing.JLabel SignUp_Background;
    private javax.swing.JComboBox<String> boxTipoDocumento;
    private javax.swing.JLabel btnIniciarSesion;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JToggleButton btnShowHide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.ButtonGroup rbtnSexo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNroDocumento;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    // End of variables declaration//GEN-END:variables
}
