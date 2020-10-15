/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author andychung
 */

import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;

public class SaveableDictionary {
    
    private HashMap<String,String> finToEng;
    private HashMap<String,String> engToFin;
    private String file;
    
    public SaveableDictionary() {
        this.finToEng = new HashMap<>();
        this.engToFin = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.finToEng = new HashMap<>();
        this.engToFin = new HashMap<>();
        this.file = file;
    }
    
    public String translate(String word) {
        if (this.finToEng.keySet().contains(word)) {
            return this.finToEng.get(word);
        } else if (this.engToFin.keySet().contains(word)) {
            return this.engToFin.get(word);
        }
        return null;
    }
    
    public void add(String words, String translation) {
        this.finToEng.putIfAbsent(words, translation);
        this.engToFin.putIfAbsent(translation, words);
    }
    
    public void delete(String word) {
        String trans;
        if (this.finToEng.keySet().contains(word)) {
            trans = this.finToEng.get(word);
            this.finToEng.remove(word);
            this.engToFin.remove(trans);
        } else if (this.engToFin.keySet().contains(word)) {
            trans = this.engToFin.get(word);
            this.engToFin.remove(word);
            this.finToEng.remove(trans);
        }
    }
    
    public boolean load() {
        try (Scanner fileScan = new Scanner(Paths.get(this.file))) {
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String key : this.finToEng.keySet()) {
                String row = key + ":" + this.finToEng.get(key);
                writer.println(row);
            }
            writer.close();
            return true;
        } catch(Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return false;
        }
    }
    
}
