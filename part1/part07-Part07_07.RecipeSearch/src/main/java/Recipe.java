/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */

import java.util.ArrayList;

public class Recipe {
    private ArrayList<String> recipe;
    
    public Recipe() {
        this.recipe = new ArrayList<>();
    }
    
    public void addPart(String line) {
        this.recipe.add(line);
    }
    
    public String getName() {
        if (!this.recipe.get(0).isEmpty()) {
            return this.recipe.get(0);
        } else {
            return "No name for this recipe";
        }
    }
    
    public int getCookingTime() {
        if (!this.recipe.get(1).isEmpty()) {
            return Integer.valueOf(this.recipe.get(1));
        } else {
            return -1;
        }
    }
    
    public ArrayList<String> getIngredients() {
        ArrayList<String> ingredients = new ArrayList<>();
        for (int i = 2; i < this.recipe.size(); i++) {
            ingredients.add(this.recipe.get(i));
        }
        return ingredients;
    }
}
