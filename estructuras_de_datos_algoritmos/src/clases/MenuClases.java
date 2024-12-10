package clases;

import javax.swing.*;
import clases.*;

public class MenuClases {

    /*
        Estos metodos son las estructuras del proyecto
     */
    public static Pila pilaPasajero = new Pila();
    public static Lista listaPaquete = new Lista();
    public static Arbol arbolDuracionDeVuelo = new Arbol();

    public void agregarDatosPasajeroEnPila(String nombre, String apellido, String telefono, String cantidadPaquetes, String cedula) {

        pilaPasajero.push(new NodoPila(new Pasajero(nombre,
                apellido,
                Integer.parseInt(telefono),
                Integer.parseInt(cantidadPaquetes),
                Integer.parseInt(cedula))));
    }

    public void insertaDuracionAArbol(int duracionVuelo) {
        arbolDuracionDeVuelo.inserta(duracionVuelo);
    }

    public String[] encuentraPasajeroPilaPorCedula(String cedula) {

        /*
            Metodo recibe cedula de pasajero y recupera o no datos para prepopular datos
            actuales del pasajero a modificar.
         */
        String[] result;

        result = pilaPasajero.encuentraPasajeroPorCedula(cedula);

        return result;
    }
    
     public String encuentraPaqueteListaPorDestino(String destino) {

        /*
            Metodo recibe cedula de pasajero y recupera o no datos para prepopular datos
            actuales del pasajero a modificar.
         */
        String result;

        result = listaPaquete.encuentraPaquetePorDestino(destino);

        return result;
    }
    
    

    public void agregarPaqueteLista(Paquete p) {

        /*
            Agregar un paquete a la lista
         */
        // Obtener tamanio de lista de paquetes (destinos)
        int tamanioDeListaActual = listaPaquete.tamano();

        // Evaluar si cantidad de paquetes es menor a 5
        // cantidad de paquetes < 5 ---> Solo agrega el paquete
        if (tamanioDeListaActual < 5) {
            listaPaquete.inserta(p);

        } else {
            // cantidad de paquetes > 5 ---> elimina cabeza y mete el nuevo
            // El vuelo con destino a: ??? salio
            listaPaquete.eliminarCabeza();
            listaPaquete.inserta(p);

        }

    }

    public Lista devuelveListaPaquetesCompleta() {
        return listaPaquete;
    }

    public String[] devuelveArrayListPaquetesCompleta() {
        String[] paquetes;
        paquetes = listaPaquete.toArray(listaPaquete, listaPaquete.tamano());
        if (paquetes == listaPaquete.toArray(listaPaquete, listaPaquete.tamano())) {
            JOptionPane.showMessageDialog(null, "La lista esta actualizada");
            return null;
        } else {
            return paquetes;
        }
    }

    /*
        Metodos nuevos
     */
    public String toStringPilas() {
        // Retorna Data Structure tipo pila en toString
        return pilaPasajero.toString();
    }

    public void agregarPaquetesPredeterminados() {
        // Agregar paquetes predeterminados
        listaPaquete.inserta(new Paquete("Paris", "Museo de Luvre", 5));
        insertaDuracionAArbol(5);
        listaPaquete.inserta(new Paquete("Londres", "Palacio de Buckingham", 8));
        insertaDuracionAArbol(8);
        listaPaquete.inserta(new Paquete("Roma", "Coliseo", 2));
        insertaDuracionAArbol(2);
        listaPaquete.inserta(new Paquete("San Jose", "Volcan Poas", 1));
        insertaDuracionAArbol(1);
        listaPaquete.inserta(new Paquete("Malvinas", "Castillo Serheines", 7));
        insertaDuracionAArbol(7);
        
    }

    public int verificarPaquetesDisponibles(String acompaniantes, String destino) {
        /*
            Verifica si se puede comprar la cantidad de datos recibida como parametro
         */
        int result;
        result = listaPaquete.verificarCamposDisponibles(acompaniantes, destino);
        return result;
    }

    public void verificarDisponibilidadDeAsiento(String cantidadAsientos, String destino) {
        /*
            Metodo recibe dos parametros
            Busca el destino y resta los asientos recibidos a los asientos disponibles del destino
         */
        //listaPaquetes.restarAsientoEnDestinoElegido(cantidadAsientos, destino);
        int totalAsientosDisponibles = listaPaquete.restarAsientoEnDestinoElegido(cantidadAsientos, destino);

        // Si los asientos restantes = 0, se elimina el destino y se da mensaje de alerta
        if (totalAsientosDisponibles == 0) {
            listaPaquete.elimina(destino);
            JOptionPane.showMessageDialog(null, "El vuelo con destino a " + destino + " partio", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Crear metodo controlBuscarYModificarPasajero(a, b, c)
    // Va a buscar por CED y si encuentra modificar los datos
    
    public void controlBuscarYModificarPasajero(String cedula, String nombre, String apellido, String telefono){
        //Metodo utilizado para llamar las variables que se desean buscar y modificar 
        
        //se convierten las variables de string a entero 
        int cedulaPasajero = Integer.parseInt(cedula);
        int telefonoPasajero = Integer.parseInt(telefono);
        //busca los datos por medio del numero de cedula y modifica los datos de nombre, apellido, telPasajero que el usuario desee modificar
        pilaPasajero.buscarYModificarPasajero(cedulaPasajero, nombre, apellido, telefonoPasajero);

    }
    
    public void controlBuscarYModificarPaquete(String destino, String actividades){
        //Metodo utilizado para buscar y modificar las variables destino y actvidades que se realizan en el paquete buscado 
        //Busca los datos por medio del destino del paquete que el usuarios desea buscar y encuentra las actividades del paquete las cuales se podran modificar
        listaPaquete.buscaYModificaPaquete(destino, actividades);

    }
    
    

    public void llamarAObtenerVueloMayorDuracion(){
        int result = arbolDuracionDeVuelo.imprimeMayor();
        //imprime el nodo de mas a la izquierda(el cualimprimeMayor es el mas bajo)
        JOptionPane.showMessageDialog(null,"El vuelo más largo es " + result + " hora(s)", "Vuelo Mayor Duracion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void llamarAObtenerVueloMenorDuracion(){
        int result = arbolDuracionDeVuelo.imprimeMenor();
        //imprime el nodo de mas a la izquierda(el cual es el mas bajo)
        JOptionPane.showMessageDialog(null,"El vuelo más corto es " + result + " hora(s)", "Vuelo Menor Duracion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String imprimeTodosLosPasajeros() {
        //Metodo para imprimir todos los datos de los pasajeros registrados dentro del programa 
        String result = pilaPasajero.toString();

        return result;//se retorna el resultado 

    }
    
}
