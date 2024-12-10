/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta1;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class ClassPublico {
    
    private String nombre;
    private String apellido;
    private String segundoNombre;
    private String ciudadDeProcedencia;
    private int edad;
    private boolean perteneceAComunidadUlacit;
    private int telefono;
    private String correoElectronico;

    public ClassPublico() {
        
    }
    
    public ClassPublico(String nombre, String apellido, String segundoNombre, String ciudadDeProcedencia, int edad, boolean perteneceAComunidadUlacit, int telefono, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.segundoNombre = segundoNombre;
        this.ciudadDeProcedencia = ciudadDeProcedencia;
        this.edad = edad;
        this.perteneceAComunidadUlacit = perteneceAComunidadUlacit;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
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

    public void setCiudadDeProcedencia(String ciudadDeProcedencia) {
        this.ciudadDeProcedencia = ciudadDeProcedencia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPerteneceAComunidadUlacit(boolean perteneceAComunidadUlacit) {
        this.perteneceAComunidadUlacit = perteneceAComunidadUlacit;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

    public String getCiudadDeProcedencia() {
        return ciudadDeProcedencia;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isPerteneceAComunidadUlacit() {
        return perteneceAComunidadUlacit;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public void imprimirInformation() {
        
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Segundo Nombre: " + segundoNombre + "\n" + "Ciudad: " + ciudadDeProcedencia + "\n" + "Edad: " + edad + "\n" + "Pertenece a la comunidad de ULACIT: " + perteneceAComunidadUlacit + "\n" + "Telefono: " + telefono + "\n" + "Correo Electronico: " + correoElectronico, "Despliegue de Informacion", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
