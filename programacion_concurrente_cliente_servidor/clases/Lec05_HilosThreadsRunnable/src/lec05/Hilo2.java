/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec05;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roger
 */
public class Hilo2 extends Thread{
    
    private Thread hilo;

    public Hilo2(Thread hilo) {
        this.hilo = hilo;
    }
    
    @Override
    public void run(){
        try {
            hilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Ejecutando el hilo: " + this.getName());
        
            try{
                sleep(1000);
            }catch (InterruptedException ex) {
                System.out.println("Error ejecutando el hilo2 " + ex.getMessage());
            }
        }
        
    }
    
}
