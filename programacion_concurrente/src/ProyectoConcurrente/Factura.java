/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoConcurrente;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Factura extends javax.swing.JInternalFrame {

    public Factura() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBoxElegirProducto = new javax.swing.JComboBox();
        jLabelSeleccionarProducto = new javax.swing.JLabel();
        btnCalcularFactura = new javax.swing.JButton();
        btnSalvarFactura = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTxtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();
        jLabelNumFactura = new javax.swing.JLabel();
        jLabelCompania = new javax.swing.JLabel();
        jComboBoxElegirCompania = new javax.swing.JComboBox();
        jComboBoxTipo = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Factura");
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Fecha");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 100, 70, 20);

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNombre.setText("Nombre");
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(150, 140, 120, 27);

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 100, 150, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 140, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Costo Total");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(610, 490, 100, 30);

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(710, 490, 130, 30);

        jComboBoxElegirProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir Producto" }));
        jComboBoxElegirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxElegirProductoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxElegirProducto);
        jComboBoxElegirProducto.setBounds(300, 240, 150, 30);

        jLabelSeleccionarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSeleccionarProducto.setText("Seleccionar Producto");
        getContentPane().add(jLabelSeleccionarProducto);
        jLabelSeleccionarProducto.setBounds(150, 240, 140, 30);

        btnCalcularFactura.setBackground(new java.awt.Color(2, 126, 96));
        btnCalcularFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcularFactura.setForeground(new java.awt.Color(236, 240, 241));
        btnCalcularFactura.setText("Calcular Factura");
        btnCalcularFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularFactura);
        btnCalcularFactura.setBounds(440, 490, 130, 30);

        btnSalvarFactura.setBackground(new java.awt.Color(2, 126, 96));
        btnSalvarFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvarFactura.setForeground(new java.awt.Color(236, 240, 241));
        btnSalvarFactura.setText("Salvar Factura");
        btnSalvarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarFactura);
        btnSalvarFactura.setBounds(710, 540, 120, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Producto", "Compañia", "Precio", "Cantidad Actual", "Cantidad", "Total", "Cantidad Restante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 300, 800, 180);

        jTxtFecha.setEditable(false);
        getContentPane().add(jTxtFecha);
        jTxtFecha.setBounds(580, 100, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(510, 140, 100, 30);

        try {
            jFormattedTextFieldTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldTelefono);
        jFormattedTextFieldTelefono.setBounds(580, 140, 150, 30);

        jLabelNumFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNumFactura.setText("Número Factura");
        getContentPane().add(jLabelNumFactura);
        jLabelNumFactura.setBounds(150, 100, 130, 27);

        jLabelCompania.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCompania.setText("Compañía");
        getContentPane().add(jLabelCompania);
        jLabelCompania.setBounds(150, 190, 120, 30);

        jComboBoxElegirCompania.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir Compañia" }));
        jComboBoxElegirCompania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxElegirCompaniaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxElegirCompania);
        jComboBoxElegirCompania.setBounds(300, 190, 150, 30);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir Tipo" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTipo);
        jComboBoxTipo.setBounds(580, 190, 150, 30);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Tipo");
        getContentPane().add(jLabel39);
        jLabel39.setBounds(510, 190, 50, 30);

        jPanel1.setBackground(new java.awt.Color(2, 126, 96));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 51));
        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(236, 240, 241));
        jLabelTitulo.setText("Factura");
        jPanel1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 50, 20));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 70);

        setBounds(0, 0, 877, 622);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBoxElegirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxElegirProductoActionPerformed



        String path = "jdbc:mysql://localhost/";
        String place = "ulacitProyecto";

        if (jComboBoxElegirProducto.getSelectedIndex() > 0) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection myconnection = DriverManager.getConnection(path + place, "root", "");
                String idMiembro, nombre, telefono, cantidad;
                try {
                    String q = "SELECT * FROM productos WHERE items=?";
                    PreparedStatement mystatement = myconnection.prepareStatement(q);
                    mystatement.setString(1, jComboBoxElegirProducto.getSelectedItem().toString());
                    DefaultTableModel mymodel = (DefaultTableModel) jTable1.getModel();
                    ResultSet myresult = mystatement.executeQuery();

                    if (myresult.next()) {
                        do {
                            idMiembro = myresult.getString("items");
                            nombre = myresult.getString("categoria");
                            telefono = myresult.getString("precios");
                            cantidad = myresult.getString("cantidad");
                            mymodel.addRow(new Object[]{idMiembro, nombre, telefono, cantidad});
                        } while (myresult.next());
                    }
                    mystatement.close();
                    myconnection.close();

                } catch (Exception ae) {
                    JOptionPane.showMessageDialog(rootPane, "Error en consulta de Item " + ae.getMessage());
                }
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "Error en conexión " + ae.getMessage());
            }
        }

    }//GEN-LAST:event_jComboBoxElegirProductoActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        java.util.Date obj = new java.util.Date();
        SimpleDateFormat myformat = new SimpleDateFormat("dd-MM-yyyy");
        String dateofbill = myformat.format(obj);
        jTxtFecha.setText(dateofbill);
        String path = "jdbc:mysql://localhost/";
        String place = "ulacitProyecto";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "SELECT * FROM productos";
                PreparedStatement mystatement = myconnection.prepareStatement(q);


                ResultSet myresult = mystatement.executeQuery();

                if (myresult.next()) {

                    do {
                        jComboBoxElegirProducto.addItem(myresult.getString("items"));
                    } while (myresult.next());
                }

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "No existen registros");
            }
            try {
                String q = "SELECT * FROM factura ORDER BY idFactura";
                PreparedStatement mystatement = myconnection.prepareStatement(q);


                ResultSet myresult = mystatement.executeQuery();

                if (myresult.next()) {
                    myresult.last();
                    int n = Integer.parseInt(myresult.getString(1));
                    n++;
                    jTextField1.setText("" + n);
                } else {
                    jTextField1.setText("1");
                }
                mystatement.close();


            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, " error en busqueda de id " + ae.getMessage());
            }

            try {
                String q = "SELECT * FROM compania";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                ResultSet myresult = mystatement.executeQuery();
                if (myresult.next()) {
                    do {
                        jComboBoxElegirCompania.addItem(myresult.getString("compañia"));
                    } while (myresult.next());
                }
                mystatement.close();
                myconnection.close();

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "Error en consulta de compañia " + ae.getMessage());
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error en conexión" + ae.getMessage());
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnCalcularFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularFacturaActionPerformed

        int r = jTable1.getRowCount();
        double rate = 0, qty = 0, total = 0, net = 0, rem_qty = 0, cur_qty = 0;
        
        //    DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
        
        for (int i = 0; i < r; i++) {
            rate = Double.parseDouble(jTable1.getValueAt(i, 2).toString());
            qty = Double.parseDouble(jTable1.getValueAt(i, 4).toString());
            cur_qty = Double.parseDouble(jTable1.getValueAt(i, 3).toString());
            total = rate * qty;
            jTable1.setValueAt("" + total, i, 5);
            net += total;
            rem_qty = cur_qty - qty;
            //      if(rem_qty<0)
            //    {
            //     jButton2.setVisible(false);
            //    JOptionPane.showMessageDialog(rootPane, "Error in Total");
            //  mymodel.setRowCount(0);

            //        }
            //      else if(rem_qty>0)
            //     {
            //       jButton2.setVisible(true);
            //  }
            jTable1.setValueAt("" + rem_qty, i, 6);
            //if(total<0 && rem_qty<0)
            //      {
            //        jButton2.setVisible(false);
            //      JOptionPane.showMessageDialog(rootPane, "Error in Total");
            //}
        }

        jTextField3.setText(String.valueOf(net));

    }//GEN-LAST:event_btnCalcularFacturaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSalvarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFacturaActionPerformed

        String path = "jdbc:mysql://localhost/";
        String place = "ulacitProyecto";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            String productos = "", cantidad = "";
            try {
                String q = "INSERT INTO factura VALUES(?,?,?,?,?,?,?)";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                mystatement.setString(1, jTextField1.getText());
                mystatement.setString(2, jTextField2.getText());
                mystatement.setString(5, jTextField3.getText());
                java.util.Date obj = new java.util.Date();
                SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
                String dateofbill = myformat.format(obj);

                mystatement.setString(7, dateofbill);

                mystatement.setString(6, jFormattedTextFieldTelefono.getText());

                int r = jTable1.getRowCount();
                for (int i = 0; i < r; i++) {
                    productos += jTable1.getValueAt(i, 0) + ",";
                    cantidad += jTable1.getValueAt(i, 4) + ",";
                }

                mystatement.setString(3, productos);
                mystatement.setString(4, cantidad);

                mystatement.execute();
                mystatement.close();
                JOptionPane.showMessageDialog(rootPane, "Factura salvada");

                this.dispose();
                Factura obj2 = new Factura();
                obj2.setVisible(true);
                Marco1.jDesktopPane1.add(obj2);

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "factura no salvada" + ae.getMessage());
            }

            int r = jTable1.getRowCount();
            for (int i = 0; i < r; i++) {
                try {
                    String q = "UPDATE productos SET cantidades=? WHERE items=?";
                    PreparedStatement mystatement = myconnection.prepareStatement(q);
                    mystatement.setString(1, jTable1.getValueAt(i, 6).toString());
                    mystatement.setString(2, jTable1.getValueAt(i, 0).toString());

                    mystatement.executeUpdate();

                    mystatement.close();

                } catch (Exception ae) {
                    JOptionPane.showMessageDialog(rootPane, "Error en consulta" + ae.getMessage());
                }
            }

            myconnection.close();
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error en conexión" + ae.getMessage());
        }

    }//GEN-LAST:event_btnSalvarFacturaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

private void jComboBoxElegirCompaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxElegirCompaniaActionPerformed
    String path = "jdbc:mysql://localhost/";
    String place = "ulacitProyecto";
    if (jComboBoxElegirCompania.getSelectedIndex() > 0) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");

            try {
                String q = "SELECT subcategoria FROM categoria WHERE categoria1=?";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                mystatement.setString(1, jComboBoxElegirCompania.getSelectedItem().toString());
                ResultSet myresult = mystatement.executeQuery();
                jComboBoxTipo.removeAllItems();
                if (myresult.next()) {
                    jComboBoxTipo.addItem("Elegir tipo");
                    do {
                        jComboBoxTipo.addItem(myresult.getString("subcategoria"));
                    } while (myresult.next());
                }
                mystatement.close();
                myconnection.close();

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "Resultado no encontrado");
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error en conexión" + ae.getMessage());
        }
    }
}//GEN-LAST:event_jComboBoxElegirCompaniaActionPerformed

private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed


    if (jComboBoxTipo.getSelectedIndex() > 0) {
        String path = "jdbc:mysql://localhost/";
        String place = "ulacitProyecto";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "SELECT * FROM productos WHERE categorias=? AND subcategorias=?";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                mystatement.setString(1, jComboBoxElegirCompania.getSelectedItem().toString());
                mystatement.setString(2, jComboBoxTipo.getSelectedItem().toString());
                ResultSet myresult = mystatement.executeQuery();


                jComboBoxElegirProducto.removeAllItems();
                if (myresult.next()) {
                    jComboBoxElegirProducto.addItem("Elegir producto");
                    do {
                        jComboBoxElegirProducto.addItem(myresult.getString("items"));
                    } while (myresult.next());
                }
                mystatement.close();
                myconnection.close();

            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "Error en consulta " + ae.getMessage());
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(rootPane, "Error en conexión" + ae.getMessage());
        }

    }

}//GEN-LAST:event_jComboBoxTipoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularFactura;
    private javax.swing.JButton btnSalvarFactura;
    private javax.swing.JComboBox jComboBoxElegirCompania;
    private javax.swing.JComboBox jComboBoxElegirProducto;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCompania;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumFactura;
    private javax.swing.JLabel jLabelSeleccionarProducto;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTxtFecha;
    // End of variables declaration//GEN-END:variables
}
