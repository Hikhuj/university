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
public class Client {
    
    private String name;
    private String lastName;
    private int phoneNumber;
    private int touristPackage;
    // Revisar esta variable
    private static final int touristPackageLimit = 5;

    @Override
    public String toString() {
        return "Client: " + "name=" + name + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", touristPackage=" + touristPackage;
    }

    public Client(String name, String lastName, int phoneNumber, int touristPackage) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.touristPackage = touristPackage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTouristPackage() {
        return touristPackage;
    }

    public void setTouristPackage(int touristPackage) {
        this.touristPackage = touristPackage;
    }

    
    
}