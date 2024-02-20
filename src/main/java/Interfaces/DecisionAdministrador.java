/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import Controlador.Controlador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class DecisionAdministrador extends javax.swing.JFrame {

    private final Controlador controlador;
    public DecisionAdministrador(Controlador controlador) {
        initComponents();
        this.controlador=controlador;
        configurarEventos();
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistroEmpleado = new javax.swing.JLabel();
        btnRegistroInventario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BIENVENIDO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 340, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ELIJA UNA OPCION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 240, 40));

        btnRegistroEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarEmpleado (1).png"))); // NOI18N
        btnRegistroEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnRegistroEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 310, 270));

        btnRegistroInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verInventario (1).png"))); // NOI18N
        btnRegistroInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnRegistroInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 310, 270));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ANALIZAR INVENTARIO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 290, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REGISTRAR EMPLEADO ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 290, 60));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home__1_-removebg-preview.png"))); // NOI18N
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_Background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarEventos(){
        
    btnRegistroEmpleado.addMouseListener(new MouseAdapter() {
            
           @Override
           public void mouseClicked(MouseEvent e) {
                   
             RegistroPersonal registroPersonal =new RegistroPersonal(controlador);
             registroPersonal.setVisible(true);
             registroPersonal.setLocationRelativeTo(null);
             dispose();
          }
        });
        
    
    btnRegistroInventario.addMouseListener(new MouseAdapter() {
            
           @Override
           public void mouseClicked(MouseEvent e) {
                   
             Inventario inventario =new Inventario(controlador);
             inventario.setVisible(true);
             inventario.setLocationRelativeTo(null);
             dispose();
          }
        });
    
    btnHome.addMouseListener(new MouseAdapter(){
            
        @Override
        public void mouseClicked(MouseEvent e){
           
            Login login = new Login(controlador);
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            dispose();
        }
  
    });
        
    }
    
    
    
    
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnRegistroEmpleado;
    private javax.swing.JLabel btnRegistroInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
