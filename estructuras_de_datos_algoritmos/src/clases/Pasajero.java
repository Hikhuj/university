package clases;

public class Pasajero {

    private String nombre, apellido;
    private int telefono, cantidadAcompaniantes, cedula;

    public Pasajero(String nombre, String apellido, int telefono, int cantidadAcompaniantes, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cantidadAcompaniantes = cantidadAcompaniantes;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCantidadAcompaniantes() {
        return cantidadAcompaniantes;
    }

    public void setCantidadAcompaniantes(int cantidadAcompaniantes) {
        this.cantidadAcompaniantes = cantidadAcompaniantes;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return 
                "\n " + nombre
                + " " + apellido
                + "\n Cedula: " + cedula
                + "\n Telefono: " + telefono
                + "\n Cantidad de acompañantes: " + cantidadAcompaniantes
                + "\n";

    }

}
