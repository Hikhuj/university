package clases;

public class NodoLista {
    private Paquete dato;
    private NodoLista next, back;

    public NodoLista(Paquete dato) {
        this.dato = dato;
    }

    public Paquete getDato() {
        return dato;
    }

    public void setDato(Paquete dato) {
        this.dato = dato;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }

    public NodoLista getBack() {
        return back;
    }

    public void setBack(NodoLista back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

    
}
