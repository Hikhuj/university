/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana12;

import static semana12.EjemploSemana12.estudiantes;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Semana12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EjemploSemana12 ej = new EjemploSemana12();
        ej.llenar();
        
        EjemploSemana12.estudiantes[2].modificar();
        
        for (int i = 0; i < estudiantes.length; i++) {
            if(EjemploSemana12.estudiantes[i] != null) {
                EjemploSemana12.estudiantes[i].imprimir();
            }
            
        }
        
        
        // EjemploSemana12.estudiantes[2].imprimir();
        
        // Puedo llamar al metodo modificar sin crear un objeto, esto debido a que 
        // es un objeto
        // Persona.modificar();
        
        /*
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        
        persona1.modificar();
        persona2.modificar();
        persona3.modificar();
        persona4.modificar();
        
        persona1.imprimir();
        persona2.imprimir();
        persona3.imprimir();
        persona4.imprimir();
        */
        
        
    }
    
}
