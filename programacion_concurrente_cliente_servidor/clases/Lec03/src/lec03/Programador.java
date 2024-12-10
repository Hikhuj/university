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
public abstract class Programador extends Empleado{
    
    private String lenguajesProgramacion;

    public Programador(String nombre, String identificador, String direccion, float salario, String lenguajesProgramacion) {
        super(nombre, identificador, direccion, salario);
        this.lenguajesProgramacion = lenguajesProgramacion;
    }

    public String getLenguajesProgramacion() {
        return lenguajesProgramacion;
    }

    public void setLenguajesProgramacion(String lenguajesProgramacion) {
        this.lenguajesProgramacion = lenguajesProgramacion;
    }

    @Override
    public String toString() {
        return "Programador{" + super.toString() + "lenguajesProgramacion=" + lenguajesProgramacion + '}';
    }
    
    public void proyectosRealizados(){
        System.out.println("Pagina persona");
        System.out.println("la pagina de Faceook (mi perfil)");
        System.out.println("Sitio en Joomla");
    }
    
}
