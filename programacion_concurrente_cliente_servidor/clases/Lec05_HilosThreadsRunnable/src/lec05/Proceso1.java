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
public class Proceso1 extends Thread{
    
    public Proceso1(String nombre){
        super(nombre);
    }
    
    private int numInt;
    
    @Override
    public void run(){
        for(int i = 0; i <= this.numInt; i++){
            //#1
            //System.out.println("Proceso 1");
            //#2
            // Nos da el nombre del hilo
            System.out.println(i + this.getName());
            // La forma que vamos a ver mas en la calle
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                System.out.println("Error en el hilo " + this.getName());
            }
        }
    }
    
    public void valorCondicion(int valor){
        this.numInt = valor;
    }
    
}
