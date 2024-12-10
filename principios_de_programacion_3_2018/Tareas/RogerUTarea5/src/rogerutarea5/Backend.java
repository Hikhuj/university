/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea5;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Backend {
    
    private int cantidadPersonas;
    private String [] peliculas = {"Saw IV", "Whistlerblower", "Hot Wuz", "Lethal Weapon", "The Matrix"};
    private int [] diasDeAlquilerGeneroPeliculas = new int[peliculas.length];
    
    
    
    public void llamar() {
        
        menu();
        
    }
    
    public void menu () {
        
        int init = 1;
        
        while(init > 0 && init < peliculas.length) {
            
            init = Integer.parseInt(JOptionPane.showInputDialog("Que pelicula desea alquilar: " + peliculas[0] + "\n"
                                                                                                + peliculas[1] + "\n"
                                                                                                + peliculas[2] + "\n"
                                                                                                + peliculas[3] + "\n"
                                                                                                + peliculas[4]));
            if (init > 0 && init < peliculas.length) {
                switch(init){
                    case 1:
                        diasDeAlquilerGeneroPeliculas[0] = diasDeAlquilerGeneroPeliculas[0] + cantidadDeDias();
                        break;
                    case 2:
                        diasDeAlquilerGeneroPeliculas[1] = diasDeAlquilerGeneroPeliculas[1] + cantidadDeDias();
                        break;
                    case 3:
                        diasDeAlquilerGeneroPeliculas[2] = diasDeAlquilerGeneroPeliculas[2] + cantidadDeDias();
                        break;
                    case 4:
                        diasDeAlquilerGeneroPeliculas[3] = diasDeAlquilerGeneroPeliculas[3] + cantidadDeDias();
                        break;
                    case 5:
                        diasDeAlquilerGeneroPeliculas[4] = diasDeAlquilerGeneroPeliculas[4] + cantidadDeDias();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Sin numero o fuera de rango", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }
        
    }
    
    public int cantidadDeDias() {
        
        int resultado;
        
        resultado = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de dias para alquilar la pelicula? "));
        
        return resultado;
        
    }
    
    
    public void imprimirCantidades() {
        
        
        
    }
}
