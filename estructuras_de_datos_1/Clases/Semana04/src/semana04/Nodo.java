/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Nodo {
    
    /* Atributos */
    // El dato
    private Auto dato;
    
    // El puntero
    private Nodo siguiente;

    
    
    // Solo recibe dato
    public Nodo(Auto dato) {
        this.dato = dato;
    }

    // Solo imprime dato
    @Override
    public String toString() {
        return "" + dato ;
    }

    public Auto getDato() {
        return dato;
    }

    public void setDato(Auto dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
