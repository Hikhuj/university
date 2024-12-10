/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_04_lecturaescrituratextoplano;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author roger
 */
public class OperacionArchivo {

    // Crear el archivo en el disco o en alguna locacion en el sistema,
    // el cual va a recibir de parametro la lista de estudiantes.
    public static void crearArchivo(ArrayList lista){
        FileWriter flwriter = null;
    
        try{
            // crea el flujo para escribir en el archivo
            // o bien crea el archivo
            flwriter = new FileWriter("src/tarea_04_lecturaescrituratextoplano/estudiantes.txt");
            // crea un buffer o flujo intermedio antes de escribir directamente en el archivo
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            
            for(Estudiante estudiante : lista){
                // escribe los datos en el archivo
                bfwriter.write(estudiante.getCedula() + ", "
                             + estudiante.getNombres() + ", "
                             + estudiante.getApellidos() + ", "
                             + estudiante.getTelefono() + ", "
                             + estudiante.getDireccion() + "\n");
            }
            // cierra el buffer intermedio
            bfwriter.close();
            System.out.println("Archivo creado satisfactoriamente...");
            
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(flwriter != null){
                try{
                    // cierra el flujo principal
                    flwriter.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    // Crear el archivo en disco, retorna la lista de estudiantes
    public static ArrayList leerArchivo(){
        
        // crea el flujo para leer desde e larchivo
        File file = new File("src/tarea_04_lecturaescrituratextoplano/estudiantes.txt");
        ArrayList listaEstudiantes = new ArrayList<>();
        Scanner scanner;
        
        try{
            // se le pasa el flujo al objeto scanner
            scanner = new Scanner(file);
            
            while(scanner.hasNextLine()){
                // vamos a leer linea por linea por medio del objeto scanner.hasNextLine
                // nos permite ir "escaneando" una linea, luego, obtener la siguiente
                // y asi sucesivamente
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                // se usa una expresion regular que valida que antes o despues de una como (,) exista cualquier cosa
                // parte la cadena recibida cada vez que encuentre una coma
                delimitar.useDelimiter("\\s*,\\s*");
                // creamos un objeto de tipo Estudiante
                Estudiante e = new Estudiante();
                // agregamos a cada atributo al objeto Estudiante
                e.setCedula(delimitar.next());
                e.setNombres(delimitar.next());
                e.setApellidos(delimitar.next());
                e.setTelefono(delimitar.next());
                e.setDireccion(delimitar.next());
                // almacenamos todo el objeto "e" en la estructura ArrayList
                listaEstudiantes.add(e);
            }
            // se cierra el objeto scanner
            scanner.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        
        // retornar la lista que se crea
        return listaEstudiantes;
        
    }
    
    // Anadir mas estudiantes al archivo
    public static void aniadirArchivo(ArrayList lista){
        
        FileWriter flwriter = null;
        
        try{
            // ademas de la ruta del archivo recibe un parametro de tipo boolean,
            // que le indican  que se va aniadir mas registros
            flwriter = new FileWriter("src/tarea_04_lecturaescrituratextoplano/estudiantes.txt", true);
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for(Estudiante estudiante : lista){
                // escrobe los datos en el archivo
                bfwriter.write(estudiante.getCedula() + ", "
                             + estudiante.getNombres() + ", "
                             + estudiante.getApellidos() + ", "
                             + estudiante.getTelefono() + ", "
                             + estudiante.getDireccion() + "\n");
            }
            bfwriter.close();
            System.out.println("Archivo modificado satisfactoriamente...");
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if(flwriter != null){
                try{
                    flwriter.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        
    }
    
}
