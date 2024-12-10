/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9_ejerciciovectores;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Persona {
    
    /*
        Atributos
    */
    
    private String nombre;
    private String apellido;
    private int edad;
    private long cedula;
    private String correo;
    
    
    /*
        Metodos
    */
    
    public Persona() {
        
    }
    
    public Persona(String [] array) {
        
        this.nombre = array[0];
        this.apellido = array[1];
        this.edad = Integer.parseInt(array[2]);
        this.cedula = Long.parseLong(array[3]);
        this.correo = array[4];
        
    }

    public String [] getFullInfo() {
        
        String [] array = null;
        
        array[0] = nombre;
        array[1] = apellido;
        array[2] = Integer.toString(edad);
        array[3] = Long.toString(cedula);
        array[4] = correo;
        
        return array;
        
    }
    
    public void imprimir() {
        
        String [] array = getFullInfo();
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nombre: " + array[0] + "| Edad: " + array[1] + " | Cedula: " + cedula + " | Correo: " + correo);
        }
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public long getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }
    
}
