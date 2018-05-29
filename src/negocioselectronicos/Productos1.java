/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocioselectronicos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lizeth
 */
public class Productos1 extends javax.swing.JFrame {
String idProducto,nombre,precio,presentacion,marca,cantSustancia,presentacionSustancia,tipoProducto,cantidad,existencia; 

DefaultTableModel model,dato;
/**
     * Creates new form Productos1
     */
    public Productos1() {
        initComponents();
        limpiar();
        bloquear();
        desbloquear();
        cargar("");
    }

    void cargar (String valor){
    String [] titulos = { "idProducto","nombre","precio","presentacion","marca","cantSustancia","presentacionSustancia","tipoProducto","cantidad","existencia" };
    String [] registros = new String [10];
    String sql = "SELECT * FROM productos WHERE CONCAT(nombre) like '%"+valor+"%'";
    
    model = new DefaultTableModel(null, titulos);
            
    conectar cc = new conectar();
    Connection cn =cc.conexion();
        
    try {
        Statement  st =cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
    
        while (rs.next()){
                registros[0]=rs.getString("idProducto");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("precio");
                registros[3]=rs.getString("presentacion");
                registros[4]=rs.getString("marca");
                registros[5]=rs.getString("cantSustancia");
                registros[6]=rs.getString("presentacionSustancia");
                registros[7]=rs.getString("tipoProducto");
                registros[8]=rs.getString("cantidad");
                registros[9]=rs.getString("existencia");
                
                model.addRow(registros);
            
                tdatos.setModel(model);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    
    }
    
    void limpiar(){
    txtid1.setText("");
    cbnombre.setSelectedItem(0);
    cbprecio.setSelectedItem(0);
    cbpresentacion.setSelectedItem(0);
    cbmarca.setSelectedItem(0);
    cbcantSustancia.setSelectedItem(0);
    cbpresentacionSustancia.setSelectedItem(0);
    cbtipo.setSelectedItem(0);
    txtcantidad.setText("");
    txtexistencia.setText("");
    }
    void bloquear(){
    txtid1.setEnabled(false);
    cbnombre.setEnabled(false);
    cbprecio.setEnabled(false);
    cbpresentacion.setEnabled(false);
    cbmarca.setEnabled(false);
    cbcantSustancia.setEnabled(false);
    cbpresentacionSustancia.setEnabled(false);
    cbtipo.setEnabled(false);
    txtcantidad.setEnabled(false);
    txtexistencia.setEnabled(false);
    btnuevo.setEnabled(false);
    btguardar.setEnabled(false);
    btcancelar.setEnabled(false); 
    btsalir.setEnabled(false); 
    }
    void desbloquear(){
    txtid1.setEnabled(false);
    cbnombre.setEnabled(true);
    cbprecio.setEnabled(true);
    cbpresentacion.setEnabled(true);
    cbmarca.setEnabled(true);
    cbcantSustancia.setEnabled(true);
    cbpresentacionSustancia.setEnabled(true);
    cbtipo.setEnabled(true);
    txtcantidad.setEnabled(true);
    txtexistencia.setEnabled(true);
    btnuevo.setEnabled(true);
    btguardar.setEnabled(true);
    btcancelar.setEnabled(true); 
    btsalir.setEnabled(true); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtid1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbnombre = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cbprecio = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbpresentacion = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cbmarca = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtexistencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbcantSustancia = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cbpresentacionSustancia = new javax.swing.JComboBox();
        Buscar = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btmostrar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tdatos = new javax.swing.JTable();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("IdProducto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, -1));

        jLabel2.setText("Nombre Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        cbnombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amigreenbio plus", "Amigreen crece mas", "Amigreen mas raiz", "8816", "241395", "Caña etapa 1", "Caña etapa 2" }));
        cbnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnombreActionPerformed(evt);
            }
        });
        getContentPane().add(cbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 110, -1));

        jLabel3.setText("Precio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        cbprecio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "$ 65", "$ 75", "$ 110", "$ 250", "$ 580" }));
        cbprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbprecioActionPerformed(evt);
            }
        });
        getContentPane().add(cbprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 110, -1));

        jLabel4.setText("Presentacion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        cbpresentacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enbotellado", "Empacado", "Enlatado" }));
        cbpresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpresentacionActionPerformed(evt);
            }
        });
        getContentPane().add(cbpresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 110, -1));

        jLabel5.setText("Marca");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        cbmarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amigreen", "AgrobioSur", "MaxVerde" }));
        cbmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmarcaActionPerformed(evt);
            }
        });
        getContentPane().add(cbmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 110, -1));

        jLabel6.setText("Cantidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 80, -1));

        jLabel7.setText("Existencia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        txtexistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexistenciaActionPerformed(evt);
            }
        });
        getContentPane().add(txtexistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 80, -1));

        jLabel8.setText("Cantidad de Sustancia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        cbcantSustancia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5 litros", "1 litro", "250 g", "500 g", "50 kilos" }));
        cbcantSustancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcantSustanciaActionPerformed(evt);
            }
        });
        getContentPane().add(cbcantSustancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 80, -1));

        jLabel9.setText("Tipo de producto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pesticida", "Insecticida", "Abono" }));
        cbtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 80, -1));

        jLabel10.setText("Presentacion de sustancia");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        cbpresentacionSustancia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Liquido", "Polvo" }));
        cbpresentacionSustancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpresentacionSustanciaActionPerformed(evt);
            }
        });
        getContentPane().add(cbpresentacionSustancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 80, -1));

        Buscar.setText("Buscar");
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 20));

        txtbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbuscarMouseClicked(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 160, -1));

        btmostrar.setText("Mostrar Todo");
        btmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        btmodificar.setText("Modificar");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        bteliminar.setText("Eliminar");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        tdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tdatos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 500, 90));

        btnuevo.setText("Nuevo");
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        btguardar.setText("Guardar");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/451170447.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbuscarMouseClicked
        cargar(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarMouseClicked

    private void btmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmostrarActionPerformed
        cargar("");
    }//GEN-LAST:event_btmostrarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        conectar c = new conectar();
        Connection cn = c.conexion();

        try{
            String sql = "UPDATE productos SET nombre=?, precio=?, presentacion=?, marca=?, cantSustancia=?, presentacionSustancia=?, tipoProducto=?, cantidad=?, existencia=?" +
            "WHERE idProducto=?";
            int fila = tdatos.getSelectedRow();
            String dato =(String) tdatos.getValueAt(fila, 0);
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, cbnombre.getSelectedItem().toString());
            pst.setString(2, cbprecio.getSelectedItem().toString());
            pst.setString(3, cbpresentacion.getSelectedItem().toString());
            pst.setString(4, cbmarca.getSelectedItem().toString());
            pst.setString(5, cbcantSustancia.getSelectedItem().toString());
            pst.setString(6, cbpresentacionSustancia.getSelectedItem().toString());
            pst.setString(7, cbtipo.getSelectedItem().toString());
            pst.setString(8, txtcantidad.getText());
            pst.setString(9, txtexistencia.getText());
            pst.setString(10, dato);

            int n = pst.executeUpdate();
            if(n>0){

                cargar("");
                limpiar();
                JOptionPane.showMessageDialog(null, "Datos Modificados");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());

        }
    }//GEN-LAST:event_btmodificarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        conectar c = new conectar();
        Connection cn = c.conexion();

        try{
            int fila = tdatos.getSelectedRow();
            String sql = "delete from productos where idProducto =" + tdatos.getValueAt(fila, 0);
            Statement  st =cn.createStatement();

            //PreparedStatement pst = cn.prepareStatement(sql);
            int n = st.executeUpdate(sql);

            if(n>0){
                cargar("");
                //desbloquear();
                JOptionPane.showMessageDialog(null, "DATOS ELIMINADOS");

                limpiar();

            }

        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
    }//GEN-LAST:event_bteliminarActionPerformed

    private void tdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdatosMouseClicked
        int filasele = tdatos.getSelectedRow();
        cbnombre.setSelectedItem(tdatos.getValueAt(filasele, 1 ).toString());
        cbprecio.setSelectedItem(tdatos.getValueAt(filasele, 2 ).toString());
        cbpresentacion.setSelectedItem(tdatos.getValueAt(filasele, 3 ).toString());
        cbmarca.setSelectedItem(tdatos.getValueAt(filasele, 4 ).toString());
        cbcantSustancia.setSelectedItem(tdatos.getValueAt(filasele, 5 ).toString());
        cbpresentacionSustancia.setSelectedItem(tdatos.getValueAt(filasele, 6 ).toString());
        cbtipo.setSelectedItem(tdatos.getValueAt(filasele, 7 ).toString());
        txtcantidad.setText(tdatos.getValueAt(filasele, 8 ).toString());
        txtexistencia.setText(tdatos.getValueAt(filasele, 9 ).toString());
        filas =filasele;
        desbloquear();
    }//GEN-LAST:event_tdatosMouseClicked

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        limpiar();    // mandamos a llamarel void
        desbloquear();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed

        conectar c = new conectar();
        Connection cn = c.conexion();

        String sql = "";
        nombre = cbnombre.getSelectedItem().toString();
        precio = cbprecio.getSelectedItem().toString();
        presentacion = cbpresentacion.getSelectedItem().toString();
        marca = cbmarca.getSelectedItem().toString();
        cantSustancia = cbcantSustancia.getSelectedItem().toString();
        presentacionSustancia = cbpresentacionSustancia.getSelectedItem().toString();
        tipoProducto = cbtipo.getSelectedItem().toString();
        cantidad = txtcantidad.getText();
        existencia = txtexistencia.getText();

        sql= "INSERT INTO productos( nombre, precio, presentacion, marca, cantSustancia, presentacionSustancia, tipoProducto, cantidad, existencia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,nombre);
            pst.setString(2,precio);
            pst.setString(3,presentacion);
            pst.setString(4,marca);
            pst.setString(5,cantSustancia);
            pst.setString(6,presentacionSustancia);
            pst.setString(7,tipoProducto);
            pst.setString(8,cantidad);
            pst.setString(9,existencia);
            int n = pst.executeUpdate();
            if(n>0)
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");

            cargar("");
            // bloquear();

        } catch (SQLException e) {
            // LogRecord Le;
            JOptionPane.showMessageDialog(null, "No es pocible guardar" + e.getMessage());
    }//GEN-LAST:event_btguardarActionPerformed
    }
    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        bloquear() ; // mandamos a llamarel void
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_btsalirActionPerformed

    private void cbnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnombreActionPerformed
    cbnombre.transferFocus();           // TODO add your handling code here:
    }//GEN-LAST:event_cbnombreActionPerformed

    private void cbprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbprecioActionPerformed
    cbprecio.transferFocus();    // TODO add your handling code here:
    }//GEN-LAST:event_cbprecioActionPerformed

    private void cbpresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpresentacionActionPerformed
    cbpresentacion.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_cbpresentacionActionPerformed

    private void cbmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmarcaActionPerformed
    cbmarca.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_cbmarcaActionPerformed

    private void cbcantSustanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcantSustanciaActionPerformed
    cbcantSustancia.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_cbcantSustanciaActionPerformed

    private void cbpresentacionSustanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpresentacionSustanciaActionPerformed
    cbpresentacionSustancia.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_cbpresentacionSustanciaActionPerformed

    private void cbtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoActionPerformed
    cbtipo.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_cbtipoActionPerformed

    private void txtid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid1ActionPerformed
    txtid1.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtid1ActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
    txtcantidad.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtexistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexistenciaActionPerformed
    txtexistencia.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtexistenciaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Productos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JButton btmostrar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btsalir;
    private javax.swing.JComboBox cbcantSustancia;
    private javax.swing.JComboBox cbmarca;
    private javax.swing.JComboBox cbnombre;
    private javax.swing.JComboBox cbprecio;
    private javax.swing.JComboBox cbpresentacion;
    private javax.swing.JComboBox cbpresentacionSustancia;
    private javax.swing.JComboBox cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tdatos;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtexistencia;
    private javax.swing.JTextField txtid1;
    // End of variables declaration//GEN-END:variables
int filas;
private void cargar(){
    
}
}
