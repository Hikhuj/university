package clases;

import javax.swing.*;

public class Lista {

    private NodoLista cabeza, ultimo;

    public void inserta(Paquete p) {
        //metodo para insertar paquetes de viaje al programa 
        if (cabeza == null) {// se crea un if en el que se dice que si cabeza es diefrente null
            cabeza = new NodoLista(p);//se iguala cabeza con NodoLista
            ultimo = cabeza;//se iguala ultimo con cabeza
        } else {
            if (p.getCantidadAsientosDisponibles() <= cabeza.getDato().getCantidadAsientosDisponibles()) {// se crea un if para considerar que si la cantidad de asientos disponible es menor o igual a cabeza
                cabeza.setBack(new NodoLista(p));
                cabeza.getBack().setNext(cabeza);
                cabeza = cabeza.getBack();
            } else {
                if (p.getCantidadAsientosDisponibles() >= ultimo.getDato().getCantidadAsientosDisponibles()) {//si cantidad de asientos disponibles es mayor o igual al ultimo entonces sera siguiente
                    ultimo.setNext(new NodoLista(p));
                    ultimo.getNext().setBack(ultimo);
                    ultimo = ultimo.getNext();
                } else {
                    NodoLista aux = cabeza;//se crea un NodoLista auxiliar y se iguala con cabeza 
                    while (p.getCantidadAsientosDisponibles() >= aux.getDato().getCantidadAsientosDisponibles()) {
                        aux = aux.getNext();
                    }
                    NodoLista temp = new NodoLista(p);
                    temp.setNext(aux);
                    temp.setBack(aux.getBack());
                    aux.setBack(temp);
                    temp.getBack().setNext(temp);
                }
            }
        }

        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo);

    }

    public String toString() {
        String msj = "";
        NodoLista aux = cabeza;

        if (cabeza != null) {
            //concatenamos los mensajes
            msj += cabeza.getDato().toString();
            aux = aux.getNext();
            while (aux != cabeza) {
                //iteramos a los nuevos registros y seguimos concatenando mensajes
                msj += aux.getDato().toString();
                aux = aux.getNext();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
        }
        //retornamos el resultado
        return msj;
    }

    public String[] toArray(Lista lista, int largo) {
        //definimos variable de inicio
        NodoLista aux = cabeza;
        //creamos un arraylist para guardar los datos
        String[] listaArray = new String[largo];
        try {
            for (int i = 0; i < largo; i++) {
                if (aux != null) {
                    //agregamos los destinos al arrayList
                    listaArray[i] = aux.getDato().getLugarViaje();
                    aux = aux.getNext();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay datos sobre el menu");
        }

        //retornamos lo informacion
        return listaArray;
    }

    public int tamano() {

        // Declarar e inicializar
        NodoLista aux = cabeza;
        int contador = 0;

        if (cabeza != null) {
            //aumentamos el contador e iteramos
            contador++;
            aux = aux.getNext();
            while (aux != cabeza) {
                //aumentamos el contador e iteramos
                contador++;
                aux = aux.getNext();
            }
        } else {
            //vacio
        }

        //retornamos el resultado
        return contador;
    }

    public void ventas(String paquete, int cantidadVenta) {
        NodoLista aux = cabeza;

        if (cabeza != null) {
            //filtramos por el destino
            if (cabeza.getDato().getLugarViaje().equalsIgnoreCase(paquete)) {
                //cuando sabemos que destino es, tomamos el dato y le agregamos la cantidad vendida
                cabeza.getDato().setCantidadAsientosDisponibles(cantidadVenta);

            } else {
                //si el destiono no esta en la cabeza iteramos al siguiente dato
                aux = aux.getNext();
                while (aux != cabeza) {
                    //filtramos de nuevo por destino
                    if (aux.getDato().getLugarViaje().equalsIgnoreCase(paquete)) {
                        //agregamos la venta
                        aux.getDato().setCantidadAsientosDisponibles(cantidadVenta);
                    }
                    aux = aux.getNext();
                }
            }
        } else {
            //lista vacia
        }
    }

    public void eliminarCabeza() {

        /*
            Metodo elimina el primer paquete agregado al programa
         */
        // Nodo para recorrer la lista
        NodoLista aux = cabeza;

        JOptionPane.showMessageDialog(null, "El vuelo con destino a " + aux.getDato().getLugarViaje() + " ha salido con exito");
        // Nodo para obtener el ultimo
        //NodoLista aux2 = ultimo;

        // Extraer dato clave para borrar de la lista
        String nombrePaqueteAEliminar = aux.getDato().getLugarViaje();

        // Evaluar si el que se quiere borrar es el primero
        if (nombrePaqueteAEliminar.equals(cabeza.getDato().getLugarViaje())) {
            cabeza = cabeza.getNext();
            ultimo.setNext(cabeza);
        } else {
            // Recorrer de el segundo hasta el ultimo
            while (aux != null && aux.getNext() != cabeza) {
                // Evaluar si esta entre N2 y ultimo
                if (nombrePaqueteAEliminar.equals(aux.getNext().getDato().getLugarViaje())) {
                    aux.setNext(aux.getNext().getNext());
                } else {
                    // Evaluar si es el ultimo
                    if (aux.getNext() == ultimo && nombrePaqueteAEliminar.equals(aux.getNext().getDato().getLugarViaje())) {
                        aux.setNext(cabeza);
                        aux = ultimo;
                    }
                }
                aux = aux.getNext();
            }
        }
    }

    public int verificarCamposDisponibles(String acompaniantes, String destino) {
        int result = 0;
        int camposDisponibles = 0;

        // Hacer condicion unicamente en donde si  los asientos a reservar
        // dejan en menos de 0 a los asientos disponibles, retorne los asientos disponibles
        NodoLista aux = cabeza;
        boolean existe = false; // se crea un boolean para indicarle cuando detenerse y para imprimirlo

        while (!existe && aux != ultimo) { // funcionara mientras siga en false, por lo que al encontrar uno existente, se detendra. Este while trabaja con toda la lista, menos el ultimo
            if (destino.equals(aux.getDato().getLugarViaje())) {
                existe = true; // si lo enceuntra, se detiene
                //Obtener un entero positivo o negativo realizar el calculo de asientos disponibles
                camposDisponibles = aux.getDato().getCantidadAsientosDisponibles();
                result = camposDisponibles - Integer.parseInt(acompaniantes);
            } else {
                if (destino.equals(ultimo.getDato().getLugarViaje())) { // condicion creada solo para el ultimo nodo
                    existe = true;
                    //Obtener un entero positivo o negativo realizar el calculo de asientos disponibles
                    camposDisponibles = aux.getDato().getCantidadAsientosDisponibles();
                    result = camposDisponibles - Integer.parseInt(acompaniantes);
                }
                aux = aux.getNext(); //para que avance luego de cada revision
            }
        }

        return result;
    }

    public int restarAsientoEnDestinoElegido(String cantidadAsientos, String destino) {

        // Hacer condicion unicamente en donde si  los asientos a reservar
        // dejan en menos de 0 a los asientos disponibles, retorne los asientos disponibles
        int result = 0;
        NodoLista aux = cabeza;
        boolean existe = false; // se crea un boolean para indicarle cuando detenerse y para imprimirlo

        while (!existe && aux != ultimo) { // funcionara mientras siga en false, por lo que al encontrar uno existente, se detendra. Este while trabaja con toda la lista, menos el ultimo
            if (destino.equals(aux.getDato().getLugarViaje())) {
                existe = true; // si lo enceuntra, se detiene
                // Genera el siguiente proceso:
                // NuevaCantidadDeAsientosDisponibles(CantidadAsientosActuales - CantidadAsientosComprados);
                aux.getDato().setCantidadAsientosDisponibles(aux.getDato().getCantidadAsientosDisponibles() - Integer.parseInt(cantidadAsientos));
                result = aux.getDato().getCantidadAsientosDisponibles();
            } else {
                if (destino.equals(ultimo.getDato().getLugarViaje())) { // condicion creada solo para el ultimo nodo
                    existe = true;
                    aux.getDato().setCantidadAsientosDisponibles(aux.getDato().getCantidadAsientosDisponibles() - Integer.parseInt(cantidadAsientos));
                    result = aux.getDato().getCantidadAsientosDisponibles();
                }
                aux = aux.getNext(); //para que avance luego de cada revision
            }
        }

        return result;
    }

    public void elimina(String destino) {

        NodoLista aux = cabeza; // se comienza por la cabeza

        if (destino.equals(cabeza.getDato().getLugarViaje())) { // trabaja solo con la cabeza
            ultimo.setNext(cabeza.getNext()); // si es correcto, se le indica al ultimo que el que le sigue ahora es el que le sigue a cabeza
            cabeza = cabeza.getNext();// la nueva cabeza es el que le sigue a cabeza
        } else {
            while (aux != null && aux.getNext() != cabeza) { // funciona solo para el cuerpo de la lista, no para la cabeza ni el ultimo
                if (destino.equals(aux.getDato().getLugarViaje())) { //Si la condicion de que ambos coincidan se cumple:
                    aux.getBack().setNext(aux.getNext());// El nodo que esta atras del que se borra, tendra de siguiente al que esta siguiente del que se borrara
                    aux.getNext().setBack(aux.getBack()); // El que esta siguiente del que se borrara tendra atras al que esta detras del que se borrara
                } else {
                    if (destino.equals(ultimo.getDato().getLugarViaje())) { // solamente funciona con el ultimo nodo, y si se cumplen las condiciones :
                        ultimo.getBack().setNext(cabeza);// el siguiente del que esta atras del ultimo sera la cabeza
                        cabeza.setBack(ultimo.getBack());// Cabeza tendra ataras al que esta atras de ultimo
                        ultimo = ultimo.getBack(); // el nuevo ultimo sera el que esta atras de ultimo
                    }
                }
                aux = aux.getNext(); // se avanza un nodo luego de cada revision
            }
        }
    }

    public boolean existe(String destino) {

        NodoLista aux = cabeza;
        boolean existe = false; // se crea un boolean para indicarle cuando detenerse y para imprimirlo

        while (!existe && aux != ultimo) { // funcionara mientras siga en false, por lo que al encontrar uno existente, se detendra. Este while trabaja con toda la lista, menos el ultimo
            if (destino.equals(aux.getDato().getLugarViaje())) {
                existe = true; // si lo enceuntra, se detiene
            } else {

                if (destino.equals(ultimo.getDato().getLugarViaje())) { // condicion creada solo para el ultimo nodo
                    existe = true;

                }
                aux = aux.getNext(); //para que avance luego de cada revision
            }
        }

        return existe;
    }

    public String encuentraPaquetePorDestino(String destino) {

        /*
            Metodo recibe la cedula del pasajero, y busca en la pila de Pasajero si existe o no
         */
        //String datosPaquete = "";
        String datosPaquete = "";
        NodoLista aux = cabeza;

        // Recorrer la lista
        if (aux != null) {
            if (destino.equals(aux.getDato().getLugarViaje())) {
                // Devolver los datos actuales del pasaporte
                datosPaquete = aux.getDato().getActividades();
            }
            aux = aux.getNext();

            while (aux != cabeza) {
                if (destino.equals(aux.getDato().getLugarViaje())) {
                    // Devolver los datos actuales del pasaporte
                    datosPaquete = aux.getDato().getActividades();
                }
                aux = aux.getNext();
            }

        }
        return datosPaquete;

    }

    public boolean buscaYModificaPaquete(String destino, String actividades) {
        //Metodo boolean para buscar y modificar las actividades de los paquetes registrados en el programa 
        NodoLista aux = cabeza;// se crea un NodoLista auxiliar y se iguala con cabeza 
        boolean result = false;

        if (aux != null) {//se dice que si auxiliar es diferente de null 
            if (destino.equals(aux.getDato().getLugarViaje())) {//auxiliar trae los datos de Lugar de viaje y activiadades que se realizaran 
                aux.getDato().setActividades(actividades);
                result = true;
            }
            aux = aux.getNext();

            while (aux != cabeza) {//ciclo para cuando auxiliar es diferente de cabeza 

                if (destino.equals(aux.getDato().getLugarViaje())) {
                    aux.getDato().setActividades(actividades);
                    result = true;
                }
                aux = aux.getNext();
            }

        }
        return result;//se retorna el resultado
    }

}
