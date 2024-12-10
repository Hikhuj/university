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
public class Terrestre extends Animal{
    
    private int cantidadPatas;

    public Terrestre() {
        super();
    }

    public Terrestre(float peso, float altura, String nombreCientifico, String tiempoVidaPromedio, int cantidadPatas) {
        super(peso, altura, nombreCientifico, tiempoVidaPromedio);
        this.cantidadPatas = cantidadPatas;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    @Override
    public String toString() {
        return "Terrestre{" + super.toString() + "cantidadPatas=" + cantidadPatas + '}';
    }
    
    public void animalRespiraAire(){
        System.out.println("El animal terrestre respira aire");
    }
    
    public String mostrarFrase(){
        return super.mostrarFrase() + ", ademas soy terrestre";
    }
    
}