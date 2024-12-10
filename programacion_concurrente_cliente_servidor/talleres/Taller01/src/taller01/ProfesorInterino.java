/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author rogerjoseulaterivera
 */
public class ProfesorInterino extends Profesor implements ListinProfesores{
    
    // Atributos
    private String fechaComienzoInterinidad;
    private String fechaFinalInterinidad;
    
    // Constructor
    public ProfesorInterino() {
        super();
    }

    public ProfesorInterino(String nombre, String apellido, int edad, int idProfesor, int cantidadClases, String fechaComienzoInterinidad, String fechaFinalInterinidad) {
        super(nombre, apellido, edad, idProfesor, cantidadClases);
        this.fechaComienzoInterinidad = fechaComienzoInterinidad;
        this.fechaFinalInterinidad = fechaFinalInterinidad;
    }

    // Metodos
    public String getFechaComienzoInterinidad() {
        return fechaComienzoInterinidad;
    }

    public void setFechaComienzoInterinidad(String fechaComienzoInterinidad) {
        this.fechaComienzoInterinidad = fechaComienzoInterinidad;
    }

    public String getFechaFinalInterinidad() {
        return fechaFinalInterinidad;
    }

    public void setFechaFinalInterinidad(String fechaFinalInterinidad) {
        this.fechaFinalInterinidad = fechaFinalInterinidad;
    }

    @Override
    public String toString() {
        return "ProfesorInterino{" + super.toString() + "fechaComienzoInterinidad=" + fechaComienzoInterinidad + ", fechaFinalInterinidad=" + fechaFinalInterinidad + '}';
    }
    
    public long calcularTiempoTrabajo(){
        
        /*
        *
        *   Metodo CalcularTiempoTrabajo(); Debe hacer un cálculo de fechas 
        *   para conocer cuantos días tiene fechaComienzoInterinidad – fechaFinalInterinidad 
        *
        */
        
        // Var
        long result;
        
        // Crear instance de tipo DateTimeFormatter enviando patron de fecha deseado Parametro
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        
        // Pasar fechas de esta clase como parametro y formatear a patron de fecha deseado
        // $inicio debe ser < a $fin para un correcto calculo sin problemas futuros
        LocalDate inicio = LocalDate.parse("" + this.fechaComienzoInterinidad, formatoFecha);
        LocalDate fin = LocalDate.parse("" + this.fechaFinalInterinidad, formatoFecha);
        
        // Obtener cantidad de dias entre un minimo y un maximo de fecha.
        long cantidadDias = ChronoUnit.DAYS.between(inicio, fin);
        
        if(cantidadDias > 0){
            result = cantidadDias;
        }else{
            result = cantidadDias * - 1;
        }
        
        return result;
    
    }
    
    @Override
    public void llenarDatos(){
        System.out.println("");
    }
    
    @Override
    public void calcularSalario(){
        
    }
    
}
