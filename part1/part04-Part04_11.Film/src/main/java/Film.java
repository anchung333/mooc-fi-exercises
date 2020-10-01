/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */
public class Film {
    private String name;
    private int ageRating;
    
    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }
    
    public int ageRating() {
        return this.ageRating;
    }
    
    public String name() {
        return this.name;
    }
}
