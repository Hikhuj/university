
package lec08client;

import javax.swing.JOptionPane;


public class Lec08Client {


    public static void main(String[] args) 
    {
        consulta("2");
    }
    public static void consulta(String id)
        {
            Lec08WSClient cliente=new Lec08WSClient();
            String respuesta =cliente.find_XML(String.class, id);
            JOptionPane.showMessageDialog(null,"La rspuesta es: \n"+respuesta);
            System.out.println("repuesta: \n" +respuesta);
            cliente.close();
        }
}
