/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */
public class CD implements Packable{
    
    private int pubYear;
    private String artist;
    private String name;
    
    public CD(String artist, String name, int pubYear) {
        this.pubYear = pubYear;
        this.artist = artist;
        this.name = name; 
    }
    
    @Override
    public double weight() {
        return 0.1;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.pubYear + ")";
    }
    
}
