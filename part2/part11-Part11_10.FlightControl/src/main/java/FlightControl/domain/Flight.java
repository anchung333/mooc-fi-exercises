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
public class Flight {
    public Airplane airplane;
    public Place depart;
    public Place target;
    
    public Flight(Airplane plane, Place dptAirport, Place trgtAirport) {
        this.airplane = plane;
        this.depart = dptAirport;
        this.target = trgtAirport;
    }
    
    public Airplane getPlane() {
        return this.airplane;
    }
    
    public Place getDeparture() {
        return this.depart;
    }
    
    public Place getTarget() {
        return this.target;
    }
    
    @Override 
    public String toString() {
        return this.airplane.toString() + " (" + this.depart + "-" + this.target + ")";
    }
}
