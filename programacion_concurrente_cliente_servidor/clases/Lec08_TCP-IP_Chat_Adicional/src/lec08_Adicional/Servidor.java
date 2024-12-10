package lec08_Adicional;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Servidor extends Observable implements Runnable{

    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
    }
    
    
    
    @Override
    public void run() {
        ServerSocket sc= null;
        Socket s= null;
        DataInputStream in= null;
        try {
            sc= new ServerSocket(puerto);
            System.out.println("Servidor arriba....");
            while (true) {
                s = sc.accept();
                System.out.println("Cliente conectado...");
                in = new DataInputStream(s.getInputStream());
                String mensaje = in.readUTF();
                System.out.println(mensaje);
                
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();
                
                s.close();
                System.out.println("Cliente desconetado");
                
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
