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
public class Animal {
    
    // Atributos
    private float peso;
    private float altura;
    private String nombreCientifico;
    private String tiempoVidaPromedio;
    
    // Constructores
    public Animal(){
    }

    public Animal(float peso, float altura, String nombreCientifico, String tiempoVidaPromedio) {
        this.peso = peso;
        this.altura = altura;
        this.nombreCientifico = nombreCientifico;
        this.tiempoVidaPromedio = tiempoVidaPromedio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getTiempoVidaPromedio() {
        return tiempoVidaPromedio;
    }

    public void setTiempoVidaPromedio(String tiempoVidaPromedio) {
        this.tiempoVidaPromedio = tiempoVidaPromedio;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", altura=" + altura + ", nombreCientifico=" + nombreCientifico + ", tiempoVidaPromedio=" + tiempoVidaPromedio + '}';
    }
    
    public String mostrarFrase(){
        return "Hola, soy un animal";
    }
    
}
