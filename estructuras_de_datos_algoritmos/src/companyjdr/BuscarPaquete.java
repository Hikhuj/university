package companyjdr;

import clases.MenuClases;
import javax.swing.JOptionPane;

public class BuscarPaquete extends javax.swing.JFrame {

    Main inicio;
    MenuClases mc;
    
    public BuscarPaquete() {
        initComponents();
        mc = new MenuClases();
        inicio = new Main();;
    }
    
    public boolean verificaNombreVacio() {
        //metodo que verifica que el usuario no deje camppos sin rellenar 
        boolean result = false;

        if (destinoInsertadoTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llenar el campo");
        } else {
            result = true;
            buscarBtn.setEnabled(true);
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volverBtn = new javax.swing.JButton();
        ordenLbl = new javax.swing.JLabel();
        destinoInsertadoTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        modificarBtn = new javax.swing.JButton();
        actividadesDelPaqueteEncontradoLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        actividadesDePaqueteencontradoTxtArea = new javax.swing.JTextArea();
        fondoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton atras.png"))); // NOI18N
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 60, 50));

        ordenLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ordenLbl.setForeground(new java.awt.Color(240, 240, 240));
        ordenLbl.setText("Inserte el nombre del paquete que busca");
        getContentPane().add(ordenLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 400, 40));

        destinoInsertadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoInsertadoTxtActionPerformed(evt);
            }
        });
        destinoInsertadoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                destinoInsertadoTxtKeyReleased(evt);
            }
        });
        getContentPane().add(destinoInsertadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 340, -1));

        buscarBtn.setBackground(new java.awt.Color(255, 102, 51));
        buscarBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscarBtn.setForeground(new java.awt.Color(240, 240, 240));
        buscarBtn.setText("Buscar");
        buscarBtn.setToolTipText("");
        buscarBtn.setDoubleBuffered(true);
        buscarBtn.setEnabled(false);
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 80, -1));

        modificarBtn.setBackground(new java.awt.Color(255, 102, 51));
        modificarBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modificarBtn.setForeground(new java.awt.Color(240, 240, 240));
        modificarBtn.setText("Modificar");
        modificarBtn.setEnabled(false);
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });
        modificarBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                modificarBtnKeyReleased(evt);
            }
        });
        getContentPane().add(modificarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 140, 50));

        actividadesDelPaqueteEncontradoLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        actividadesDelPaqueteEncontradoLbl.setForeground(new java.awt.Color(240, 240, 240));
        actividadesDelPaqueteEncontradoLbl.setText("Actividades");
        getContentPane().add(actividadesDelPaqueteEncontradoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        actividadesDePaqueteencontradoTxtArea.setColumns(20);
        actividadesDePaqueteencontradoTxtArea.setRows(5);
        jScrollPane1.setViewportView(actividadesDePaqueteencontradoTxtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 300, 220));

        fondoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo avion company2.jpg"))); // NOI18N
        getContentPane().add(fondoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void destinoInsertadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoInsertadoTxtActionPerformed
    
    }//GEN-LAST:event_destinoInsertadoTxtActionPerformed

    private void destinoInsertadoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_destinoInsertadoTxtKeyReleased
    verificaNombreVacio();
    }//GEN-LAST:event_destinoInsertadoTxtKeyReleased

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        // Variables
        String datosPaquete;

        // Enviar destino y obtener el texto de la actividad del destino
        datosPaquete = mc.encuentraPaqueteListaPorDestino(destinoInsertadoTxt.getText());

        // Si el arreglo de datos obtenidos es diferente de vacio se prepopulan los datos en los campos de texto
        // mostrando los datos antiguos del paquete
        if (datosPaquete != "") {
            // Popular TextFields con datos actuales de paquetes
            actividadesDePaqueteencontradoTxtArea.setText(datosPaquete);        
            modificarBtn.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Paquete no encontrado");
            inicio.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        //boton que modificara las actividades de los paquetes que el usuario busque
        if (verificaNombreVacio()) {
            mc.controlBuscarYModificarPaquete(
                                            destinoInsertadoTxt.getText(),
                                            actividadesDePaqueteencontradoTxtArea.getText());

            JOptionPane.showMessageDialog(null, "Cambios guardados correctamente");
            inicio.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void modificarBtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modificarBtnKeyReleased

    }//GEN-LAST:event_modificarBtnKeyReleased

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
            java.util.logging.Logger.getLogger(BuscarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea actividadesDePaqueteencontradoTxtArea;
    private javax.swing.JLabel actividadesDelPaqueteEncontradoLbl;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField destinoInsertadoTxt;
    private javax.swing.JLabel fondoLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JLabel ordenLbl;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
