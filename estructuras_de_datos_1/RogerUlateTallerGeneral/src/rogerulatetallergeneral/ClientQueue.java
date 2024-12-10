/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerulatetallergeneral;

/**
 *
 * @author rogerjoseulaterivera
 */
public class ClientQueue {
    
    /* Atributos */
    private ClientNode front, last;
    
    
    
    // Metodo que agrega
    public void inQueue(ClientNode n) {
        
        if(front == null){
            // front recibe el valor de N
            front = n;
            // y por ende, last sera el que este al front de la cola
            // last = front;
        }else{
            // En este caso se va a agregar un nuevo dato a la cola
            // por lo que primero debemos setear el nuevo
            // puntero ULTIMO, que apuntara al nuevo
            // NODO obtenido como parametro
            // Para crear la nueva union, o puntero
            last.setNext(n);
        }
        
        // Para asegurarme que ULTIMO sea el last
        // item que se recibio y que ira a la COLA
        // debo decirle al sistema que ULTIMO sea igual
        // al N elemento que se metio de last.
        last = n;
        
    }
    
    // Metodo que saca
    // Puedo incluso cambiar NODO y sacar Auto
    public ClientNode extractQueue() {
        
        // Ocupamos sacar siempre el FRENTE, esto por ser cola
        ClientNode aux = front;
        
        // Debemos saber si FRENTE tiene algo que sacar,
        // pero en este caso trabajaremos con una copia por referencia.
        if(aux != null) {
            
            // Sacamos front sustituyendolo con la siguiente posicion.
            // Esto lo logramos con el metodo getAtras();
            // que devuelve el objeto siguiente en la cola.
            front = front.getNext();
            
            // Ocupamos eliminar el puntero entre FRENTE y ATRAS
            // para que ATRAS sea el nuevo FRENTE
            aux.setNext(null);
            
            // Si llego hasta ULTIMO, no puedo borrarlo facilmente
            // por lo que debo saber si es ULTIMO y borrarlo de otra forma
            if(front == null){
                
                // Si front quedo, ULTIMO debe quedar NULL tambien
                last = null;
                
            }
            
        }
        
        return aux;
        
    }
    
    // Aca estoy sobre escribiendo el method por default TOSTRING
    // por el siguiente, ya que si llamo a COLA en un System.out.println()
    // Solo me va a devolver el puntero.
    @Override
    public String toString() {
        
        String msj = "";
        
        ClientNode aux = front;
        
        while(aux != null) {
            
            msj += aux + "\n";
            aux = aux.getNext();
            
        }
        
        return msj;
        
    }
    
    public boolean find(int phoneNumber) {
        
        boolean result = false;
        ClientNode aux = front;
        
        while(aux != null) {
            
            if(phoneNumber == aux.getData().getPhoneNumber()){
                
                result = true;
                
            }
            
            aux = aux.getNext();
            
        }
        
        return result;
        
    }
    
    public boolean isEmpty() {
        
        boolean result = true;
        
        if(front != null) {
            result = false;
        }
        
        return result;
        
    }
    
    // Extrae el last
    public void extrae(int phoneNumber) {
        
        ClientNode aux = front;
        
        // Evaluar si el PRIMERO cumple condicion
        if(phoneNumber == aux.getData().getPhoneNumber()){
            front = aux.getNext();
            aux = null;
        }else{
            while(aux.getNext() != null){
                // Evaluar si es el MEDIO
                if(aux.getNext().getNext() != null && phoneNumber == aux.getNext().getData().getPhoneNumber()){
                    System.out.println("Es el medio");
                    ClientNode tmp = aux.getNext().getNext();
                    aux.setNext(null);
                    aux.setNext(tmp);
                }else{
                    if(aux.getNext() == last && phoneNumber == aux.getNext().getData().getPhoneNumber()){
                        aux.setNext(null);
                    }else{
                        aux = aux.getNext();
                    }
                }
            }
        }
        
        
    }
 
    
    
    
}
