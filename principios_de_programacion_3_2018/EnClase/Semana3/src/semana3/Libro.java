/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Libro {
    
    private String nombre;
    private String autor;
    private float precio;
    
    public Libro(String nombre) {
        this.nombre = nombre;
    }
    
    public Libro(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }
    
    public Libro(String nombre, String autor, float precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }
    
    public void imprime() {
        System.out.println(nombre);
        System.out.println(autor);
        System.out.println(precio);
        System.out.println();
    }
    
}
