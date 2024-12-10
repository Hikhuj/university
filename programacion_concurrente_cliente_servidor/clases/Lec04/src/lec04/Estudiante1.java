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
public class Estudiante1 {
    
    private String nombre;
    private String apellido;
    private int carnet;
    private float ponderado;

    public Estudiante1(String nombre, String apellido, int carnet, float ponderado) {
        if(nombre == null || apellido == null || carnet == 0 || ponderado == 0.0f){
            throw new IllegalArgumentException("Datos no completos");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.ponderado = ponderado;
    }

    public float getPonderado() {
        return ponderado;
    }

    public void setPonderado(float ponderado) {
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
    
}
