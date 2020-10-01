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

public class Hold {
    private ArrayList<Suitcase> cases;
    private int currWeight;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.cases = new ArrayList();
        this.maxWeight = maxWeight;
        currWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.currWeight <= this.maxWeight) {
            cases.add(suitcase);
            currWeight += suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.cases) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.cases.size() + ((this.cases.size() > 1) ? " suitcases " : " suitcase ") + "(" + this.currWeight + " kg)";
    }
}
