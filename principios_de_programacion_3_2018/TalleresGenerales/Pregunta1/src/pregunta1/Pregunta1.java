/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta1;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Pregunta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClassEvento classEvento = new ClassEvento("Eleccion de Carreras","Descripcion dummy de evento", "ULACIT","Pablo Montagano",1400,true,01,01,2019);
        ClassOrador classOrador = new ClassOrador("Richard", "Stealth", "", "USA Embassy", 02, "San Jose", "Costa Rica", false, "Ingeniero");
        ClassPublico classPublico = new ClassPublico("Demon", "Sanchez", "Arch", "Canas", 21, false, 23232323, "demon@merko.ru");
        
        classPublico.imprimirInformation();
        
    }
    
}
