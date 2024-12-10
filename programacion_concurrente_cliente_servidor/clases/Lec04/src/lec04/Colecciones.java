/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author roger
 */
public class Colecciones {
    
    public void probarSet(){
        Set set = new HashSet();
        set.add("one");
        set.add("Second");
        set.add("3rd");
        set.add(new Integer(4));
        set.add(new Float(5.0F));
        set.add("second");
        set.add("Second");
        System.out.println("Set: " + set);
    }
    
    public void probarList(){
        
        List list = new ArrayList();
        
        list.add("one");
        list.add("Second");
        list.add("3rd");
        list.add(new Integer(4));
        list.add(new Float(5.0F));
        list.add("second");
        list.add("Second");
        System.out.println("List: " + list);
        
    }
    
    public void probarOrdenamientoSet(){
        
        TreeSet estudiantesSet = new TreeSet();
        
        estudiantesSet.add(new Estudiante("Jaime", "Peralta", 1234565, 849.5F));
        estudiantesSet.add(new Estudiante("Marlon", "Kothler", 2345676, 700.0F));
        estudiantesSet.add(new Estudiante("Aleja", "Gomez", 9876542, 849.52F));
        estudiantesSet.add(new Estudiante("Carlos", "Gomez", 3574879, 870.5F));
        
        Object[] estudiantesArray = estudiantesSet.toArray();
        
        Estudiante e;
        
        for(Object o: estudiantesArray){
            e = (Estudiante)o;
            System.out.printf("Nombre: %s \tApellido: %s \tCarnet: %s \tPonderado: %.2f\n", e.getNombre(), e.getApellido(), e.getCarnet(), e.getPonderado());
        }
        
    }
    
    // Metodo para probar COMPARATOR
    public void probarOrdenamientoSetComparador(){
        
        Comparator c = new ComparadorNombre();
        
        TreeSet estudiantesSet = new TreeSet(c);
        
        estudiantesSet.add(new Estudiante1("Jaime", "Peralta", 1234565, 849.5F));
        estudiantesSet.add(new Estudiante1("Marlon", "Kothler", 2345676, 700.0F));
        estudiantesSet.add(new Estudiante1("Aleja", "Gomez", 9876542, 849.52F));
        estudiantesSet.add(new Estudiante1("Carlos", "Gomez", 3574879, 870.5F));
        
        Object[] estudiantesArray = estudiantesSet.toArray();
        
        Estudiante1 e;
        
        for(Object o: estudiantesArray){
            e = (Estudiante1)o;
            System.out.printf("Nombre: %s \tApellido: %s \tCarnet: %s \tPonderado: %.2f\n", e.getNombre(), e.getApellido(), e.getCarnet(), e.getPonderado());
        }
        
    }
    
}
