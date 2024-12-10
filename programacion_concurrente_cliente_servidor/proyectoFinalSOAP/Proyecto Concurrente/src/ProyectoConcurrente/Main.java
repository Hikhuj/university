
package ProyectoConcurrente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;


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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        String path = "jdbc:mysql://localhost/";
        String place = "factorydb";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection(path + place, "root", "");
            try {
                String q = "select * from createuser";
                PreparedStatement mystatement = myconnection.prepareStatement(q);
                ResultSet myresult = mystatement.executeQuery();

                if (myresult.next()) {
                    login obj1 = new login();
                    obj1.setVisible(true);
                } else {
                    createuser ob1j = new createuser();
                    ob1j.setVisible(true);
                }
                mystatement.close();
                myconnection.close();
            } catch (Exception ae) {
                System.out.print("Error in Query" + ae.getMessage());
            }
        } catch (Exception ae) {
            System.out.print("Error in Connection" + ae.getMessage());
        }

    }
}