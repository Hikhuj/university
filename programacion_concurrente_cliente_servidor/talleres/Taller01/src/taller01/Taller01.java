/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Taller01 {

    /**
     * @param args the command line arguments
     */
    
//    public long daysBetween(Date one, Date two){
//        long difference = (one.getTime()-two.getTime())/86400000;
//        return Math.abs(difference);
//    }
    
    public static ArrayList<Persona> profesorado = new ArrayList<Persona>();
    
    public static void main(String[] args) {
        
        /*
        *
        *   Taller 01 para el Curso de Programacion Concurrente Cliente-Servidor
        *
        */
        
        // Para obtener una fecha
//        Calendar today = Calendar.getInstance();
//        today.set(Calendar.HOUR_OF_DAY, 0);
//        
//        System.out.println("Fecha de hoy: " + today.getTime());


        /*
        *
        *   Para calcular la cantidad de dias en entre dos fechas
        *
        */
//        Date fechaHoy = new Date();
//        Calendar myNextCalendar = Calendar.getInstance();
//        myNextCalendar.set(2020, 0, 1);
//        Date nyd = myNextCalendar.getTime();
//        
//        Taller01 myObject = new Taller01();
//        long days = myObject.daysBetween(fechaHoy,nyd);
//        
//        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, YYYY");
//        String fechaDeHoy = sdf.format(fechaHoy);
//        String newYearsDay = sdf.format(nyd);
//        
//        System.out.println(days + " ---> days from today's date of " + fechaDeHoy + " until " + newYearsDay);
//        System.out.println(fechaHoy);

        
        
        // presentacion del taller:

        
//        Persona personaSimple = new Persona("Roger", "Ulate", 29);
//        ProfesorTitular profesorTitular1 = new ProfesorTitular("Roger", "Ulate", 29, 1, 28000.13, 20, "Fecha de Hoy");
//        ProfesorInterino profesorInterino1 = new ProfesorInterino("Roger", "Ulate", 29, 1, 28000.13, 20, "Fecha de Hoy", "Fecha de Maniana");
//        
//        profesorado.add(personaSimple);
//        profesorado.add(profesorTitular1);
//        profesorado.add(profesorInterino1);
//        
//        System.out.println("Todos los personajes");
//        for(Persona profesores: profesorado){
//            System.out.println(profesores.getNombre()
//                                + " " + profesores.getApellido()
//                                + " " + profesores.getEdad());
//        }
        
        MenuApp iniciarApp = new MenuApp();
        
        iniciarApp.setVisible(true);
        
    }
    
}
