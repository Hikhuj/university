/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana13;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Ejercicios {
    
    int [] suma = new int[5];
    
    public void suma() {
        
        try{
            int count = 1;
            
            for (int i = 0; i < suma.length; i++) {
                
                try{
                    
                    suma[i] = Integer.parseInt(JOptionPane.showInputDialog("Deme el numero " + count + " para sumar:"));
                    
                    if(suma[i] < 0 || suma[i] == 0) {

                        JOptionPane.showMessageDialog(null, "Numero es menor a 0 o igual a 0", "Error", JOptionPane.ERROR_MESSAGE);
                        // me ayuda a devolverme una posicion mientras no logre poner el valor correctamente
                        // en cada item
                        i--;
                        count--;

                    }

                    count++;
                    
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "No es un numero", "Error", JOptionPane.ERROR_MESSAGE);
                    // me ayuda a devolverme una posicion mientras no logre poner el valor correctamente
                    // en cada item
                    i--;
                }
            }
            
            sumarDatos(suma);
        
            // Puedo agregar el nombre del error y darle algun nombre especifico
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No se creo ninguna nota", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "La ultima nota no se guarda", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese numeros enteros unicamente", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void sumarDatos(int [] numeros) {
        
        int resultado = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            resultado = resultado + numeros[i];
        }
        
        System.out.println("Total numeros sumados es: " + resultado);
        
    }
    
}
