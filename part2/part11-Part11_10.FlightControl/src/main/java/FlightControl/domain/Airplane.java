/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author andychung
 */
public class Airplane {
    private final String Id;
    private final int capacity;
    
    public Airplane(String id, int capacity) {
        this.Id = id;
        this.capacity = capacity;
    }
    
    public String getId() {
        return this.Id;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    @Override
    public String toString() {
        return this.getId() + " (" + this.getCapacity() + " capacity)";
    }
}
