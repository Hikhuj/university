package clases;

public class NodoArbol {

    private int dato;
    private NodoArbol hijoIzq, hijoDer;

    public NodoArbol(int dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return " " + dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }

}
