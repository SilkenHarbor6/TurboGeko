/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.MT;

import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class frmProductosinreceta extends javax.swing.JFrame {

    /**
     * Creates new form frmProductosinreceta
     */
    public frmProductosinreceta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloPagosProveedores1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPagosProveedores1.setBackground(new java.awt.Color(51, 51, 255));
        lblTituloPagosProveedores1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTituloPagosProveedores1.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPagosProveedores1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloPagosProveedores1.setText("                          Agregar producto sin Receta");
        lblTituloPagosProveedores1.setToolTipText("");
        lblTituloPagosProveedores1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTituloPagosProveedores1.setOpaque(true);
        getContentPane().add(lblTituloPagosProveedores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 55));

        jButton1.setText("Agregar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel2.setText("Nombre del producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 20));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Recipe r = new Recipe();
        try {
            frmProducto f = new frmProducto();
            f.idProducto = r.agregarProducto(nombre.getText().trim().toUpperCase());
            JOptionPane.showMessageDialog(null, "Producto agergado!\nAhora procederás a ingresar los materiales necesarios para la fabricación de tu nuevo product: " + nombre.getText().trim().toUpperCase());
            f.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo falló");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmProductosinreceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductosinreceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductosinreceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductosinreceta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductosinreceta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTituloPagosProveedores1;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}