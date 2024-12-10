/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Libro {
    
    /*
    
        PILAS
    
        PUSH = ingresa datos.
        POP = extrae datos y los elimina.
    
        Esta clase OBJETO tipo LIBRO NO SE TRABAJA TANTO, la clase PILA SI se trabaja mucho
    
        Clase normal de un objeto generico
    
    */

    
    
    // Atributos del objeto que se trabajara en la pila
    private String titulo;
    private String autor;
    private String editorial;
    private int paginas;
    private int year;
    
    

    public Libro(String titulo, String autor, String editorial, int paginas, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
        this.year = year;
    }

    
    
    // Muestra todos los datos
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", paginas=" + paginas + ", year=" + year + '}';
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getYear() {
        return year;
    }
    
    
    
    
}
