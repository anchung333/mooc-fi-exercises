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

public class Pipe<T> {
    
    private ArrayList<T> queue;
    
    public Pipe() {
        this.queue = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.queue.add(value);
    }
    
    public T takeFromPipe() {
        if (this.isInPipe()) {
            return this.queue.remove(0);
        }
        return null;
    }
    
    public boolean isInPipe() {
        return !(this.queue.isEmpty());
    }
}
