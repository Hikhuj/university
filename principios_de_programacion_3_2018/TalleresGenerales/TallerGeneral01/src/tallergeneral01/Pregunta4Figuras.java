/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallergeneral01;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Pregunta4Figuras {
    
    public void piramideDeNumeros() {
        int valorRecibido = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a pregunta 4, \nimprimire una piramide con el numero que me de,\nde forma N-1, por afavor ingrese un numero"));

        int valor = valorRecibido;
        
        // Cuenta de N numero obtenido hacia abajo hasta llegar al 1.
        for(int i = valorRecibido; i >= 1; i--) {
            for(int j = valor; j >= 1; j--){
                System.out.print(j + ",");
            }
            System.out.println();
            valor = valor - 1;
        }
        System.out.println();
    }
    
}
