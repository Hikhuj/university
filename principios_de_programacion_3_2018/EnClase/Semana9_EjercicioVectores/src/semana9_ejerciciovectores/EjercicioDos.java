/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9_ejerciciovectores;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class EjercicioDos {
    
    private int tamanoArreglo;
    private int [] arregloNumeros = new int[tamanoArreglo];
    private int numeroMayor;
    
    public void llamar() {
        
        setTamanoArreglo();
        crearArreglo();
        obtenerNumeroMayor();
        System.out.println("El numero mayor es: " + getNumeroMayor());
        
    }
    
    public void setTamanoArreglo() {
        
        this.tamanoArreglo = Integer.parseInt(JOptionPane.showInputDialog("Dar tamano de arreglo: "));
        
    }
    
    public void crearArreglo() {
        
        int [] array = new int[tamanoArreglo];
        
        for (int i = 0; i < tamanoArreglo; i++) {
            array[i] = (int) (Math.random() * tamanoArreglo);
        }
        
        arregloNumeros = array;
        
        imprimirArreglo();
        
    }
    
    public void imprimirArreglo() {
        
        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.println("Numero " + i + ": " + arregloNumeros[i]);
        }
        
    }
    
    public void obtenerNumeroMayor() {
        
        int [] array = arregloNumeros;
        int valorInicial = 0;
        
        for (int i = 0; i < array.length; i++) {
            
            if ((int)(array[i]) > valorInicial ) {
                valorInicial  = array[i];
            }
            
        }
        
        this.numeroMayor = valorInicial;
        
    }
    
    public int getNumeroMayor() {
        
        return numeroMayor;
        
    }
    
}
