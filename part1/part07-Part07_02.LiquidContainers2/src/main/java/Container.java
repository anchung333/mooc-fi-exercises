/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */
public class Container {
    
    private int currAmount;
    
    public Container() {
        this.currAmount = 0;
    }
    
    public int contains() {
        return this.currAmount;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.currAmount = (this.currAmount + amount > 100) ? 100 : (this.currAmount + amount);
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.currAmount = (this.currAmount - amount < 0) ? 0 : (this.currAmount - amount);
    }
    
    public String toString() {
        return this.currAmount + "/100";
    }
    
}
