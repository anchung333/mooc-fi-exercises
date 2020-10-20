/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */

public class Hideout<T> {
    private T store;
    
    public void Hideout() {
        this.store = null;
    }
    
    public void putIntoHideout(T toHide) {
        this.store = toHide;
    }
    
    public T takeFromHideout() {
        if (this.store == null) {
            return null;
        }
        T temp = this.store;
        this.store = null;
        return temp;
    }
    
    public boolean isInHideout() {
        return !(this.store == null);
    }
}
