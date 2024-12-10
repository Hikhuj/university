/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallergeneral01;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Pregunta5GanadorEleccion {
    
    private final int cantidadCandidatos = 3;
    private int cantidadVotos;
    private int votosCandidato1 = 0;
    private int votosCandidato2 = 0;
    private int votosCandidato3 = 0;
    private int voto;
    
    int i = 0;
    
    public void preguntarVotos() {
        
        cantidadVotos = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al contador de votos, ingrese la cantida de votos: "));
        
        while(i < this.cantidadVotos){
            voto = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite a para quien es el voto\n1 para candidato Abel,\n2 para candidato Oscar, o\n3 para candidato Rafael"));
            
            switch(voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    System.out.println("Voto nulo, no existen mas candidatos o se equivoco.");
            }
            
            i++;
        }
    }
    
    public void getResultados() {
        
        JOptionPane.showMessageDialog(null, "Total de votos: " + cantidadVotos + "\nPara candidato Abel: " + votosCandidato1 + "\nPara candidato Oscar: " + votosCandidato2 + "\nPara candidato Rafael: " + votosCandidato3, "Total a Pagar", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void operacion() {
        preguntarVotos();
        getResultados();
    }
    
    

}
