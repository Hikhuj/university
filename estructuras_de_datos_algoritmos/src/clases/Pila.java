package clases;

import javax.swing.JOptionPane;
import clases.*;

public class Pila {

    private NodoPila top;

    //Agrega información
    public void push(NodoPila n) {
        //pregunto si top esta vacio, lo que significa que la pila esta vacia
        if (top == null) {
            //si lo esta top es n
            top = n;
        } else {
            //sino, unimos n con el dato de abajo que seria top
            n.setAbajo(top);
            //actualizamos el valor de top
            top = n;
        }
    }

    //Saca información
    public NodoPila pop() {
        //Guarda información temporalmente
        NodoPila aux = top;
        //revisamos que tenga información
        if (aux != null) {
            //Decimos que top es el dato de abajo
            top = top.getAbajo();
            //borramos la unión de auz
            aux.setAbajo(null);
        }
        return aux;
    }

    public String toString() { //metodo ToString visto en clase
        String pas = "";
        NodoPila aux = top;
        if (top != null) {
            while (aux != null) {
                pas += aux.getDato() + "\n";
                aux = aux.getAbajo();
            }
        } else {
            return "No hay pasajeros por el momento";
        }
        return pas;
    }

    public String nombreYApellido() {
        String msj = "";
        //Difinimos que aux sea igual a top
        NodoPila aux = top;
        // Mientras que aux no sea null iteramos
        while (aux != null) {
            //Le concatenamos aux al mensaje
            msj = msj + aux.getDato().getNombre() + aux.getDato().getApellido();
            //Avanzamos al nodo siguiente
            aux = aux.getAbajo();
        }
        return msj;
    }

    public int cuentaCantidadClientes() {
        int contador = 0;
        //Difinimos que aux sea igual a top
        NodoPila aux = top;
        // Mientras que aux no sea null iteramos
        while (aux != null) {
            //aumentamos el contador
            contador += 1;
            //Avanzamos al nodo siguiente
            aux = aux.getAbajo();
        }
        return contador;
    }

    public boolean encuentraYModifica(int cedula, String nombre, String apellido, String telefono) {
        //Metodo que realiza la busqueda de un pasajero por medio de la cedula 
        //Y obtiene los datos de nombre, apellido y numero de telefono del pasajero buscado y estos datos podran ser modficados por el usuario
        NodoPila aux = top;
        boolean encuentra = false;

        while (!encuentra && aux != null) {
            if (cedula == aux.getDato().getCedula()) {
                encuentra = true;

                aux.getDato().setNombre(nombre);
                aux.getDato().setApellido(apellido);

                if (nombre != null || nombre != "") {
                    aux.getDato().setNombre(nombre);
                }
                if (apellido != null || apellido != "") {
                    aux.getDato().setApellido(apellido);
                }

                if (telefono != null || telefono != "") {
                    aux.getDato().setTelefono(Integer.parseInt(telefono));
                }

            }
            aux = aux.getAbajo();
        }
        return encuentra;// se retorna el boolean encuentra

    }

    public String[] encuentraPasajeroPorCedula(String cedula) {

        /*
            Metodo recibe la cedula del pasajero, y busca en la pila de Pasajero si existe o no
         */
        String[] datosPasajeros = new String[3];
        NodoPila aux = top;
        int cedulaEntero = Integer.parseInt(cedula);

        // Recorrer la lista
        while (aux != null) {
            if (cedulaEntero == aux.getDato().getCedula()) {
                // Devolver los datos actuales del pasaporte
                datosPasajeros[0] = aux.getDato().getNombre();
                datosPasajeros[1] = aux.getDato().getApellido();
                datosPasajeros[2] = "" + aux.getDato().getTelefono();
            }
            aux = aux.getAbajo();
        }

        return datosPasajeros;
    }

    public boolean buscarYModificarPasajero(int cedulaPasajero, String nombre, String apellido, int telefonoPasajero) {

        /*
            Metodo recibe la cedula del pasajero, y busca en la pila de Pasajero si existe o no
         */
        NodoPila aux = top;
        boolean result = false;

        // Recorrer la lista
        while (aux != null) {
            if (cedulaPasajero == aux.getDato().getCedula()) {
                aux.getDato().setCedula(cedulaPasajero);
                aux.getDato().setNombre(nombre);
                aux.getDato().setApellido(apellido);
                aux.getDato().setTelefono(telefonoPasajero);
                result = true;
            }
            aux = aux.getAbajo();
        }

        return result;
    }

}
