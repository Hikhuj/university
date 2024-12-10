/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk03wk05_listasgenericas;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author roger
 */
public class Colecciones {
    
    // Creamos el metodo de ordenamiento que nos ayudara a ordenar
    // y tambien a evaluar los datos para su impresion
    public void ordenamientoPorNombre(){
        
        // Creamos una Instancia de Interface Comparator para el proposito
        // del ordenamiento
        Comparator c = new ComparadorPorNombre();
        
        // Creamos la coleccion generica de datos a la cual le enviamos el
        // comparador por nombre
        TreeSet listaMascotas = new TreeSet(c);
        
        // Se agregan a la lista los diferentes objetos
        // Format: String Nombre, String tipoAnimal, peso.float, int idAnimal
        listaMascotas.add(new Mascota("A", "Perico 1", 0.25f, 12345)); // Perico #1
        listaMascotas.add(new Mascota("F", "Gato 3", 4.0f, 23451)); // Gato #3
        listaMascotas.add(new Mascota("G", "Tortuga 2", 0.15f, 34512)); // Tortuga #2
        listaMascotas.add(new Mascota("E", "Perro 1", 15.6f, 45123)); // Perro #1
        listaMascotas.add(new Mascota("B", "Perico 2", 0.10f, 51234)); // Perico #2
        listaMascotas.add(new Mascota("H", "Gato 1", 8.5f, 11111)); // Gato #1
        listaMascotas.add(new Mascota("I", "Perico 4", 0.28f, 22222)); // Perico #4
        listaMascotas.add(new Mascota("C", "Perico 3", 0.10f, 33333)); // Perico #3
        listaMascotas.add(new Mascota("J", "Gato 2", 3.5f, 44444)); // Gato #2
        listaMascotas.add(new Mascota("D", "Perro 2", 25.7f, 55555)); // Perro #2
        listaMascotas.add(new Mascota("K", "Tortuga 1", 1.0f, 12121)); // Tortuga #1
        
        // Se obtiene el objeto de listaMascotas y se convierte a arreglo
        // luego se almacena en un objeto de tipo Arreglo
        Object[] mascotasArray = listaMascotas.toArray();
        
        // Se crea un objeto nuevo tipo mascota de nombre "e"
        Mascota e;
        
        // Utilizamos la iteracion for mejorada para recorrer cada linea
        // del objeto
        for(Object o: mascotasArray){
            // Asignar al objeto "e" de tipo Mascota el casteo de la 
            // linea del arreglo "o"
            e = (Mascota)o;
            // Imprimir la linea del objeto
            System.out.printf("Nombre de Mascota: %s \t"
                                + "Tipo de Mascota: %s \t"
                                + "Peso de Mascota: %.2f \t"
                                + "Id de Mascota: %s\n",
                                e.getNombre(),
                                e.getTipoAnimal(),
                                e.getPeso(),
                                e.getIdAnimal());
        }
        
    }
    
}
