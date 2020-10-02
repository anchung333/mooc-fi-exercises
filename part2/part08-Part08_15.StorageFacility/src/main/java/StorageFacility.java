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

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        if (!this.storage.containsKey(unit)) {
            this.storage.put(unit, new ArrayList<>());
        }
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit)) {
            ArrayList<String> unit = this.storage.get(storageUnit);
            for (String storedItem : unit) {
                if (storedItem.equals(item)) {
                    unit.remove(storedItem);
                    break;
                }
            }
            if (unit.isEmpty()) {
                this.storage.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String storageUnit : this.storage.keySet()) {
            if (!storageUnit.isEmpty()) {
                units.add(storageUnit);
            }
        }
        return units;
    }
    
    
}
