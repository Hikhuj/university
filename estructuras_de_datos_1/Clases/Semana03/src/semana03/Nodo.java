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
public class Nodo {
    
    /*
        Aqui se tendran dos cosas importantes
        Punteros: 
                Nos ayudan a mantener los datos unidos
                Nos senala donde estan los datos.
        Informacion:
                En este caso son los libros
                Ocupamos que se senale

        Esta clase NODO NO SE TRABAJA TANTO, la clase PILA SI se trabaja mucho
    
    */
    
    /* Metodos necesarios */
    private Libro dato;
    // Atributo que es del mismo tipo que la clase donde esta
    private Nodo abajo;

    
    public Nodo(Libro dato) {
        this.dato = dato;
    }

    // Metodo toString, necesario
    @Override
    public String toString() {
        return "" + dato;
    }

    // Sets and Gets
    public void setDato(Libro dato) {
        this.dato = dato;
    }

    public void setAbajo(Nodo abajo) {
        this.abajo = abajo;
    }

    public Libro getDato() {
        return dato;
    }

    public Nodo getAbajo() {
        return abajo;
    }    
    
    
}
