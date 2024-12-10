/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerulatetallergeneral;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class TouristPackageSimpleList {
    
    private TouristPackageNode cabeza;
    
    
    public void addTouristPackage(TouristPackage p) {
        
        if(cabeza == null){
            
            // Como cabeza es un TouristPackageNode, no puedo asigna un dato a un TouristPackageNode CABEZA
            cabeza = new TouristPackageNode (p);
            
        }else{
            // Verificar si el dato que obtengo es menor que CABEZA.
            if(p.getPackageNumber() < cabeza.getData().getPackageNumber()){
                // Como cabeza es un TouristPackageNode, no puedo asigna un dato a un TouristPackageNode CABEZA
                TouristPackageNode aux = new TouristPackageNode(p);
                // Establecemos que CABEZA va a estar despues de AUX
                // por que vamos a establecer una nueva cabeza
                aux.setNext(cabeza);
                // Ahora la nueva CABEZA sera el AUX que tuvimos antes
                cabeza = aux;
            }else{
                // Si AUX es mayor a CABEZA, tons AUX va despues de CABEZA
                if(cabeza.getNext() == null) {
                    // Hacemos que el AUX vaya despues de CABEZA
                    cabeza.setNext(new TouristPackageNode (p));
                }else{
                    // Necesito crear algo que me ayude a recorrer la estructura sin danar
                    // la estructura original
                    TouristPackageNode aux = cabeza;
                    // EL ciclo while me ayudara a concretar mi pregunta, acorde
                    // a como lo estoy ordenando
                    while(aux.getNext() != null && p.getPackageNumber() > aux.getNext().getData().getPackageNumber()){
                        // Al agregar el aux.getNext() != null
                        // me ayuda a ver si el ultimo elemento es null
                        // ya que si lo es, me va a sacar del la cola
                        aux = aux.getNext();
                    }
                    // Como ya mi iteracion anterior logro encontrar quien es mayor
                    // a AUX, se cumple mi iteracion y se sale, dejando a AUX
                    // con el nuevo valor de posicion (MATRIX)
                    // Necesito crear un TouristPackageNode nuevo para guardar el DATO obtenido
                    // ya que este no viene como TouristPackageNode desde el principio
                    TouristPackageNode temp = new TouristPackageNode(p);
                    // La ide aes no destruir mi lista y unir mi TouristPackageNode nuevo con el SIGUIENTE
                    // con el fin de que no muera mi ultimo TouristPackageNode
                    temp.setNext(aux.getNext());
                    aux.setNext(temp);
                }
                
            }
            
            
        }
        
    }
    
    public String toString(){
        
        TouristPackageNode aux = cabeza;
        
        String s = "Paquetes Turisticos: ";
        
        while(aux != null){
            
            s+= aux + ", ";
            
            aux = aux.getNext();
            
        }
        
        return s;
    }
    
    /*
        Practica 1: public boolean existe(String titulo)
    */
    public boolean exist(String packageDestination) {
        
        TouristPackageNode aux = cabeza;
        
        boolean result = false;
        
        if(aux != null){
            while(aux != null) {
                if(packageDestination.equals(aux.getData().getPackageDestination())){
                    result = true;
                }
            aux = aux.getNext();
            }
        }
        
        return result;
        
    }
    
    
    /*
        Elimina lo que se le envia
    */
    public void deleteByLessPackageSold(int amountPackageSold) {
        
        // Crear un TouristPackageNode auxiliar para no dan
        TouristPackageNode aux = cabeza;
        
        // Evaluar si es el PRIMER TouristPackageNode o no
        if(amountPackageSold == aux.getData().getPackageNumber()){
            cabeza = aux.getNext();
            aux = null;
        }else{
            // Evaluar TouristPackageNode MEDIOS hasta ULTIMO
            while(aux.getNext() != null) {
                // Evalua si es TouristPackageNode MEDIO
                if(amountPackageSold == aux.getNext().getData().getPackageNumber() && aux.getNext().getNext() != null){
                    TouristPackageNode tmp = aux.getNext().getNext();
                    aux.setNext(tmp);
                }else{
                    // Evaluar si es TouristPackageNode ULTIMO
                    if(amountPackageSold == aux.getNext().getData().getPackageNumber() && aux.getNext().getNext() == null){
                        aux.setNext(null);
                    }else{
                        // Si no cumple nada de lo anterior, solicita el siguiente TouristPackageNode
                        aux = aux.getNext();
                    }
                }
            }
        } 
    }
    
}
