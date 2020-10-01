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

public class UserInterface {
    private Scanner scanner;
    private TodoList toDo;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.toDo = list;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            this.processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            this.add();
        } else if (command.equals("remove")) {
            this.remove();
        } else if (command.equals("list")) {
            this.list();
        }
    }
    
    private void add() {
        System.out.println("To add: ");
        String newTask = scanner.nextLine();
        this.toDo.add(newTask);
    }
    
    private void remove() {
        System.out.println("Which one is removed? ");
        int idx = Integer.valueOf(scanner.nextLine());
        this.toDo.remove(idx);
    }
    
    private void list() {
        this.toDo.print();
    }
}
