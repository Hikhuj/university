package com.ulacit;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author proyectoFinal
 */

@XmlRootElement(name = "contactoProveedor")
public class ContactoProveedor implements Serializable{

    //atributos
    private int id;
    private int telefono;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String correo;

    //constructor vacio
    public ContactoProveedor() {
    }

    //constructor normal
    public ContactoProveedor(int id, int telefono, String nombre, String apellido1, String apellido2, String correo) {
        this.id = id;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correo = correo;
    }

    //setters y getters
    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    @XmlElement
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    @XmlElement
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    @XmlElement
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    @XmlElement
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    @XmlElement
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //toString
    @Override
    public String toString() {
        return "ContactoProveedor{" + "id=" + id + ", telefono=" + telefono + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", correo=" + correo + '}';
    }

}
