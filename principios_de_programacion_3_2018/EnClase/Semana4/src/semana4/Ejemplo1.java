/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

import javax.swing.*;

/**
 *
 * @author ulacit
 */
public class Ejemplo1 {
    
    public void ejemplo1(int edad) { // 5,20,40
        if(edad >= 18) {
            System.out.println("Puede Volar");
        }
    }
    
    public void ejemplo2(int edad) { // 5,20,40
        if(edad >= 18) {
            System.out.println("Puede Volar");
            if(edad > 30){
                System.out.println("Puede ser candidato a presidente");
            }
        }
    }
    
    public void ejemplo3(int edad) { // 5,20,40
        if(edad >= 18) {
            System.out.println("Puede Volar");
        }else{
            System.out.println("Puede pedir un helado");
        }
    }
    
    public void ejemplo4(int mes) {
        
        String nombreMeses [] = {"Enero","Febrero","Marzo",
                                "Abril","Mayo", "Junio",
                                "Julio","Agosto", "Septiembre",
                                "Octubre", "Noviembre","Diciembre"};
        
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("Hay 31 dias en el mes " + nombreMeses[mes]);
        }else{
            if(mes == 2) {
                System.out.println("Normalmente seran 28 dias en el mes " + nombreMeses[mes]);
            }else{
                if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    System.out.println("Hay 30 dias en el mes " + nombreMeses[mes]);
                }else{
                    System.out.println("Mes invalido");
                }
            }
        }
    }
    
    public void ejemplo5(int d) {
        String nombreDias [] = {"Domingo", "Lunes","Martes","Miercoles",
                                "Jueves","Viernes", "Sabado"};
        
        if(d == 1) {
            System.out.println("Hoy es " + nombreDias[d -1]);
        }else{
            if(d == 2) {
                System.out.println("Hoy es " + nombreDias[d -1]);
            }else{
                if(d == 3) {
                    System.out.println("Hoy es " + nombreDias[d -1]);
                }else{
                    if(d == 4) {
                        System.out.println("Hoy es " + nombreDias[d -1]);
                    }else{
                        if(d == 5) {
                            System.out.println("Hoy es " + nombreDias[d -1]);
                        }else{
                            if(d == 6) {
                                System.out.println("Hoy es " + nombreDias[d -1]);
                            }else{
                                if(d == 7) {
                                    System.out.println("Hoy es " + nombreDias[d -1]);
                                }else{
                                    System.out.println("El dia ingresado es invalido");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void ejemplo6(int opcion) {
        switch(opcion) {
            case 1:
                System.out.println("Operadora es Ingles");
                break;
            case 2:
                System.out.println("CIT");
                break;
            case 3:
                System.out.println("Registro");
                break;
            default:
                // El tener un caso Default nos permite dar una respuesta
                // generica para el objeto que use la funcion.
                System.out.println("No es valido");
                break;
        }
    }
    
    public void ejemplo7(int d) {
        switch(d) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                // El tener un caso Default nos permite dar una respuesta
                // generica para el objeto que use la funcion.
                System.out.println("Dia no es valido");
                break;
        }
    }

    public void menu() {
        int opc = demeNumero("1. Dice si vota\n2. if aninado, comprobar si es candidato\n3. Ejemplo 3: Si puede pedir un helado\n4. Ejemplo 4: Dar un mes en numero\n5. Ejemplo 5: Dar un dia en numero\n6. Ejemplo 6: Dar una opcion de extension\n7. Ejemplo 7: dia con Switch");
        int edad, mes, dia, opcion;
        switch(opc) {
            case 1:
                edad = demeNumero("Deme su edad");
                ejemplo1(edad);
                break;
            case 2:
                edad = demeNumero("Deme su edad");
                ejemplo2(edad);
                break;
            case 3:
                edad = demeNumero("Deme su edad");
                ejemplo3(edad);
                break;
            case 4:
                mes = demeNumero("Deme un mes en numero");
                ejemplo4(mes);
                break;
            case 5:
                dia = demeNumero("Deme un dia en numero");
                ejemplo5(dia);
                break;
            case 6:
                opcion = demeNumero("Deme una opcion de extension");
                ejemplo6(opcion);
                break;
            case 7:
                dia = demeNumero("Deme un dia en numero: para Switch");
                ejemplo7(dia);
                break;
            default:
            
        }
    
    }
    
    public int demeNumero(String msj) {
        String texto = JOptionPane.showInputDialog(msj);
        int numero = Integer.parseInt(texto);
        return numero;
    }



}