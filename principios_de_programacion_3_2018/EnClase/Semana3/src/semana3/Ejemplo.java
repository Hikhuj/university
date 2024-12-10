/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

import javax.swing.*;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Ejemplo {
    
    public void operaciones() {
        
        String texto1 = JOptionPane.showInputDialog("Deme un numero");
        int numero = Integer.parseInt(texto1);
        
        String texto2 = JOptionPane.showInputDialog("Deme otro numero");
        int numero2 = Integer.parseInt(texto2);
        
        System.out.println("Resultado suma: " + sumar(numero, numero2));
        System.out.println("Resultado resta: " + restar(numero, numero2));
        
        JOptionPane.showMessageDialog(null, "Resultado suma: " + sumar(numero, numero2));
        JOptionPane.showMessageDialog(null, "Resultado suma: " + restar(numero, numero2));
        JOptionPane.showMessageDialog(null, "Resultado suma: " + multiplicar(numero, numero2));
        JOptionPane.showMessageDialog(null, "Resultado suma: " + dividir(numero, numero2));
        
        
    }
    
    private int sumar(int num1, int num2) {
        
        int result = 0;
        
        result = num1 + num2;
        
        return result;
        
    }
    
    
    private int restar(int num1, int num2) {
        
        int result = 0;
        
        result = num1 - num2;
        
        return result;
        
    }
    
    
    private int multiplicar(int num1, int num2) {
        
        int result = 0;
        
        result = num1 * num2;
        
        return result;
        
    }
    
    
    private int dividir(int num1, int num2) {
        
        int result = 0;
        
        result = num1 / num2;
        
        return result;
        
    }
    
}
