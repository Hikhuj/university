/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.*;

/**
 *
 * @author roger
 */
public class Leccion02 {

    // Arreglo para ejemplo
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
        
    // Clase principal
    public static void main(String[] args) {
        
        
        Futbolista ronaldinho = new Futbolista(2, "Juan", "Ronaldinho", 45, 10, "medio");
        Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 50, "Licenciado en Fisioterapia", 25);
        
        integrantes.add(ronaldinho);
        integrantes.add(raulMartinez);
        
        /*
            Aplicacion de clases Abstract y Interface
            Clase Padre: SeleccionFutbol.java
                |------> Varios hijos
            Clase Abstract: Entrenadores.java
                |------> Aplicado a EntrenadorPortero.java
                |------> Aplicado a Entrenador.java
            Clase Interface: AccionesAdicionales.java
                |------> Aplicado a Masajista.java
                |------> Aplicado a Futbolista.java
        */
        
    }
    
}
