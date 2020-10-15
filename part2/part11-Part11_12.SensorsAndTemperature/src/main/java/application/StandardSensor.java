/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author andychung
 */
public class StandardSensor implements Sensor {
    
    private int reading;
    
    public StandardSensor(int temp) {
        this.reading = temp;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }
    
    @Override
    public void setOff() {
        return;
    }
    
    @Override
    public void setOn() {
        return;
    }
    
    @Override
    public int read() {
        return this.reading;
    }
}
