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
import java.util.List;
import java.util.Iterator;

public class Employees {
    
    private ArrayList<Person> employees;
    
    public Employees() {
        this.employees = new ArrayList();
    }
    
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        while (iterator.hasNext()) {
            this.employees.add(iterator.next());
        }
    }
    
    public void print() {
        Iterator<Person> toPrint = this.employees.iterator();
        while (toPrint.hasNext()) {
            System.out.println(toPrint.next());
        }
    }
    
    public void print(Education education) {
        if (this.employees.size() == 1) {
            if (this.employees.get(0).getEducation() == education) {
                System.out.println(this.employees.get(0));
            }
            return;
        }
        
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
               System.out.println(iterator.next()); 
            } 
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
               iterator.remove();
            } 
        }
    }
}
