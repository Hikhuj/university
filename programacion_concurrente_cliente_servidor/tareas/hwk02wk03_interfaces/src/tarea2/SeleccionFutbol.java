/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author roger
 */
public class SeleccionFutbol {
    
    // Atributos
    int id;
    String nombre;
    String apellido;
    int edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id
                + ", nombre=" + nombre 
                + ", apellido=" + apellido 
                + ", edad=" + edad + '}';
    }
    
    public void concentrarse(){
        System.out.println("Se debe concentrar 3 dias antes");
    }
    
    public void viajar(){
        System.out.println("Debe tener los papeles al dia para poder viajar");
    }
    
}
