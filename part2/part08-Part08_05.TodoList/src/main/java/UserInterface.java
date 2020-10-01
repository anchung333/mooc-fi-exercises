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
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
          System.out.println("Command: ");  
          String command = this.scanner.nextLine();
          if (command.equals("stop")) {
              break;
          }
          
          if (command.equals("add")) {
              System.out.println("To add: ");
              String task = this.scanner.nextLine();
              todoList.add(task);
          } else if (command.equals("list")) {
              todoList.print();
          } else if (command.equals("remove")) {
              System.out.println("Which one is removed? ");
              int idx = Integer.valueOf(this.scanner.nextLine());
              todoList.remove(idx);
          }
        }
    }
    
}
