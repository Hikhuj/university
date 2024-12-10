/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Semana04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cola cola = new Cola();
        cola.encola(new Nodo(new Auto("BMW", "X5", 2019, 5)));
        cola.encola(new Nodo(new Auto("Toyota", "Supra", 2018, 5)));
        cola.encola(new Nodo(new Auto("Audi", "A5", 2019, 5)));
        cola.encola(new Nodo(new Auto("Tesla", "S", 2019, 5)));
        cola.encola(new Nodo(new Auto("GM", "RR", 2019, 5)));
        
        
        // Impresion de Cola por primera vez
        System.out.println(cola);
        
        
        // Ejercicio 1
        /*
        boolean ejercicio1 = cola.encuentra(Integer.parseInt(JOptionPane.showInputDialog("Deme anio de auto")));
        System.out.println(ejercicio1);
        
        System.out.println(cola);
        */
        
        
        // Ejercicio 2
        cola.extrae("RR");
        
        System.out.println("");
        System.out.println("");
        System.out.println("Imprimir cola por segunda vez");
        System.out.println(cola);
        
        
        
    }
    
}
