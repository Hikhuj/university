/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana02;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Backend {

    
    // Ejercicio de Fibonacci
    public void ejercicio01() {

        int num;
        int numFibonacci;

        try{

            num = Integer.parseInt(JOptionPane.showInputDialog("Deme un numero"));

            numFibonacci = calcFibonacci(num);
            
            System.out.println("El Fibonacci de " + num + " es: " + calcFibonacci(num));
            
        }catch(HeadlessException | NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Mensaje Error", "No es un numero", JOptionPane.ERROR_MESSAGE);

        }

    }
        
    private int calcFibonacci(int a) {

        // Caso base
        if(a == 0) {
            
            return 0;

        }else{
            
            // Caso base 2
            // Donde el Fibonacci de 1 es igual a si mismo
            if(a == 1) {
                
                return 1;
                
            
            }else{
                
                // Se toma el numero - 1 ma
                return calcFibonacci(a - 1) + calcFibonacci(a - 2);
                
            }
        }

    }
    
    
    // Ejercicio de Restas por Recursividad
    public void ejercicio02() {

        int num;
        int num2;
        int result;

        try{

            num = Integer.parseInt(JOptionPane.showInputDialog("Deme el dividendo"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Deme el divisor"));
            
            result = divisionBySub(num, num2);
            
            System.out.println("El resultado de dividir " + num + "/" + num2 + " es: " + result);
            
        }catch(HeadlessException | NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Mensaje Error", "No es un numero", JOptionPane.ERROR_MESSAGE);

        }

    }
    
    private int divisionBySub(int num, int num2) {
        
        // Caso base
        // Para que funcione el Dividendo (num) llegara a ser menor que el divisor (num2)
        if(num < num2){
            
            return 0;
            
        }else{
            
            // Cuando se cumpla el Caso Base al sumar un # positivo con el 0 (cero)
            // este ira retornandose recursivamente y sumandose hasta dar un total
            // el cual definira cuantas veces fue hecha la operacion, ergo: cuantas veces se puede 
            // restar
            return 1 + divisionBySub(num - num2, num2);
            
        }

    }
 

    // Ejercicio de conversion: Binario a Decimal
    public void ejercicio03() {
        
        int num;
        int result;

        try{

            num = Integer.parseInt(JOptionPane.showInputDialog("Deme el numero binario"));

            result = binaryToDecimal(num);
            
            System.out.println("El decimal del binario " + num + " es: " + result);
            
        }catch(HeadlessException | NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Mensaje Error", "No es un numero", JOptionPane.ERROR_MESSAGE);

        }
        
    }
    
    private int binaryToDecimal(int n) {
        
        //Caso base
        if(n == 0) {
            
            return 1;
            
        }else{
            
            return 1;
            
        }
        
    }

}
