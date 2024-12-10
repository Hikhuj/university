/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana06;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Semana06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaCircular listc = new ListaCircular();
        
        listc.inserta(new Producto("Papel higienico", "Scott", 2000));
        listc.inserta(new Producto("Cepillo dental", "Colgate", 3000));
        listc.inserta(new Producto("Condones", "Durex", 5000));
        listc.inserta(new Producto("Cigarros", "Derby", 6000));
        
        
        System.out.println(listc);
        
        
        /**** Practica ****/
        
        
        /*
            Ejercicio 1: Existe
        */
        //System.out.println();
        //boolean result = listc.existe("Condones");
        //System.out.println(result);
        //System.out.println();
        
        
        /*
            Ejercicio 2: Elimina
        */
        System.out.println();
        listc.elimina("Cigarros", "Derby");
        System.out.println(listc);
        //listc.elimina("Condones", "Durex");
        //System.out.println(listc);
        //listc.elimina("Cepillo dental", "Colgate");
        //System.out.println(listc);
        //listc.elimina("Papel higienico", "Scott");
        //System.out.println(listc);
        
        
        /*
            Ejercicio 3: Buscar
        */
        //int precio = Integer.parseInt(JOptionPane.showInputDialog("Imprimir productos menor al precio dado, deme el precio: "));
        //String result = listc.buscar(precio);
        //System.out.println("Los precios menores a " + precio + "\n" + result);
        
        
        /*
            Ejercicio 4: Productos
        */
        //String inicial = JOptionPane.showInputDialog("Deme la inicial que se ocupa");
        //inicial = inicial.toLowerCase();
        //char c = inicial.charAt(0);
        //String result = listc.productos(c);
        //System.out.println(result);
        
        
        
    }
    
}
