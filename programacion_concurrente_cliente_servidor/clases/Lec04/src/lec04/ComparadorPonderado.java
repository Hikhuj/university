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
public class ComparadorPonderado implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(((Estudiante1)o1).getPonderado() == ((Estudiante1)o2).getPonderado()){
            return 0;
        }else if(((Estudiante1)o1).getPonderado() < ((Estudiante1)o2).getPonderado()){
            return -1;
        }else{
            return 1;
        }
    }    
    
}
