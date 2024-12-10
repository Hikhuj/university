package com.ulacit;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author proyectoFinal
 */
@XmlRootElement(name = "empleado")
public class Empleado implements Serializable{
    
    //atributos
    private int id;
    private String usuario;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String email;
    
    //constructor vacio
    public Empleado() {
    }

    //constructor normal
    public Empleado(int id, String usuario, String nombre1, String nombre2, String apellido1, String apellido2, String email) {
        this.id = id;
        this.usuario = usuario;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
    }
    
    //setters y getters
    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    @XmlElement
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre1() {
        return nombre1;
    }

    @XmlElement
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    @XmlElement
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
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

    public String getEmail() {
        return email;
    }

    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }
    
    //toString
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", usuario=" + usuario + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", email=" + email + '}';
    }

}
