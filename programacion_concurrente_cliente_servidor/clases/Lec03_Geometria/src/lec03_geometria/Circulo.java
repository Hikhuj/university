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
public class Circulo extends Forma implements CRUD{
    
    @Override
    public void getArea() {
        System.out.println("El area de un circulo se obtiene atraves de la siguiente formular: PI * r^2");
    }

    @Override
    public void getPerimetro() {
        System.out.println("Formula de Perimetro de Circlo: ");
    }

    @Override
    public void insertar() {
    }

    @Override
    public void actualizar() {
    }

    @Override
    public void eliminar() {
    }

    @Override
    public void listar() {
    }

}
