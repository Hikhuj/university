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
public class subcategory extends javax.swing.JInternalFrame {

    /**
     * Creates new form subcategory
     */
    public subcategory() {
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

        jTextField1 = new javax.swing.JTextField();
        category = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        subcategory = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("SubCategory Update");
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
            }
        });
        getContentPane().setLayout(null);

        category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Category" }));
        getContentPane().add(category);
        category.setBounds(170, 30, 160, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 130, 110, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Type");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 80, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Company");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 30, 90, 30);

        subcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subcategoryActionPerformed(evt);
            }
        });
        getContentPane().add(subcategory);
        subcategory.setBounds(170, 80, 160, 30);

        setBounds(0, 0, 365, 208);
    }// </editor-fold>//GEN-END:initComponents

    private void subcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subcategoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String path = "jdbc:mysql://localhost/";
        String place = "factorydb";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "insert into category values(?,?)";
                PreparedStatement mystatement = myconnection.prepareStatement(q);

                mystatement.setString(1, category.getSelectedItem().toString());
                mystatement.setString(2, subcategory.getText());
                mystatement.execute();
                //    label.setText("Saved Succesfully");
                JOptionPane.showMessageDialog(rootPane, "Saved Successfully");
                subcategory.setText(null);

                mystatement.close();
                myconnection.close();

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "Error in Query" + ae.getMessage());
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error in connection" + ae.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        String path = "jdbc:mysql://localhost/";
        String place = "factorydb";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "select * from Company";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                ResultSet myresult = mystatement.executeQuery();
                if (myresult.next()) {
                    do {
                        category.addItem(myresult.getString("company"));
                    } while (myresult.next());
                }
                mystatement.close();
                myconnection.close();

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "No records exist");
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error in connection" + ae.getMessage());
        }

    }//GEN-LAST:event_formInternalFrameActivated
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox category;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField subcategory;
    // End of variables declaration//GEN-END:variables
}
