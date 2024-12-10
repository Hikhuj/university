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
 * @author roger
 */
public class ProfesorTitular extends Profesor implements ListinProfesores{
    
    // Atributos
    private String fechaNombrado;
    
    // Constructor
    public ProfesorTitular() {
        super();
    }

    public ProfesorTitular(String nombre, String apellido, int edad, int idProfesor, int cantidadClases, String FechaNombrado) {
        super(nombre, apellido, edad, idProfesor, cantidadClases);
        this.fechaNombrado = FechaNombrado;
    }
    
    // Metodos
    public String getFechaNombrado() {
        return fechaNombrado;
    }

    public void setFechaNombrado(String fechaNombrado) {
        this.fechaNombrado = fechaNombrado;
    }

    @Override
    public String toString() {
        return "ProfesorTitular{" + super.toString() + "FechaNombrado=" + fechaNombrado + '}';
    }
    
    public long desplegarAniosExperiencia(){
    
        /*
        *
        *   Metodo DesplegarAniosExperiencia(); debe calcular atraves de la variable
        *   FechaNombrado - FechaActual <<<- esta ultima debe obtenerse de alguna forma
        *
        */
        
        // Var
        long result;
        
        // Crear instance de tipo DateTimeFormatter enviando patron de fecha deseado Parametro
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        
        // Pasar fechas de esta clase como parametro y formatear a patron de fecha deseado
        // $inicio debe ser < a $fin para un correcto calculo sin problemas futuros
        LocalDate inicio = LocalDate.parse("" + this.fechaNombrado, formatoFecha);
        LocalDate fechaLocal = LocalDate.now();
        
        // Obtener cantidad de dias entre un minimo y un maximo de fecha.
        long cantidadDias = ChronoUnit.DAYS.between(inicio, fechaLocal);
        
        if(cantidadDias > 0){
            result = cantidadDias;
        }else{
            result = cantidadDias * - 1;
        }
        
        return result;
        
    }
    
    @Override
    public void llenarDatos(){
        
    }
    
    @Override
    public void calcularSalario(){
        
    }
    
}
