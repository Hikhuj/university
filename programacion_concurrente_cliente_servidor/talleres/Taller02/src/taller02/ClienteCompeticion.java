/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller02;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author roger
 */
public class ClienteCompeticion extends javax.swing.JFrame {

    ArrayList<Resultado> listaResultados = new ArrayList<>();
    
    String [][] tablaCompetidores = new String[10][4];
    
    // Cantidad de competidores
    int cantidadTiros = 10;
    
    // Nombres de competidores
    String[] competidoresArray = {"A","B","C","D","E","F","G","H","I","J"};
    
    // Enviar datos de hilo
    Hilo hilo;
    
    // Backend de TCP/IP
    Backend backend = new Backend();
    
    public class Hilo implements Runnable{
    
        // Atributos
        private int cantidadTiros;
        private String nombreCompetidor;
        private int puntuacionMin = 1;
        private int puntuacionMax = 10;
        private int esperaMin = 300;
        private int esperaMax = 500;
        private int disparoMin = 20;
        private int disparoMax = 50;
        private int anotacion = 0;
        private int puntuacionTotal = 0;
        // Generar un arreglo T=> String que almacene >> Nombre | % Apunte | % Disparo | ScoreFinal
        private double promedioApunte = 0.0;
        private double promedioDisparo = 0.0;
        private int numeroTirador;

        // Constructores
        public Hilo(){
        }

        public Hilo(String nombreCompetidor, int cantidadTiros, int tirador){
            this.nombreCompetidor = nombreCompetidor;
            this.cantidadTiros = cantidadTiros;
            this.numeroTirador = tirador;
        }

        // Ejecucion del hilo
        @Override
        public void run(){

            // Iteracion sobre la cantidad de tiros
            for (int i = 0; i < this.cantidadTiros; i++) {

                // Variables contadoras para calculos
                int puntuacion;
                long tiempoDeApunte;
                long tiempoDeDisparo;

                // Capturar errores de tiempos
                try{
                    // Tirador Apunta
                    tiempoDeApunte = generarTiempoApuntar();
                    Thread.sleep(tiempoDeApunte);
                    System.out.println("Competidor " + this.nombreCompetidor + " apunta");
                    jTA_simulacion.append("Competidor " + this.nombreCompetidor + " apunta\n");
                    // Sumar promedio de tiempo de apunte
                    this.promedioApunte += tiempoDeApunte;
                    System.out.println("Total de Apunte: " + promedioApunte);

                    // Tirador Dispara
                    tiempoDeDisparo = generarTiempoDisparo();
                    Thread.sleep(tiempoDeDisparo);
                    System.out.println("Competidor " + this.nombreCompetidor + " dispara");
                    jTA_simulacion.append("Competidor " + this.nombreCompetidor + " dispara\n");
                    // Sumar promedio de tiempo de disparo
                    this.promedioDisparo += tiempoDeDisparo;
                    System.out.println("Total de Disparo: " + promedioDisparo);

                    // Generar puntuacion
                    puntuacion = generarAnotacion();
                    System.out.println("Score de " + this.nombreCompetidor + "= " + puntuacion);
                    jTA_simulacion.append("Score de " + this.nombreCompetidor + "= " + puntuacion + "\n");
                    // Sumar puntuacion de competidor
                    this.puntuacionTotal += puntuacion;


                }catch(InterruptedException ex){
                    System.out.println("Error: " + ex);
                }
            }

            // Calcular promedio de Apunte
            promedioApunte = promedioApunte / 10;
            System.out.println("Promedio de apunte " + promedioApunte);
            
            // Calcular promedio de Disparo
            promedioDisparo = promedioDisparo / 10;
            System.out.println("Promedio de disparo " + promedioDisparo);
            
            // Generar conexion a server
            // backend.clientMessageAndConnection(nombreCompetidor,promedioApunte + "",promedioDisparo + "",puntuacionTotal + "");
            
            String [] datosTirador = {nombreCompetidor,promedioApunte + "",promedioDisparo + "",puntuacionTotal + ""};
            
            for (int j = 0; j < tablaCompetidores[numeroTirador].length; j++) {
                tablaCompetidores[numeroTirador][j] = datosTirador[j];
            }
            
        }

        // Metodos
        public int generarAnotacion(){
            return ThreadLocalRandom.current().nextInt(puntuacionMin, puntuacionMax + 1);
        }

        public int generarTiempoDisparo(){
            return ThreadLocalRandom.current().nextInt(disparoMin, disparoMax + 1);
        }

        public int generarTiempoApuntar(){
            return ThreadLocalRandom.current().nextInt(esperaMin, esperaMax + 1);
        }
        
        public int getPuntuacionTotal(){
            return puntuacionTotal;
        }

    }
    
    public void ejecutarHilo(){

        int tirador = 0;
        
        // Iteracion que crea los hilos y envia la informacion para ser procesada
        for (int i = 0; i < competidoresArray.length; i++) {
            
            hilo = new Hilo(competidoresArray[i], cantidadTiros, tirador);
            Thread thread = new Thread(hilo);
            
            thread.start();
            
        }
        
    }
    
    public void imprimirTablaCompetidores(){
        
        for (int i = 0; i < this.tablaCompetidores.length; i++) {
            System.out.println("");
            for (int j = 0; j < this.tablaCompetidores[i].length; j++) {
                System.out.print(tablaCompetidores[i][j]);
                System.out.println(",");
            }
        }
        
    }
    
    /**
     * Creates new form ServidorCalculos
     */
    public ClienteCompeticion() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTA_simulacion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jBtn_simulacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTA_simulacion.setColumns(20);
        jTA_simulacion.setRows(5);
        jScrollPane2.setViewportView(jTA_simulacion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 500, 250));

        jLabel1.setText("Comenzar simulacion: Competicion de Tiro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jBtn_simulacion.setText("COMENZAR SIMULACION");
        jBtn_simulacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_simulacionMouseClicked(evt);
            }
        });
        jBtn_simulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_simulacionActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_simulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_simulacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_simulacionActionPerformed

    private void jBtn_simulacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_simulacionMouseClicked
        /*
        *
        * ACCION DE BOTON
        *
        */
        
        // Hacer llamado para ejecutar hilo
        // Simula el promedio de X cantidad de jugadores y Y cantidad de tiros
        ejecutarHilo();

        
        
    }//GEN-LAST:event_jBtn_simulacionMouseClicked

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
            java.util.logging.Logger.getLogger(ClienteCompeticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteCompeticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteCompeticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteCompeticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteCompeticion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_simulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTA_simulacion;
    // End of variables declaration//GEN-END:variables
}
