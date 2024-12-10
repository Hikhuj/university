package clases;

public class Arbol {

    private NodoArbol raiz;

    public void inserta(int duracionVuelo) {

        if (raiz == null) { // si la lista es vacia
            raiz = new NodoArbol(duracionVuelo);

        } else {
            // Crear metodo que retorna un nodoLista
            //Enviarlo como parametro en siguiente metodo
            insertaRec(duracionVuelo, raiz); // siempre que se usa recursividad se ocupa el numero que se va a meter y un nodo para conocer el nivel en que se esta

        }

    }

    private void insertaRec(int duracionVuelo, NodoArbol n) { // los datos que mete y nodo para saber en que nivel esta

        if (duracionVuelo < n.getDato()) { // si el que se va a meter es menor que el nodo con que se esta trabajando, se pone a la izquierda
            // Abajo seria:
            // if(n.getHijoIzq() == null){ 
            if (n.getHijoIzq() == null) {// se pregunta si hay campo para ponerlo a la izquierda
                n.setHijoIzq(new NodoArbol(duracionVuelo));
            } else {
                insertaRec(duracionVuelo, n.getHijoIzq()); // para volver a hacer las mismas preguntas pereo en un nivel inferior
            }
        } else {
            if (n.getHijoDer() == null) { // si tiene campo a la derecha, se pone ahi
                n.setHijoDer(new NodoArbol(duracionVuelo)); // para insertar a la derecha, ya que es mayor que n
            } else {
                insertaRec(duracionVuelo, n.getHijoDer()); // si hijo derecho si esta ocupado, se baja un nivel mas
            }

        }

    }

    public void inOrden() {
        if (raiz != null) {
            System.out.println("InOrden");
            inOrdenRec(raiz);
        } else {
            System.out.println("El arbol esta vacio");
        }
    }

    private void inOrdenRec(NodoArbol n) {

        if (n != null) {
            inOrdenRec(n.getHijoIzq());
            System.out.println(" " + n);
            inOrdenRec(n.getHijoDer());

        }
    }

    public void preOrden() {
        if (raiz != null) {
            System.out.println("PreOrden");
            preOrdenRec(raiz);
        } else {
            System.out.println("El arbol esta vacio");
        }
    }

    private void preOrdenRec(NodoArbol n) {
        if (n != null) {
            System.out.println(" " + n);
            preOrdenRec(n.getHijoIzq());
            preOrdenRec(n.getHijoDer());

        }
    }

    public void postOrden() {
        if (raiz != null) {
            System.out.println("PostOrden");
            postOrdenRec(raiz);
        } else {
            System.out.println("El arbol esta vacio");
        }
    }

    private void postOrdenRec(NodoArbol n) {
        if (n != null) {
            postOrdenRec(n.getHijoIzq());
            postOrdenRec(n.getHijoDer());
            System.out.println(" " + n);

        }

    }

    public int imprimeMenor() {
        int result = 0;

        if (raiz != null) { // condicion para que solo trabaje si la raiz existe
            NodoArbol aux = raiz; // comienza desde la raiz
            while (aux.getHijoIzq() != null) { // mientras que exista un hijo de la izquierda 
                aux = aux.getHijoIzq(); // se pasa al hijo de la izquierda
            }

            result = aux.getDato();
        }

        return result;
    }

    public int imprimeMayor() {
        int result = 0;

        if (raiz != null) { // condicion para que solo trabaje si la raiz existe
            NodoArbol aux = raiz; // comienza desde la raiz
            while (aux.getHijoDer() != null) { // mientras que exista un hijo de la izquierda 
                aux = aux.getHijoDer(); // se pasa al hijo de la izquierda
            }
            result = aux.getDato();
        }

        return result;
    }
}
