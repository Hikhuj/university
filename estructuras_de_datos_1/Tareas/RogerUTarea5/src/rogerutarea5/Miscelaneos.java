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
public class Miscelaneos {
    
    public void mensajeErrorValorNuloONoNumerico() {
    
        JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error", JOptionPane.ERROR_MESSAGE);

    }
    
    public void mensajeErrorValorFueraRango() {
        
        JOptionPane.showMessageDialog(null, "Opcion fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
        
    }
    
    public void errorMessageIdAlreadyExist() {
        
        JOptionPane.showMessageDialog(null, "Id ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        
    }
   
}