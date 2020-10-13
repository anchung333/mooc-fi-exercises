/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */
public class Book {
    private String name;
    private int ageRecommendation;
    
    public Book(String name, int age) {
        this.name = name;
        this.ageRecommendation = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAgeRec() {
        return this.ageRecommendation;
    }
    
    @Override
    public String toString() {
        return this.name + " (recommended for " + this.ageRecommendation + " year-olds or older)";
    }
}
