/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerulatetallergeneral;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Controller {
    
    // Agregar tipo de lista
    //CustomList studentList = new CustomList();
    Miscelaneos miscelaneos = new Miscelaneos();
    TouristPackageSimpleList touristPackageSS = new TouristPackageSimpleList();
    
    
    
    // Opciones: Menu principal
    public String mainMenuOptions() {
        
        String resultado = "Menu Principal:"
                            + "\n1. Ver los paquetes"
                            + "\n2. Ver las busetas (sin terminar)"
                            + "\n3. Agregar un paquete"
                            + "\n4. Agregar un cliente nuevo (sin terminar)"
                            + "\n5. Salir";
                
        return resultado;
                
    }

    // Menu Principal
    public void mainMenu() {
        
        /*
        Menu Principal:
            1. Ver los paquetes
            2. Ver las busetas (sin terminar)
            3. Agregar un paquete
            4. Agregar un cliente nuevo (sin terminar)
            5. Salir
        */        

        int opc = 0;
        
        do{
            
            try{
                
                opc = Integer.parseInt(JOptionPane.showInputDialog(mainMenuOptions()));
                
                switch(opc) {
                    case 1:
                        seePackage();
                        break;
                    case 2:
                        seeMiniBUs();
                        break;
                    case 3:
                        addPackage();
                        break;
                    case 4:
                        addNewClient();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        miscelaneos.mensajeErrorValorFueraRango();
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                miscelaneos.mensajeErrorValorNuloONoNumerico();                
            
            }
            
        }while(opc != 5);
        
        System.exit(0);
        
    }
    
    public void seePackage(){
        
        JOptionPane.showMessageDialog(null, touristPackageSS.toString() ,"Cantidad de Paquetes", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void seeMiniBUs(){
        
    }
    
    public void addPackage(){
        
        JOptionPane.showMessageDialog(null, touristPackageSS.toString() ,"Cantidad de Paquetes", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Se agregara un paquete turistico" ,"Agrendando Paquete", JOptionPane.INFORMATION_MESSAGE);
        
        int packageNumber = Integer.parseInt(JOptionPane.showInputDialog("Deme el numero de paquete"));
        String packageName = JOptionPane.showInputDialog("Deme el nombre del paquete");
        
        touristPackageSS.addTouristPackage(new TouristPackage(packageNumber, packageName));
        
    }
    
    public void addNewClient(){
        
    }
    
    
}
