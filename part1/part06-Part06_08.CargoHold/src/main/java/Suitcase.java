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

public class Suitcase {
    private ArrayList<Item> items;
    private int currWeight;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.currWeight = 0;
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (item.getWeight() + this.currWeight <= maxWeight) {
            this.items.add(item);
            this.currWeight += item.getWeight();
        }
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
    }
    
    public int totalWeight() {
        int totWeight = 0;
        for (Item item : this.items) {
            totWeight += item.getWeight();
        }
        return totWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        return this.items.size() + ((this.items.size() > 1) ? " items " : " item ") + "(" + this.totalWeight() + " kg)";
    }
}
