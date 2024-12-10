/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec01;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Lec01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente miCliente;
        
        int id = Util.devolverNumero(200,1);
        String nombre = JOptionPane.showInputDialog("Digite el nombre del cliente");
        String direccion = JOptionPane.showInputDialog("Digite la direccion");
        int cantidadRecibos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de recibos"));
        
        miCliente = new Cliente(id, nombre, direccion, cantidadRecibos);
        miCliente.agregarRecibos();
        miCliente.desplegarRecibos();
        
    }
    
}
