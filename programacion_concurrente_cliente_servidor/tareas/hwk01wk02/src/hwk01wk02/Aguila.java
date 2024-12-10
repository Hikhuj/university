/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk01wk02;

/**
 *
 * @author roger
 */
public class Aguila extends Aereo{
    
    private boolean aveRaptora;

    public Aguila() {
        super();
    }

    public Aguila(float peso, float altura, String nombreCientifico, String tiempoVidaPromedio, float longitudAlas, String tipoReproduccion, boolean aveRaptora) {
        super(peso, altura, nombreCientifico, tiempoVidaPromedio, longitudAlas, tipoReproduccion);
        this.aveRaptora = aveRaptora;
    }

    public boolean isAveRaptora() {
        return aveRaptora;
    }

    public void setAveRaptora(boolean aveRaptora) {
        this.aveRaptora = aveRaptora;
    }

    @Override
    public String toString() {
        return "Aguila{" + super.toString() + "aveRaptora=" + aveRaptora + '}';
    }
    
}
