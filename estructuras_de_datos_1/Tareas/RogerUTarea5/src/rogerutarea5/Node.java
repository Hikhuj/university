/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea5;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Node {
    
    // Atributes
    private Patient data;
    private Node next;
    
    public Node(Patient data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "" + data;
    }
    
    public Patient getData(){
        return data;
    }
    
    public void setData(Patient data){
        this.data = data;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
}
