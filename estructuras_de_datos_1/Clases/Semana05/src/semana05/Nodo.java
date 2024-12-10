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
public class Nodo {
    
    private Pelicula dato;
    private Nodo next;

    
    public Nodo(Pelicula dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "" + dato;
    }

    public Pelicula getDato() {
        return dato;
    }

    public void setDato(Pelicula dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
    
}
