/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec04;

/**
 *
 * @author roger
 */
public class Lec04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Colecciones c = new Colecciones();
        
        System.out.println("-----------------------------------------------");
        c.probarSet();
        System.out.println("-----------------------------------------------");
        c.probarList();
        System.out.println("-----------------------------------------------");
        c.probarOrdenamientoSet();
        System.out.println("-----------------------------------------------");
        c.probarOrdenamientoSetComparador();
        
        /*
            Formato de llamado
            |
            |--> El metodo MAIN llama a COLECCIONES.java
                |
                |--> COLECCIONES.java >> Tiene metodo COMPARADOR.
                    |
                    |--> El metodo que va a trabajar con el comparador 
                         va a instanciar una clase que contiene 
                         la INTERFACE de COMPARATOR donde se ejecuta la evaluaciona
                         luego devuelve la evaluacion a una ITERACION que esta
                         en el metodo de COLECCIONES.java que interactua con COMPARADOR
        */
        
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
        
    }
    
}
