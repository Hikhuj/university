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
public class Ejercicio2 {
    
    // Metodos
    public void imprimirDatos2() {
        
        String nombreUsuario = JOptionPane.showInputDialog("Deme su nombre:");
        String salarioUsuario = JOptionPane.showInputDialog("Deme su salario:");
        double salarioUsuarioDouble = Double.parseDouble(salarioUsuario);
        
        JOptionPane.showMessageDialog(null, "Estimado " + nombreUsuario + ". En este mes su salario se desglosa así:"
                                       + "\nSalario bruto: " + salarioUsuario
                                       + "\n8% CCSS: " + calcularCCSS(salarioUsuarioDouble)
                                       + "\n1% Banco Popular: " + calcularBancoPopular(salarioUsuarioDouble)
                                       + "\nTotal de deducciones: " + calcularTotalDeducciones(salarioUsuarioDouble)
                                       + "\nSalario Neto: " + calcularSalarioNeto(salarioUsuarioDouble));
        
    }
    
    
    private double calcularCCSS(double salarioUsuarioDouble) {
        
        double resultado;
        
        resultado = salarioUsuarioDouble - (salarioUsuarioDouble * 0.08);
        
        return resultado;
        
    }
    
    
    private double calcularBancoPopular(double salarioUsuarioDouble) {
        
        double resultado;
        
        resultado = salarioUsuarioDouble - (salarioUsuarioDouble * 0.01);
        
        return resultado;
        
    }
    
    
    private double calcularTotalDeducciones(double salarioUsuarioDouble) {
        
        double resultado;
        
        resultado = salarioUsuarioDouble * 0.09;
        
        return resultado;
        
    }
    
    
    private double calcularSalarioNeto(double salarioUsuarioDouble) {
        
        double resultado;
        
        resultado = salarioUsuarioDouble - (salarioUsuarioDouble * 0.09);
        
        return resultado;
        
    }
    
}
