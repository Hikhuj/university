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
public class Hilo1 extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Ejecutando el hilo: " + this.getName());
            try {
                Hilo1.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error en el hilo1: " + ex.getMessage());
            }
        }
    }
    
}
