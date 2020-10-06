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

public class ChangeHistory {
    
    private ArrayList<Double> history;
   
    public ChangeHistory() {
        this.history = new ArrayList();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        } else {
            double maxValue = this.history.get(0);
            for (Double ele : this.history) {
                if (ele > maxValue) {
                    maxValue = ele;
                }
            }
            return maxValue;
        }
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        } else {
            double minValue = this.history.get(0);
            for (Double e : this.history) {
                if (e < minValue) {
                    minValue = e;
                }
            }
            return minValue;
        }
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Double change : this.history) {
            sum += change;
        }
        return 1.0*sum/this.history.size();
    }
    
    @Override
    public String toString() {
        return this.history.toString();
    }
}
