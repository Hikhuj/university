/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk03wk05_listasgenericas;

/**
 *
 * @author roger
 */
public class Mascota {
    
    private String nombre;
    private String tipoAnimal;
    private float peso;
    private int idAnimal;

    public Mascota(String nombre, String tipoAnimal, float peso, int idAnimal) {
        // Validacion
        if( nombre == null ||
            tipoAnimal == null ||
            peso == 0.0 ||
            idAnimal == 0){
            throw new IllegalArgumentException("Le faltan datos.");
        }
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.peso = peso;
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

}
