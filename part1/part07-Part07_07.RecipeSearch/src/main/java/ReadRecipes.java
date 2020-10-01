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
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadRecipes {
    private String fileName;
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    
    public ReadRecipes(String file, Scanner scanner) {
        this.fileName = file;
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }
    
    public void readFile() {
        this.readAllRecipes();
        while (true) {
            System.out.println("Enter command: ");
            String command = "";
            if (this.scanner.hasNextLine()) {
                command = this.scanner.nextLine();
            }
            if (command.equals("stop") || command.equals("")) {
                break;
            }
            if (command.equals("list")) {
                this.listRecipes(this.recipes);
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String name = this.scanner.nextLine();
                this.listRecipes(this.findByName(name));
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int cookingTime = Integer.valueOf(this.scanner.nextLine());
                this.listRecipes(this.findByCookingTime(cookingTime));
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = this.scanner.nextLine();
                this.listRecipes(this.findByIngredient(ingredient));
            }
        }
        
    }
    
    public void readAllRecipes() {
        try (Scanner fileScan = new Scanner(Paths.get(this.fileName))) {
            Recipe recipe = new Recipe();
            while (fileScan.hasNextLine()) {
                //do stuff
                String recipePart = fileScan.nextLine();
                if (recipePart.equals("") || !(fileScan.hasNextLine())) {
                    this.recipes.add(recipe);
                    recipe = new Recipe();
                } else {
                    recipe.addPart(recipePart);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void listRecipes(ArrayList<Recipe> recipeList) {
        //do something
        System.out.println("Recipes: ");
        for (Recipe recipe : recipeList) {
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
        }
    }
    
    public ArrayList<Recipe> findByName(String name) {
        ArrayList<Recipe> matches = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)) {
                matches.add(recipe);
            }
        }
        return matches;
    }
    
    public ArrayList<Recipe> findByCookingTime(int cookingTime) {
        ArrayList<Recipe> matches = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                matches.add(recipe);
            }
        }
        return matches;
    }
    
    public ArrayList<Recipe> findByIngredient(String ingredient) {
        ArrayList<Recipe> matches = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            ArrayList<String> ingredients = recipe.getIngredients();
            for (String ingrdt : ingredients) {
                if (ingrdt.equals(ingredient)) {
                    matches.add(recipe);
                }
            }
        }
        return matches;
    }
}
