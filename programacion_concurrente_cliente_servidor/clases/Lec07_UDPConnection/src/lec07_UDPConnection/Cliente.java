/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec07_UDPConnection;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int PORT_SERVIDOR = 5000;
        byte[] buffer = new byte[1024];
        
        DatagramSocket socketUDP;
        
        try{
            InetAddress direccionServidor = InetAddress.getByName("localhost");
            socketUDP = new DatagramSocket();
            
            String mensaje = "Hola desde el lado del cliente";
            
            buffer = mensaje.getBytes();
            
            DatagramPacket pregunta = new DatagramPacket(buffer, buffer.length, direccionServidor, PORT_SERVIDOR);
            
            System.out.println("Enviando el datagrama");
            
            socketUDP.send(pregunta);
            
            DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
            
            socketUDP.receive(peticion);
            
            System.out.println("Esta peticion del servidor");
            
            mensaje = new String(peticion.getData());
            
            System.out.println(peticion.getData());
            
            System.out.println(mensaje);
            
            socketUDP.close();
            
        } catch (SocketException ex){
            
        } catch (UnknownHostException ex){
            
        } catch (IOException ex){
            
        }
        
    }
    
}
