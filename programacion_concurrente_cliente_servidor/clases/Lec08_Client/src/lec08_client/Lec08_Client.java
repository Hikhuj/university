/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec08_client;

import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class Lec08_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        consulta("2");
    }
    
    public static void consulta(String id){
        // TODO code application logic here
        Lec08WsCliente cliente = new Lec08WsCliente();
        String respuesta = cliente.find_JSON(String.class, id);
        JOptionPane.showMessageDialog(null, "La respuesta es: \n" + respuesta);
        System.out.println("respuesta: \n " + respuesta);
        cliente.close();
    }
    
}
