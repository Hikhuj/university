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
public class TouristPackageNode {
    
    private TouristPackage data;
    private TouristPackageNode next;
    
    public TouristPackageNode(TouristPackage data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "" + data;
    }

    public TouristPackage getData() {
        return data;
    }

    public void setData(TouristPackage data) {
        this.data = data;
    }

    public TouristPackageNode getNext() {
        return next;
    }

    public void setNext(TouristPackageNode next) {
        this.next = next;
    }
    
}