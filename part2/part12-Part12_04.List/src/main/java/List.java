/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */
public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;
    
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }
    
    public void add(Type value) {
        if (this.firstFreeIndex == this.values.length) {
            this.grow();
        }
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }
    
    public void grow() {
        int newSize = this.values.length + (this.values.length)/2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }
    
    public void remove(Type value) {
        if (this.indexOf(value) < 0) {
            return;
        }
        this.shift(this.indexOf(value));
        this.firstFreeIndex--;
    }
    
    public void shift(int startIndex) {
        for (int i = startIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i+1];
        }
    }
    
    public int indexOf(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean contains(Type value) {
        return this.indexOf(value) > -1;
    }
    
    public int size() {
        return this.firstFreeIndex;
    }
    
    public Type value(int index) {
        if (index >= 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }
}
