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
public class Ejemplo {
 
    int notas [] = new int[5];
    
    /*
    public void ejemplo1() {
        
        try{

            for (int i = 0; i <= notas.length; i++) {
                notas[i] = (int) (Math.random() * 100);
            }
        
            // Puedo agregar el nombre del error y darle algun nombre especifico
        }catch(NullPointerException e){
            
            JOptionPane.showMessageDialog(null, "No se creo ninguna nota", "Error", JOptionPane.ERROR_MESSAGE);
            
        }catch(ArrayIndexOutOfBoundsException e){
            
            JOptionPane.showMessageDialog(null, "La ultima nota no se guarda", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
            
    }
    */
    
    public void ejemplo1() {
        
        try{
            int count = 1;
            for (int i = 0; i <= notas.length; i++) {
                
                try{
                    
                    notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Deme la nota #" + count +":"));
                    count++;
                    
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "No se creo ninguna nota", "Error", JOptionPane.ERROR_MESSAGE);
                    // me ayuda a devolverme una posicion mientras no logre poner el valor correctamente
                    // en cada item
                    i--;
                }
            }
        
            // Puedo agregar el nombre del error y darle algun nombre especifico
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No se creo ninguna nota", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "La ultima nota no se guarda", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese numeros enteros unicamente", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
    }
    
    public int [] getNotas(){
        
        return notas;
        
    }
    
    public void printArray() {
        
        int [] array = getNotas();
        
        int count = 1;
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nota " + count + ": " + array[i]);
            count++;
        }
        
    }
    
    public void ejemplo2() {
        
        String solicito = JOptionPane.showInputDialog("Deme la palabra a buscar");
        String texto = "Esta semana queda la ultima tarea :)";
        
        try{
            if(texto.contains(solicito)){
                JOptionPane.showMessageDialog(null, "Se encontro");
            }else{
                // Se esta llamando al tipo de error que nosotros creamos por aparte
                throw new Error("No se encontro la palabra");
            }
        }catch(Error e) {
            
        }
        
    }
        
    
    
}
