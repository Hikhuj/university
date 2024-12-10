/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

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
        
        while(opc != 8){
            
            opc = demeNumero("Que desea hacer:\n"
                + "1. Contar\n"
                + "2. Ejemplo 1\n"
                + "3. Ejemplo 2\n"
                + "4. Ejemplo 3\n"
                + "5. Ejemplo 4\n"
                + "6. Ejemplo 5\n"
                + "7. Triangulo\n"
                + "8. Salir\n");
        
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
            }
            
        }
        
        System.exit(1);
        
    }
    
}
