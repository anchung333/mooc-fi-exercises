
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */
public class Item {
    private String id;
    private String name;
    
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        return this.id.equals(comparedItem.id);
    }
    
    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
}
