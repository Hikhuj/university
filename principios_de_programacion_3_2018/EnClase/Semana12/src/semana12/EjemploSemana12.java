/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana12;

/**
 *
 * @author rogerjoseulaterivera
 */
public class EjemploSemana12 {
    
    // Para jalar los estudiantes a diferentes lugares si los ocupase
    static Persona [] estudiantes = new Persona[10];
    
    public void llenar() {
        
        estudiantes[Persona.cont] = new Persona("Ana");
        
        estudiantes[Persona.cont] = new Persona("Sofia");
        
        estudiantes[Persona.cont] = new Persona("Pedro");
        
        estudiantes[Persona.cont] = new Persona("Luis");
        
        for (int i = 0; i < estudiantes.length; i++) {
            if(estudiantes[i] != null) {
                estudiantes[i].imprimir();
            }
            
        }
        
    }
    
}
