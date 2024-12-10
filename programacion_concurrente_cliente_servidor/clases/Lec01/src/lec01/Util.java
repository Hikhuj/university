/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec01;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Util {
    
    public static int devolverNumero(int max, int min){
        return (int)(Math.random() * ((max-min) + 1) + min);
    }
    
}
