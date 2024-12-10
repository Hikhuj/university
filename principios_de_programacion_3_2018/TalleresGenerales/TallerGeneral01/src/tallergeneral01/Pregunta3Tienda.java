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
public class Pregunta3Tienda {
    
    private final int camisaPequenaPrecio = 3000;
    private final int camisaMedianaPrecio = 5300;
    private final int camisaGrandePrecio = 7000;
    private final double descuentoCamisaMediana = 0.03;
    private final double descuentoCamisaGrande = 0.05;
    private int cantidadCamisas;
    private char tamanoCamisas;
    private double precioAPagar;

    public void setCantidadCamisas(String cantidadCamisas) {
        this.cantidadCamisas = Integer.parseInt(cantidadCamisas);
    }

    public void setTamanoCamisas(String tamanoCamisas) {
        this.tamanoCamisas = tamanoCamisas.charAt(0);
    }
    
    public double getPrecioAPagar() {
        return precioAPagar;
    }
    
    public void calcularTotal() {
        double totalValor;
        
        if(tamanoCamisas == 'P') {
            this.precioAPagar = cantidadCamisas * camisaPequenaPrecio;
        }else{
            if(tamanoCamisas == 'M') {
                totalValor = cantidadCamisas * camisaMedianaPrecio;
                this.precioAPagar = totalValor - (totalValor * descuentoCamisaMediana);
            }else{
                if(tamanoCamisas == 'G'){
                    totalValor = cantidadCamisas * camisaGrandePrecio;
                    this.precioAPagar = totalValor - (totalValor * descuentoCamisaGrande);
                }else{
                    System.out.println("Ingresó un valor erroneo");
                    // llamar al menu principal de nuevo
                }
            }
        }
    }
    
    public void actionPregunta3Tienda() {
        
        System.out.println("Bienvenido a la pregunta #3");
        setCantidadCamisas(JOptionPane.showInputDialog("Deme la cantidad de camisas:"));
        setTamanoCamisas(JOptionPane.showInputDialog("Que tamano desea:\nTalla Pequena (ingrese 'P')\nTalla Mediana (ingrese 'M')\nTalla Grande (ingrese 'G')"));
        calcularTotal();
        //System.out.println("Total a pagar: " + getPrecioAPagar());
        JOptionPane.showMessageDialog(null, "Total a pagar: " + getPrecioAPagar(), "Total a Pagar", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
