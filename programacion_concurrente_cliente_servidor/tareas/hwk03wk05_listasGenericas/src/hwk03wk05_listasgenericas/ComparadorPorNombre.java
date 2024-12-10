/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk03wk05_listasgenericas;

import java.util.Comparator;

/**
 *
 * @author roger
 */
public class ComparadorPorNombre implements Comparator{
    
    @Override
    public int compare(Object o1, Object o2){
        return (((Mascota)o1).getNombre()).compareTo(((Mascota)o2).getNombre());
    }
    
}
