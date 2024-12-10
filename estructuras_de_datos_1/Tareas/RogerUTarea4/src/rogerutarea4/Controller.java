/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea4;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Controller {
    
    CustomList studentList = new CustomList();
    Miscelaneos miscelaneos = new Miscelaneos();
    
    /*
        For testing
        Auto population
    */
    
    public void prePopulation(){
        
        studentList.insert(new Student(11422305, "Mike", "Oscar", "Ontario", 25, 'M', 85, "Estructuras de Datos"));
        studentList.insert(new Student(11422305, "Laura", "Maria", "Fernandez", 33, 'M', 76, "Estructuras de Datos"));
        studentList.insert(new Student(11122323, "Nora", "", "Kinsey", 25, 'F', 23, "Estructuras de Datos"));
        studentList.insert(new Student(11224355, "Lucioys", "", "Bulkins", 25, 'M', 90, "Estructuras de Datos"));
        studentList.insert(new Student(14428548, "Oscar", "", "Sierra", 25, 'M', 70, "Estructuras de Datos"));
        studentList.insert(new Student(11452299, "Nora", "", "Sullivan", 25, 'F', 85, "Estructuras de Datos"));
        
        printList();
        
    }
    
    public void addStudent(){
        
        int id, age, grade;
        String firstName, lastName, middleName, universityCourseName, tmpGender;
        char gender;
        boolean exit = false;
        
        System.out.println("Ingresando estudiante...");
        
        while(exit != true){
            
            id = Integer.parseInt(JOptionPane.showInputDialog("Digite ID (cedula de identidad)"));

            if(studentList.existById(id) == true){
                miscelaneos.errorMessageIdAlreadyExist();
                addStudent();
            }else{
                firstName = JOptionPane.showInputDialog("Digite el nombre:");
                middleName = JOptionPane.showInputDialog("Digite el segundo nombre:");
                lastName = JOptionPane.showInputDialog("Digite el apellido:");
                age = ageChecker();
                gender = genderCheck();
                grade = gradeChecker();
                universityCourseName = JOptionPane.showInputDialog("Nombre de curso");
                
                studentList.insert(new Student(id,firstName,middleName,lastName,age,gender,grade,universityCourseName));
                
                exit = true;
            }
            
        }

        printList();
        
    }
    
    public int ageChecker() {
        
        int result = 0;
        boolean control = false;
        
        while(control != true){
            
            try{
                
                result = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
                
                if(result >= 0 && result <= 150){
                    control = true;
                }else{
                    miscelaneos.mensajeErrorValorFueraRango();
                    ageChecker();
                }
                
            }catch(Exception e){
                miscelaneos.mensajeErrorValorNuloONoNumerico();
                ageChecker();
            }
            
        }
        
        return result;
        
    }
    
    public char genderCheck() {
        
        char result = ' ';
        String var = "";
        
        boolean control = false;
        
        while(control != true){
            
            var = JOptionPane.showInputDialog("Digite el genero en una letra \"M\" para masculino o \"F\" para femenino");
            
            if(var.length() > 0 && var.length() <= 1){
                var = var.toUpperCase();
                result = var.charAt(0);
                if((result == 'M' || result == 'm') || (result == 'F' || result == 'f')){
                    control = true;
                }else{
                    miscelaneos.mensajeErrorValorNuloONoNumerico();
                    genderCheck();
                }
            }else{
                miscelaneos.mensajeErrorValorFueraRango();
                genderCheck();
            }
            
        }
        
        return result;
        
    }
    
    public int gradeChecker() {
        
        int result = 0;
        String var = "";
        boolean control = false;
        
        while(control != true){
            
            try{
                
                result = Integer.parseInt(JOptionPane.showInputDialog("Deme la nota"));
                
                if(result >= 0 && result <= 100){
                    control = true;
                }else{
                    miscelaneos.mensajeErrorValorFueraRango();
                    gradeChecker();
                }
                
            }catch(Exception e){
                miscelaneos.mensajeErrorValorNuloONoNumerico();
                gradeChecker();
            }
            
        }
        
        return result;
        
    }
    
    public void printList(){
        
        System.out.println(studentList.toString());
        
    }
    
    public void modifyStudent(){
        
        studentList.modifyStudentGrade();
        printList();
        
    }
    
    public void eliminateStudentById(){
    
        int id;
        boolean result;
           
        try{

            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID de estudiante que se eliminara:"));
            result = studentList.deleteById(id);

            if(result == true){
                JOptionPane.showMessageDialog(null, "El alumno se borro con exito", "Borrado", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "El alumno no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }catch(Exception e){
            miscelaneos.mensajeErrorValorNuloONoNumerico();
        }

    }
    
    public void calculateAverage(){
        
        double result = studentList.averageGrades();
        double women = studentList.averageWomenNumber();
        double men = studentList.averageMenNumber();
        
        JOptionPane.showMessageDialog(null, "Promedio de notas: " + result + "\nPromedio de mujeres: " + women + "%\nPromedio de hombres: " + men + "%", "Information", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void getAverageGradesUpAndDownWomen(){
        
        String result = studentList.notesHigherLowerWomen();
        
        JOptionPane.showMessageDialog(null, result, "Mujeres: Nota alta y baja", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void getAverageGradesUpAndDownMen(){
        
        String result = studentList.notesHigherLowerMen();
        
        JOptionPane.showMessageDialog(null, result, "Hombres: Nota alta y baja", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    // Opciones: Menu principal
    public String opcionesMenuPrincipal() {
        
        String resultado = "Menu Principal:"
                            + "\n1. Agregar alumno nuevo"
                            + "\n2. Buscar alumno por nombre"
                            + "\n3. Eliminar alumno por id"
                            + "\n4. Promedio de notas, mujeres y hombres"
                            + "\n5. Nota mas alta y baja (Mujeres)"
                            + "\n6. Nota mas alta y baja (Hombres)"
                            + "\n7. Salir";
                
        return resultado;
                
    }

    // Menu Principal
    public void menuPrincipal() {
        
        /*
            1. Agregar alumno nuevo
            2. Buscar alumno por nombre
            3. Eliminar alumno por id
            4. Calcular promedio de calificaciones
            5. Mostrar nota mas alta (Mujeres)
            6. Mostrar nota mas alta (Hombres)
            7. Salir
        */
        
        int opc = 0;
        
        do{
            
            try{
                
                opc = Integer.parseInt(JOptionPane.showInputDialog(opcionesMenuPrincipal()));
                
                switch(opc) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        modifyStudent();
                        break;
                    case 3:
                        eliminateStudentById();
                        break;
                    case 4:
                        calculateAverage();
                        break;
                    case 5:
                        getAverageGradesUpAndDownWomen();
                        break;
                    case 6:
                        getAverageGradesUpAndDownMen();
                        break;
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        miscelaneos.mensajeErrorValorFueraRango();
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                miscelaneos.mensajeErrorValorNuloONoNumerico();                
            
            }
            
        }while(opc != 7);
        
        System.exit(0);
        
    }
    
    
}
