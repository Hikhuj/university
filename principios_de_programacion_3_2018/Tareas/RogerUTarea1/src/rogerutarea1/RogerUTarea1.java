/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea1;

/**
 *
 * @author rogerjoseulaterivera
 */
public class RogerUTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Punto 1:
            Escriba un programa que se visualice en el monitor lo siguiente:
            “Bienvenido al mundo de Java.
            Podrás dar solución a muchos problemas”
        
            Para esta solucion se utiliza lo que se conoce como secuencias de escape, en donde se usa una composicion
            de -> \CHAR, ejemplo "\n", en donde dependiendo de lo se dese realizar, asi sera el proposito de dicha letra
            En este caso el "\n" nos permite insertar una nueva linea de texto en el lugar donde se haya agregado esta
            secuancia de escape. Tambien se puede utilizar codigos UNICODE.
        
            https://docs.oracle.com/javase/tutorial/java/data/characters.html
        */
        
        
        // Punto 1
        System.out.print("Bienvenido al mundo de Java.\nPodrás dar solución a muchos problemas");
        
        
        /* OMITIR: Solo formato */
        System.out.println();
        System.out.println();
        
        /*
            Punto 2:
            Escriba un programa que dadas 3 variables int (a, b, c) calculen la expresión y muestre el resultado.

                a + b ∗ c
            x = ---------
                  c - a
        */
        
        // Se declaran e inicializan las variables tipo Integer (numeros enteros, sin punto flotante o decimal)
        int a = 2;
        int b = 3;
        int c = 5;
        
        /*
            Se declara una cuarta variable que alojara el resultado, con un valor de tipo Integer 
            (tambien puede inicializarse esta variable, pero debera ser 0 con el fin de evitar calculos o respuestas adicionales o imprecisas.
        */
        int resultado;
        
        /*
            La variable "resultado" almacenara la operacion a ejecutarse, aqui se aplican las reglas matematicas 
            de orden de ejecucion de operaciones matematicas (en ingles se conocer como PEMDAS).
            Por lo que se debe usar parentesis para operaciones que esten dentro de otras operaciones.
            En este caso la multiplicacion va primero antes que la suma en el numerador y luego las sumas y restas.
            Una vez obtenido la resolucion de las operaciones en numerador y denominador, se procede a la division.
        */
        resultado = (a+(b*c))/(c-a);
        
        
        // Impresion del resultado en consola
        System.out.println("De acuerdo a la siguiente operacion:\n");
        System.out.println("    a + b ∗ c");
        System.out.println("x = ---------");
        System.out.println("      c - a  \n");
        System.out.println("El resultado es:" + resultado);
        
        
        
        
    }
    
}
