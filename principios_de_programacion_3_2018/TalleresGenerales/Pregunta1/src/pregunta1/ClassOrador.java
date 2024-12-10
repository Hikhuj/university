/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta1;

/**
 *
 * @author rogerjoseulaterivera
 */
public class ClassOrador {
    
    private String nombre;
    private String apellido;
    private String segundoNombre;
    private String lugarDeTrabajo;
    private int diaDisponible;
    private String ciudadProcedencia;
    private String paisProcedencia;
    private boolean esProfesorULACIT;
    private String profesion;

    public ClassOrador() {
        
    }
    
    public ClassOrador(String nombre, String apellido, String segundoNombre, String lugarDeTrabajo, int diaDisponible, String ciudadProcedencia, String paisProcedencia, boolean esProfesorULACIT, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.segundoNombre = segundoNombre;
        this.lugarDeTrabajo = lugarDeTrabajo;
        this.diaDisponible = diaDisponible;
        this.ciudadProcedencia = ciudadProcedencia;
        this.paisProcedencia = paisProcedencia;
        this.esProfesorULACIT = esProfesorULACIT;
        this.profesion = profesion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public void setDiaDisponible(int diaDisponible) {
        this.diaDisponible = diaDisponible;
    }

    public void setCiudadProcedencia(String ciudadProcedencia) {
        this.ciudadProcedencia = ciudadProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public void setEsProfesorULACIT(boolean esProfesorULACIT) {
        this.esProfesorULACIT = esProfesorULACIT;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public int getDiaDisponible() {
        return diaDisponible;
    }

    public String getCiudadProcedencia() {
        return ciudadProcedencia;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public boolean isEsProfesorULACIT() {
        return esProfesorULACIT;
    }

    public String getProfesion() {
        return profesion;
    }
 
}
