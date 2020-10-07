/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
    
    public Warehouse() {
        this.prices = new HashMap();
        this.stock = new HashMap();
    }
   
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product,price);
        this.stock.put(product,stock);
    }
    
    public int price(String product) {
        if (this.prices.keySet().contains(product)) {
            return this.prices.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        if (this.stock.keySet().contains(product)) {
            return this.stock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product) {
        if (this.stock.keySet().contains(product)) {
            if (this.stock.get(product) > 0) {
                this.stock.put(product, this.stock.get(product) - 1);
                return true;
            }  
        }
        return false;
    }
    
    public Set<String> products() {
        return this.stock.keySet();
    }
    
    
}
