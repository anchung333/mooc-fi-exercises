/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */

import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    
    private HashMap<LicensePlate,String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registry.get(licensePlate) == null) {
            this.registry.put(licensePlate, owner);
            return true;
        } else if (this.registry.get(licensePlate).equals(owner)) {
           return false; 
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.registry.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        String removedVal = this.registry.remove(licensePlate);
        if (removedVal == null) {
            return false;
        }
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate plate : this.registry.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<>();
        for (String owner : this.registry.values()) {
            if (!(ownerList.contains(owner))) {
                ownerList.add(owner);
            }
        }
        
        for (String owner : ownerList) {
            System.out.println(owner);
        }
    }
}
