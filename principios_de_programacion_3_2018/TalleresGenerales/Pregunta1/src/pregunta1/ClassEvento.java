/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta1;

/**
 *
 * @author rogerjoseulaterivera
 */
public class ClassEvento {
    
    private String nombreDeEvento;
    private String descripcion;
    private String lugar;
    private String orador;
    private int hora; // Formato Militar
    private boolean esObligatorio;
    private int dia;
    private int mes;
    private int anio;
    
    public ClassEvento() {
        
    }

    public ClassEvento(String nombreDeEvento, String descripcion, String lugar, String orador, int hora, boolean esObligatorio, int dia, int mes, int anio) {
        this.nombreDeEvento = nombreDeEvento;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.orador = orador;
        this.hora = hora;
        this.esObligatorio = esObligatorio;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setNombreDeEvento(String nombreDeEvento) {
        this.nombreDeEvento = nombreDeEvento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setOrador(String orador) {
        this.orador = orador;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setEsObligatorio(boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombreDeEvento() {
        return nombreDeEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public String getOrador() {
        return orador;
    }

    public int getHora() {
        return hora;
    }

    public boolean isEsObligatorio() {
        return esObligatorio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    
    
}
