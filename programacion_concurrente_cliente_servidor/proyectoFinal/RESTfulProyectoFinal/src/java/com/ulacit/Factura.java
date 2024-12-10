package com.ulacit;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author proyectoFinal
 */
@XmlRootElement (name = "factura")
public class Factura implements Serializable{

    //atributos
    private int id;
    private int idCliente;
    private String emailCliente;
    private String nombreCliente;
    private String nombreCajero;
    private String fecha;
    private String hora;
    private double subtotal;
    private double impuesto;
    private double total;

    //constructor vacio
    public Factura() {
    }

    //constructor normal
    public Factura(int id, int idCliente, String emailCliente, String nombreCliente, String nombreCajero, String fecha, String hora, double subtotal, double impuesto, double total) {
        this.id = id;
        this.idCliente = idCliente;
        this.emailCliente = emailCliente;
        this.nombreCliente = nombreCliente;
        this.nombreCajero = nombreCajero;
        this.fecha = fecha;
        this.hora = hora;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
    }

    //setters y getters
    public int getId() {
        return id;
    }
    
    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    @XmlElement
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    @XmlElement
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    @XmlElement
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCajero() {
        return nombreCajero;
    }

    @XmlElement
    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }

    public String getFecha() {
        return fecha;
    }

    @XmlElement
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    @XmlElement
    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getSubtotal() {
        return subtotal;
    }

    @XmlElement
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    @XmlElement
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    @XmlElement
    public void setTotal(double total) {
        this.total = total;
    }

    //toString
    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", idCliente=" + idCliente + ", emailCliente=" + emailCliente + ", nombreCliente=" + nombreCliente + ", nombreCajero=" + nombreCajero + ", fecha=" + fecha + ", hora=" + hora + ", subtotal=" + subtotal + ", impuesto=" + impuesto + ", total=" + total + '}';
    }

}
