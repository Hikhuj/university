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
public class Permutaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Backend backend = new Backend();
        
        String [] array = {"a","b","c"};
        
        backend.printPermutations(array);
        
    }
    
}