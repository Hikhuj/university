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
public class Tiburon extends Acuatico{
    
    private int distanciaOlfato;

    public Tiburon() {
        super();
    }

    public Tiburon(float peso, float altura, String nombreCientifico, String tiempoVidaPromedio, String tipoDeAgua, int profundidadNadoPromedio, int distanciaOlfato) {
        super(peso, altura, nombreCientifico, tiempoVidaPromedio, tipoDeAgua, profundidadNadoPromedio);
        this.distanciaOlfato = distanciaOlfato;
    }

    public int getDistanciaOlfato() {
        return distanciaOlfato;
    }

    public void setDistanciaOlfato(int distanciaOlfato) {
        this.distanciaOlfato = distanciaOlfato;
    }

    @Override
    public String toString() {
        return "Tiburon{" + super.toString() +"distanciaOlfato=" + distanciaOlfato + '}';
    }
    
}
