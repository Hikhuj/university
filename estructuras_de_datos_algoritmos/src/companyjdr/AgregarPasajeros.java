package companyjdr;

import clases.MenuClases;
import clases.Pasajero;
import javax.swing.JOptionPane;

public class AgregarPasajeros extends javax.swing.JFrame {

    MenuClases mc = new MenuClases();
    Main menu = new Main();

    public AgregarPasajeros() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registroDePasajerosLbl = new javax.swing.JLabel();
        nombrePasajeroLbl = new javax.swing.JLabel();
        apellidoPasajeroLbl = new javax.swing.JLabel();
        telefonoPasajeroLbl = new javax.swing.JLabel();
        volverBtn = new javax.swing.JButton();
        paqueteDeseadoPasajeroLbl = new javax.swing.JLabel();
        acompanantesPasajeroLbl = new javax.swing.JLabel();
        nombrePasajeroTxt = new javax.swing.JTextField();
        apellidoPasajeroTxt = new javax.swing.JTextField();
        telefonoPasajeroTxt = new javax.swing.JTextField();
        paqueteDeseadoCbx = new javax.swing.JComboBox<>();
        acompanantesPasajeroCbx = new javax.swing.JComboBox<>();
        agregarPasajeroBtn = new javax.swing.JButton();
        cedulaPasajeroLbl = new javax.swing.JLabel();
        cedulaPasajeroTxt = new javax.swing.JTextField();
        fondoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registroDePasajerosLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registroDePasajerosLbl.setForeground(new java.awt.Color(255, 255, 255));
        registroDePasajerosLbl.setText("Registro de pasajeros");
        getContentPane().add(registroDePasajerosLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        nombrePasajeroLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombrePasajeroLbl.setForeground(new java.awt.Color(255, 255, 255));
        nombrePasajeroLbl.setText("Nombre:");
        getContentPane().add(nombrePasajeroLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        apellidoPasajeroLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        apellidoPasajeroLbl.setForeground(new java.awt.Color(255, 255, 255));
        apellidoPasajeroLbl.setText("Apellidos:");
        getContentPane().add(apellidoPasajeroLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        telefonoPasajeroLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telefonoPasajeroLbl.setForeground(new java.awt.Color(255, 255, 255));
        telefonoPasajeroLbl.setText("Numero de telefono:");
        getContentPane().add(telefonoPasajeroLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        volverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton atras.png"))); // NOI18N
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 60, 50));

        paqueteDeseadoPasajeroLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paqueteDeseadoPasajeroLbl.setForeground(new java.awt.Color(255, 255, 255));
        paqueteDeseadoPasajeroLbl.setText("Paquete de viaje deseado:");
        getContentPane().add(paqueteDeseadoPasajeroLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        acompanantesPasajeroLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        acompanantesPasajeroLbl.setForeground(new java.awt.Color(255, 255, 255));
        acompanantesPasajeroLbl.setText("Acompañantes:");
        getContentPane().add(acompanantesPasajeroLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        nombrePasajeroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePasajeroTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nombrePasajeroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 270, 30));
        getContentPane().add(apellidoPasajeroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 260, 30));
        getContentPane().add(telefonoPasajeroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 190, 30));

        paqueteDeseadoCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paqueteDeseadoCbxActionPerformed(evt);
            }
        });
        getContentPane().add(paqueteDeseadoCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 150, 30));

        acompanantesPasajeroCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(acompanantesPasajeroCbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 220, 30));

        agregarPasajeroBtn.setBackground(new java.awt.Color(255, 102, 51));
        agregarPasajeroBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        agregarPasajeroBtn.setForeground(new java.awt.Color(240, 240, 240));
        agregarPasajeroBtn.setText("Agregar Pasajero");
        agregarPasajeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPasajeroBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPasajeroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 160, 30));

        cedulaPasajeroLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cedulaPasajeroLbl.setForeground(new java.awt.Color(240, 240, 240));
        cedulaPasajeroLbl.setText("Cedula:");
        getContentPane().add(cedulaPasajeroLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        cedulaPasajeroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaPasajeroTxtActionPerformed(evt);
            }
        });
        getContentPane().add(cedulaPasajeroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 260, 30));

        fondoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo avion company2.jpg"))); // NOI18N
        getContentPane().add(fondoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 592, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarPasajeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPasajeroBtnActionPerformed
        
        String variable;
        
        if (validaInformacion() && validaCedula()) {
            // Obtener entero positivo o negativo para calcular los asientos disponibles
            int camposDisponibles = mc.verificarPaquetesDisponibles(acompanantesPasajeroCbx.getSelectedItem().toString(), paqueteDeseadoCbx.getSelectedItem().toString());

            // Si hay asientos disponibles o no
            if (camposDisponibles >= 0) {
                mc.agregarDatosPasajeroEnPila(nombrePasajeroTxt.getText(), apellidoPasajeroTxt.getText(), telefonoPasajeroTxt.getText(), acompanantesPasajeroCbx.getSelectedItem().toString(), cedulaPasajeroTxt.getText());
                mc.verificarDisponibilidadDeAsiento(acompanantesPasajeroCbx.getSelectedItem().toString(), paqueteDeseadoCbx.getSelectedItem().toString());
                Main inicio = new Main();
                inicio.setVisible(true);
                this.dispose();
            } else {
                // Mensaje de error con asientos disponibles para el viaje
                JOptionPane.showMessageDialog(null, "Solo nos restan " + (camposDisponibles + Integer.parseInt(acompanantesPasajeroCbx.getSelectedItem().toString())) + " campos disponibles", "Cantidad no disponible", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_agregarPasajeroBtnActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        Main inicio = new Main();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void nombrePasajeroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePasajeroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePasajeroTxtActionPerformed

    private void paqueteDeseadoCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paqueteDeseadoCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paqueteDeseadoCbxActionPerformed

    private void cedulaPasajeroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaPasajeroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaPasajeroTxtActionPerformed

    public boolean validaInformacion() {

        /*
            Validar informacion en campos
         */
        boolean result = false;
        int telefonoPasajero = 0;

        // Verificar que los datos agregados en Pasajero cumplan no sean NULL
        if (nombrePasajeroTxt.getText().isEmpty() || apellidoPasajeroTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor no dejar campos sin rellenar");
        } else {

            // Evaluar si tiene 8 digitos
            if (telefonoPasajeroTxt.getText().length() == 8) {

                // Evaluar si es un numero entero
                try {
                    telefonoPasajero = Integer.parseInt(telefonoPasajeroTxt.getText());
                    result = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un numero telefonico valido");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El numero telefonico debe ser de 8 digitos");
            }
        }

        // Retornar valor
        return result;

    }

    public boolean validaCedula() {

        boolean result = false;
        int cedulaPasajero;

        if (cedulaPasajeroTxt.getText().length() == 9) {

            try {
                cedulaPasajero = Integer.parseInt(cedulaPasajeroTxt.getText());
                result = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una cedula valida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La cedula debe contener 9 digitos");
        }
        return result;
    }

    public void llenarComboBox() {
        String arrayListPaquetes[];
        arrayListPaquetes = mc.devuelveArrayListPaquetesCompleta();
        for (String arrayListPaq : arrayListPaquetes) {
            paqueteDeseadoCbx.addItem(arrayListPaq);
        }
    }

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
            java.util.logging.Logger.getLogger(AgregarPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AgregarPasajeros().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acompanantesPasajeroCbx;
    private javax.swing.JLabel acompanantesPasajeroLbl;
    private javax.swing.JButton agregarPasajeroBtn;
    private javax.swing.JLabel apellidoPasajeroLbl;
    private javax.swing.JTextField apellidoPasajeroTxt;
    private javax.swing.JLabel cedulaPasajeroLbl;
    private javax.swing.JTextField cedulaPasajeroTxt;
    private javax.swing.JLabel fondoLbl;
    private javax.swing.JLabel nombrePasajeroLbl;
    private javax.swing.JTextField nombrePasajeroTxt;
    private javax.swing.JComboBox<String> paqueteDeseadoCbx;
    private javax.swing.JLabel paqueteDeseadoPasajeroLbl;
    private javax.swing.JLabel registroDePasajerosLbl;
    private javax.swing.JLabel telefonoPasajeroLbl;
    private javax.swing.JTextField telefonoPasajeroTxt;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
