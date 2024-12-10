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
public class Colibri extends Aereo{
    
    private int velocidadDeLatidos;

    public Colibri() {
    }

    public Colibri(float peso, float altura, String nombreCientifico, String tiempoVidaPromedio, float longitudAlas, String tipoReproduccion, int velocidadDeLatidos) {
        super(peso, altura, nombreCientifico, tiempoVidaPromedio, longitudAlas, tipoReproduccion);
        this.velocidadDeLatidos = velocidadDeLatidos;
    }

    public int getVelocidadDeLatidos() {
        return velocidadDeLatidos;
    }

    public void setVelocidadDeLatidos(int velocidadDeLatidos) {
        this.velocidadDeLatidos = velocidadDeLatidos;
    }

    @Override
    public String toString() {
        return "Colibri{" + super.toString() +"velocidadDeLatidos=" + velocidadDeLatidos + '}';
    }
    
}