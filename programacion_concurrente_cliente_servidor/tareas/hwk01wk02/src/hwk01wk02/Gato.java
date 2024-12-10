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
public class Gato extends Terrestre{
    
    private boolean caza;

    public Gato() {
        super();
    }

    public Gato(float peso, float altura, String nombreCientifico, String tiempoVidaPromedio, int cantidadPatas, boolean caza) {
        super(peso, altura, nombreCientifico, tiempoVidaPromedio, cantidadPatas);
        this.caza = caza;
    }

    public boolean isCaza() {
        return caza;
    }

    public void setCaza(boolean caza) {
        this.caza = caza;
    }

    @Override
    public String toString() {
        return "Gato{" + super.toString() + "caza=" + caza + '}';
    }
    
}
