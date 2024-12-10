/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller01;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Profesor extends Persona implements ListinProfesores{
    
    // Atributos
    private int idProfesor;
    private double salario;
    private int cantidadClases;
    private static int precioClase = 15000;
    
    // Constructor

    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellido, int edad, int idProfesor, int cantidadClases) {
        super(nombre, apellido, edad);
        this.idProfesor = idProfesor;
        this.cantidadClases = cantidadClases;
    }

    // Metodos
    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCantidadClases() {
        return cantidadClases;
    }

    public void setCantidadClases(int cantidadClases) {
        this.cantidadClases = cantidadClases;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString() + "idProfesor=" + idProfesor + ", salario=" + salario + ", cantidadClases=" + cantidadClases + '}';
    }
    
    @Override
    public void llenarDatos(){
        
    }
    
    @Override
    public void calcularSalario(){
        
        /*
        *
        *   Calcular salario()debe sobre escribirse en la clase de profesores 
        *   depende de la cantidad de lecciones que tenga el profesor, 
        *   se multiplica por 15000 y la restricción es que solo puede tener 
        *   un mínimo de 40 clases y un máximo de 48 clases
        *
        */
        
        setSalario(this.precioClase * this.cantidadClases);
        
    }
    
}
