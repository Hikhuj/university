package com.ulacit;

/**
 *
 * @author proyectoFinal
 */
public class SuperAdmin extends Empleado {

    //atributo
    private String asiganrLocal;

    //constructor super
    public SuperAdmin() {
        super();
    }

    //constructor herencia
    public SuperAdmin(int id, String usuario, String nombre1, String nombre2, String apellido1, String apellido2, String email, String asiganrLocal) {
        super(id, usuario, nombre1, nombre2, apellido1, apellido2, email);
        this.asiganrLocal = asiganrLocal;
    }

    //setters y getters
    public String getAsiganrLocal() {
        return asiganrLocal;
    }

    public void setAsiganrLocal(String asiganrLocal) {
        this.asiganrLocal = asiganrLocal;
    }

    //toString herencia
    @Override
    public String toString() {
        return "SuperAdmin{" + super.toString() + "asiganrLocal=" + asiganrLocal + '}';
    }

}
