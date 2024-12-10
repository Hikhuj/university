package companyjdr;

import clases.MenuClases;

public class MuestraTodosPasajeros extends javax.swing.JFrame {

    MenuClases mc = new MenuClases();
    Main menu = new Main();

    public MuestraTodosPasajeros() {
        initComponents();
        visualizadatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        todosLosPasajerosLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        muestraPasajerosTxtArea = new javax.swing.JTextArea();
        volverBtn = new javax.swing.JButton();
        fondoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        todosLosPasajerosLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        todosLosPasajerosLbl.setForeground(new java.awt.Color(240, 240, 240));
        todosLosPasajerosLbl.setText("Todos los pasajeros");
        getContentPane().add(todosLosPasajerosLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 370, -1));

        muestraPasajerosTxtArea.setColumns(20);
        muestraPasajerosTxtArea.setRows(5);
        muestraPasajerosTxtArea.setEditable(false);
        jScrollPane2.setViewportView(muestraPasajerosTxtArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 570, 400));

        volverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton atras.png"))); // NOI18N
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 60, 50));

        fondoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo avion company2.jpg"))); // NOI18N
        getContentPane().add(fondoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        Main inicio = new Main();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    public void visualizadatos() {
        //llamamos la información y la pegamos en el textArea
        muestraPasajerosTxtArea.setText(mc.imprimeTodosLosPasajeros());
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
            java.util.logging.Logger.getLogger(MuestraTodosPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MuestraTodosPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MuestraTodosPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MuestraTodosPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MuestraTodosPasajeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoLbl;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea muestraPasajerosTxtArea;
    private javax.swing.JLabel todosLosPasajerosLbl;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
