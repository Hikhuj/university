/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class ListaDobleEnlazada {
    
    private Nodo cabeza, ultimo;
    
    public void inserta(Juego j){
        
        // Revisar si la lista esta vacida o no
        if(cabeza == null){
            // Como CABEZA esta vacido
            // simplemente creamos un nodo nuevo y agregarmos el juego
            // por que no pueden meterse datos sin nodo
            cabeza = new Nodo(j);
            ultimo = cabeza;
            // Recordad que son listas y que son doblemente enlazadas
            // Las siguientes lineas son necesarias
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else{
            if(j.getYear() < cabeza.getDato().getYear()){
                cabeza.setBack(new Nodo(j));
                cabeza.getBack().setNext(cabeza);
                cabeza = cabeza.getBack();
            }else{
                if(j.getYear() > ultimo.getDato().getYear()){
                    ultimo.setNext(new Nodo (j));
                    ultimo.getNext().setBack(ultimo);
                    ultimo = ultimo.getNext();
                }else{
                    Nodo aux = cabeza;
                    while(j.getYear() > aux.getDato().getYear()){
                        aux = aux.getNext();
                    }
                    // Crear un nuevo nodo
                    Nodo temp = new Nodo(j);
                    // mas facil trabajar en el nuevo anclarlo a los siguientes que ya estaban
                    temp.setBack(aux.getBack());
                    // Una forma facil de conectar el puntero
                    aux.setBack(temp);
                    temp.getBack().setNext(temp);
                }
            }
        }
        
        // Al sacar todo esto en las deciciones, evitamos redundancia;
        // Nos permite hacer que siempre se adoble enlace.
        // Recordad que son listas y que son doblemente enlazadas
        // Las siguientes lineas son necesarias
        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo);
        
    } // fin inserta
    
    @Override
    public String toString(){
        
        Nodo aux = cabeza;
        String s = "Lista:\n";
        
        if(aux != null){
            s += aux + ",\n";
            aux = aux.getNext();
            while(aux != cabeza){
                s += aux + ",\n";
                aux = aux.getNext();
            }
        }else{
            s+= "Vacia";
        }
        
        return s;
        
    }
    
    // Ejercicio #1
    public boolean existe(String nombre){
        
        Nodo aux = cabeza;
        
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
    
    // Ejercicio #2
    public void modifica(String nombre, int year){
        
        Nodo aux = cabeza;
        
        String plataformaNueva;
        
        // Se evalua si la lista esta vacia o no
        if(aux != null){
            // Se evalua el primer elemento
            if(nombre.equals(aux.getDato().getNombre()) && year == aux.getDato().getYear()){
                plataformaNueva = JOptionPane.showInputDialog("Deme el nombre de la nueva plataforma: ");
                aux.getDato().setPlataforma(plataformaNueva);
            }else{
                aux = aux.getNext();
                // Se recorre el resto de la lista
                while(aux != cabeza){
                    // Se evalua del segundo elemento hasta el ultimo
                    if(nombre.equals(aux.getDato().getNombre()) && year == aux.getDato().getYear()){
                        plataformaNueva = JOptionPane.showInputDialog("Deme el nombre de la nueva plataforma: ");
                        aux.getDato().setPlataforma(plataformaNueva);
                    }
                    aux = aux.getNext();
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Mensaje de error", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    // Ejercicio #3
    public void elimina(String nombre, int year){
        
        Nodo aux = cabeza;
        
        // Se evalua el primer elemento
        if(nombre.equals(cabeza.getDato().getNombre()) && year == cabeza.getDato().getYear()){
            ultimo.setNext(cabeza.getNext());
            cabeza = cabeza.getNext();
        }else{
            // Se evalua el ultimo elemento
            if(nombre.equals(ultimo.getDato().getNombre()) && year == ultimo.getDato().getYear()){
                ultimo.getBack().setNext(cabeza);
                cabeza.setBack(ultimo.getBack());
                ultimo = ultimo.getBack();
            }else{
                // Se recorre la lista desde el segundo elemento hasta antes del ultimo
                while(aux != null && aux.getNext() != cabeza){
                    // Se evaluan elementos medios
                    if(nombre.equals(aux.getDato().getNombre()) && year == aux.getDato().getYear()){
                        aux.getBack().setNext(aux.getNext());
                        aux.getNext().setBack(aux.getBack());
                    }
                    aux = aux.getNext();
                }
            }
        }
        
    }
    
    // Ejercicio #4
    public void imprimeDescendente(){
        
        Nodo aux = ultimo;
        
        // Evaliuar si la lista esta vacia
        if(aux != null){
            System.out.println("Lista descendente:\n");
            System.out.println(aux.getDato());
            aux = aux.getBack();
            while(aux != ultimo){
                System.out.println(aux.getDato());
                aux = aux.getBack();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Lista esta vacia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    // Ejercicio #5
    public int cuentaNombres(String nombre){
        
        Nodo aux = cabeza;
        
        int result = 0;
        
        // Evaluar si la lista esta vacia o no
        if(aux != null){
            // Caso primer elemento: evaluar si primer elemento cumple o no condicion
            if(nombre.equals(aux.getDato().getNombre())){
                result++;
            }
            aux = aux.getNext();
            // Recorrer todos los elementos desde el segundo hasta el ultimo
            while(aux != cabeza){
                // Evaluar los elementos desde e segundo hasta el ultimo si cumple condicion
                if(nombre.equals(aux.getDato().getNombre())){
                    result++;
                }
                aux = aux.getNext();
            }
        }
        
        return result;
        
    }
    
    
}
