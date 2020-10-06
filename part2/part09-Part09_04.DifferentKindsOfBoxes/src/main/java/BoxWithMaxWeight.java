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

public class BoxWithMaxWeight extends Box{
    
    private final int maxWeight;
    private int currWeight;
    private ArrayList<Item> storage;
    
    public BoxWithMaxWeight(int capacity) {
        super();
        this.maxWeight = capacity;
        this.currWeight = 0;
        this.storage = new ArrayList();
    }
    
    @Override
    public void add(Item item) {
        if (item.getWeight() > this.maxWeight || item.getWeight() + this.currWeight > this.maxWeight) {
            return;
        }
        this.storage.add(item);
        this.currWeight += item.getWeight();
    }
    
    @Override 
    public boolean isInBox(Item item) {
        for (Item stored : this.storage) {
            if (stored.equals(item)) { 
                return true;
            }
        }
        return false;
    }

}
