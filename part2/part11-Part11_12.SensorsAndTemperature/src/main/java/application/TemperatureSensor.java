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
import java.util.Random;

public class TemperatureSensor implements Sensor{
    
    private boolean isOn;
    
    public TemperatureSensor() {
        this.isOn = false;
    }
    
    @Override
    public boolean isOn () {
        return this.isOn;
    }
    
    @Override 
    public void setOff() {
        this.isOn = false;
    }
    
    @Override
    public void setOn() {
        this.isOn = true;
    }
    
    @Override
    public int read() {
        if (this.isOn) {
            Random randomInt = new Random();
            return randomInt.nextInt(61) - 30;
        } else {
            throw new IllegalStateException("Sensor is off");
        }
    }
}
