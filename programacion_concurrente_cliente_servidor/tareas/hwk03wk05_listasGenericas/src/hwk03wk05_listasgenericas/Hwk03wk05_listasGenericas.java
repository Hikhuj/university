/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk03wk05_listasgenericas;

/**
 *
 * @author roger
 */
public class Hwk03wk05_listasGenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Resumen de Proceso:
            
            Para crear una comparacion de deben hacer ciertos pasos
             - Instanciar una clase de Colecciones
             - De la clase Colecciones crear un metodo 
                que realice la comparacion de cada objeto 
                de la lista generica.
             - De la instancia de Colecciones, instanciar una
                Interface Comparator para la comparacion de cada uno de los
                dos objetos que recibe y retorna el resultado.
        */
        
        // Importar la clase que contieneel metodo para imprimir el ordenamiento de la lista
        Colecciones c = new Colecciones();
        
        // Imprimir la lista de las mascotas 
        System.out.println("-----------------------------------------");
        System.out.println("Probando comparador de lista de Mascotas:");
        System.out.println("-----------------------------------------");
        c.ordenamientoPorNombre();
        System.out.println("-----------------------------------------");
        
    }
    
}