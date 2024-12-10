/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec04;

/**
 *
 * @author roger
 */
public class Estudiante implements Comparable{
    
    private String nombre;
    private String apellido;
    private int carnet;
    private float ponderado;

    public Estudiante(String nombre, String apellido, int carnet, float ponderado) {
        if(nombre == null || apellido == null || carnet == 0 || ponderado == 0.0f){
            throw new IllegalArgumentException("Datos no completos");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.ponderado = ponderado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public float getPonderado() {
        return ponderado;
    }

    public void setPonderado(float ponderado) {
        this.ponderado = ponderado;
    }
    
    // Metodo de INTERFACE COMPARABLE
    @Override
    public int compareTo(Object o){
        // Con esto vamos a hacer que ordenamos la lista por el promedio ponderado
        double f = ponderado - ((Estudiante)o).ponderado;
        if(f == 0.0){
            return 0;
        }else if(f < 0.0){
            // Diciendo que si es menor le decimos que lo mande atras y evalue el siguiente
            return -1;
        }else{
            return 1;
        }
    }
    
}
