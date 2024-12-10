/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk01wk02;

import java.util.*;

/**
 *
 * @author roger
 */
public class Tarea01Week2 {

    /**
     * @param args the command line arguments
     */
    
    // Arerglo de Animales declarado
    public static ArrayList<Animal> animales = new ArrayList<Animal>();
    
    public static void main(String[] args) {
        
        // Ejemplo de herencia con animales
        
        /*
            Ejemplo de Herencia con Animales
        */
        
        // Inicializacion de objetos
        Perro perroPastor = new Perro(12.5f, 20.6f, "Caninus Perrus", "12 anios", 12, "Pastor Aleman", "Lobo");
        Aguila aguilaCalva = new Aguila(20.5f, 12.6f, "Aguilus Calvus", "25 anios", 45.5f, "Veripara", true);
        Tiburon tiburonMartillo = new Tiburon(120f, 50.5f, "Tiburonos Sangrientos", "25 anios", "Salada", 1500, 50);
        
        // Insercion de animales a arreglo
        animales.add(perroPastor);
        animales.add(aguilaCalva);
        animales.add(tiburonMartillo);
       
        // Impresion basica
        System.out.println("Todos los animales comienza a nacer" + "Todos ejecutan el mismo metodo");
        
        // Impresion de todos los animales por medio de una iteracion
        for(Animal a: animales){
            System.out.println(a.getNombreCientifico() + ", " + a.getPeso() + ", " + a.mostrarFrase());
        }
        
    }
    
}