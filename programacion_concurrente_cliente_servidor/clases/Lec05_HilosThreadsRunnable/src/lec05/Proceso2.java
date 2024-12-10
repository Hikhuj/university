/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec05;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author roger
 */
public class Proceso2 implements Runnable{
    
    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Proceso 2");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException ex){
                Logger.getLogger(Proceso2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
