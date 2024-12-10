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
public class Triangulo extends Forma implements CRUD{
    
    @Override
    public void getArea() {
        System.out.println("Area de triangulo: (B*H)/2");
    }

    @Override
    public void getPerimetro() {
        System.out.println("Perimetro de triangulo: Lado * 3");
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
