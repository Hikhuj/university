package companyjdr;

import clases.*;

public class BuscaPorDuracion extends javax.swing.JFrame {
    
    MenuClases mc = new MenuClases();
    Main menu = new Main();

    
    public BuscaPorDuracion() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscaMenorBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        buscaMayorBtn = new javax.swing.JButton();
        fondoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscaMenorBtn.setBackground(new java.awt.Color(255, 102, 51));
        buscaMenorBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscaMenorBtn.setForeground(new java.awt.Color(240, 240, 240));
        buscaMenorBtn.setText("Mas Corto");
        buscaMenorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaMenorBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscaMenorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 140, 40));

        volverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton atras.png"))); // NOI18N
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        getContentPane().add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 60, 50));

        buscaMayorBtn.setBackground(new java.awt.Color(255, 102, 51));
        buscaMayorBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscaMayorBtn.setForeground(new java.awt.Color(240, 240, 240));
        buscaMayorBtn.setText("Mas Largo");
        buscaMayorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaMayorBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscaMayorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 40));

        fondoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo avion company2.jpg"))); // NOI18N
        getContentPane().add(fondoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 570, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        //boton que retorna a la pantalla prinicpal 
        Main inicio = new Main();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    private void buscaMayorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaMayorBtnActionPerformed
        mc.llamarAObtenerVueloMayorDuracion();//mediante el uso de un arbol binario se obtiene el vuelo mas largo por duracion de horas
    }//GEN-LAST:event_buscaMayorBtnActionPerformed

    private void buscaMenorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaMenorBtnActionPerformed
        mc.llamarAObtenerVueloMenorDuracion();//mediante el uso de un arbol binario se obtiene el vuelo con menor duracion de horas 
    }//GEN-LAST:event_buscaMenorBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BuscaPorDuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaPorDuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaPorDuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaPorDuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaPorDuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscaMayorBtn;
    private javax.swing.JButton buscaMenorBtn;
    private javax.swing.JLabel fondoLbl;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
