/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Pila {
    
    
    // Atributo de tipo NODO con palabra reservada "top"
    private Nodo top;
    
    
    // Agrega elemento en el TOP de la Pila.
    public void push(Nodo n){
        
        // Si lo que hay en TOP es NULL
        if(top == null) {
            
            // N pasara a ser TOP
            top = n;
            
        }else{
            
            // Tengo N y lo uno con Top
            // Osea, unir esos dos datos actuales
            // El anterior con el nuevo
            n.setAbajo(top);
            top = n;
            
        }

    }


    /*
    OPCION #1
    
    Asi retornaria todo
    
    public Nodo pop(){
        
        // Como vamos a cambiar el NODO, necesitamos un NODO auxiliar
        // Aqui compruebo si HAY o NO HAY informacion
        Nodo aux = top;
        
        if(aux != null) {
            
            // Le pido a TOP que cambie, para que ahora sea el NODO que este abajo
            top = top.getAbajo();
            
        }
        
        // Va a retornar todos los datos si hago
        return aux;
        
    }
    */
    
    public Nodo pop(){
        
        // Como vamos a cambiar el NODO, necesitamos un NODO auxiliar, 
        // para evitar destruir el NODO actual

        Nodo aux = top;
        
        // Aqui compruebo si HAY o NO HAY informacion
        if(aux != null) {
            
            // Le pido a TOP que cambie, para que ahora sea el NODO que este abajo
            top = top.getAbajo();
            // Para borrar la union del ultimo dato ingresado, y borra el resto
            // de lo que alla en la pila.
            aux.setAbajo(null);
            
        }

        return aux;
        
    }
    
    
    // Obtener todos los datos de la pila
    public String toString() {
        
        String msj = "";
        
        // Siempre debo hacer un NODO auxiliar
        // para evitar usar el NODO real
        
        Nodo aux = top;
        
        while(aux != null) {
            
            msj += aux + "\n";
            aux = aux.getAbajo();
            
        }
        
        return msj;
        
    }
    
    
    // Taller, ejercicio 1
    /*
        Metodo retorna boolean y recibe String TituloLibro
        Retornar falso si no esta el titulo, retornar true si el titulo esta
    */
    public boolean encuentra(String titulo) {
        
        boolean result = false;
        Nodo aux = top;
        
        
        while(aux != null) {
            
            if(titulo.equals(aux.getDato().getTitulo())){
                
                result = true;
                
            }
            
            // msj += aux + "\n";
            aux = aux.getAbajo();
            
        }
        
        return result;
        
    }
    
    /*
    public int getPilaTamanio() {
        
        int result = 0;
        
        Nodo aux = top;
        
        while(aux != null) {
            
            aux = aux.getAbajo();
            result++;
            
        }
        
        return result;
        
    }
    */
    
    
    // Taller, ejercicio 2
    /*
        Cree el método que “extrae(int pos)” que extrae el libro de la pila que se encuentra en esa
        posición, la pila debe prevalecer igual (menos el Libro sacado). 
    */
    public Nodo extrae(int pos) {
        
        // Se crea un nodo auxiliar
        /*
        Nodo aux = top;
        Nodo tmp = null;
        int index = 0;
        
        // Recorremos la pila
        while(aux != null){
            if(index == pos){
                aux = null;
                aux = top.getAbajo();
                top = aux;
                System.out.println("La posicion calza");
            }
            index++;
        }
        */
        int index = 0;
        Nodo aux = top;
        Nodo toReturn = null;
        while(aux != null){
            if(index == pos){
                toReturn = aux;
            }
            aux = aux.getAbajo();
            index++;
        }
        
        return toReturn;
        
        /*
            // Se crea una copia de la pila
        Nodo aux = null;
        
        // Obtener tamano de pila para llegar hasta ese punto en: N-1
        int tamanioPila = getPilaTamanio();
        
        // Contador de veces que 
        int counter = 1;
        
        // Ciclo donde iremos contando de N a N-1 hasta llegar a la posicion
        // que necesitamos borrar
        while(tamanioPila != pos) {
            
            // Se genera un nodo temporal
            Nodo temp = new Nodo(null);
            
            // El nodo temporal que es NULL por ahora
            // recibira setDato(que recibira un OBJETO tipo LIBRO.getDato() <-- retorna)
            // el dato tipo LIBRO)
            temp.setDato(top.getDato());
            
            // Si el nodo AUX que es vacio contiene
            if(aux == null) {
                
                aux = temp;
                
            }else{
                
                temp.setAbajo(aux);
                aux = temp;
                
            }
            
            tamanioPila--;
            pop();
            }
        
            pop();
        */
        
        
    }
    
    
    
    
}
