/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Cola {
    
    /* Atributos */
    private Nodo frente, ultimo;
    
    
    
    // Metodo que agrega
    public void encola(Nodo n) {
        
        if(frente == null){
            // frente recibe el valor de N
            frente = n;
            // y por ende, ultimo sera el que este al frente de la cola
            // ultimo = frente;
        }else{
            // En este caso se va a agregar un nuevo dato a la cola
            // por lo que primero debemos setear el nuevo
            // puntero ULTIMO, que apuntara al nuevo
            // NODO obtenido como parametro
            // Para crear la nueva union, o puntero
            ultimo.setSiguiente(n);
        }
        
        // Para asegurarme que ULTIMO sea el ultimo
        // item que se recibio y que ira a la COLA
        // debo decirle al sistema que ULTIMO sea igual
        // al N elemento que se metio de ultimo.
        ultimo = n;
        
    }
    
    
    // Metodo que saca
    // Puedo incluso cambiar NODO y sacar Auto
    public Nodo atiende() {
        
        // Ocupamos sacar siempre el FRENTE, esto por ser cola
        Nodo aux = frente;
        
        // Debemos saber si FRENTE tiene algo que sacar,
        // pero en este caso trabajaremos con una copia por referencia.
        if(aux != null) {
            
            // Sacamos frente sustituyendolo con la siguiente posicion.
            // Esto lo logramos con el metodo getAtras();
            // que devuelve el objeto siguiente en la cola.
            frente = frente.getSiguiente();
            
            // Ocupamos eliminar el puntero entre FRENTE y ATRAS
            // para que ATRAS sea el nuevo FRENTE
            aux.setSiguiente(null);
            
            // Si llego hasta ULTIMO, no puedo borrarlo facilmente
            // por lo que debo saber si es ULTIMO y borrarlo de otra forma
            if(frente == null){
                
                // Si frente quedo, ULTIMO debe quedar NULL tambien
                ultimo = null;
                
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
        
        Nodo aux = frente;
        
        while(aux != null) {
            
            msj += aux + "\n";
            aux = aux.getSiguiente();
            
        }
        
        return msj;
        
    }
    
    
    public boolean encuentra(int anio) {
        
        boolean result = false;
        Nodo aux = frente;
        
        while(aux != null) {
            
            if(anio == aux.getDato().getAnio()){
                
                result = true;
                
            }
            
            aux = aux.getSiguiente();
            
        }
        
        
        return result;
        
    }
    
    public boolean esVacia() {
        
        boolean result = true;
        
        if(frente != null) {
            result = false;
        }
        
        return result;
        
    }
    
    // Extraer el primero
    /*
    public void extrae(String modelo) {
        
        Nodo aux = frente;
        
        if(modelo.equals(aux.getDato().getModelo())){
            
            frente = aux.getSiguiente();
            aux.setDato(null);
            aux = null;
            
            aux = frente;
            
        }
        
    }
    */
    
    
    // Extrae el ultimo
    public void extrae(String modelo) {
        
        Nodo aux = frente;
        
        // Evaluar si el PRIMERO cumple condicion
        if(modelo == aux.getDato().getModelo()){
            frente = aux.getSiguiente();
            aux = null;
        }else{
            while(aux.getSiguiente() != null){
                // Evaluar si es el MEDIO
                if(aux.getSiguiente().getSiguiente() != null && modelo == aux.getSiguiente().getDato().getModelo()){
                    System.out.println("Es el medio");
                    Nodo tmp = aux.getSiguiente().getSiguiente();
                    aux.setSiguiente(null);
                    aux.setSiguiente(tmp);
                }else{
                    if(aux.getSiguiente() == ultimo && modelo == aux.getSiguiente().getDato().getModelo()){
                        aux.setSiguiente(null);
                    }else{
                        aux = aux.getSiguiente();
                    }
                }
            }
        }
        
        
    } // fin de metodo
    
    
    /*
        Cree un método que ordene ascendentemente la cola 
        según la cantidad de las personas que puede transportar. 
        En este caso la cola cambia el orden de los elementos.
    */
    
}
