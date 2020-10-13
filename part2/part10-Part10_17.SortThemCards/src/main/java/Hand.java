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
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        for (Card c : this.cards) {
            System.out.println(c);
        }
    }
    
    public void sort() {
        Collections.sort(this.cards);
    }
    
    public ArrayList<Card> getCards() {
        return this.cards;
    }
    
    @Override
    public int compareTo(Hand h2) {
        int totVal = this.cards.stream().mapToInt(c -> c.getValue()).reduce(0,(a,b) -> a + b);
        int compVal = h2.getCards().stream().mapToInt(c -> c.getValue()).sum();
        if (totVal < compVal) {
            return -1;
        } else if (totVal == compVal) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
}
