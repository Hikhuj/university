/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec03;

/**
 *
 * @author roger
 */
public abstract class Empleado {
    
    private String nombre;
    private String identificador;
    private String direccion;
    private float salario;

    public Empleado() {
    }

    public Empleado(String nombre, String identificador, String direccion, float salario) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.direccion = direccion;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "Empleado{" + "nombre=" + nombre + ", identificador=" + identificador + ", direccion=" + direccion + ", salario=" + salario + '}';
    }
    
    public void lugarTrabajo(String lugar){
        System.out.println("El lugar de trabajo es: " + lugar);
    }
    
    public abstract void calcularSalario();
    
}
