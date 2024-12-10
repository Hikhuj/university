/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutaciones;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Backend {
    
    public double factorialcalc(double numero) {
        
        if(numero == 0){
            
            return 1;
            
        }else{
            
            return numero * factorialcalc(numero - 1);
            
        }
        
    }
    
    public double groupsAmount(double permutations, int numberOfElements) {
        
        double result;
        
        result = permutations/numberOfElements;
        
        return result;
        
    }
    
    public void printPermutations(String [] array) {
        
        String [] tempArray = array;
        
        double permutations = factorialcalc(tempArray.length);
        
        double groups = groupsAmount(permutations, tempArray.length);
        
        int counter = 1;
        int amountGroups = 1;
        
        for (int i = 0; i < permutations; i++) {

            for (int j = 0; j < (tempArray.length - 1); j++) {
                System.out.println(amountGroups + ")");
                amountGroups++;
            }
            amountGroups = 1;
            counter++;
            
        }
        
    }
    
}
