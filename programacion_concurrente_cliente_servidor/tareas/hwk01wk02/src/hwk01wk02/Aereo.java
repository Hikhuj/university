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
public class Aereo extends Animal{
    
    private float longitudAlas;
    private String tipoReproduccion;

    public Aereo() {
        super();
    }

    public Aereo(float peso, float altura, String nombreCientifico, String tiempoVidaPromedio, float longitudAlas, String tipoReproduccion) {
        super(peso, altura, nombreCientifico, tiempoVidaPromedio);
        this.longitudAlas = longitudAlas;
        this.tipoReproduccion = tipoReproduccion;
    }

    public float getLongitudAlas() {
        return longitudAlas;
    }

    public void setLongitudAlas(float longitudAlas) {
        this.longitudAlas = longitudAlas;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    @Override
    public String toString() {
        return "Aereo{" + super.toString() + "longitudAlas=" + longitudAlas + ", tipoReproduccion=" + tipoReproduccion + '}';
    }
    
}
