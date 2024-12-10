/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec03;

/**
 *
 * @author roger
 */
public class Rutina {
    
    public void iniciaEjemplo(){
        
        Empleado primerEmpleado = new Empleado("Juan", "235786435", "Desamparados", 250000.0f);
        Empleado segundoEmpleado = new Programador("John","11111111","Romosher", 800000.0f, "C#, Java, React, Angular");
        Empleado tercerEmpleado = new Administrador("Jose", "0111111111", "Escazu", 1200000.0f, "Gerente", 10);
        
        Empleado[] empleados = new Empleado[3];
        empleados[0] = segundoEmpleado;
        empleados[1] = tercerEmpleado;
        empleados[2] = primerEmpleado;
        
        // esto es un for optimizado
        for(Empleado e: empleados){
            revisarObjeto(e);
        }
        
    }
    
    public void revisarObjeto(Empleado e){
        if(e instanceof Administrador){
            System.out.println("Es un administrador");
            Administrador a = (Administrador)e;
            a.lugarTrabajo("Torre Mercedez");
        }else if(e instanceof Programador){
            System.out.println("Es un programador");
            Programador p = (Programador)e;
            p.proyectosRealizados();
        }else{
            System.out.println("Es un empleado");
            System.out.println(e);
        }
    }
    
}
