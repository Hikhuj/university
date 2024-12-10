/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana05;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Pelicula {
    
    
    // Variables
    private String titulo, director;
    private int minutos, anios;

    
    // Constructor
    public Pelicula(String titulo, String director, int minutos, int anios) {
        this.titulo = titulo;
        this.director = director;
        this.minutos = minutos;
        this.anios = anios;
    }

    @Override
    public String toString() {
        return "\nTitulos=" + titulo + ", director=" + director + ", minutos=" + minutos + ", anios=" + anios + '}';
    }

    // Set y Getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulos) {
        this.titulo = titulos;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }
    
    
    
    
    
}
