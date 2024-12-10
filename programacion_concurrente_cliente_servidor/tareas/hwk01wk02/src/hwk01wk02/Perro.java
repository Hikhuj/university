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
public class Perro extends Terrestre{
    
    private String raza;
    private String ancestros;

    public Perro() {
        super();
    }

    public Perro(float peso, float altura, String nombreCientifico, String tiempoVidaPromedio, int cantidadPatas, String raza, String ancestros) {
        super(peso, altura, nombreCientifico, tiempoVidaPromedio, cantidadPatas);
        this.raza = raza;
        this.ancestros = ancestros;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAncestros() {
        return ancestros;
    }

    public void setAncestros(String ancestros) {
        this.ancestros = ancestros;
    }

    @Override
    public String toString() {
        return "Perro{" + super.toString() + "raza=" + raza + ", ancestros=" + ancestros + '}';
    }
    
}
