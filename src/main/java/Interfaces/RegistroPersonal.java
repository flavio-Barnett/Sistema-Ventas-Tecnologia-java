/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import Controlador.Controlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import modelo.Personal;

public class RegistroPersonal extends javax.swing.JFrame {
    
    private final Controlador controlador;
    
    public RegistroPersonal(Controlador controlador) {
        initComponents();
        this.controlador = controlador;
        configurarEventos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblContrasena = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblCorreoElectronico = new javax.swing.JLabel();
        cboTipoDocumento = new javax.swing.JComboBox<>();
        lblNumeroDocumento = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblcNroTelefonico = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFemenino = new javax.swing.JRadioButton();
        lblGenero = new javax.swing.JLabel();
        lblNroTelefonico = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroTelefonico = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtNumeroTelefonico1 = new javax.swing.JTextField();
        txtNroDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        btnHome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblApellido.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Primer Apellido ");
        getContentPane().add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 110, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, 10));

        lblContrasena.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasena.setText("Contrasena");
        getContentPane().add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 70, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 170, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 230, 20));

        lblCorreoElectronico.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoElectronico.setText("Primer Nombre ");
        getContentPane().add(lblCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        cboTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Documento", "DNI", "Carne de Extranjeria", "Carne CPP", "Carne PTP", "Pasaporte" }));
        cboTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(cboTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, 30));

        lblNumeroDocumento.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblNumeroDocumento.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroDocumento.setText("Correo Electronico");
        getContentPane().add(lblNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 120, 30));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, 20));

        lblcNroTelefonico.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblcNroTelefonico.setForeground(new java.awt.Color(255, 255, 255));
        lblcNroTelefonico.setText("Nro Documenro");
        getContentPane().add(lblcNroTelefonico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 150, 20));

        grupo1.add(rbtnMasculino);
        rbtnMasculino.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rbtnMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbtnMasculino.setText("Masculino");
        getContentPane().add(rbtnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 90, 20));

        grupo1.add(rbtnFemenino);
        rbtnFemenino.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        rbtnFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbtnFemenino.setText("Femenino");
        getContentPane().add(rbtnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 90, 20));

        lblGenero.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 255));
        lblGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenero.setText("Sexo de nacimiento");
        getContentPane().add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 140, 30));

        lblNroTelefonico.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblNroTelefonico.setForeground(new java.awt.Color(255, 255, 255));
        lblNroTelefonico.setText("Nro Telefonico");
        getContentPane().add(lblNroTelefonico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 100, 30));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 160, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro Empleado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 240, 70));

        txtNumeroTelefonico.setBackground(new java.awt.Color(144, 93, 245));
        txtNumeroTelefonico.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroTelefonico.setBorder(null);
        txtNumeroTelefonico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroTelefonicoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumeroTelefonico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 160, 30));

        txtNombre.setBackground(new java.awt.Color(144, 93, 245));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 160, 30));

        txtApellido.setBackground(new java.awt.Color(49, 18, 176));
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setBorder(null);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 170, 30));

        txtCorreoElectronico.setBackground(new java.awt.Color(144, 93, 245));
        txtCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreoElectronico.setBorder(null);
        getContentPane().add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 230, 30));

        txtNumeroTelefonico1.setBackground(new java.awt.Color(144, 93, 245));
        txtNumeroTelefonico1.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroTelefonico1.setBorder(null);
        getContentPane().add(txtNumeroTelefonico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 160, 30));

        txtNroDocumento.setBackground(new java.awt.Color(144, 93, 245));
        txtNroDocumento.setForeground(new java.awt.Color(255, 255, 255));
        txtNroDocumento.setBorder(null);
        txtNroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroDocumentoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registrar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 90, 30));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Gradient1.png"))); // NOI18N
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 160, 50));

        txtContrasena.setBackground(new java.awt.Color(49, 18, 176));
        txtContrasena.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasena.setBorder(null);
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 150, 30));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home2__1_-removebg-preview (1).png"))); // NOI18N
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SignUp_Background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarEventos() {
        btnRegistrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isValidarCampos()) {
                    controlador.registrarEmpleado(dataOfemployee());
                    cleanFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Falta completar Campos", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        });        
        
        btnHome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DecisionAdministrador decisionAdministrador = new DecisionAdministrador(controlador);
                decisionAdministrador.setVisible(true);
                decisionAdministrador.setLocationRelativeTo(null);
                dispose();
            }            
        });
    }
    
    private Personal dataOfemployee() {
        
        String firstName = txtNombre.getText();
        String lastName = txtApellido.getText();        
        String email = txtCorreoElectronico.getText();
        String documentType = String.valueOf(cboTipoDocumento.getSelectedItem());
        String documentNumber = txtNroDocumento.getText();
        String cellphoneNumber = txtNumeroTelefonico.getText();
        String password = txtContrasena.getText();
        String gender = rbtnFemenino.isSelected() ? "Femenino" : "Masculino";
        Personal personal = new Personal(firstName, lastName, email, documentType, documentNumber, cellphoneNumber, password, gender);
        System.out.println(personal.getFirstName());
        return personal;        
        
    }
    
    private void cleanFields() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreoElectronico.setText("");
        cboTipoDocumento.setSelectedIndex(0);
        txtNroDocumento.setText("");
        txtNumeroTelefonico.setText("");
        txtContrasena.setText("");
        rbtnFemenino.setSelected(false);
        rbtnMasculino.setSelected(false);
    }
    
    private boolean isValidarCampos() {
        String firstName = txtNombre.getText();
        String lastName = txtApellido.getText();        
        String email = txtCorreoElectronico.getText();
        String documentType = String.valueOf(cboTipoDocumento.getSelectedItem());
        String documentNumber = txtNroDocumento.getText();
        String cellphoneNumber = txtNumeroTelefonico.getText();
        String password = txtContrasena.getText();
        String gender = rbtnFemenino.isSelected() ? "Femenino" : "Masculino";
        return !(firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || documentType.isEmpty() || documentNumber.isEmpty() || cellphoneNumber.isEmpty() || password.isEmpty() || gender.isEmpty());        
    }
    

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (!(minusculas || mayusculas || espacio))
            evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (!(minusculas || mayusculas || espacio))
            evt.consume();
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void cboTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoDocumentoActionPerformed
        boolean validacionComboBox = !(cboTipoDocumento.getSelectedItem().equals("Tipo Documento"));
        txtNroDocumento.setEditable(validacionComboBox);
    }//GEN-LAST:event_cboTipoDocumentoActionPerformed

    private void txtNumeroTelefonicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroTelefonicoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if ((!numeros) || (txtNumeroTelefonico.getText().trim().length() == 9))
            evt.consume();
    }//GEN-LAST:event_txtNumeroTelefonicoKeyTyped

    private void txtNroDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDocumentoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        
        if (cboTipoDocumento.getSelectedItem().equals("DNI")) {
            if ((txtNroDocumento.getText().trim().length() == 8) || (!numeros)) {
                evt.consume();
            }
        } else if ((cboTipoDocumento.getSelectedItem().equals("Carne de Extranjeria")) || (cboTipoDocumento.getSelectedItem().equals("Carne CPP")) || (cboTipoDocumento.getSelectedItem().equals("Carne PTP"))) {
            if ((txtNroDocumento.getText().trim().length() == 9) || (!numeros)) {
                evt.consume();
            }
        } else if (cboTipoDocumento.getSelectedItem().equals("Pasaporte")) {
            if (txtNroDocumento.getText().trim().length() == 10) {
                evt.consume();
            }
        }
        
    }//GEN-LAST:event_txtNroDocumentoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JComboBox<String> cboTipoDocumento;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNroTelefonico;
    private javax.swing.JLabel lblNumeroDocumento;
    private javax.swing.JLabel lblcNroTelefonico;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroDocumento;
    private javax.swing.JTextField txtNumeroTelefonico;
    private javax.swing.JTextField txtNumeroTelefonico1;
    // End of variables declaration//GEN-END:variables
}
