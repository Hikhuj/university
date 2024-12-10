/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec07_UDPConnection;


import java.io.IOException;
import java.net.*;
import java.util.*;
                                        

/**
 *
 * @author rogerjoseulaterivera
 */
public class Servidor {
    
    public static void main(String[] args) {
    
        final int PORT = 5000;
        byte[] buffer = new byte[1024];
        DatagramSocket socketUDP;
        
        try{
            
            System.out.println("Iniciando el servidor UDP...");
            socketUDP = new DatagramSocket(PORT);

            while(true){

                DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);

                socketUDP.receive(peticion);
                
                System.out.println("Recibo la informacion del cliente");
                
                String mensaje = new String(peticion.getData());
                
                System.out.println(mensaje);
                
                int puertoCliente = peticion.getPort();
                
                InetAddress direccion = peticion.getAddress();
                
                mensaje = "Hola desde el servidor";
                
                buffer = mensaje.getBytes();
                
                DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length, direccion, puertoCliente);
                
                System.out.println("Envio de informacion");
                
                socketUDP.send(respuesta);

            }
        
        }catch (SocketException ex){
            System.out.println(ex.getMessage());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }
          
}
