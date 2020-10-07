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

public class Box implements Packable{
    
    private ArrayList<Packable> items;
    private final double maxWeight;
    
    public Box(double maxCapacity) {
        this.items = new ArrayList();
        this.maxWeight = maxCapacity;
    }
    
    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    @Override
    public double weight() {
        double weight = 0.0;
        for (Packable item : this.items) {
           weight += item.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
