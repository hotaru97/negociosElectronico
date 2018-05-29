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
public class Proveedores extends javax.swing.JFrame {
String idProveedor,nombrep,apeMatp,apePatp,direccionp,telefonop,correop,sexop,empresa;    

DefaultTableModel model,dato;
    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
        initComponents();
        limpiar();
        bloquear();
        desbloquear();
        cargar("");
    }

    void cargar (String valor){
    String [] titulos = {"idProveedor","nombrep","apePatp","apeMatp","sexop","telefonop","correop","direccionp","empresa" };
    String [] registros = new String [9];
    String sql = "SELECT * FROM proveedores WHERE CONCAT(nombrep) like '%"+valor+"%'";
    
    model = new DefaultTableModel(null, titulos);
            
    conectar cc = new conectar();
    Connection cn =cc.conexion();
        
    try {
        Statement  st =cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
    
        while (rs.next()){
                registros[0]=rs.getString("idProveedor");
                registros[1]=rs.getString("nombrep");
                registros[2]=rs.getString("apePatp");
                registros[3]=rs.getString("apeMatp");
                registros[4]=rs.getString("sexop");
                registros[5]=rs.getString("telefonop");
                registros[6]=rs.getString("correop");
                registros[7]=rs.getString("direccionp");
                registros[8]=rs.getString("empresa");
                
                model.addRow(registros);
            
                tdatos.setModel(model);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    
    }
    
    void limpiar(){
    txtidp.setText("");
    txtnombrep.setText("");
    txtapepatp.setText("");
    txtapematp.setText("");
    cbsexop.setSelectedItem(0);
    txttelefonop.setText("");
    txtcorreop.setText("");
    txtdireccionp.setText("");
    texto.setText("");
    
    }
    void bloquear(){
    txtidp.setEnabled(false);
    txtnombrep.setEnabled(false);
    txtapepatp.setEnabled(false);
    txtapematp.setEnabled(false);
    cbsexop.setEnabled(false);
    txttelefonop.setEnabled(false);
    txtcorreop.setEnabled(false);
    txtdireccionp.setEnabled(false);
    texto.setEnabled(false);
    btnuevo.setEnabled(false);
    btguardar.setEnabled(false);
    btcancelar.setEnabled(false); 
    btsalir.setEnabled(false); 
    }
    void desbloquear(){
    txtidp.setEnabled(false);
    txtnombrep.setEnabled(true);
    txtapepatp.setEnabled(true);
    txtapematp.setEnabled(true);
    cbsexop.setEnabled(true);
    txttelefonop.setEnabled(true);
    txtcorreop.setEnabled(true);
    txtdireccionp.setEnabled(true);
    texto.setEnabled(true);
    btnuevo.setEnabled(true);
    btguardar.setEnabled(true);
    btcancelar.setEnabled(true); 
    btsalir.setEnabled(true); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tdatos = new javax.swing.JTable();
        Buscar = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btmostrar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        btnuevo = new javax.swing.JButton();
        cbsexop = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        txtidp = new javax.swing.JTextField();
        txtnombrep = new javax.swing.JTextField();
        txtapepatp = new javax.swing.JTextField();
        txtapematp = new javax.swing.JTextField();
        txtdireccionp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttelefonop = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcorreop = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 470, 90));

        Buscar.setText("Buscar");
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 20));

        txtbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbuscarMouseClicked(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 110, -1));

        btmostrar.setText("Mostrar Todo");
        btmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        btmodificar.setText("Modificar");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        bteliminar.setText("Eliminar");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        btguardar.setText("Guardar");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        btnuevo.setText("Nuevo");
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        cbsexop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hombre", "Mujer" }));
        cbsexop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsexopActionPerformed(evt);
            }
        });
        getContentPane().add(cbsexop, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 150, -1));

        jLabel6.setText("Sexo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel5.setText("Direccion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, 20));

        jLabel4.setText("ApellidoMat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setText("ApellidoPat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel1.setText("IdProveedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setText("Empresa");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 150, -1));

        txtidp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpActionPerformed(evt);
            }
        });
        getContentPane().add(txtidp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 150, -1));

        txtnombrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrepActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombrep, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 150, -1));

        txtapepatp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapepatpActionPerformed(evt);
            }
        });
        getContentPane().add(txtapepatp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, -1));

        txtapematp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapematpActionPerformed(evt);
            }
        });
        getContentPane().add(txtapematp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 150, -1));

        txtdireccionp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionpActionPerformed(evt);
            }
        });
        getContentPane().add(txtdireccionp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 150, -1));

        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        txttelefonop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonopActionPerformed(evt);
            }
        });
        getContentPane().add(txttelefonop, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 150, -1));

        jLabel8.setText("Correo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        txtcorreop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreopActionPerformed(evt);
            }
        });
        getContentPane().add(txtcorreop, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 150, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/451170447.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 470, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdatosMouseClicked
        int filasele = tdatos.getSelectedRow();
        txtnombrep.setText(tdatos.getValueAt(filasele, 1 ).toString());
        txtapepatp.setText(tdatos.getValueAt(filasele, 2 ).toString());
        txtapematp.setText(tdatos.getValueAt(filasele, 3 ).toString());
        cbsexop.setSelectedItem(tdatos.getValueAt(filasele, 4 ).toString());
        txttelefonop.setText(tdatos.getValueAt(filasele, 5 ).toString());
        txtcorreop.setText(tdatos.getValueAt(filasele, 6 ).toString());
        txtdireccionp.setText(tdatos.getValueAt(filasele, 7 ).toString());
        texto.setText(tdatos.getValueAt(filasele, 8 ).toString());
        filas =filasele;
        desbloquear();
    }//GEN-LAST:event_tdatosMouseClicked

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
            String sql = "UPDATE proveedores SET nombrep=?, apePatp=?, apeMatp=?, sexop=?, telefonop=?, correop=?, direccionp=?, empresa=?" +
            "WHERE idProveedor=?";
            int fila = tdatos.getSelectedRow();
            String dato =(String) tdatos.getValueAt(fila, 0);
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, txtnombrep.getText());
            pst.setString(2, txtapepatp.getText());
            pst.setString(3, txtapematp.getText());
            pst.setString(4, cbsexop.getSelectedItem().toString());
            pst.setString(5, txttelefonop.getText());
            pst.setString(6, txtcorreop.getText());
            pst.setString(7, txtdireccionp.getText());
            pst.setString(8, texto.getText());
            pst.setString(9, dato);

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
            String sql = "delete from proveedores where idProveedor =" + tdatos.getValueAt(fila, 0);
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

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_btsalirActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        bloquear() ; // mandamos a llamarel void
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed

        conectar c = new conectar();
        Connection cn = c.conexion();

        String sql = "";
        nombrep = txtnombrep.getText();
        apePatp = txtapepatp.getText();
        apeMatp = txtapematp.getText();
        sexop = cbsexop.getSelectedItem().toString();
        telefonop = txttelefonop.getText();
        correop = txtcorreop.getText();
        direccionp = txtdireccionp.getText();
        empresa = texto.getText();

        sql= "INSERT INTO proveedores(nombrep, apePatp, apeMatp, sexop, telefonop, correop, direccionp ,empresa) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,nombrep);
            pst.setString(2,apePatp);
            pst.setString(3,apeMatp);
            pst.setString(4,sexop);
            pst.setString(5,telefonop);
            pst.setString(6,correop);
            pst.setString(7,direccionp);
            pst.setString(8,empresa);
            int n = pst.executeUpdate();
            if(n>0)
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");

            cargar("");
            // bloquear();

        } catch (SQLException ex) {
            // LogRecord Le;
            JOptionPane.showMessageDialog(null, "No es pocible guardar");
    }//GEN-LAST:event_btguardarActionPerformed
    }
    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        limpiar();    // mandamos a llamarel void
        desbloquear();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void cbsexopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsexopActionPerformed
        cbsexop.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_cbsexopActionPerformed

    private void txtidpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpActionPerformed
        txtidp.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpActionPerformed

    private void txtnombrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrepActionPerformed
        txtnombrep.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrepActionPerformed

    private void txtapepatpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapepatpActionPerformed
        txtapepatp.transferFocus();    // TODO add your handling code here:
    }//GEN-LAST:event_txtapepatpActionPerformed

    private void txtapematpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapematpActionPerformed
        txtapematp.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtapematpActionPerformed

    private void txtdireccionpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionpActionPerformed
        txtdireccionp.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionpActionPerformed

    private void txttelefonopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonopActionPerformed

    private void txtcorreopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreopActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
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
    private javax.swing.JComboBox cbsexop;
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
    private javax.swing.JTextField texto;
    private javax.swing.JTextField txtapematp;
    private javax.swing.JTextField txtapepatp;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcorreop;
    private javax.swing.JTextField txtdireccionp;
    private javax.swing.JTextField txtidp;
    private javax.swing.JTextField txtnombrep;
    private javax.swing.JTextField txttelefonop;
    // End of variables declaration//GEN-END:variables
int filas;
private void cargar(){
    
}
}
