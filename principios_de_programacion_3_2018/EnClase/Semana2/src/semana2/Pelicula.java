/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Pelicula {
    
    // Variable list
    String nombre = "The Matrix";
    String genero = "Sci-Fi";
    boolean subtitulada = true;
    String paisOrigen = "USA";
    short duracionMinutos = 150;
    
    
    // Methods
    public void imprimir() {
        System.out.println("Nombre de película: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Esta subtitulada: " + subtitulada);
        System.out.println("País de origen: " + paisOrigen);
        System.out.println("Duración (en min): " + duracionMinutos);
    }
    
}
