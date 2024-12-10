/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Nodo {
    
    private Juego dato;
    private Nodo next, back;
    
    public Nodo(Juego dato){
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato;
    }

    public Nodo(Juego dato, Nodo next, Nodo back) {
        this.dato = dato;
        this.next = next;
        this.back = back;
    }

    public Juego getDato() {
        return dato;
    }

    public void setDato(Juego dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getBack() {
        return back;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }
    
    
    
}
