/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author roger
 */
public class Entrenador extends Entrenadores{
    
    private int idFederacionFifa;
    
    public Entrenador(){
        super();
    }
    
    @Override
    public void dormir(){
        System.out.println("El entrenador necesita dormir 2 horas");
    }
    
}
