/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec02;

import java.util.*;

/**
 *
 * @author roger
 */
public class Leccion02 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 70, "2AR7068");
        Futbolista ronaldinho = new Futbolista(2, "Juan", "Ronaldinho", 45, 10, "medio");
        Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 50, "Licenciado en Fisioterapia", 25);
        
        integrantes.add(delBosque);
        integrantes.add(ronaldinho);
        integrantes.add(raulMartinez);
        
        /*
        System.out.println("Todos los integrantes comienza una concentracion" + "(Todos ejecutan el mismo metodo)");
        for(SeleccionFutbol integrante: integrantes){
            System.out.println(integrante.getNombre() + " " + integrante.getApellido() + "-->");
            integrante.concentrarse();
        }
        
        System.out.println("----------------------------------------------------------------");
        
        System.out.println("Todos los integrantes viajan para el juego" + "(Todos ejecutan el mismo metodo)");
        for(SeleccionFutbol integrante: integrantes){
            System.out.println(integrante.getNombre() + " " + integrante.getApellido() + "-->");
            integrante.concentrarse();
        }
        
        System.out.println("---------------------------------ENTRENAMIENTO-------------------------------");
        
        System.out.println("Entrenador: Solamente el entrenador y el futbolista tienen metodos para entrenar");
        System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + "-->");
        delBosque.dirigirEntrenamiento();
        System.out.print(ronaldinho.getNombre() + " " + ronaldinho.getApellido() + "-->");
        ronaldinho.entrenar();
        
        System.out.println("---------------------------------Masajista-------------------------------");
        
        System.out.println("Masajista : Solamente el masajista tienen metodos para dar masajes");
        System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + "-->");
        raulMartinez.darMasaje();
        
        System.out.println("---------------------------------Juego-------------------------------");
        
        System.out.println("Entrenador: Solamente el entrenador y el futbolista tienen metodos para el partido");
        System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + "-->");
        delBosque.dirigirPartido();
        System.out.print(ronaldinho.getNombre() + " " + ronaldinho.getApellido() + "-->");
        ronaldinho.jugarPartido();
        */
        
    }
    
}
