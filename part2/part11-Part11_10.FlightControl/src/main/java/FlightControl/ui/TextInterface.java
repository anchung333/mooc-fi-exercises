/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

/**
 *
 * @author andychung
 */

import java.util.Scanner;
import FlightControl.logic.FlightControl;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;

public class TextInterface {
    
    private FlightControl flightControl;
    private Scanner scanner;
    
    public TextInterface(FlightControl fc, Scanner scanner) {
        this.flightControl = fc;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Airport Asset Control");
        System.out.println("---------------------");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print(">");
            String input = this.scanner.nextLine();
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                this.addAirplane();
            } else if (input.equals("2")) {
                this.addFlight();
            } else {
                System.out.println("Invalid command!");
            }
        }
        this.startFlightControl();
    }
    
    private void addAirplane() {
        System.out.print("Give the airplane id: ");
        String airplaneId = this.scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int airplaneCapacity = Integer.valueOf(this.scanner.nextLine());
        this.flightControl.addAirplane(airplaneId, airplaneCapacity);
    }
    
    private void addFlight() {
        System.out.print("Give the airplane id: ");
        Airplane plane = this.askForAirplane(this.scanner);
        System.out.print("Give the departure airport id: ");
        String departId = this.scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String targetId = this.scanner.nextLine();
        this.flightControl.addFlight(plane, departId, targetId);
    }
    
    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("--------------");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print(">");
            String input = this.scanner.nextLine();
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                this.printAirplanes();
            } else if (input.equals("2")) {
                this.printFlights();
            } else if (input.equals("3")) {
                this.printAirplaneDetails();
            } else {
                System.out.println("Invalid command!");
            }
        }
    }
    
    private void printAirplanes() {
        for (Airplane plane : this.flightControl.getPlanes()) {
            System.out.println(plane);
        }
    }
    
    private void printFlights() {
        for (Flight f : this.flightControl.getFlights()) {
            System.out.println(f);
        }
    }
    
    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        Airplane plane = this.askForAirplane(this.scanner);
        System.out.println(plane);
    }
    
    public Airplane askForAirplane(Scanner scanner) {
        Airplane plane = null;
        while (plane == null) {
            String id = scanner.nextLine();
            plane = this.flightControl.getAirplane(id);
            if (plane == null) {
                System.out.println("Airplane not found! Please try again");
            }
        }
        return plane;
    }
}
