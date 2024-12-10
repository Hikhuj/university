/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author roger
 */
public abstract class Entrenadores extends SeleccionFutbol{
    
    private int idFederacionCR;
    
    public Entrenadores(){
        super();
    }

    public Entrenadores(int id, String nombre, String apellido, int edad, int idFederacionCR) {
        super(id, nombre, apellido, edad);
        this.idFederacionCR = idFederacionCR;
    }

    public int getIdFederacionCR() {
        return idFederacionCR;
    }

    public void setIdFederacionCR(int idFederacionCR) {
        this.idFederacionCR = idFederacionCR;
    }
    
    // Metodo abstracto
    public abstract void dormir();
    
}
