/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana12;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Persona {
    
    // Permite compartir informacion entre clases
    String nombre = "Roger";
    int id = 15;
    static int cont = 1;
    
    public Persona(String nombre) {
        
        this.nombre = nombre;
        id = cont+1;
        cont++;
        
    }
    
    public Persona() {
        // Con esta forma podriamos tener un contador utilizando un atributo estatico
        id = cont;
        cont++;
        
    }
    
    // El metodo static me permite compartir informacion entre clases
    public void modificar() {
     
        nombre = JOptionPane.showInputDialog("Deme el nombre de la persona");
        
    }
    
    public void imprimir() {
        
        System.out.println(id + " " + nombre);
        
    }
        
    
}
