/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author roger
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Inicializar y declara variable con un monto de prueba.
        int monto = 54000;
        
        // Se crea un objeto de tipo HojaDeCalculos, que contiene el metodo requirido por el ejercicio.
        // Calcula(float){}
        HojaDeCalculos claseFinanciera = new HojaDeCalculos();
        
        // Se hace llamado del metodo de la clase, enviandole por parametro el monto que se quiere calcular.
        claseFinanciera.Calcula(monto);
        
    }
    
}
