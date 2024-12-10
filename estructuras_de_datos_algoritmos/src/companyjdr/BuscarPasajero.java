package companyjdr;

import clases.*;
import javax.swing.JOptionPane;

public class BuscarPasajero extends javax.swing.JFrame {

    // Instanciar clase
    Pila pilaPasajero;
    MenuClases mc;
    Main inicio;

    /**
     * Creates new form BuscarPasajero
     */
    public BuscarPasajero() {
        initComponents();
        // Declarar clases
        pilaPasajero = new Pila();
        mc = new MenuClases();
        inicio = new Main();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ordenLbl = new javax.swing.JLabel();
        cedulaInsertadaTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        nombrePasajeroBuscadoLbl = new javax.swing.JLabel();
        apellidoPasajeroBuscadoLbl = new javax.swing.JLabel();
        telefonoPasajeroBuscadoLbl = new javax.swing.JLabel();
        apellidoPasajeroBuscadoTxt = new javax.swing.JTextField();
        telefonoPasajeroBuscadoTxt = new javax.swing.JTextField();
        nombrePasajeroBuscadoTxt = new javax.swing.JTextField();
        modificarBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        cedulaIncorrectaLbl = new javax.swing.JLabel();
        fondoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ordenLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ordenLbl.setForeground(new java.awt.Color(240, 240, 240));
        ordenLbl.setText("Inserte la cedula del pasajero que busca");
        getContentPane().add(ordenLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 390, -1));

        cedulaInsertadaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaInsertadaTxtActionPerformed(evt);
            }
        });
        cedulaInsertadaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cedulaInsertadaTxtKeyReleased(evt);
            }
        });
        getContentPane().add(cedulaInsertadaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 340, -1));

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

        nombrePasajeroBuscadoLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nombrePasajeroBuscadoLbl.setForeground(new java.awt.Color(240, 240, 240));
        nombrePasajeroBuscadoLbl.setText("Nombre");
        getContentPane().add(nombrePasajeroBuscadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        apellidoPasajeroBuscadoLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        apellidoPasajeroBuscadoLbl.setForeground(new java.awt.Color(240, 240, 240));
        apellidoPasajeroBuscadoLbl.setText("Apellido");
        getContentPane().add(apellidoPasajeroBuscadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        telefonoPasajeroBuscadoLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        telefonoPasajeroBuscadoLbl.setForeground(new java.awt.Color(240, 240, 240));
        telefonoPasajeroBuscadoLbl.setText("Telefono");
        getContentPane().add(telefonoPasajeroBuscadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        apellidoPasajeroBuscadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoPasajeroBuscadoTxtActionPerformed(evt);
            }
        });
        apellidoPasajeroBuscadoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoPasajeroBuscadoTxtKeyReleased(evt);
            }
        });
        getContentPane().add(apellidoPasajeroBuscadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 240, 30));

        telefonoPasajeroBuscadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoPasajeroBuscadoTxtActionPerformed(evt);
            }
        });
        telefonoPasajeroBuscadoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoPasajeroBuscadoTxtKeyReleased(evt);
            }
        });
        getContentPane().add(telefonoPasajeroBuscadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 240, 30));

        nombrePasajeroBuscadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePasajeroBuscadoTxtActionPerformed(evt);
            }
        });
        nombrePasajeroBuscadoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombrePasajeroBuscadoTxtKeyReleased(evt);
            }
        });
        getContentPane().add(nombrePasajeroBuscadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 240, 30));

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

        volverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton atras.png"))); // NOI18N
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 60, 50));

        cedulaIncorrectaLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cedulaIncorrectaLbl.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(cedulaIncorrectaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 340, 20));

        fondoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo avion company2.jpg"))); // NOI18N
        getContentPane().add(fondoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 550, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed

        if (verificaEspaciosAlModificar()) {
            mc.controlBuscarYModificarPasajero(cedulaInsertadaTxt.getText(),
                    nombrePasajeroBuscadoTxt.getText(),
                    apellidoPasajeroBuscadoTxt.getText(),
                    telefonoPasajeroBuscadoTxt.getText());

            JOptionPane.showMessageDialog(null, "Cambios guardados correctamente");
            inicio.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        String[] datosPasajero;

        datosPasajero = mc.encuentraPasajeroPilaPorCedula(cedulaInsertadaTxt.getText());

        // Si el arreglo de datos obtenidos es diferente de NULL se prepopulan los datos en los campos de texto
        // mostrando los datos antiguos del pasajero
        if (datosPasajero[0] != null) {
            // Popular TextFields con datos actuales de pasajero
            nombrePasajeroBuscadoTxt.setText(datosPasajero[0]);
            apellidoPasajeroBuscadoTxt.setText(datosPasajero[1]);
            telefonoPasajeroBuscadoTxt.setText(datosPasajero[2]);
            modificarBtn.setEnabled(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Pasajero no encontrado");
            inicio.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_buscarBtnActionPerformed

    private void cedulaInsertadaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaInsertadaTxtActionPerformed

    }//GEN-LAST:event_cedulaInsertadaTxtActionPerformed

    private void cedulaInsertadaTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaInsertadaTxtKeyReleased
        validaCedula();
    }//GEN-LAST:event_cedulaInsertadaTxtKeyReleased

    private void nombrePasajeroBuscadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePasajeroBuscadoTxtActionPerformed

    }//GEN-LAST:event_nombrePasajeroBuscadoTxtActionPerformed

    private void apellidoPasajeroBuscadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoPasajeroBuscadoTxtActionPerformed

    }//GEN-LAST:event_apellidoPasajeroBuscadoTxtActionPerformed

    private void telefonoPasajeroBuscadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoPasajeroBuscadoTxtActionPerformed

    }//GEN-LAST:event_telefonoPasajeroBuscadoTxtActionPerformed

    private void nombrePasajeroBuscadoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePasajeroBuscadoTxtKeyReleased

    }//GEN-LAST:event_nombrePasajeroBuscadoTxtKeyReleased

    private void apellidoPasajeroBuscadoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoPasajeroBuscadoTxtKeyReleased

    }//GEN-LAST:event_apellidoPasajeroBuscadoTxtKeyReleased

    private void telefonoPasajeroBuscadoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoPasajeroBuscadoTxtKeyReleased

    }//GEN-LAST:event_telefonoPasajeroBuscadoTxtKeyReleased

    private void modificarBtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modificarBtnKeyReleased

    }//GEN-LAST:event_modificarBtnKeyReleased

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
            java.util.logging.Logger.getLogger(BuscarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPasajero().setVisible(true);
            }
        });
    }

    public boolean validaCedula() {

        boolean result = false;
        int cedulaPasajero;

        if (cedulaInsertadaTxt.getText().length() == 9) {
            try {
                cedulaPasajero = Integer.parseInt(cedulaInsertadaTxt.getText());
                result = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una cedula valida");
            }
            cedulaIncorrectaLbl.setText("");
            buscarBtn.setEnabled(true);
        } else {
            cedulaIncorrectaLbl.setText("Cedula Invalida");
            buscarBtn.setEnabled(false);
        }
        return result;
    }

    public boolean verificaEspaciosAlModificar() {
        boolean result = false;

        if (nombrePasajeroBuscadoTxt.getText().isEmpty() || apellidoPasajeroBuscadoTxt.getText().isEmpty() || telefonoPasajeroBuscadoTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor primero ingrese un numero de cedula valido");
        } else {
            result = true;
        }
        return result;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoPasajeroBuscadoLbl;
    private javax.swing.JTextField apellidoPasajeroBuscadoTxt;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JLabel cedulaIncorrectaLbl;
    private javax.swing.JTextField cedulaInsertadaTxt;
    private javax.swing.JLabel fondoLbl;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JLabel nombrePasajeroBuscadoLbl;
    private javax.swing.JTextField nombrePasajeroBuscadoTxt;
    private javax.swing.JLabel ordenLbl;
    private javax.swing.JLabel telefonoPasajeroBuscadoLbl;
    private javax.swing.JTextField telefonoPasajeroBuscadoTxt;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
