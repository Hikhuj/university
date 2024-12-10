/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerutarea4;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Backend {
    
    public void contar() {

        int a = 10;
        int b, c, d, e;

        b = a++;
        c = ++a;
        d = a--;
        e = --a;

        System.out.println("b vale: " + b);
        System.out.println("c vale: " + c);
        System.out.println("d vale: " + d);
        System.out.println("e vale: " + e);

    }

    public void ejemplo1() {

        int i = 10;
        while (i >= 10) {
            System.out.println("i vale: " + i);
            i--;
        }

    }

    public void ejemplo2() {

        int i = 0;

        while (i < 5) {
            System.out.println("@@@@@@@@@@");
            i++;
        }

    }

    public void ejemplo2Punto2() {

        int i = 0;
        int j = 0;

        while (i < 5) {
            j = 0;
            System.out.println("Linea " + (i + 1));
            while (j < 10) {
                System.out.print("@");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public void ejemplo3() {

        for (int i = 0; i < 5; i++) {
            System.out.println("i vale: " + i);

            for (int j = 5; j > 0; j--) {
                System.out.println("    j vale: " + j);
            }
        }

    }

    public void ejemplo4() {

        int i = 0;
        int j = 0;

        while (i < 5) {
            j = 0;
            System.out.println("Linea " + (i + 1));
            while (j < 10) {
                System.out.print("@");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public void ejemplo4Punto2() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public void ejemplo5() {

        int i = 10;
        
        do {
            System.out.println("i vale " + i);
            i++;
        } while (i <= 5);

    }

    public void ejercicio1(int cantidadDeLineas) {
        
        for (int i = 1; i <= cantidadDeLineas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    public int demeNumero(String msj) {
        String texto = JOptionPane.showInputDialog(msj);
        int numero = Integer.parseInt(texto);
        return numero;
    }
    
    public void menu() {
        
        int opc = 0;

        while(opc != 10){
            
            opc = demeNumero("Que desea hacer:\n"
                + "1. Contar\n"
                + "2. Ejemplo 1\n"
                + "3. Ejemplo 2\n"
                + "4. Ejemplo 3\n"
                + "5. Ejemplo 4\n"
                + "6. Ejemplo 5\n"
                + "7. Triangulo\n"
                + "8. Multiplos de 5\n"
                + "9. Ejercicio, cantidad de personas en grados\n"
                + "10. Salir\n");
        
            switch(opc) {
                case 1:
                    contar();
                    break;
                case 2:
                    ejemplo1();
                    break;
                case 3:
                    ejemplo2();
                    break;
                case 4:
                    ejemplo3();
                    break;
                case 5:
                    ejemplo4();
                    break;
                case 6:
                    ejemplo5();
                    break;
                case 7:
                    ejercicio1(demeNumero("Por favor deme un numero para crear el triangulo"));
                    break;
                case 8:
                    ejercicio2multiplosDe5();
                    break;
                case 9:
                    ejercicio3CantidadPersonas();
                    break;
            }
            
        }
        
        System.exit(1);
        
    }
    
    public void ejercicio2multiplosDe5() {
        
        // Se solicitan dos numeros, el contador de inicio y el limite de conteo
        int numero1 = demeNumero("Ingrese el numero desde donde comenzare a contar");
        int numero2 = demeNumero("Ingrese el numero hasta donde dejare de contar");
        
        // Se crea ua iteracion en donde la variable inicial es igual al contador de inicio
        // y el limite de la iteracion se define por el limite de conteo obtenido
        for(int i = numero1; i <= numero2; i++) {
            // Se evalua cada numero obteniendo el residuo de su division con 5
            // si el residuo es 0, es un multiplo valido
            if((i % 5) == 0) {
                System.out.println("Multiplo: " + i);
            }
        }
    }
    
    
    public void ejercicio3CantidadPersonas() {
        
        // Listado de varias necesarias para procesar information
        int opc = 0;
        int totalPrimaria = 0;
        int totalSecundaria = 0;
        int totalUniversidad = 0;
        int totalPersonas = 0;
        int porcentajePrimaria = 0;
        int porcentajeSecundaria = 0;
        int porcentajeUniversidad = 0;
        int personas = totalPersonas + 1;
        
        // Se genera una iteracion similar al menu, si se elije un numero diferente de 4
        // se elegira una opcion especifica hasta que se ingrese un 4 y salga del menu.
        while(opc != 4) {
            
            // Se obtiene el valor necesario para ejecutar determinada accion
            opc = demeNumero("Grado academico de persona: " + personas + "\n"
                + "1. Primaria\n"
                + "2. Secundaria\n"
                + "3. Universidad\n"
                + "4. Generar total\n");
            
            // Dependiendo de la opcion obtenida, se ira acumulando en una unidad al total de cada
            // categoria con el fin de generar un acumulado al final
            switch(opc) {
                case 1:
                    totalPrimaria = totalPrimaria + 1;
                    break;
                case 2:
                    totalSecundaria = totalSecundaria + 1;
                    break;
                case 3:
                    totalUniversidad = totalUniversidad + 1;
                    break;
            }
            
            // Funciona como contador para mostar por la persona que se va agregando
            personas++;
            
        }
        
        // Se obtiene el total de personas
        totalPersonas = totalPrimaria + totalSecundaria + totalUniversidad;
        
        // Se obtiene el porcentaje de cada categoria sobre el total de las personas entrevistadas
        porcentajePrimaria = (totalPrimaria * 100)/totalPersonas;
        porcentajeSecundaria = (totalSecundaria * 100)/totalPersonas;
        porcentajeUniversidad = (totalUniversidad * 100)/totalPersonas;
        
        // Se despliega el total de los resultados obtenidos
        JOptionPane.showMessageDialog(null, "De las " + totalPersonas + " personas,\n"
                + "un " + porcentajePrimaria + "% son de primaria\n"
                + "un " + porcentajeSecundaria + "% son de secundaria\n"
                + "un " + porcentajeUniversidad + "% son de universidad", "Resultados", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
    
}
