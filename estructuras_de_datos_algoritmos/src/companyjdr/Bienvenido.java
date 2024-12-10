package companyjdr;
import clases.*;

public class Bienvenido extends javax.swing.JFrame {
    
    MenuClases mc = new MenuClases();
    Main menu = new Main();
    
    public Bienvenido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenidoLbl = new javax.swing.JLabel();
        salirBtn = new javax.swing.JButton();
        comenzarBtn = new javax.swing.JButton();
        panelLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bienvenidoLbl.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        bienvenidoLbl.setForeground(new java.awt.Color(255, 255, 255));
        bienvenidoLbl.setText("Bienvenido");
        getContentPane().add(bienvenidoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 320, 90));

        salirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Boton Salir.png"))); // NOI18N
        salirBtn.setToolTipText("");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        getContentPane().add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 70, 70));

        comenzarBtn.setBackground(new java.awt.Color(255, 153, 51));
        comenzarBtn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        comenzarBtn.setForeground(new java.awt.Color(255, 255, 255));
        comenzarBtn.setText("Comenzar");
        comenzarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(comenzarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 240, 110));

        panelLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo avion company2.jpg"))); // NOI18N
        getContentPane().add(panelLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        System.exit(0);
        //Algo
    }//GEN-LAST:event_salirBtnActionPerformed

    private void comenzarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarBtnActionPerformed
        //metodo de boton comenzar el cul envia al usuario a la pantalla principal y tambien agrega el metodo de paquetes predeterminados al programa
        mc.agregarPaquetesPredeterminados();//se agregan los paquetes predeterminados al programa 
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_comenzarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenidoLbl;
    private javax.swing.JButton comenzarBtn;
    private javax.swing.JLabel panelLbl;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables
}
