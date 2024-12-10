/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 * @author roger
 */
public class HojaDeCalculos {
    
    public void Calcula(float cantidad){
        
        /*
            Tipo de parametros que recibe (float) -> Tipo de parametro que retorna (System print)
        
            Descripcion: Metodo no retorna datos, pero imprime cuanto debe 
            invertir para obtener la cantidad reciba por el metodo
            
            >>> Calcula(float 54000)
            49680.0
            
        */
        
        // Lista de variables
        float resultado = 0.0f;
        float interesGanado = 0.0f;
        float porcentajeInteres = 0.08f;
        
        // Operacion
        // Obtener el x% de la cantidad recibida por parametro, luego restar a esta misma cantidad
        // recibida por parametro para obtener la inversion requerida.
        resultado = cantidad - (cantidad * porcentajeInteres);
        
        // Impresion de datos
        System.out.println("*---------------------------------------------------------------*");
        System.out.println("Si desea obtener ₡" + cantidad + ", debera invertir ₡" + resultado);
        System.out.println("*---------------------------------------------------------------*");
        
    }
    
}
