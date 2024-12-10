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
public class Pregunta7ComisionGanadaVendedores {
    
    private final String nombreVendedor1 = "Julieta";
    private final String nombreVendedor2 = "Marco";
    private double comisionVendedor1 = 0.0;
    private double comisionVendedor2 = 0.0;
    private int cantidadDeVentasDelDia;
    private final double porcentajeComision = 0.15;

    public void setComisionVendedor1(double comision) {
        this.comisionVendedor1 = comisionVendedor1 + comision;
    }

    public void setComisionVendedor2(double comision) {
        this.comisionVendedor2 = comisionVendedor2 + comision;
    }

    public void setCantidadDeVentasDelDia(int cantidadDeVentasDelDia) {
        this.cantidadDeVentasDelDia = cantidadDeVentasDelDia;
    }

    public String getNombreVendedor1() {
        return nombreVendedor1;
    }

    public String getNombreVendedor2() {
        return nombreVendedor2;
    }

    public double getComisionVendedor1() {
        return comisionVendedor1;
    }

    public double getComisionVendedor2() {
        return comisionVendedor2;
    }

    public int getCantidadDeVentasDelDia() {
        return cantidadDeVentasDelDia;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }
    
    public double calcularComision(double monto) {
        
        double resultado = monto * porcentajeComision;
        return resultado;
        
    }
    
    public void operacion() {
        
        setCantidadDeVentasDelDia(Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a comision, por favor ingrese cantidad de ventas del dia: ")));
   
        int i = 0;
        int venta;
        int monto;
        double comisionesParaVendedor1 = 0.0;
        double comisionesParaVendedor2 = 0.0;
        
        while(i < cantidadDeVentasDelDia) {
            
            venta = i + 1;
            
            monto = Integer.parseInt(JOptionPane.showInputDialog("Asignar venta " + venta + " a:\n1 para vendedor/a " + nombreVendedor1 + "\n2 para vendedor/a " + nombreVendedor1));
            
            switch(monto) {
                case 1:
                    comisionesParaVendedor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto de venta de " + nombreVendedor1));
                    break;
                case 2:
                    comisionesParaVendedor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto de venta de " + nombreVendedor2));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No existe vendedor", "Comision de Vendedores", JOptionPane.WARNING_MESSAGE);
            }
            
            System.out.println(i);
            i++;
            
        }
        
        setComisionVendedor1(calcularComision(comisionesParaVendedor1));
        setComisionVendedor2(calcularComision(comisionesParaVendedor2));
        imprimirResultados();
        
        
    }
    
    public void imprimirResultados() {
        
        JOptionPane.showMessageDialog(null, "El vendedor " + nombreVendedor1 + " gano: " + getComisionVendedor1() + "\n" + "El vendedor " + nombreVendedor2 + " gano: " + getComisionVendedor2(), "Calculo de comision vendedores", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
    
}
