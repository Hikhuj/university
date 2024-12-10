/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Apartado {
    
    // Atributos
    private String nombre;
    private int numeroFactura;
    private double montoDeCompra;
    // Podemos crear un atributo de tipo objeto
    private DiaUno creacion;
    private DiaUno fechaVencimiento;
    
    public void solicitar() {
        
        this.nombre = JOptionPane.showInputDialog("Deme su nombre: ");
        this.numeroFactura = Integer.parseInt(JOptionPane.showInputDialog("Deme su numero de factura: "));
        this.montoDeCompra = Double.parseDouble(JOptionPane.showInputDialog("Deme monto de compra: "));
        
        // Puedo incluso darle valores
        creacion = new DiaUno();
        fechaVencimiento = new DiaUno(Integer.parseInt(JOptionPane.showInputDialog("Creando Factura: Deme dia")),Integer.parseInt(JOptionPane.showInputDialog("Creando Factura: Deme mes")),Integer.parseInt(JOptionPane.showInputDialog("Creando Factura: Deme an")));
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de factura: " + numeroFactura);
        System.out.println("Monto de la compra: $" + montoDeCompra);
        System.out.println("Creacion de factura: " + creacion);
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
        
        
    }
    
}
