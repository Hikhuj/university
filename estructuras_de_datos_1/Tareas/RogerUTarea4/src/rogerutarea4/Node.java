/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea4;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Node {
    
    // Atributes
    private Student data;
    private Node next;
    
    public Node(Student data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "" + data;
    }
    
    public Student getData(){
        return data;
    }
    
    public void setData(Student data){
        this.data = data;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
}
