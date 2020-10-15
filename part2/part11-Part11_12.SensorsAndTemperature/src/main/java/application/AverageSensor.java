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

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {
    
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    @Override
    public void setOff() {
        for (Sensor s : this.sensors) {
            s.setOff();
        }
    }
    
    @Override
    public void setOn() {
        for (Sensor s : this.sensors) {
            s.setOn();
        }
    }
    
    @Override
    public boolean isOn() {
        for (Sensor s : this.sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int read() {
        int sum = 0;
        for (Sensor s : this.sensors) {
           sum += s.read();
        }
        this.readings.add(sum/this.sensors.size());
        return sum/this.sensors.size();
    }
    
    public void addSensor (Sensor sens) {
        this.sensors.add(sens);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }  
}
