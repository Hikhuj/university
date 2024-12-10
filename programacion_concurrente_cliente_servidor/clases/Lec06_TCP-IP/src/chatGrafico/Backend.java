/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatGrafico;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lec06.Client;

/**
 *
 * @author roger
 */
public class Backend {
    
    // Attributes
    private String clienteMessageToServer;
    
    public void clientMessageAndConnection(String ipNumber, String portNumber, String chatMessage){
        
        Socket s1 = null;
        
        try {
            s1 = new Socket(ipNumber, Integer.parseInt(portNumber));
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: IP does not exit");
            JOptionPane.showMessageDialog(null, "Error al tratar de conectarse al servidor, IP no existe o Servidor no ha sido inicializado.");
        }

        DataInputStream dis;
        DataOutputStream dos;

        try{
            dos = new DataOutputStream(s1.getOutputStream());
            dis = new DataInputStream(s1.getInputStream());
            dos.writeUTF(getDateOfSystem() + ":>> " + chatMessage);
            System.out.println(dis.readUTF());
            dis.close();
            s1.close();

        }catch (IOException ex){
           Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Error");
        }
        
    }
    
    public String getIpToClient(){
        
        String result = "";
        
        try{
            InetAddress IP = InetAddress.getLocalHost();
            System.out.println("Local IP found: " + IP.toString());
            result = InetAddress.getLocalHost().getHostAddress();
        }catch(UnknownHostException ex){
            System.out.println("IP not found: " + ex);
            System.out.println("It is possible network connection not established,\ncheck network connection.");
        }
        
        return result;
        
    }
    
    public String getDateOfSystem(){
        
        String result;
        
        result = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        
        return result;
        
    }
    
    public void serverMessageConnectionReceiver(int portNumber){
        
        // Crear objeto nulo de socket
        ServerSocket serverSocket = null;
        String mensaje = "";
            
        // Metemos en try/catch la conexion con el fin de que si falla, devuelva un mensaje
        try{
            // Iniciando la conexion por medio del puerto ####
            serverSocket = new ServerSocket(portNumber);
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
                // Mensaje recibido por el cliente externo
                setClienteMessageToServer(dis.readUTF());
                //dos.writeUTF("Peticion realizada...");
                //s1.close();
                System.out.println("Cliente cerrado");
            } catch (IOException ex){
                System.out.println("Socket Connection Error " + ex.getMessage());
            }
        }
        
    }

    public String getClienteMessageToServer() {
        return clienteMessageToServer;
    }

    public void setClienteMessageToServer(String clienteMessageToServer) {
        this.clienteMessageToServer = clienteMessageToServer;
    }
    
    
    
}
