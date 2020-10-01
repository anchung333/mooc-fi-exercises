/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Birds {
    private ArrayList<Bird> birds;
    Scanner scanner;
    
    public Birds(Scanner scan) {
        this.birds = new ArrayList<>();
        this.scanner = scan;
    }
    
    public void addBird() {
        System.out.println("Name: ");
        String birdName = this.scanner.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = this.scanner.nextLine();
        Bird newBird = new Bird(birdName, latinName);
        this.birds.add(newBird);
    }
    
    public String addObservation() {
        System.out.println("Bird? ");
        String birdName = this.scanner.nextLine();
        for (Bird bird : this.birds) {
            System.out.println(bird.getName());
            if (bird.getName().equals(birdName)) {
                bird.addObservation();
                return "";
            }
        }
        return "Not a bird!";
    }
    
    public void listBirds() {
        for (Bird bird : this.birds) {
            System.out.println(bird.toString());
        }
    }
    
    public void listOne() {
        System.out.println("Bird? ");
        String birdName = this.scanner.nextLine();
        for (Bird bird : this.birds) {
            if (bird.getName().equals(birdName)) {
                System.out.println(bird.toString());
            }
        }
    }
}
