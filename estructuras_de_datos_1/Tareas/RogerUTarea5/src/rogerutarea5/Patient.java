/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea5;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Patient {
    
    // Atributes
    private String nombre;
    private int prioridad;
    private int ficha;
    private String especialidad;

    @Override
    public String toString() {
        return "Paciente: " + "nombre=" + nombre + ", prioridad=" + prioridad + ", ficha=" + ficha + ", especialidad=" + especialidad;
    }

    public Patient(String nombre, int prioridad, int ficha, String especialidad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.ficha = ficha;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
