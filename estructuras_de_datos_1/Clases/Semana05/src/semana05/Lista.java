/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana05;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Lista {
    
    // CABEZA siempre va a hacer el primer dato de la estructura
    // y cualquier regla que yo haga debe modificar a CABEZA
    // se debe tener cuidado en el ordenamiento de la estructura.
    private Nodo cabeza;
    
    
    public void inserta(Pelicula p) {
        
        if(cabeza == null){
            
            // Como cabeza es un nodo, no puedo asigna un dato a un nodo CABEZA
            cabeza = new Nodo (p);
            
        }else{
            // Verificar si el dato que obtengo es menor que CABEZA.
            if(p.getAnios() < cabeza.getDato().getAnios()){
                // Como cabeza es un nodo, no puedo asigna un dato a un nodo CABEZA
                Nodo aux = new Nodo(p);
                // Establecemos que CABEZA va a estar despues de AUX
                // por que vamos a establecer una nueva cabeza
                aux.setNext(cabeza);
                // Ahora la nueva CABEZA sera el AUX que tuvimos antes
                cabeza = aux;
            }else{
                // Si AUX es mayor a CABEZA, tons AUX va despues de CABEZA
                if(cabeza.getNext() == null) {
                    // Hacemos que el AUX vaya despues de CABEZA
                    cabeza.setNext(new Nodo (p));
                }else{
                    // Necesito crear algo que me ayude a recorrer la estructura sin danar
                    // la estructura original
                    Nodo aux = cabeza;
                    // EL ciclo while me ayudara a concretar mi pregunta, acorde
                    // a como lo estoy ordenando
                    while(aux.getNext() != null && p.getAnios() > aux.getNext().getDato().getAnios()){
                        // Al agregar el aux.getNext() != null
                        // me ayuda a ver si el ultimo elemento es null
                        // ya que si lo es, me va a sacar del la cola
                        aux = aux.getNext();
                    }
                    // Como ya mi iteracion anterior logro encontrar quien es mayor
                    // a AUX, se cumple mi iteracion y se sale, dejando a AUX
                    // con el nuevo valor de posicion (MATRIX)
                    // Necesito crear un nodo nuevo para guardar el DATO obtenido
                    // ya que este no viene como NODO desde el principio
                    Nodo temp = new Nodo(p);
                    // La ide aes no destruir mi lista y unir mi NODO nuevo con el SIGUIENTE
                    // con el fin de que no muera mi ultimo NODO
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
                
            }
            
            
        }
        
    }
    
    public String toString(){
        
        Nodo aux = cabeza;
        
        String s = "Lista: ";
        
        while(aux != null){
            
            s+= aux + ", ";
            
            aux = aux.getNext();
            
        }
        
        return s;
    }
    
    /*
        Practica 1: public boolean existe(String titulo)
    */
    public boolean existe(String titulo) {
        
        Nodo aux = cabeza;
        
        boolean result = false;
        
        if(aux != null){
            while(aux != null) {
                if(titulo.equals(aux.getDato().getTitulo())){
                    result = true;
                }
            aux = aux.getNext();
            }
        }
        
        return result;
        
    }
    
    /*
        Practica 2: public void elimina (int year)
    
    public void elimina(int anio){

        Nodo aux = cabeza;
        
        // Si ELIMINAR primer dato
        if(anio == aux.getDato().getAnios()){
            cabeza = aux.getNext();
            aux = null;
        }
        
    }
    */
    
    /*
        Practica 2.1: Elimina ultimo dato

    public void elimina(int anio) {
        
        Nodo aux = cabeza;
        
        // Si ELIMINA ultimo dato
        if(anio == aux.getNext().getDato().getAnios() && aux.getNext().getNext() == null){
            cabeza.setNext(null);
        }
        
    }
    */
    
    /*
        Practica 2.3: Elimina dato del medio
    
    public void elimina(int anio) {
        
        Nodo aux = cabeza;
        
        // Si ELIMINA ultimo dato
        
        while(aux.getNext() != null) {
            if(anio == aux.getNext().getDato().getAnios() && aux.getNext().getNext() != null){
                Nodo tmp = aux.getNext().getNext();
                aux.setNext(tmp);
            }else{
                aux = aux.getNext();
            }
        }
        
    }
    */
    
    
    /*
        Elimina lo que se le envia
    */
    public void elimina(int anio) {
        
        // Crear un nodo auxiliar para no dan
        Nodo aux = cabeza;
        
        // Evaluar si es el PRIMER nodo o no
        if(anio == aux.getDato().getAnios()){
            cabeza = aux.getNext();
            aux = null;
        }else{
            // Evaluar nodo MEDIOS hasta ULTIMO
            while(aux.getNext() != null) {
                // Evalua si es nodo MEDIO
                if(anio == aux.getNext().getDato().getAnios() && aux.getNext().getNext() != null){
                    Nodo tmp = aux.getNext().getNext();
                    aux.setNext(tmp);
                }else{
                    // Evaluar si es nodo ULTIMO
                    if(anio == aux.getNext().getDato().getAnios() && aux.getNext().getNext() == null){
                        aux.setNext(null);
                    }else{
                        // Si no cumple nada de lo anterior, solicita el siguiente nodo
                        aux = aux.getNext();
                    }
                }
            }
        } 
    }


    /*
        Practica 3: public String muestra() // solicitar el nombre
        de un director y mostrar todas las películas del mismo.
    */
    public String muestra(){
        
        // Obtener el nodo CABEZA de forma auxiliar sin afectar original
        Nodo aux = cabeza;
        
        // Declarar e inicializar variables necesarias
        String solicitaNombreDirector = "";
        String result = "";
        
        // Obtener el director que se desea obtener informacion
        solicitaNombreDirector = JOptionPane.showInputDialog("Deme el nombre del director a buscar");
        
        // Recorrer la lista
        while(aux != null){
            // Evaluar los NODOS excepto el ULTIMO
            if(solicitaNombreDirector.equals(aux.getDato().getDirector())){
                result+= aux.getDato();
            }else{
                // Evaluar el NODO en caso que es el ULTIMO
                if(aux.getNext() == null && solicitaNombreDirector.equals(aux.getDato().getDirector())){
                    result+= aux.getDato();
                }
            }
            // Llamar al siguiente NODO disponible
            aux = aux.getNext();
        }
        
        // Retornar valor
        return result;
        
    }

}
