/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Client {
    
    private static final String ip = "127.0.0.1";
    private static final int port = 5432;
    
    public static void main(String[] args){
        
        try{
            InetAddress IP = InetAddress.getLocalHost();
            System.out.println(IP.toString());
            System.out.println("-----------");
            System.out.println(InetAddress.getLocalHost().getHostAddress());
            System.out.println(InetAddress.getLocalHost().getHostAddress());
            
        }catch(UnknownHostException ex){
            System.out.println("IP not found");
        }
        
        
        /*
        Socket s1 = null;
        
        try {
            s1 = new Socket(ip, port);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        }
        
        DataInputStream dis;
        DataOutputStream dos;
        
        try{
            dos = new DataOutputStream(s1.getOutputStream());
            dis = new DataInputStream(s1.getInputStream());
            dos.writeUTF("Roger Ulate Rivera");
            System.out.println(dis.readUTF());
            dis.close();
            s1.close();
        }catch (IOException ex){
           Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Error");
        }
        */
        
    }
    
}
