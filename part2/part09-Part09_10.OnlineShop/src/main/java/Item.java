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
    
    private final String name;
    private int qty;
    private final int unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return this.unitPrice*this.qty;
    }
    
    public void increaseQuantity() {
        this.qty++;
    }
    
    @Override
    public String toString() {
        return this.name + ": " + this.qty;
    }
    
}
