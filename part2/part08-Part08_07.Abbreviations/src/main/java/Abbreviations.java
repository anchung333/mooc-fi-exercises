/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String,String> dict;
    
    public Abbreviations() {
        this.dict = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        String name = sanitize(abbreviation);
        this.dict.put(name, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = this.sanitize(abbreviation);
        return this.dict.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        abbreviation = this.sanitize(abbreviation);
        return this.dict.get(abbreviation);
    }
    
    private String sanitize(String term) {
        String sanitized = term.toLowerCase().trim();
        return sanitized;
    }
}
