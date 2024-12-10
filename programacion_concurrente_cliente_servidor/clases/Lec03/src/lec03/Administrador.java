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
public abstract class Administrador extends Empleado{
    
    private String puesto;
    private int aniosExperiencia;

    public Administrador() {
        super();
    }

    public Administrador(String nombre, String identificador, String direccion, float salario, String puesto, int aniosExperiencia) {
        super(nombre, identificador, direccion, salario);
        this.puesto = puesto;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    @Override
    public String toString() {
        return "Administrador{" + super.toString() +"puesto=" + puesto + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
    
    public void carteraProyecto(){
        System.out.println("Administrar casa de empleados");
        System.out.println("Cambio de equipos");
        System.out.println("Contratacion personal");
    }
    
    @Override
    public void calcularSalario(){
        System.out.println("Imprime calcular salario de Administrador");
    }
    
}
