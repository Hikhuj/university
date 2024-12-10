/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea1;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Backend {
    
    public void solicitarDato() {
        
        String n;
        int num;
        int numSize;
        
        try{
            
            n = JOptionPane.showInputDialog("Ingrese un numero!");
            
            num = Integer.parseInt(n);
            
            numSize = n.length();
            
            // imprimeDigitos(n, numSize);
            
        }catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, "Mensaje de Error", "Ingreso un valor no numerico", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    private int imprimeDigitos(int n, int numSize){
        
        if(n == 1) {
            
            return 1;
            
        }else{
            
            return imprimeDigitos(n, numSize - 1);
            
        }
        
    }
    
}
