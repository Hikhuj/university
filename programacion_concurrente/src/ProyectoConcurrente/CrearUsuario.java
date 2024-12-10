/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoConcurrente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class CrearUsuario extends javax.swing.JFrame {

    public CrearUsuario() {
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

        jLabelContrasenia = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTxtUsuario = new javax.swing.JTextField();
        jTxtNombre = new javax.swing.JTextField();
        jTxtContrasenia = new javax.swing.JPasswordField();
        btnCrearCuenta = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Admin");
        getContentPane().setLayout(null);

        jLabelContrasenia.setText("Contraseña");
        getContentPane().add(jLabelContrasenia);
        jLabelContrasenia.setBounds(40, 190, 80, 30);

        jLabelUsuario.setText("Usuario");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(40, 140, 80, 30);

        jLabelNombre.setText("Nombre");
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(40, 90, 80, 30);

        jTxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtUsuario);
        jTxtUsuario.setBounds(150, 140, 150, 30);

        jTxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtNombre);
        jTxtNombre.setBounds(150, 90, 150, 30);

        jTxtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtContraseniaActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtContrasenia);
        jTxtContrasenia.setBounds(150, 190, 150, 30);

        btnCrearCuenta.setBackground(new java.awt.Color(2, 126, 96));
        btnCrearCuenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(236, 240, 241));
        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearCuenta);
        btnCrearCuenta.setBounds(80, 250, 180, 30);
        getContentPane().add(label);
        label.setBounds(490, 450, 0, 0);

        jPanel1.setBackground(new java.awt.Color(2, 126, 96));
        jPanel1.setForeground(new java.awt.Color(236, 240, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Crear Cuenta de Administrador");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 200, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 330, 70);

        setSize(new java.awt.Dimension(345, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombreActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        String path = "jdbc:mysql://localhost/";
        String place = "ulacitProyecto";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "INSERT INTO crearUsuario VALUES(?,?,?,?)";
                PreparedStatement mystatement = myconnection.prepareStatement(q);

                mystatement.setString(1, jTxtUsuario.getText());
                mystatement.setString(2, "Administrador");
                mystatement.setString(3, jTxtNombre.getText());
                mystatement.setString(4, jTxtContrasenia.getText());

                mystatement.execute();
                //    label.setText("Saved Succesfully");
                JOptionPane.showMessageDialog(rootPane, "Cuenta creada exitosamente");
                mystatement.close();
                myconnection.close();
                Marco1 obj = new Marco1();
                obj.setVisible(true);
                this.dispose();

            } catch (Exception ae) {
                label.setText("Error en consulta" + ae.getMessage());
            }
        } catch (Exception ae) {
            label.setText("Error en conexión" + ae.getMessage());
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void jTxtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtContraseniaActionPerformed

    private void jTxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelContrasenia;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jTxtContrasenia;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtUsuario;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
