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

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.simpleDict = dict;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                this.simpleDict.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String searchWord = scanner.nextLine();
                if (this.simpleDict.translate(searchWord) == null) {
                    System.out.println("Word " + searchWord + " was not found");
                } else {
                    System.out.println("Translation: " + this.simpleDict.translate(searchWord));
                }   
            } else {
              System.out.println("Unknown command");  
            }   
        }
    }
}
