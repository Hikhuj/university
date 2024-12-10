package clases;

public class Paquete {

    private String lugarViaje, actividades;
    private int cantidadAsientosDisponibles, duracionVuelo;
    // Cantidad de asientos disponibles
    private static int asientosDisponibles = 15;

    public Paquete(String lugarViaje, String actividades, int duracionVuelo) {
        this.lugarViaje = lugarViaje;
        this.actividades = actividades;
        this.cantidadAsientosDisponibles = asientosDisponibles;
        this.duracionVuelo = duracionVuelo;
    }

    public String getLugarViaje() {
        return lugarViaje;
    }

    public void setLugarViaje(String lugarViaje) {
        this.lugarViaje = lugarViaje;
    }

    public int getCantidadAsientosDisponibles() {
        return cantidadAsientosDisponibles;
    }

    public void setCantidadAsientosDisponibles(int cantidadAsientosDisponibles) {
        this.cantidadAsientosDisponibles = cantidadAsientosDisponibles;
    }

    public int getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(int duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    @Override
    public String toString() {
        return "\n Información Paquete:"
                + "\n Destino: " + lugarViaje
                + "\n Duracion del vuelo: " + duracionVuelo + " horas"
                + "\n Campos disponibles: " + cantidadAsientosDisponibles
                + "\n Actividades: " + actividades
                + "\n";
    }

}
