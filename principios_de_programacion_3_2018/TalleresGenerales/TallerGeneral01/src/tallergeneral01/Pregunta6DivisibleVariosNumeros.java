/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallergeneral01;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Pregunta6DivisibleVariosNumeros {
    
    private int numeroSolicitado;
    private String esDivisible = "El numero recibido es divisible entre:\n";
    
    
    public void calcularDivisibilidad() {
        
        this.numeroSolicitado = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a divisibilidad (2,3,5, o 7), ingrese un numero: "));
   

        if((numeroSolicitado % 2) == 0) {
            this.esDivisible = esDivisible + "es divisible entre 2,\n";
        }else{
            this.esDivisible = esDivisible + "no es divisible entre 2,\n";
        }
        
        if((numeroSolicitado % 3) == 0) {
            this.esDivisible = esDivisible + "es divisible entre 3,\n";
        }else{
            this.esDivisible = esDivisible + "no es divisible entre 3,\n";
        }
        
        if((numeroSolicitado % 5) == 0) {
            this.esDivisible = esDivisible + "es divisible entre 5,\n";
        }else{
            this.esDivisible = esDivisible + "no es divisible entre 5,\n";
        }
        
        if((numeroSolicitado % 7) == 0) {
            this.esDivisible = esDivisible + "es divisible entre 7.\n";
        }else{
            this.esDivisible = esDivisible + "no es divisible entre 7.\n";
        }
        
        imprimirResultado();
        
    }
    
    public void imprimirResultado() {
        
        JOptionPane.showMessageDialog(null, esDivisible, "Divisibilidad", JOptionPane.INFORMATION_MESSAGE);
        
    }
       
    
}
