/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoConcurrente;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JInternalFrame {

    public Menu() {
        initComponents();
    }

    /**
     * This method is called FROM within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelNumeroTelefono = new javax.swing.JLabel();
        jLabelPuesto = new javax.swing.JLabel();
        jLabelNumId = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        postbox = new javax.swing.JComboBox();
        jTxtNumTelefono = new javax.swing.JFormattedTextField();
        box1 = new javax.swing.JRadioButton();
        box2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAreaDireccion = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        jLabelGenero = new javax.swing.JLabel();
        jLabelFecNacimiento = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox();
        jComboBoxMes = new javax.swing.JComboBox();
        jComboBoxAnio = new javax.swing.JComboBox();
        jTxtNumeroId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelTituloIngreseInfo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Agregar Empleado");
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

        jLabelDireccion.setText("Dirección");
        getContentPane().add(jLabelDireccion);
        jLabelDireccion.setBounds(30, 330, 80, 30);

        jLabelNumeroTelefono.setText("Número Teléfono");
        getContentPane().add(jLabelNumeroTelefono);
        jLabelNumeroTelefono.setBounds(30, 200, 110, 30);

        jLabelPuesto.setText("Puesto");
        getContentPane().add(jLabelPuesto);
        jLabelPuesto.setBounds(30, 150, 80, 30);

        jLabelNumId.setText("Número de Id");
        getContentPane().add(jLabelNumId);
        jLabelNumId.setBounds(30, 70, 80, 30);

        jLabelNombre.setText("Nombre");
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(30, 110, 80, 30);
        getContentPane().add(jTxtNombre);
        jTxtNombre.setBounds(190, 110, 200, 30);

        postbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir Puesto", "Gerente", "Supervisor", "Encargado", "Empleados", "Guardia Seguridad" }));
        postbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postboxActionPerformed(evt);
            }
        });
        getContentPane().add(postbox);
        postbox.setBounds(190, 150, 200, 30);

        try {
            jTxtNumTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTxtNumTelefono);
        jTxtNumTelefono.setBounds(190, 200, 200, 30);

        buttonGroup1.add(box1);
        box1.setText("Masculino");
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        getContentPane().add(box1);
        box1.setBounds(190, 240, 110, 28);

        buttonGroup1.add(box2);
        box2.setText("Femenino");
        getContentPane().add(box2);
        box2.setBounds(300, 240, 90, 28);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTxtAreaDireccion.setColumns(20);
        jTxtAreaDireccion.setRows(5);
        jScrollPane1.setViewportView(jTxtAreaDireccion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 330, 200, 110);

        btnGuardar.setBackground(new java.awt.Color(2, 126, 96));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(236, 240, 241));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(160, 460, 110, 31);

        jLabelGenero.setText("Género");
        getContentPane().add(jLabelGenero);
        jLabelGenero.setBounds(30, 240, 80, 30);

        jLabelFecNacimiento.setText("Fecha de Nacimiento");
        getContentPane().add(jLabelFecNacimiento);
        jLabelFecNacimiento.setBounds(30, 280, 130, 30);

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Día" }));
        jComboBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDia);
        jComboBoxDia.setBounds(190, 280, 60, 30);

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes" }));
        getContentPane().add(jComboBoxMes);
        jComboBoxMes.setBounds(250, 280, 70, 30);

        jComboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año" }));
        getContentPane().add(jComboBoxAnio);
        jComboBoxAnio.setBounds(320, 280, 70, 30);

        jTxtNumeroId.setEditable(false);
        getContentPane().add(jTxtNumeroId);
        jTxtNumeroId.setBounds(190, 70, 200, 30);

        jPanel1.setBackground(new java.awt.Color(2, 126, 96));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloIngreseInfo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTituloIngreseInfo.setForeground(new java.awt.Color(236, 240, 241));
        jLabelTituloIngreseInfo.setText("Ingrese su Información");
        jPanel1.add(jLabelTituloIngreseInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 430, 60);

        setBounds(0, 0, 428, 535);
    }// </editor-fold>//GEN-END:initComponents

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box1ActionPerformed
    
    void showid() {
        String path = "jdbc:mysql://localhost/";
        String place = "ulacitProyecto";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            PreparedStatement myStatement = null;
            try {
                String q = "SELECT MAX(ID) FROM miembro";
                myStatement = myconnection.prepareStatement(q);
                ResultSet myresult = myStatement.executeQuery();
                if (myresult.next()) {
                    int oldID = Integer.parseInt(myresult.getString(01));
                    int newID = oldID + 1;
                    jTxtNumeroId.setText(String.valueOf(newID));
                }
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "Error en consulta" + ae.getMessage());
            } finally {
                myStatement.close();
                myconnection.close();
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error en consulta" + ae.getMessage());
        }
}
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String path = "jdbc:mysql://localhost/";
        String place = "ulacitProyecto";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "INSERT INTO miembro VALUES(?,?,?,?,?,?,?)";
                PreparedStatement mystatement = myconnection.prepareStatement(q);

                mystatement.setString(1, jTxtNumeroId.getText());
                mystatement.setString(2, jTxtNombre.getText());
                mystatement.setString(3, postbox.getSelectedItem().toString());
                mystatement.setString(4, jTxtNumTelefono.getText());
                if (box1.isSelected()) {
                    mystatement.setString(5, "Masculino");
                } else if (box2.isSelected()) {
                    mystatement.setString(5, "Femenino");
                }
                mystatement.setString(6, jTxtAreaDireccion.getText());
                String dob = jComboBoxAnio.getSelectedItem() + "-" + jComboBoxMes.getSelectedItem() + "-" + jComboBoxDia.getSelectedItem();
                mystatement.setString(7, dob);

                mystatement.execute();
                JOptionPane.showMessageDialog(rootPane, "Guardado exitoso");
                jTxtNumeroId.setText(null);
                jTxtNombre.setText(null);
                jTxtNumTelefono.setText(null);
                jTxtAreaDireccion.setText(null);
                buttonGroup1.clearSelection();
                postbox.setSelectedIndex(0);
                jComboBoxDia.setSelectedIndex(0);
                jComboBoxMes.setSelectedIndex(0);
                jComboBoxAnio.setSelectedIndex(0);
                mystatement.close();
                myconnection.close();

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "Error en consulta" + ae.getMessage());
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error in connection" + ae.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void postboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postboxActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        showid();

        for (int a = 1; a <= 31; a++) {
            if (a < 10) {
                jComboBoxDia.addItem("0" + a);
            } else {
                jComboBoxDia.addItem(String.valueOf(a));
            }

        }
        for (int a = 1; a <= 12; a++) {
            if (a < 10) {
                jComboBoxMes.addItem("0" + a);
            } else {
                jComboBoxMes.addItem(String.valueOf(a));
            }

        }
        for (int a = 1975; a <= 2013; a++) {
            jComboBoxAnio.addItem(String.valueOf(a));
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void jComboBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDiaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton box1;
    private javax.swing.JRadioButton box2;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jComboBoxAnio;
    private javax.swing.JComboBox jComboBoxDia;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFecNacimiento;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumId;
    private javax.swing.JLabel jLabelNumeroTelefono;
    private javax.swing.JLabel jLabelPuesto;
    private javax.swing.JLabel jLabelTituloIngreseInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtAreaDireccion;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JFormattedTextField jTxtNumTelefono;
    private javax.swing.JTextField jTxtNumeroId;
    private javax.swing.JComboBox postbox;
    // End of variables declaration//GEN-END:variables
}
