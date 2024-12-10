package com.ulacit;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author proyectoFinal
 */
@XmlRootElement(name = "proveedor")
public class Proveedor implements Serializable{

    //atributos
    private int id;
    private int telefono1;
    private int telefono2;
    private String proveedor;
    private String correo;
    private String direccion;

    //constructor vacio
    public Proveedor() {
    }

    //constructor normal
    public Proveedor(int id, int telefono1, int telefono2, String proveedor, String correo, String direccion) {
        this.id = id;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.proveedor = proveedor;
        this.correo = correo;
        this.direccion = direccion;
    }

    //setters y getters
    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono1() {
        return telefono1;
    }

    @XmlElement
    public void setTelefono1(int telefono1) {
        this.telefono1 = telefono1;
    }

    public int getTelefono2() {
        return telefono2;
    }

    @XmlElement
    public void setTelefono2(int telefono2) {
        this.telefono2 = telefono2;
    }

    public String getProveedor() {
        return proveedor;
    }

    @XmlElement
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCorreo() {
        return correo;
    }

    @XmlElement
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    @XmlElement
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //toString
    @Override
    public String toString() {
        return "Proveedor{" + "id=" + id + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", proveedor=" + proveedor + ", correo=" + correo + ", direccion=" + direccion + '}';
    }

}
