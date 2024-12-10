/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea6;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Backend {
    
    private int tamanoMatriz;
    private int [][] matriz;
    private int espaciosEnMatriz;
    private int total;
    
    // Inicializador
    public void init() {
        
        setTamano();
        setIniciarMatriz(getTamano());
        setMatriz();
        setEjercicio();
        resultado();
        
    }
    
    public void setTamano() {
        
        int tamano = 0;
        
        try{
            tamano = Integer.parseInt(JOptionPane.showInputDialog("Deme el tamano para la matriz cuadrada: "));
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Formato de numero no valido", "Advertencia", JOptionPane.ERROR_MESSAGE);
            
        }
        
        this.tamanoMatriz = tamano;
        
    }
    
    public int getTamano() {
        
        return tamanoMatriz;
        
    }
    
    public void setIniciarMatriz(int tamanoMatriz) {
        
        int vector [][] = new int[tamanoMatriz][tamanoMatriz];
        setEspaciosEnMatriz((tamanoMatriz * tamanoMatriz));
        this.matriz = vector;
        
    }
    
    public void setEspaciosEnMatriz(int espacios) {
        
        this.espaciosEnMatriz = espacios;
        
    }
    
    public int getEspaciosEnMatriz() {
        
        return espaciosEnMatriz;
        
    }
    
    public int [][] getMatriz() {
        
        return matriz;
        
    }
    
    public void setMatriz() {
        
        int [][] vector = getMatriz();
        
        for (int[] vector1 : vector) {
            for (int j = 0; j < vector1.length; j++) {
                vector1[j] = (int) (Math.random() * espaciosEnMatriz);
            }
        }
        
        System.out.println("Matriz total");
        imprimirMatriz(vector);
        
    }
    
    public void setTotal(int total) {
        
        this.total = total;
        
    }
    
    public int getTotal() {
        
        return total;
        
    }
    
    public void setEjercicio() {
        
        int [][] vector = getMatriz();
        int nuevoLimite = vector.length;
        nuevoLimite = nuevoLimite - 1;
        int resultado = 0;
        
        for (int i = 1; i < nuevoLimite; i++) {
            for (int j = 1; j < nuevoLimite; j++) {
                
                resultado = resultado + vector[i][j];
                
            }
        }
        
        setTotal(resultado);
        
    }
    
    public void resultado() {
        
        JOptionPane.showMessageDialog(null, "Suma total de matriz interna es: " + getTotal(), "Total", JOptionPane.INFORMATION_MESSAGE);
        
    }
 
    public void imprimirMatriz(int [][] matriz) {
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + ",");
            }
            System.out.println();
        }
        
    }
    
}
