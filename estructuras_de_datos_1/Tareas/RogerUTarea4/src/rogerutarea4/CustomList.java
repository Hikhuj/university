/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea4;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class CustomList {
    
    private Node head;
    
    
    public void insert(Student p) {
        
        if(head == null){
            
            // Como head es un nodo, no puedo asigna un dato a un nodo CABEZA
            head = new Node (p);
            
        }else{
            // Verificar si el dato que obtengo es menor que CABEZA.
            if(p.getId() < head.getData().getId()){
                // Como head es un nodo, no puedo asigna un dato a un nodo CABEZA
                Node aux = new Node(p);
                // Establecemos que CABEZA va a estar despues de AUX
                // por que vamos a establecer una nueva head
                aux.setNext(head);
                // Ahora la nueva CABEZA sera el AUX que tuvimos antes
                head = aux;
            }else{
                // Si AUX es mayor a CABEZA, tons AUX va despues de CABEZA
                if(head.getNext() == null) {
                    // Hacemos que el AUX vaya despues de CABEZA
                    head.setNext(new Node (p));
                }else{
                    // Necesito crear algo que me ayude a recorrer la estructura sin danar
                    // la estructura original
                    Node aux = head;
                    // EL ciclo while me ayudara a concretar mi pregunta, acorde
                    // a como lo estoy ordenando
                    while(aux.getNext() != null && p.getId() > aux.getNext().getData().getId()){
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
                    Node temp = new Node(p);
                    // La ide aes no destruir mi lista y unir mi NODO nuevo con el SIGUIENTE
                    // con el fin de que no muera mi ultimo NODO
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
                
            }
            
            
        }
        
    }
    
    public String toString(){
        
        Node aux = head;
        
        String s = "Lista: \n";
        
        while(aux != null){
            
            s+= aux + ", \n";
            
            aux = aux.getNext();
            
        }
        
        return s;
    }
    
    // Cambiar nombre de parametro que recibe
    public boolean existById(int id) {
        
        Node aux = head;
        
        boolean result = false;
        
        while(aux != null) {
            
            if(id == aux.getData().getId()){
                
                result = true;
                
            }
            
            aux = aux.getNext();
            
        }
        
        return result;
        
    }
    
    public boolean existByName(String name) {
        
        Node aux = head;
        
        boolean result = false;
        
        while(aux != null) {
            
            if(name.equals(aux.getData().getId())){
                
                result = true;
                
            }
            
            aux = aux.getNext();
            
        }
        
        return result;
        
    }
    
    public double averageGrades() {
        
        Node aux = head;
        
        double result = 0.0;
        
        int counter = 0;
        
        // comprobar si lista esta llena
        if(aux != null){
            // recorrer lista
            while(aux != null) {
                // sumar cada nota con el total de notas acumuladas
                result = result + aux.getData().getGrade();
                counter++;
                aux = aux.getNext();
            }
        }
        
        // sacar promedio de notas
        result = result/(double)counter;
        
        return result;
        
    }
    
    public double averageWomenNumber() {
        
        Node aux = head;
        
        double result = 0;
        int counter = 0;
        
        // comprobar si la lista esta vacia
        if(aux != null){
            // recorrer lista
            while(aux != null) {
                // acumular puntos por aca F que se encuentre
                if(aux.getData().getGender() == 'F'){
                    result+= 1;
                }
                counter++;
                aux = aux.getNext();
            }
        }
        
        result = result/counter;
        
        return result;
        
    }
    
    public double averageMenNumber() {
        
        Node aux = head;
        
        double result = 0;
        int counter = 0;
        
        // comprobar si la lista esta vacia
        if(aux != null){
            // recorrer lista
            while(aux != null) {
                // acumular puntos por aca M que se encuentre
                if(aux.getData().getGender() == 'M'){
                    result+= 1;
                }
                counter++;
                aux = aux.getNext();
            }
        }
        
        result = result/counter;
        
        return result;
        
    }
    
    public String notesHigherLowerWomen(){
        
        String result = "";
        
        Node aux = head;
        int lowest = 100;
        int highest = 0;
        
        // Recorrer lista
        while(aux != null){
            // Si  nota es mayor a 0 y es femenino
            if(aux.getData().getGrade() > highest && aux.getData().getGender() == 'F'){
                // asignar nueva nota mayor
                highest = aux.getData().getGrade();
            }else{
                // Si  nota es menor a 100 y es femenino
                if(aux.getData().getGrade() < lowest && aux.getData().getGender() == 'F'){
                    // asignar nueva nota menor
                    lowest = aux.getData().getGrade();
                }else{
                    aux = aux.getNext();
                }
            }
        }
        
        result = "Nota mas alta de mujeres: " + highest + "\nNota mas baja de mujeres: " + lowest;
        
        return result;
        
    }
    
    public String notesHigherLowerMen(){
        
        String result = "";
        
        Node aux = head;
        int lowest = 100;
        int highest = 0;
        
        // Recorrer lista
        while(aux != null){
            // Si  nota es mayor a 0 y es masculino
            if(aux.getData().getGrade() > highest && aux.getData().getGender() == 'M'){
                // asignar nueva nota mayor
                highest = aux.getData().getGrade();
            }else{
                // Si  nota es menor a 100 y es masculino
                if(aux.getData().getGrade() < lowest && aux.getData().getGender() == 'M'){
                    // asignar nueva nota menor
                    lowest = aux.getData().getGrade();
                }else{
                    aux = aux.getNext();
                }
            }
        }
        
        result = "Nota mas alta de hombres: " + highest + "\nNota mas baja de hombres: " + lowest;
        
        return result;
        
    }
    
    public void modifyStudentGrade(){
        
        Node aux = head;
        String name;
        int duplicates = 0;
        int choice = 0;
        
        // Verificar que la lista no este vacia
        if(aux != null){
            
            // Solicitar nombre de estudiante
            name = JOptionPane.showInputDialog("Deme el nombre del estudiante a modificar:");
            
            // Comprobar si existe duplicados
            if(existDuplicates(name) != 0){

                JOptionPane.showMessageDialog(null, "Existen dos o mas personas con mismo nombre", "Precaucion", JOptionPane.WARNING_MESSAGE);

                // Recorrer la lista
                while(aux != null){
                    
                    // Evaluar cada elemento si el nombre es el que buscamos
                    if(name.equals(aux.getData().getFirstName())){
                        
                        boolean notValid = false;
                        
                        // Imprimir alumno que calza con la busqueda
                        JOptionPane.showMessageDialog(null, aux.getData(), "Estudiante", JOptionPane.INFORMATION_MESSAGE);
                        
                        // Generaremos un ciclo para ir recorriendo cada uno de los alumnos que calzan
                        while(notValid != true){
                            
                            // Preguntar si queremos modificar el alumno presente en la variable
                            choice = Integer.parseInt(JOptionPane.showInputDialog("Desea modificar este alumno? (1 para si, 0 para no)"));
                            
                            // Si la opcion esta en el rango
                            if(choice >= 0 && choice <= 1){
                                
                                // Se modifica el alumno
                                if(choice == 1){
                                    int newGrade = Integer.parseInt(JOptionPane.showInputDialog("Deme la nueva nota"));
                                    aux.getData().setGrade(newGrade);
                                    notValid = true;
                                }else{
                                    JOptionPane.showMessageDialog(null, "No se modificara este alumno", "Cambiando", JOptionPane.INFORMATION_MESSAGE);
                                    notValid = true;
                                }
                                
                            }else{
                                
                                JOptionPane.showMessageDialog(null, "No es una opcion valida", "Error", JOptionPane.ERROR_MESSAGE);
                                modifyStudentGrade();
                                
                            }
                            
                        }
                        
                    }
                    
                    aux = aux.getNext();
                    
                }
                
            }else{
                // No existe estudiante con ese nombre
                JOptionPane.showMessageDialog(null, "No existe estudiante con este nombre", "No Existe", JOptionPane.WARNING_MESSAGE);
                int newGrade = Integer.parseInt(JOptionPane.showInputDialog("Deme la nueva nota"));
                aux.getData().setGrade(newGrade);
            }
            
        }else{
            // La lista esta vacia, no puede modificarse nada
            JOptionPane.showMessageDialog(null,"La lista esta vacia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }
    
    public int existDuplicates(String name){
        
        Node aux = head;
        int counter = 0;
        
        if(aux != null){
            while(aux != null){
                if(name.equals(aux.getData().getFirstName())){
                    counter++;
                }
                aux = aux.getNext();
            }
        }else{
            JOptionPane.showMessageDialog(null,"La lista esta vacia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return counter;
        
    }
    
    public boolean deleteById(int id) {
        
        // Crear un nodo auxiliar para no dan
        Node aux = head;
        boolean result = false;
        
        // Evaluar si es el PRIMER nodo o no
        if(id == aux.getData().getId()){
            head = aux.getNext();
            aux = null;
            result = true;
        }else{
            // Evaluar nodo MEDIOS hasta ULTIMO
            while(aux.getNext() != null) {
                // Evalua si es nodo MEDIO
                if(id == aux.getNext().getData().getId() && aux.getNext().getNext() != null){
                    Node tmp = aux.getNext().getNext();
                    aux.setNext(tmp);
                    result = true;
                }else{
                    // Evaluar si es nodo ULTIMO
                    if(id == aux.getNext().getData().getId() && aux.getNext().getNext() == null){
                        aux.setNext(null);
                        result = true;
                    }else{
                        // Si no cumple nada de lo anterior, solicita el siguiente nodo
                        aux = aux.getNext();
                    }
                }
            }
        }
        
        return true;
    }

}