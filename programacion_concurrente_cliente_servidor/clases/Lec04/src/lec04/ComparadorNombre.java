/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec04;

import java.util.Comparator;

/**
 *
 * @author roger
 */
public class ComparadorNombre implements Comparator{

    @Override
    public int compare(Object o1, Object o2){
        // Recordar que en este caso el COMPAREto va a devolver un negativo si es menor al que se compara
        // Respeta las mayusculas y las minusculas
        return (((Estudiante1)o1).getNombre()).compareTo(((Estudiante1)o2).getNombre());
    }
   
    
    
}
