/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogerulatetallergeneral;

/**
 *
 * @author rogerjoseulaterivera
 */
public class MiniBus {
    
    private int miniBusUnits = 2;
    private int seatsOpen = 15;

    @Override
    public String toString() {
        return "MiniBus{" + "miniBusUnits=" + miniBusUnits + ", seatsOpen=" + seatsOpen + '}';
    }

    public int getMiniBusUnits() {
        return miniBusUnits;
    }

    public void setMiniBusUnits(int miniBusUnits) {
        this.miniBusUnits = miniBusUnits;
    }

    public int getSeatsOpen() {
        return seatsOpen;
    }

    public void setSeatsOpen(int seatsOpen) {
        this.seatsOpen = seatsOpen;
    }
    
}
