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
public class Menu {
    
    // Solicitados en el menu
    Pregunta3Tienda backUno = new Pregunta3Tienda();
    Pregunta7ComisionGanadaVendedores backCinco = new Pregunta7ComisionGanadaVendedores();
    
    // No solicitados en el menu
    Pregunta4Figuras backDos = new Pregunta4Figuras();
    Pregunta5GanadorEleccion backTres = new Pregunta5GanadorEleccion();
    Pregunta6DivisibleVariosNumeros backCuatro = new Pregunta6DivisibleVariosNumeros();
    
    public void menu() {

        int i = 1;
        int opcionMenu;
        
        while(i != 0) {
            
            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer:\nIngrese 1 para Pregunta 3: Total a pagar de camisa\nIngrese 2 para Pregunta 7: Comision de vendedores\nO ingrese cualquier valor numerico para salir."));
   
            switch(opcionMenu) {
                case 1:
                    backUno.actionPregunta3Tienda();
                    break;
                case 2:
                    backCinco.operacion();
                    break;
                default:
                    i = 0;
                    
            }
        
        }
        
        JOptionPane.showMessageDialog(null, "Adios", "Adios", JOptionPane.INFORMATION_MESSAGE);
            
    }
    
    public void otrosEjercicios() {
        
        JOptionPane.showMessageDialog(null, "Saludos, a continuacion veremos los otros ejercicios solicitados:", "Adios", JOptionPane.INFORMATION_MESSAGE);
        
        backDos.piramideDeNumeros();
        backTres.operacion();
        backCuatro.calcularDivisibilidad();
        
    }
    
}
