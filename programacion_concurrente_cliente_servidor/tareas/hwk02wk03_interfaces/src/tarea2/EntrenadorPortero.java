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
public class EntrenadorPortero extends Entrenadores{
    
    // Atributos
    private String porteroAsignado;

    public EntrenadorPortero() {
        super();
    }

    public String getPorteroAsignado() {
        return porteroAsignado;
    }

    public void setPorteroAsignado(String porteroAsignado) {
        this.porteroAsignado = porteroAsignado;
    }
    
    @Override
    public void dormir(){
        System.out.println("El o la Asistente de Portero duerme poco por que se vuelve mas loco");
    }
    
}
