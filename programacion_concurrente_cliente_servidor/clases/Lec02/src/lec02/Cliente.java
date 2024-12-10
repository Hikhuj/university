/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec02;

/**
 *
 * @author roger
 */
public class Cliente extends Persona{
    
    // Attributes
    String cuenta;
    float limiteCompra;
    String fechaVencimientoMembresia;
    boolean vip;
    
    public Cliente(){
        super();
    }

    public Cliente(String cuenta, float limiteCompra, String fechaVencimientoMembresia, boolean vip, int id, String nombre, String documentoIdentificacion, String fechaNacimiento, String email) {
        super(id, nombre, documentoIdentificacion, fechaNacimiento, email);
        this.cuenta = cuenta;
        this.limiteCompra = limiteCompra;
        this.fechaVencimientoMembresia = fechaVencimientoMembresia;
        this.vip = vip;
    }

    @Override
    public String toString() {
        // Aqui es sumamente importante poner atencion a super(), ya que este nos permite llamar todo lo que la clase padre,
        // en este caso Cliente mas + super.toString, nos permite llamar el toString de Cliente y despues ya que estoy en la 
        // clase persona, llamar normalmente a Persona.
        return "Cliente{" + super.toString() + "cuenta=" + cuenta + ", limiteCompra=" + limiteCompra + ", fechaVencimientoMembresia=" + fechaVencimientoMembresia + ", vip=" + vip + '}';
    }
    
    
    
    
}
