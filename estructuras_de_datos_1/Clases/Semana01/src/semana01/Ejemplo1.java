/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Ejemplo1 {
    
    
    public void imprime(int x) {

        // Metodo se llama a si mismo reducciendo el valor de la variable
        // hasta llegar a 0
        if(x>0) {
            System.out.println("El numero es:" + x);
            imprime(x-1);
        }
        
    }
    
    /*
    public void imprime(int x) {
    
        //    Metodo que se llama a si mismo.
        //    Aqui hace el metodo primero y luego imprime
        if(x>0) {
            imprime(x-1);
            System.out.println("El numero es:" + x);
        }
    
    }
    */
    
    /*
    public void imprime(int x) {
        
        //    Metodo que se llama a si mismo.
        //    Sucede un desbordamiento de memoria
        if(x>0) {
            imprime(x+1);
            System.out.println("El numero es:" + x);
        }
        
    }
    */
    
    /*
    public int fac(int n){
        
        // Caso Base o Condicion de parada.
        if(n==1) {
            
            return 1;
            
        }else{
            
            return n * fac(n-1);
            
        }
        
    }
    */
    
    // Metodo iterativo
    public void muestraFactorial() {

        // Vars
        int n = 1;
        
        // Algunos pasos para hacer en la parte iterativa:
        
        // valide si es correcto o no
        
        while(n != 0){
            try{
                // Pedir al usuario el valor de N
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo para capcular factorial (Digite \"0\" para salir)"));

                // si es correcto, muestran el resultado
                if(n > 0){
                    System.out.println("El factorial de " + n + " es: " + fac(n));
                }else{
                    System.out.println("El numero debe ser mayor a 0 y no puede ser negativo");
                }

            }catch(HeadlessException | NumberFormatException e){
                System.out.println("No es un numero");
            }
        }
  
        // incorrecto, le indico al usuario el rango aceptado
        // manejo de errores
        
    }
    
    // Metodo recursivo
    // Metodo sano de recursividad para factorial
    public int fac(int n){
        
        // Caso Base o Condicion de parada.
        if(n==1) {
            
            return 1;
            
        }else{
            
            return n * fac(n-1);
            
        }
        
    }
    
    /*******************************************
        Additional Practice of Recursive Methods
    ********************************************/
    
    /*
        Sumar los numeros naturales hasta N (se lo damos nosotros) de forma recursiva
    */
    public int sumNaturalNums(int n){
        
        int result;
        
        if(n == 1){
            return 1;
        }else{
            result = n + sumNaturalNums(n - 1);
        }
        
        return result;
        
    }
    
    /*
        Recorrer un array de forma recursiva
    */
    public void readArrayRecursive(int arrayLength, String [] array){
        if(arrayLength == 0){
            System.out.println(array[0]);
        }else{
            System.out.println(readArrayRecursive((arrayLength - 1), array));
        }
    }
    
    /*
        Recorrer un array de forma recursiva
    */
    
}
