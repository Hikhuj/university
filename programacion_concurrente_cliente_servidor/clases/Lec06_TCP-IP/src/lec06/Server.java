package lec06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Server {
    
    private static final int port = 5432;
    
    public static void main(String[] args) {
        
        // Crear objeto nulo de socket
        ServerSocket serverSocket = null;
            
        // Metemos en try/catch la conexion con el fin de que si falla, devuelva un mensaje
        try{
            // Iniciando la conexion por medio del puerto ####
            serverSocket = new ServerSocket(port);
            System.out.println("Init server...");
            
        }catch (IOException ex){
            System.out.println("Port error " + ex.getMessage());
        }
        
        // Mientras la conexion sea infinita, siempre va a estar haciendo la conexion
        
        DataOutputStream dos; // este dato captura la informacion del cliente;
        DataInputStream dis; // esta linea es para responderle al cliente
        while(true){
            try{
                Socket s1 = serverSocket.accept();
                
                dis = new DataInputStream(s1.getInputStream());
                dos = new DataOutputStream(s1.getOutputStream());
                String mensaje = dis.readUTF();
                System.out.println("Enviando de: " + mensaje);
                dos.writeUTF("Peticion realizada...");
                s1.close();
                System.out.println("Cliente cerrado");
            } catch (IOException ex){
                System.out.println("Socket Connection Error " + ex.getMessage());
            }
        }
        
    }
    
}
