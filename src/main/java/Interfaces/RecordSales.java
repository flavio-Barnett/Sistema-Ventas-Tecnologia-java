package interfaces;

import Controlador.Controlador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RecordSales extends javax.swing.JFrame {

    private final Controlador controlador;
    private final DefaultTableModel modeloTabla;
    private final int usuario;

    public RecordSales(Controlador controlador, int usuario) {
        this.controlador = controlador;
        this.usuario = usuario;
        modeloTabla = new DefaultTableModel();
        initComponents();
        setTitle("Registro de Ventas");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCerrarSesion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtIgv = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home2__1_-removebg-preview (1).png"))); // NOI18N
        lblCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(lblCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Cod. Producto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Sub-Total:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Stock:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        lblDni.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDni.setText("DNI:");
        jPanel1.add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Apellido:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Celular:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Nombre Pro.:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Cantidad:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setText("Ventas");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtSubTotal.setEditable(false);
        jPanel1.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 80, 30));

        txtStock.setEditable(false);
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 200, 30));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 200, 30));
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, 30));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 200, 30));
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 200, 30));
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 200, 30));

        txtNombreProducto.setEditable(false);
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 200, 30));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 200, 30));

        btnBuscarProducto.setText("B");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 40, 30));

        btnVenta.setText("Venta");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 110, 40));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 110, 40));

        btnBuscarCliente.setText("B");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 40, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setText("Total:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        txtTotal.setEditable(false);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 200, 40));

        txtIgv.setEditable(false);
        jPanel1.add(txtIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 80, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("I.G.V:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 110, 40));

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVenta);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 650, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 800, 500));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogIn_Background.png"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(845, 540));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if (!(txtDni.getText().equals("") && txtNombreCliente.getText().equals(""))) {
            if (Integer.parseInt(txtCantidad.getText())>0 &&Integer.parseInt(txtCantidad.getText())<Integer.parseInt(txtStock.getText())) {
                controlador.agregarTablaVenta(modeloTabla, tblVenta, txtProducto, txtCantidad);
                txtDni.setEditable(false);
                txtNombreCliente.setEditable(false);
                txtApellido.setEditable(false);
                txtCelular.setEditable(false);
                txtProducto.setText("");
                txtNombreProducto.setText("");
                txtCantidad.setText("");
                txtStock.setText("");
                sumarColumna();
            } else {
                JOptionPane.showMessageDialog(null, "Stock Insuficiente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        controlador.getBuscarDatosUsuario(txtDni, txtNombreCliente, txtApellido, txtCelular);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        controlador.getBuscarDatosProducto(txtProducto, txtNombreProducto, txtCantidad, txtStock);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        // TODO add your handling code here:
        if (!(txtDni.getText().equals(""))) {
            if (modeloTabla.getRowCount()>0) {
                controlador.registrarVenta(tblVenta, txtDni, usuario);
                actualizarStockBaseDatos();
                JOptionPane.showMessageDialog(null, "VeNta Exitosamente Completada", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                modeloTabla.setRowCount(0);
                txtDni.setText("");
                txtNombreCliente.setText("");
                txtApellido.setText("");
                txtCelular.setText("");
                txtSubTotal.setText("");
                txtIgv.setText("");
                txtTotal.setText("");
                txtDni.setEditable(true);
                txtNombreCliente.setEditable(true);
                txtApellido.setEditable(true);
                txtCelular.setEditable(true);
            } else {
                JOptionPane.showMessageDialog(null, "Agrege los elementos a comprar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Rellene el campo del comprador.");
        }
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
        modeloTabla.setRowCount(0);
        txtDni.setText("");
        txtNombreCliente.setText("");
        txtApellido.setText("");
        txtCelular.setText("");
        txtSubTotal.setText("");
        txtIgv.setText("");
        txtTotal.setText("");
        txtDni.setEditable(true);
        txtNombreCliente.setEditable(true);
        txtApellido.setEditable(true);
        txtCelular.setEditable(true);
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        Login login = new Login(controlador);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    
    private void sumarColumna() {
        int filas = modeloTabla.getRowCount();
        double suma = 0;
        try {
            for (int i = 0; i < filas; i++) {
            Object valor = modeloTabla.getValueAt(i, 5); 
            if (valor instanceof Number number) {
                suma += number.doubleValue();
            }
        }
        } catch (Exception ex) {
            System.out.println("error = " + ex);
        }
        txtSubTotal.setText(String.valueOf(suma*0.82));
        txtIgv.setText(String.valueOf(suma*0.18));
        txtTotal.setText(String.valueOf(suma));
    }
    
    private void actualizarStockBaseDatos(){
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String nombreProducto = (String) modeloTabla.getValueAt(i, 0);
            int stock = (int) modeloTabla.getValueAt(i, 4);
            controlador.actualizarStock(stock, nombreProducto);
            System.out.println("Producto" + nombreProducto + "; cantidad " + stock);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    
}
