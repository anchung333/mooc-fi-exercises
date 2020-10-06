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

public class OneItemBox extends Box{
    
    private ArrayList<Item> storage;
    
    public OneItemBox() {
        this.storage = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (this.storage.isEmpty()) {
            this.storage.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        if (this.storage.isEmpty()) {
            return false;
        }
        if (this.storage.get(0).equals(item)) {
            return true;
        }
        return false;
    }
}
