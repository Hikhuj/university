/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoConcurrente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sharma1
 */
public class viewproducts extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewemployee
     */
    public viewproducts() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Products");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items", "Company", "Size", "Rate/Piece in Rupees", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 100, 970, 500);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Products Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 30, 170, 30);

        setBounds(0, 0, 1065, 667);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    }//GEN-LAST:event_formInternalFrameActivated

private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
    String path = "jdbc:mysql://localhost/";
    String place = "factorydb";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection myconnection = DriverManager.getConnection(path + place, "root", "");
        String item, category, subcategory, rates, quantity;
        try {
            String q = "select * from products";
            PreparedStatement mystatement = myconnection.prepareStatement(q);
            DefaultTableModel mymodel = (DefaultTableModel) jTable1.getModel();
            ResultSet myresult = mystatement.executeQuery();
            if (myresult.next()) {
                do {
                    item = myresult.getString("items");
                    category = myresult.getString("category");
                    subcategory = myresult.getString("subcategory");
                    rates = myresult.getString("rates");
                    quantity = myresult.getString("quantity");
                    mymodel.addRow(new Object[]{item, category, subcategory, rates, quantity});
                } while (myresult.next());
            } else {
                JOptionPane.showMessageDialog(rootPane, "No records exist");

            }

            mystatement.close();
            myconnection.close();

        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error " + ae.getMessage());
        }
    } catch (Exception ae) {
        JOptionPane.showMessageDialog(rootPane, "Error in connection" + ae.getMessage());
    }
}//GEN-LAST:event_formInternalFrameOpened
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
