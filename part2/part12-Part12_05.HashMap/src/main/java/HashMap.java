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

public class HashMap<K,V> {
    private ArrayList<ArrayList<Pair<K,V>>> map;
    private int firstFreeIndex;
    
    public HashMap() {
        this.map = new ArrayList<>();
        this.firstFreeIndex = 0;
    }
    
    public V get(K Key) {
        int hashValue = Math.abs(Key.hashCode() % this.map.size());
        if (this.map.get(hashValue) == null) {
            return null;
        }
        
        ArrayList<Pair<K,V>> pairs = this.map.get(hashValue);
        
        for (Pair<K,V> p : pairs) {
            if (p.getKey().equals(Key)) {
                return p.getValue();
            }
        }
        
        return null;
    }
    
    public void add(K key, V value) {
        ArrayList<Pair<K,V>> pairs = getListBasedOnKey(key);
        int idx = getIndexOfKey(pairs, key);
        
        if (idx == -1) {
            pairs.add(new Pair(key, value));
            this.firstFreeIndex++;
        } else {
            //override value if key already exist within list
            pairs.get(idx).setValue(value);
        }
    }
    
    //return the ArrayList of K-V Pairs at a certain index
    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = (key.hashCode() % this.map.size());
        if (this.map.get(hashValue) == null) {
            this.map.add(hashValue, new ArrayList<Pair<K,V>>());
        }
        return this.map.get(hashValue);
    }
    
    private int getIndexOfKey(ArrayList<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }
    
    public V remove(K key) {
        ArrayList<Pair<K,V>> pairsAtIndex = getListBasedOnKey(key);
        if (pairsAtIndex.isEmpty()) {
            return null;
        }
        
        for (Pair<K,V> pair : pairsAtIndex) {
            if (pair.getKey().equals(key)) {
                V valToRet = pair.getValue();
                pairsAtIndex.remove(pair);
                return valToRet;
            }
        }
        return null;
    }
}
