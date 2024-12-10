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
public class TouristPackage {

    private int packageNumber;
    private String packageDestination;
    private int amountPackageSold;
    private int packageSoldLimit = 15;
    private int packageLimit = 5;

    @Override
    public String toString() {
        return "\n # = " + packageNumber + ", Destino de paquete = " + packageDestination + ", Cantida de paquetes vendidos = " + amountPackageSold;
    }

    public TouristPackage(int packageNumber, String packageDestination) {
        this.packageNumber = packageNumber;
        this.packageDestination = packageDestination;
        this.amountPackageSold = 0;
    }

    public int getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }

    public String getPackageDestination() {
        return packageDestination;
    }

    public void setPackageDestination(String packageDestination) {
        this.packageDestination = packageDestination;
    }

    public int getAmountPackageSold() {
        return amountPackageSold;
    }

    public void setAmountPackageSold(int amountPackageSold) {
        this.amountPackageSold = amountPackageSold;
    }

    public int getPackageSoldLimit() {
        return packageSoldLimit;
    }

    public void setPackageSoldLimit(int packageSoldLimit) {
        this.packageSoldLimit = packageSoldLimit;
    }

    public int getPackageLimit() {
        return packageLimit;
    }

    public void setPackageLimit(int packageLimit) {
        this.packageLimit = packageLimit;
    }

    
}
