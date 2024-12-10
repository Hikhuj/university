
package ProyectoConcurrente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.log4j.PropertyConfigurator;


public class Main {

    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Marco1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        String path = "jdbc:mysql://localhost/";
        String place = "ulacitProyecto";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "SELECT * FROM crearUsuario";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                ResultSet myresult = mystatement.executeQuery();

                if (myresult.next()) {
                    Ingreso obj1 = new Ingreso();
                    obj1.setVisible(true);
                    PropertyConfigurator.configure("log4j.properties");
                    ClienteChat c = new ClienteChat();
                    c.recibirMensajesServidor();
                } else {
                    CrearUsuario ob1j = new CrearUsuario();
                    ob1j.setVisible(true);
                }
                mystatement.close();
                myconnection.close();
            } catch (Exception ae) {
                System.out.print("Error en consulta" + ae.getMessage());
            }
        } catch (Exception ae) {
            System.out.print("Error en conexión" + ae.getMessage());
        }

    }
}