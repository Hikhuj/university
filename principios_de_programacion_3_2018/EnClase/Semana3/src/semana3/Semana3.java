/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro1 = new Libro("Aprende facil");
        Libro libro2 = new Libro("Aprende facil", "Jose");
        Libro libro3 = new Libro("Aprende facil", "Jose", 584.5f);
        
        libro1.imprime();
        libro2.imprime();
        libro3.imprime();
        
        //Ejemplo ej = new Ejemplo();
        //ej.operaciones();
        
        /*
        // SUMA
        int dato = ej.sumar(50, 10);
        System.out.println("La suma es: " + dato);
        System.out.println("La suma es: " + ej.sumar(40, 9));
        
        // RESTAR
        dato = ej.restar(50, 10);
        System.out.println("La suma es: " + dato);
        System.out.println("La suma es: " + ej.restar(40, 9));
        */
        
    }
    
}
