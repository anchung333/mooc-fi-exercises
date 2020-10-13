/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */
public class Person {
    
    private String name;
    private Education degree;
    
    public Person(String name, Education edu) {
        this.name = name;
        this.degree = edu;
    }
    
    public Education getEducation() {
        return this.degree;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.degree;
    }
     
    
}
