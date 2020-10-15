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
public class Place {
    private String Id;
    
    public Place(String ID) {
        this.Id = ID;
    }
    
    @Override
    public String toString() {
        return this.Id;
    }
}
