/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec02;

/**
 *
 * @author roger
 */
public abstract class Entrenador extends SeleccionFutbol implements Acciones{
    
    String idFederacion;

    public Entrenador(){
        super();
    }
    
    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirigirPartido(){
        System.out.println("El entrenador dirige el partido");
    }
    
    public void dirigirEntrenamiento(){
        System.out.println("El entrenador dirige el entrenamiento");
    }

    @Override
    public String toString() {
        return "Entrenador{" + super.toString() + "idFederacion=" + idFederacion + '}';
    }

    @Override
    public void respirar() {
        System.out.println("El entrenador respira");
    }

    @Override
    public void observar() {
        System.out.println("El entrenador observa");
    }
    
    // Metodos abstractos
    public abstract void getCertificadoFifa();
    
}
