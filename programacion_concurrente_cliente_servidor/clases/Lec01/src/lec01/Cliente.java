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
public class Cliente {
    
    // Atributos
    private int idCliente;
    private String nombreCompleto;
    private String direccion;
    private Recibo[] listaRecibo = new Recibo[999];
    
    // Constructores

    public Cliente() {
    }

    public Cliente(int idCliente, String nombreCompleto, String direccion, int cantidadRecibo) {
        this.idCliente = idCliente;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.listaRecibo = new Recibo[cantidadRecibo];
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // toString Method
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", listaRecibo=" + listaRecibo + '}';
    }   
    
    // Metodos
    public void agregarRecibos(){
        int posicion = 0;
        String continuar = "S";
        while(posicion < this.listaRecibo.length || continuar.equals('S')){
            float monto = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto de la compra:"));
            String local = JOptionPane.showInputDialog("Digite el local donde se realizo la compra");
            this.listaRecibo[posicion] = new Recibo(Util.devolverNumero(200, 1), monto, direccion);
            posicion++;
            continuar = JOptionPane.showInputDialog("Si desea continuar digite 'S'" + " cualquier otra tecla detrendra el proceso.");
        }
    }
    
    public void desplegarRecibos(){
        for(int i = 0; i < this.listaRecibo.length; i++){
            if(!this.listaRecibo[i].getProducto().isEmpty()){
                System.out.println(this.listaRecibo[i].toString());
            }
        }
    }
    
}
