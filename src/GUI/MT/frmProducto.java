package GUI.MT;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesar
 */
public class frmProducto extends javax.swing.JFrame {

    int indice = 0;
    Materiales Ma = new Materiales();
    ArrayList<Materiales> Lma = new ArrayList<Materiales>();
    ArrayList<Materiales> Lmar = new ArrayList<Materiales>();
    DefaultTableModel modelo1;
    DefaultTableModel modelo2;
    public int idProducto;

    /**
     * Creates new form frmProducto
     */
    public frmProducto() {
        initComponents();
        modelo1 = (DefaultTableModel) this.jTable1.getModel();
        modelo2 = (DefaultTableModel) this.jTable2.getModel();
        Lma = Ma.CargarMateriales();
        Cargar_Listado_Materiales();
        fillMeasurement();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtname = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbMeasurement = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 539));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPagosProveedores1.setBackground(new java.awt.Color(51, 51, 255));
        lblTituloPagosProveedores1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTituloPagosProveedores1.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPagosProveedores1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloPagosProveedores1.setText("   Crear Receta");
        lblTituloPagosProveedores1.setToolTipText("");
        lblTituloPagosProveedores1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTituloPagosProveedores1.setOpaque(true);
        getContentPane().add(lblTituloPagosProveedores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 55));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Precio Unitario"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 320, 180));

        jButton1.setText("Finalizar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Materiales Disponibles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Material:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 260, 870, -1));

        txtname.setEnabled(false);
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 330, -1));

        txtcosto.setEnabled(false);
        getContentPane().add(txtcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nombre de la receta:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 330, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Precio unitario", "Unidades en Stock", "Lote"
            }
        ));
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 840, 190));

        jButton2.setText("Agergar Material");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Costo Total del producto:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, 20));

        txttotal.setEnabled(false);
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Agregar Material");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 870, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Medidas:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Costo Unitario:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        getContentPane().add(cmbMeasurement, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyReleased
        indice = jTable1.getSelectedRow();
        CargarInfo();

    }//GEN-LAST:event_jTable2KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        indice = jTable1.getSelectedRow();
        CargarInfo();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Lma.get(indice).measurement = cmbMeasurement.getSelectedIndex() + 1;
        Lmar.add(Lma.get(indice));
        modelo2.setRowCount(0);
        double total = 0;
        for (int i = 0; i < Lmar.size(); i++) {
            String[] registro = {String.valueOf(Lmar.get(i).getMaterial_id()), Lmar.get(i).getMaterial_name(), String.valueOf(Lmar.get(i).getUnit_price()), String.valueOf(Lmar.get(i).getUnits_in_stock()), String.valueOf(Lmar.get(i).getNumber_lot())};
            modelo2.addRow(registro);
            total = total + Lmar.get(i).getUnit_price();
        }
        txttotal.setText(String.valueOf(total));
        Lma.remove(indice);
        Cargar_Listado_Materiales();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Recipe r = new Recipe();
            r.insertRecipe(Integer.parseInt(txtcosto.getText()), idProducto, Lmar);
            JOptionPane.showMessageDialog(null, "Agregado!");
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
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProducto().setVisible(true);
            }
        });
    }

    public void Cargar_Listado_Materiales() {
        modelo1.setRowCount(0);
        for (int i = 0; i < Lma.size(); i++) {
            String[] registro = {String.valueOf(Lma.get(i).getMaterial_id()), Lma.get(i).getMaterial_name(), String.valueOf(Lma.get(i).getUnit_price())};
            modelo1.addRow(registro);
        }
    }

    public void CargarInfo() {
        txtname.setText(Lma.get(indice).getMaterial_name());
        txtcosto.setText(String.valueOf(Lma.get(indice).getUnit_price()));
    }

    public void FinalizarReceta() {
        try {
            ConexionBD conex = new ConexionBD();
            for (int i = 0; i < Lmar.size(); i++) {
                String query = "SELECT setReceta (?,?,?,?);";
                PreparedStatement st = conex.getConnection().prepareStatement(query);
//por agregar los parametros
                st.executeUpdate();
            }
            conex.close();

        } catch (SQLException e) {

        }

    }

    private void fillMeasurement() {
        cmbMeasurement.removeAllItems();
        Recipe r = new Recipe();
        ArrayList<String> data = new ArrayList<>();
        data = r.measurementList();
        for (int i = 0; i < data.size(); i++) {
            cmbMeasurement.addItem(data.get(i));
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbMeasurement;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblTituloPagosProveedores1;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}