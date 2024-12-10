/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Auto {
    
    private String marca, modelo;
    private int anio, pasajeros;

    public Auto(String marca, String modelo, int anio, int pasajeros) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.pasajeros = pasajeros;
    }
    
    @Override
    public String toString() {
        return "\nAuto:" + marca + ", modelo=" + modelo + ", anio=" + anio + ", pasajeros=" + pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
}
