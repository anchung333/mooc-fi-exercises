/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

/**
 *
 * @author andychung
 */

import java.util.HashMap;
import java.util.Collection;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

public class FlightControl {
    
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    
    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirplane(String airplaneId, int capacity) {
        Airplane plane = new Airplane(airplaneId, capacity);
        this.airplanes.put(airplaneId, plane);
    }
    
    public void addFlight(Airplane plane, String depart, String target) {
        this.places.putIfAbsent(depart, new Place(depart));
        this.places.putIfAbsent(target, new Place(target));
        
        Flight flight = new Flight(plane, this.places.get(depart), this.places.get(target));
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getPlanes() {
        return this.airplanes.values();
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    public Airplane getAirplane(String id) {
        if (this.airplanes.containsKey(id)) {
            return this.airplanes.get(id);
        } else {
            return null;
        }
    }
}
