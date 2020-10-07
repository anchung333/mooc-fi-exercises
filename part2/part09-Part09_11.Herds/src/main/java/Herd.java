/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */

import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable{
    
    private List<Movable> movables;
    
    public Herd() {
        this.movables = new ArrayList();
    }
    
    @Override
    public String toString() {
        String print = "";
        for (Movable org : this.movables) {
            print += org.toString() + "\n";
        }
        return print;
    }
    
    public void addToHerd(Movable movable) {
        this.movables.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable m : this.movables) {
            m.move(dx, dy);
        }
    }
}
