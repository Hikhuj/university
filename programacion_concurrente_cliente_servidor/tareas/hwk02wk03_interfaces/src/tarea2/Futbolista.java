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
public class Futbolista extends SeleccionFutbol{
    
    private int dorsal;
    private String demarcacion;
    
    public Futbolista(){
        super();
    }

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    public void jugarPartido(){
            System.out.println("El jugador juega el partido");
    }
    
    public void entrenar(){
        System.out.println("El jugador entrena");
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista{" + super.toString() + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
    
}
