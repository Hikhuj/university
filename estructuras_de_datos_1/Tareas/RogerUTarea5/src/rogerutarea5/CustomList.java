/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea5;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class CustomList {
    
    private Node cabeza;
    private Node ultimo;
    
    public void inserta(Patient p) {
        
        // Evaluar si el PRIMER elemento es NULL
        // en donde la cabeza si es NULL quiere decir que no existe
        // lista alguna
        if(cabeza == null){
            cabeza = new Node(p);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
        }else{
            // Aqui debemos responder la pregunta de si el nuevo dato
            // es menor a CABEZA (que vaya a ser la nueva CABEZA)
            if(p.getPrecio() < cabeza.getDato().getPrecio()){
                // Como no puedo nodear un dato a un nodo
                // creo un nodo nuevo para poder guardar el 
                // dato dentro
                Node aux = new Node(p);
                aux.setNext(cabeza);
                cabeza = aux;
                // Recordamos hacer la lista CIRCULAR
                ultimo.setNext(cabeza);
            }else{
                // Caso en el que dato sea mayor que ULTIMO
                if(p.getPrecio() > ultimo.getData().getPrecio()){
                    ultimo.setNext(new Node(p));
                    ultimo = ultimo.getNext();
                    // Recordamos hacer la lista CIRCULAR
                    ultimo.setNext(cabeza);
                }else{
                    Node aux = cabeza;
                    while(p.getPrecio() > aux.getNext().getData().getPrecio()){
                        aux = aux.getNext();
                    }
                    Node temp = new Node(p);
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
            }
        }
        
    }
    
    
    @Override
    public String toString(){
        
        Node aux = cabeza;
        
        String s = "Lista: \n";
        
        if(aux != null) {
            
            s += aux + "," + "\n";
            aux = aux.getNext();
            
            while(aux != cabeza) {
                // Como la lista es circular debe detenerse
                // cuando regrese a ser cabeza
                s += aux + ", " + "\n";
                aux = aux.getNext();
            }
            
        }else{
            s+= "vacia";
        }
        
        return s;
    }
     
    public boolean existe(String nombre) {
        
        Node aux = cabeza;
        
        boolean result = false;
        
        // Evaluar si la lista esta vacia o no
        if(aux != null){
            // Caso primer elemento: evaluar si primer elemento cumple o no condicion
            if(nombre.equals(aux.getDato().getNombre())){
                result = true;
            }
            aux = aux.getNext();
            // Recorrer todos los elementos desde el segundo hasta el ultimo
            while(aux != cabeza){
                // Evaluar todos los elementos desde el segundo elemento hasta el ultimo
                if(nombre.equals(aux.getDato().getNombre())){
                    result = true;
                }
                aux = aux.getNext();
            }
        }
        
        return result;
        
    }
    
    
    public void elimina(String nombre, String marca) {
        
        Node aux = cabeza;
        
        // Evaluar si la lista esta vacia
        if(aux != null){
            // Evalua si existe solo un elemento en la lista que se apunta a si misma
            if(aux == cabeza && aux == ultimo){
                // Se limpia la lista
                cabeza = null;
            }else{
                // Evaluar si el primer elemento de la lista cumple la condicion
                if(nombre.equals(aux.getDato().getNombre()) && marca.equals(aux.getDato().getMarca())){
                    cabeza = aux.getNext();
                    ultimo.setNext(cabeza);
                }else{
                    // Se recorre la lista desde el segundo elemento hasta el final 
                    // (evitando que apunte a ultimo.siguiente (es una lista circular, por ende nunca terminaria de recorrerse)
                    while(aux.getNext() != cabeza){
                        // Caso para evaluar el ultimo elemento: primero antes de recorrer la lista
                        if((aux.getNext() == ultimo) && (nombre.equals(aux.getNext().getDato().getNombre()) && marca.equals(aux.getNext().getDato().getMarca()))){
                            ultimo = aux;
                            ultimo.setNext(cabeza);
                        }else{
                            // Caso para evaluar elementos del medio: se recorre los elementos entre el primero y el ultimo (ya estan evaluados arriba)
                            if(nombre.equals(aux.getNext().getDato().getNombre()) && marca.equals(aux.getNext().getDato().getMarca())){
                               aux.setNext(aux.getNext().getNext()); 
                            }
                        }
                        // Los encuentre o no, debe ir evaluando cada uno.
                        aux = aux.getNext();
                    }
                }
            }
        }
    }
    
    
    
    public String buscar(int precio){
        
        Node aux = cabeza;
        
        String result = "";
        
        // Evaluar si la lista esta vacia o no
        if(aux != null){
            // Caso primer elemento: evaluar si el primer elemento cumple o no condicion
            if(precio > aux.getDato().getPrecio()){
                result+= aux.getDato() + "\n";
            }
            aux = aux.getNext();
            // Recorrer elementos desde el segundo hasta el final
            while(aux != cabeza){
                // Evaluar si el elemento cumple condicion
                if(precio > aux.getDato().getPrecio()){
                    result+= aux.getDato() + "\n";
                }
                aux = aux.getNext();
            }
        }
        
        return result;
        
    }
    
    
    public String productos(char c){
        
        Node aux = cabeza;
        
        String result = "";
        
        String nombreProducto = "";
        char inicialProducto;
        
        //Evaluar si la lista esta vacia o no
        if(aux != null){
            // Obtener el dato y simplificar su nombre a minusculas
            nombreProducto = aux.getDato().getMarca();
            nombreProducto = nombreProducto.toLowerCase();
            inicialProducto = nombreProducto.charAt(0);
            
            // Evaluar primer elemento de la lista
            if(c == inicialProducto){
                result+= cabeza.getDato() + "\n";
            }
            aux = aux.getNext();
            // Evaluar todos los elementos desde el segundo hasta el ultimo
            while(aux != cabeza){
                // Obtener el dato y simplificar su nombre a minusculas
                nombreProducto = aux.getDato().getMarca();
                nombreProducto = nombreProducto.toLowerCase();
                inicialProducto = nombreProducto.charAt(0);
                // Evaluar elemento de la lista si cumple condicion
                if(c == inicialProducto){
                    result+= aux.getDato() + "\n";
                }
                aux = aux.getNext();
            }
        }
        
        return result;
        
    }

}