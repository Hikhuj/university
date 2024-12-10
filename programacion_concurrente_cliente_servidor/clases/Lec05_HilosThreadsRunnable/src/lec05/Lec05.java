/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec05;

/**
 *
 * @author roger
 */
public class Lec05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instanciando los hilos
        /*
        #1
        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo3 = new Proceso1();
        */
        
                    /*
                        Este es para cuando se usa el hilo por medio de IMPLEMENTS + RUNNABLE
        //        // 2
        //        Proceso1 hilo1 = new Proceso1("Hilo 1");
        //        Proceso1 hilo3 = new Proceso1("Hilo 2");
        //        hilo1.valorCondicion(20);
        //        hilo3.valorCondicion(30);
        //        // La implementacion para que Proceso 2 herede del Proceso 1
        //        Thread hilo2 = new Thread(new Proceso2());
                    */
        //        
        //          hilo1.start();
        ////        try{
        ////            hilo1.sleep(5000);
        ////        }catch (InterruptedException ex){
        ////            System.out.println("Error en el hilo 1");
        ////        }
        //        
        //          hilo2.start();
        //          hilo2.stop();
        ////        try{
        ////            hilo2.sleep(5000);
        ////        }catch (InterruptedException ex){
                        /*System.out.println("Error en el hilo 2");*/
        ////        }
        //        
        //        // Arrancar los hilos (iniciarlos)
        //        hilo3.start();
        //        
        //    }

        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2(hilo1);
        
        hilo2.start();
        hilo1.start();
        
    }
    
}
