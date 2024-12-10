/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Semana07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaDobleEnlazada l = new ListaDobleEnlazada();
        
        l.inserta(new Juego("Pokemon", "Nintendo", 1997));
        l.inserta(new Juego("God of War", "PC", 2005));
        l.inserta(new Juego("Fallout", "Nintendo", 1990));
        l.inserta(new Juego("Arma 3", "PC", 2018));
        l.inserta(new Juego("Fallout", "PC", 2019));
        l.inserta(new Juego("Fallout", "Americano", 2020));
        
        System.out.println(l);
        
        /*
            Ejercicio 1: Existe
        */
        //System.out.println();
        //boolean result = l.existe("Arma 3");
        //System.out.println(result);
        //System.out.println();
        
        /*
            Ejercicio 2: Modifica
        */
        /*
        l.modifica(JOptionPane.showInputDialog("Deme el nombre del juego a modificar: "), Integer.parseInt(JOptionPane.showInputDialog("Deme el anio de juego")));
        System.out.println(l);
        */
        
        /*
            Ejercicio 3: Elimina
        */
        //l.elimina("Arma 3", 2018);
        //System.out.println(l);
        
        
        /*
            Ejercicio 4: Imprime desendentemente
        */
        //l.imprimeDescendente();
        
        
        /*
            Ejercicio 5: Cuestan nombres
        */
        //String nombreDeJuego = JOptionPane.showInputDialog("Deme el nombre del juego a contar");
        //int cantidadDeJuegosPorNombre = l.cuentaNombres(nombreDeJuego);
        //System.out.println("Juegos repetidos con el nombre " + nombreDeJuego + ", Cantidad: " + cantidadDeJuegosPorNombre);
        
        
        
        
    }
    
}
