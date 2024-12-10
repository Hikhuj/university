/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana05;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Semana05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista l = new Lista();
        
        l.inserta(new Pelicula("Blanca N", "Director1", 180, 1980));
        l.inserta(new Pelicula("Batman", "Director2", 190, 1995));
        l.inserta(new Pelicula("The Matrix", "Director1", 200, 2001));
        l.inserta(new Pelicula("Thor", "Director4", 150, 2001));
        l.inserta(new Pelicula("Avengers", "Director1", 180, 2010));
        l.inserta(new Pelicula("Ban", "Director1", 180, 2019));
        l.inserta(new Pelicula("CerCo", "Director2", 190, 1980));
        l.inserta(new Pelicula("Animalia", "Director1", 200, 1900));
        l.inserta(new Pelicula("XX", "Director4", 150, 2008));
        l.inserta(new Pelicula("The following", "Director1", 180, 1980));
        
        // Imprimir datos
        System.out.println(l);
        System.out.println();
        
        // Imprimir si existe
        String resultado = JOptionPane.showInputDialog("Deme un titulo de pelicula");
        boolean resultado2 = l.existe(resultado);
        System.out.println("El titulo " + resultado + ", existe?: " + resultado2);
        
        
        // Elimina un dato
        l.elimina(Integer.parseInt(JOptionPane.showInputDialog("Deme el anio de pelicula(s) que quiere eliminar")));
        System.out.println("Despues de eliminar por el anio solicitado:");
        System.out.println(l);
        System.out.println();
        
        // Devuelve muestra
        String muestra = l.muestra();
        System.out.println(muestra);
        
        
    }
    
}
