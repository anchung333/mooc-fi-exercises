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
    private int currAmt;
    
    public Container() {
        this.currAmt = 0;
    }
    
    public int contains() {
        return this.currAmt;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.currAmt = (this.currAmt + amount > 100) ? 100 : this.currAmt + amount;
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.currAmt = (this.currAmt - amount < 0) ? 0 : this.currAmt - amount;
        }
    }
    
    @Override
    public String toString() {
        return this.currAmt + "/100";
    }
}
