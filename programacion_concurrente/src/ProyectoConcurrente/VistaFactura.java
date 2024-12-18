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


public class VistaFactura extends javax.swing.JInternalFrame {

    public VistaFactura() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabelTituloFacturaDetalles = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ver Factura");
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
                "Factura No.", "Nombre Proveedor", "Número de Contacto", "Producto", "Cantidad", "Valor Total", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 70, 970, 500);

        jPanel1.setBackground(new java.awt.Color(2, 126, 96));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloFacturaDetalles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTituloFacturaDetalles.setText("Factura de Detalles");
        jPanel1.add(jLabelTituloFacturaDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1070, 50);

        setBounds(0, 0, 1065, 639);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        String path = "jdbc:mysql://localhost/";
        String place = "ulacitProyecto";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            String idFactura, proveedor, telefono, productos, cantidad, total, fecha;
            try {
                String q = "SELECT * FROM factura";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                DefaultTableModel mymodel = (DefaultTableModel) jTable1.getModel();
                ResultSet myresult = mystatement.executeQuery();
                if (myresult.next()) {
                    do {
                        idFactura = myresult.getString("idFactura");
                        proveedor = myresult.getString("proveedor");
                        telefono = myresult.getString("telefono");
                        productos = myresult.getString("productos");
                        //     String p[]=product.split(",");
                        //   for(int i=0;i<10;i++)
                        //{
                            //       product=myresult.getString("productos");
                            //    String p[]=product.split(",");
                            //    product=(p[i]+"\n");
                        //}
                        productos = myresult.getString("productos");
                        cantidad = myresult.getString("cantidad");
                        total = myresult.getString("total");
                        fecha = myresult.getString("fecha");
                        String a[] = fecha.split("-");
                        fecha = (a[2] + "-" + a[1] + "-" + a[0]);
                        mymodel.addRow(new Object[]{idFactura, proveedor, telefono, productos, cantidad, total, fecha});
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
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTituloFacturaDetalles;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
