/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Carro {
    
    // Attributes
    String traccion;
    short cilindraje;
    byte cantidadPasajeros;
    String color = "Gris";
    String transmision;
    byte puertas = 5;
    byte llantas;
    String serialMotor;
    String modelo = "Creta";
    int year = 2017;
    String combustible = "Super";
    boolean riteve = false;
    boolean marchamo = true;
    
    
    // Methods
    public void imprimir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + year);
        System.out.println("Color: " + color);
        System.out.println("Combustible: " + combustible);
        System.out.println();
    }
    
}
