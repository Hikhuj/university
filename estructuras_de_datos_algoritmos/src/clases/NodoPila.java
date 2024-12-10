package clases;

public class NodoPila {
    private Pasajero dato;
    private NodoPila abajo;

    public NodoPila(Pasajero dato) {
        this.dato = dato;
    }

    public Pasajero getDato() {
        return dato;
    }

    public void setDato(Pasajero dato) {
        this.dato = dato;
    }

    public NodoPila getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoPila abajo) {
        this.abajo = abajo;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
    
}
