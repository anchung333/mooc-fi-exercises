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

public class MisplacingBox extends Box{
    
    private ArrayList<Item> storage;
    
    public MisplacingBox() {
        this.storage = new ArrayList();
    }
    
    @Override
    public void add(Item item) {
        this.storage.add(item);
    }
    
    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
