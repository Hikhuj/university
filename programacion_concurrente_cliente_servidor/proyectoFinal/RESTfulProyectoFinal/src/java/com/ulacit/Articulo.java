package com.ulacit;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author proyectoFinal
 */

@XmlRootElement(name = "articulo")
public class Articulo implements Serializable{

    //atributos
    private int id;
    private int idProveedor;
    private int cantidadDisponible;
    private String descripcion;
    private String categoria;
    private double precio;
    private char disponible;

    //constructor vacio
    public Articulo() {
    }

    ///constructor normal
    public Articulo(int id, int idProveedor, int cantidadDisponible, String descripcion, String categoria, double precio, char disponible) {
        this.id = id;
        this.idProveedor = idProveedor;
        this.cantidadDisponible = cantidadDisponible;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.disponible = disponible;
    }

    //setters y getters
    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    @XmlElement
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    @XmlElement
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @XmlElement
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    @XmlElement
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    @XmlElement
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public char getDisponible() {
        return disponible;
    }

    @XmlElement
    public void setDisponible(char disponible) {
        this.disponible = disponible;
    }

    //toString
    @Override
    public String toString() {
        return "Articulo{" + "id=" + id + ", idProveedor=" + idProveedor + ", cantidadDisponible=" + cantidadDisponible + ", descripcion=" + descripcion + ", categoria=" + categoria + ", precio=" + precio + ", disponible=" + disponible + '}';
    }

}
