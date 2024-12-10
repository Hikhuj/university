/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Ejemplos {
    
    /*
        Variables
    */
    
    int [][] ventas = new int [4][5];
    
    
    
    /*
        Metodos
    */
    
    public void init() {
        
        // llenar();
        llenadoAutomatico();
        imprimir();
        
    }
    
    public void llenar() {
        
        // Cantidad de filas
        for (int i = 0; i < ventas.length; i++) {
            // Cantidad de columnas
            for (int j = 0; j < ventas.length; j++) {
                
                ventas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la venta " + i + "/" + j));
                
            }
        }
        
    }
    
    
    public void llenadoAutomatico() {
        
        // Cantidad de filas
        for (int i = 0; i < ventas.length; i++) {
            // Cantidad de columnas
            for (int j = 0; j < ventas.length; j++) {
                
                ventas[i][j] = (int) (Math.random() * (ventas.length * ventas[0].length ));
                
            }
        }
        
    }
    
    
    public void imprimir() {
        
        // Cantidad de filas
        for (int i = 0; i < ventas.length; i++) {
            // Cantidad de columnas
            for (int j = 0; j < ventas[i].length; j++) {
                
                System.out.print(" " + ventas[i][j]);
                
            }
            System.out.println("");
        }
        
    }
    
}
