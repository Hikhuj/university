/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Semana03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaramos la clase nueva
        Pila p = new Pila();
        
        // Creamos el dato que se necesita.
        // Recordemos que con PUSH se ingresan datos a la pila, permite
        // ingresar los datos al NODO
        p.push(new Nodo(new Libro("iT", "SK", "Santillana", 550, 1960)));
        p.push(new Nodo(new Libro("Como matar a un ruisenor", "JM", "Salamanca", 500, 1950)));
        p.push(new Nodo(new Libro("Harry Potter", "JK Rowling", "Salamanca", 350, 1940)));
        p.push(new Nodo(new Libro("El Hobbit", "JRRT", "Salamanca", 350, 1995)));
        p.push(new Nodo(new Libro("El Senor de los Huevos Fotro", "JRRT", "Salamanca", 350, 2008)));
        
        /*
        
        // Una manera de mostrar los datos seria
        System.out.println("Prueba 1:");
        Nodo aux = p.pop();
        while(aux != null) {
            System.out.println(aux);
            aux = p.pop();
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        // Que pasa en la prueba dos donde solicito de nuevo los datos (que fueron eliminados en
        // la prueba 1 por medio del metodo POP
        System.out.println("Prueba 2:");
        aux = p.pop();
        while(aux != null) {
            System.out.println(aux);
            aux = p.pop();
        }
        */

        // Asi que en lugar de tener todo lo anterior, podria simplemente hacer lo siguiente
        // Esto nos dice que es un puntero (direccion en memoria)
        System.out.println(p);
        
        // Luego tomamos ese objeto y lo imprimimos con toString (metodo creado por nosotros)
        p.toString();
        
        // Por lo que de lo anterior, necesitaremos pasar la direccion en memoria a toString
        
        
        
        /*
        boolean ejercicio1;
        
        ejercicio1 = p.encuentra(JOptionPane.showInputDialog("Deme el titulo del libro"));
     
        System.out.println(ejercicio1);
        */
        
        
        int ejercicio2;
        
        p.extrae(Integer.parseInt(JOptionPane.showInputDialog("Deme posicion de libro: ")));
        
        System.out.println(p);
        
        p.toString();
                
        
        
        
    }
    
}
