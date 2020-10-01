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

public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList() {
        this.tasks = new ArrayList<>();
    }
    
    public void add(String task) {
        tasks.add(task);
    }
    
    public void print() {
        int index = 0;
        while (index < this.tasks.size()) {
            System.out.println((index + 1) + ": " + this.tasks.get(index));
            index++;
        }
    }
    
    public void remove(int remove) {
        this.tasks.remove(remove - 1);
    }
}
