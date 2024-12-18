/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoConcurrente;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Ingreso extends javax.swing.JFrame {

    public Ingreso() {
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
        jTxtUsuario = new javax.swing.JTextField();
        jTxtContrasenia = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelTituloIngresar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelContrasenia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelContrasenia.setText("Contraseña");
        getContentPane().add(jLabelContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, 30));

        jTxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 150, 30));
        getContentPane().add(jTxtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 150, 30));

        btnIngresar.setBackground(new java.awt.Color(2, 126, 96));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(236, 240, 241));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 120, 40));
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuario.setText("Usuario");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 100, 30));

        jPanel1.setBackground(new java.awt.Color(2, 126, 96));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloIngresar.setBackground(new java.awt.Color(236, 240, 241));
        jLabelTituloIngresar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTituloIngresar.setForeground(new java.awt.Color(236, 240, 241));
        jLabelTituloIngresar.setText("Bienvenidos");
        jPanel1.add(jLabelTituloIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 120));

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 140, 240));

        setSize(new java.awt.Dimension(504, 395));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String path = "jdbc:mysql://localhost/";
        String place = "ulacitProyecto";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                // Consulta a la tabla de crearUsuario --> Tabla de Usuario
                String q = "SELECT * FROM crearusuario WHERE nombreUsuario=? AND contrasenia=?";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                mystatement.setString(1, jTxtUsuario.getText());
                mystatement.setString(2, jTxtContrasenia.getText());
                ResultSet myresult = mystatement.executeQuery();
                if (myresult.next()) {
                    if (myresult.getString("tipoUsuario").equals("Administrador")) {
                        Marco1 obj = new Marco1();
                        obj.setVisible(true);
                        this.setVisible(false);
                    } else if (myresult.getString("tipoUsuario").equals("Vendedor")) {
                        Marco11 obj = new Marco11();
                        obj.setVisible(true);
                        this.setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Usuario/Contraseña errónea");
                }
                
                mystatement.close();
                myconnection.close();
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "Error en consulta" + ae.getMessage());
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error en conexión" + ae.getMessage());
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabelContrasenia;
    private javax.swing.JLabel jLabelTituloIngresar;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jTxtContrasenia;
    private javax.swing.JTextField jTxtUsuario;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
