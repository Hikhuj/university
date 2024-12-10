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
public class ClientNode {
    
     /* Atributos */
    // El dato
    private Client data;
    
    // El puntero
    private ClientNode next;
    
    
    // Solo recibe dato
    public ClientNode(Client data) {
        this.data = data;
    }

    // Solo imprime dato
    @Override
    public String toString() {
        return "" + data ;
    }

    public Client getData() {
        return data;
    }

    public void setData(Client data) {
        this.data = data;
    }

    public ClientNode getNext() {
        return next;
    }

    public void setNext(ClientNode next) {
        this.next = next;
    }
    
}
