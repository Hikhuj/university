/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_wk6;

/**
 *
 * @author roger
 */
public class Practica_wk6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hilo hilo = new Hilo();
        
        int limiteSuperior = 300;
        int limiteInferior = 600;
        
        int cantidad = (int)((limiteSuperior - limiteInferior + 1) * Math.random() + limiteInferior);
        int cantidad2 = (int)((limiteSuperior - limiteInferior + 1) * Math.random() + limiteInferior);
        
        System.out.println(cantidad2);
        
        hilo.cantidadPasillos(6);
        
        //hilo.start();
        
        for (int i = 0; i < 100; i++) {
            hilo.start();
            try{
                hilo.sleep(cantidad2);
            }catch (InterruptedException ex){
                System.out.println("Nada pasa");
            }
        }
        
    }
    
}
