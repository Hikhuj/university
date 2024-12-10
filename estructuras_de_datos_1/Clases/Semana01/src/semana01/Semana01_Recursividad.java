/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Semana01_Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instancias
        Ejemplo1 ejem1 = new Ejemplo1();
        
        // Variables
        int n = 5;
        
        
        // Contiene varios ejemplos
        ejem1.imprime(5);
        
        
        /*
            Muestra de factorial de forma interactiva
            sin utilizar recursividad
        */
        //ejem1.muestraFactorial();
        
        
        /*
            Factorial de forma recursiva
        */
        // Mostrar resultado
        //System.out.println("Factorial de " + n + " es: " + ejem1.fac(n));
        
        /*******************************************
            Additional Practice of Recursive Methods
        ********************************************/
        
        /*
            Sumar los numeros naturales hasta N (se lo damos nosotros) de forma recursiva
        */
        System.out.println("El total de sumar " + n + " de forma recursiva es: " + ejem1.sumNaturalNums(10));
        
        /*
            Recorrer un array de forma recursiva
        */
        String [] array = {"a","b","c"};
        ejem1.readArrayRecursive((array.length - 1), array);
        
        
    }
    
}