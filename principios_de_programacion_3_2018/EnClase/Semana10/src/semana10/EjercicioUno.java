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
public class EjercicioUno {
    
    /*
        Variables
    */
    
    private int matrizNN[][];
    private int matrizNM[][];
    
    /*
        Metodos
    */
    
    public void init() {
        
        askFormaLlenarMatriz();
        
    }
    
    public void setMatrizNN() {
        
        int n;
        
        try {
            
            n = Integer.parseInt(JOptionPane.showInputDialog("Tamano de la matriz cuadrada: "));
            this.matrizNN = new int[n][n];
            
        }catch(Exception e) {
            
            JOptionPane.showMessageDialog(null,"No es un numero, intente de nuevo", "Advertencia",JOptionPane.WARNING_MESSAGE);
            setMatrizNN();
            
        }
        
    }
    
    public void setMatrizNM() {
        
        int n;
        int m;
        
        try {
            
            n = Integer.parseInt(JOptionPane.showInputDialog("Deme el tamano de la matriz rectangular (ALTURA): "));
            m = Integer.parseInt(JOptionPane.showInputDialog("Deme el tamano de la matriz rectangular (BASE): "));
            this.matrizNM = new int[n][m];
            
        }catch(Exception e) {
            
            JOptionPane.showMessageDialog(null,"No es un numero, intente de nuevo", "Advertencia",JOptionPane.WARNING_MESSAGE);
            setMatrizNM();
            
        }
        
    }
    
    public void llenaMatrizNN(boolean ordenado) {
        
        if(ordenado) {
            
            int contador = 0;
            int [][] array = this.matrizNN;
            
            // Orden ascendente
            // Cantidad de filas
            for (int i = 0; i < array.length; i++) {
                // Cantidad de columnas
                for (int j = 0; j < array.length; j++) {

                    array[i][j] = contador;
                    contador++;

                }
            }
            
            this.matrizNN = array;
            imprimir(this.matrizNN);
            
        }else{

            int [][] array = this.matrizNN;
            
            // Automatico
            // Cantidad de filas
            for (int i = 0; i < array.length; i++) {
                // Cantidad de columnas
                for (int j = 0; j < array.length; j++) {

                    array[i][j] = (int) (Math.random() * (array.length * array[0].length ));

                }
            }
            
            this.matrizNN = array;
            imprimir(this.matrizNN);
            
        }
        
    }
    
    public void llenaMatrizNM(boolean ordenado) {
        
        if(ordenado) {
            
            int contador = 0;
            int [][] array = this.matrizNM;
            
            // Orden ascendente
            // Cantidad de filas
            for (int i = 0; i < array.length; i++) {
                // Cantidad de columnas
                for (int j = 0; j < array.length; j++) {

                    array[i][j] = contador;
                    contador++;
                }
            }
            
            this.matrizNM = array;
            imprimir(this.matrizNM);
            
        }else{

            int [][] array = this.matrizNM;
            
            // Automatico
            // Cantidad de filas
            for (int i = 0; i < array.length; i++) {
                // Cantidad de columnas
                for (int j = 0; j < array.length; j++) {

                    array[i][j] = (int) (Math.random() * (array.length * array[0].length ));

                }
            }
            
            this.matrizNM = array;
            imprimir(this.matrizNM);
            
        }
        
    }
    
    public void imprimir(int [][] array) {
        
        System.out.println("");
        // Cantidad de filas
        for (int i = 0; i < array.length; i++) {
            // Cantidad de columnas
            for (int j = 0; j < array[i].length; j++) {
                
                System.out.print(" " + array[i][j]);
                
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void askFormaLlenarMatriz() {
    
        boolean ordenado;
        
        setMatrizNN();
        setMatrizNM();
        
        try{
            
            ordenado = Boolean.parseBoolean(JOptionPane.showInputDialog("De que forma quiere llenar las matrices\n - Digite --> true , para ordenado\n - Digite ---> false , para aleatorio "));
            llenaMatrizNN(ordenado);
            llenaMatrizNM(ordenado);
            
        }catch(Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"ERROR", "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    
    }

}
