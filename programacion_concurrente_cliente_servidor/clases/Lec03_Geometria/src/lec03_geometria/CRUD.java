/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec03_geometria;

/**
 *
 * @author roger
 */
public interface CRUD {
    
    public void insertar();
    public void actualizar();
    // por default los metodos ya son abstract
    public void eliminar();
    public void listar();
    
}
