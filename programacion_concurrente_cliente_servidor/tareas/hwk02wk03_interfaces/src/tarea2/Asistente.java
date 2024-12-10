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
public class Asistente extends Entrenadores{
    
    // Atributos
    private int mesesExperienciaAsistente;

    public Asistente(){
        super();
    }

    public Asistente(int id, String nombre, String apellido, int edad, int idFederacionCR, int mesesExperienciaAsistente) {
        super(id, nombre, apellido, edad, idFederacionCR);
        this.mesesExperienciaAsistente = mesesExperienciaAsistente;
    }

    public int getMesesExperienciaAsistente() {
        return mesesExperienciaAsistente;
    }

    public void setMesesExperienciaAsistente(int mesesExperienciaAsistente) {
        this.mesesExperienciaAsistente = mesesExperienciaAsistente;
    }
    
    @Override
    public void dormir(){
        System.out.println("El o la Asistente duerme poco por que se vuelve loco");
    }
    
}
