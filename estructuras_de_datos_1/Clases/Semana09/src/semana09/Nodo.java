/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana09;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Nodo {
    
    private int dato;
    // Aqui se necesitan dos punteros para crear un hijo izquierdo o bien un hijo derecho
    private Nodo hijoIzq, hijoDer;

    public Nodo(int dato){
        this.dato = dato;
    }
    
    @Override
    public String toString() {
        return "" + dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }
    
    
    
}
