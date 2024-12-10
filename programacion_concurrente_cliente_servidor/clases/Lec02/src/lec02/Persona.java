/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec02;

/**
 *
 * @author roger
 */
public class Persona {
    
    // Atributos
    int id;
    String nombre;
    String documentoIdentificacion;
    String fechaNacimiento;
    String email;
    
    // Metodos

    public Persona() {
    }

    public Persona(int id, String nombre, String documentoIdentificacion, String fechaNacimiento, String email) {
        this.id = id;
        this.nombre = nombre;
        this.documentoIdentificacion = documentoIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
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

    public String getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(String documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", documentoIdentificacion=" + documentoIdentificacion + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + '}';
    }
    
    
}
