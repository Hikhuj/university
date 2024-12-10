/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciossemana3;

import javax.swing.*;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Ejercicio1 {

    // Metodos
    public void imprimirDatos() {
        
        String nombreUsuario = JOptionPane.showInputDialog("Deme su nombre:");
        String anioNacimientoUsuario = JOptionPane.showInputDialog("Deme anio de nacimiento:");
        int anioNacimientoUsuarioInt = Integer.parseInt(anioNacimientoUsuario);
        
        JOptionPane.showMessageDialog(null, "Hola " + nombreUsuario + ", en el anio 2018 tendras " + calcularEdad(anioNacimientoUsuarioInt) + " anios.");
        
    }
    
    private int calcularEdad(int anioNacimiento) {
        
        int resultado = 0;
        
        resultado = 2018 - anioNacimiento;
        
        return resultado;
        
    }
    
}
