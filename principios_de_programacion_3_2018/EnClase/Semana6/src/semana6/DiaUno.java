/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6;

/**
 *
 * @author rogerjoseulaterivera
 */
public class DiaUno {
    
    private int dia;
    private int mes;
    private int anio;

    
    @Override
    public String toString() {
        return "Fecha: " + dia + "/" + mes + "/" + anio;
    }
    
    public DiaUno() {
        dia = 18;
        mes = 10;
        anio = 2018;
        
    }
    
    public DiaUno(int dia) {
        this.dia = dia;
        mes = 10;
        anio = 2018;
    }
    
    public DiaUno(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        anio = 2018;
    }
    
    public DiaUno(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public void imprimirDatos() {
        
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(anio);
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        
        if(dia >= 1 && dia <= 31) {
            this.dia = dia;
        }else{
            this.dia = 1;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        
        if(mes >= 1 && mes <= 12) {
            this.mes = mes;
        }else{
            this.mes = 1;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        
        if(anio >= 1 && anio <= 2018) {
            this.anio = anio;
        }else{
            this.anio = 1;
        }
    }
    
    
    
}
