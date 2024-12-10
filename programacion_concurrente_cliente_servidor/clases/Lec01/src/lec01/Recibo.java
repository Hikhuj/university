/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec01;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Recibo {
    
    // Atributos
    private int numeroRecibo;
    private float monto;
    private String producto;

    public Recibo() {
    }

    public Recibo(int numeroRecibo, float monto, String producto) {
        this.numeroRecibo = numeroRecibo;
        this.monto = monto;
        this.producto = producto;
    }

    public int getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(int numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Recibo{" + "numeroRecibo=" + numeroRecibo + ", monto=" + monto + ", producto=" + producto + '}';
    }
    
}
