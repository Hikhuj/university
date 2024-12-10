/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_wk6;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Hilo extends Thread{
    
    // Declaracion de las variables
    private int cantidadPasillos;
    /*
    private int tiempoLlegadaCliente;
    private int cantidadProductos;
    private int cantidadTiempoPorProducto;
    private int tiempoEnCadaProducto;
    private int inicio;
    private int fin;
    */
    
    // Constructor del hilo
    /*
    public Hilo(String name){
        super(name);
    }
    */

    @Override
    public void run(){
        for (int i = 0; i < this.cantidadPasillos; i++) {
            // Tiempo por pasillo
            System.out.println("Pasillo: " + i);
            for (int j = 0; j < 5; j++) {
                // Tiempo por producto
            }
        }
        
        // Tiempo con cajeta
        // Cantidad de productos + sleep time
    }
    
    public void cantidadPasillos(int valor){
        this.cantidadPasillos = valor;
    }
    
    public int randomPasillos(){
        
        
        
        int limiteSuperior = 13;
        int limiteInferior = 8;
        
        return (int)((limiteSuperior - limiteInferior + 1) * Math.random() + limiteInferior);
        
    }
    

}
