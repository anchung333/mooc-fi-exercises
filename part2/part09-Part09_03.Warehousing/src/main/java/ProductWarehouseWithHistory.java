/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andychung
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory warehouseHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.warehouseHistory = new ChangeHistory();
        this.warehouseHistory.add(initialBalance);
    }
    
    public String history() {
        return this.warehouseHistory.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.warehouseHistory.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double returnAmount = super.takeFromWarehouse(amount);
        this.warehouseHistory.add(super.getBalance());
        return returnAmount;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.warehouseHistory.toString());
        System.out.println("Largest amount of product: " + this.warehouseHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.warehouseHistory.minValue());
        System.out.println("Average: " + this.warehouseHistory.average());
    }
}
