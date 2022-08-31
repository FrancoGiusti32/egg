package Entities;

import java.util.ArrayList;

public class deck {

    private Integer position;
    private ArrayList<card> deck;

    public deck() {
        this.position = 0;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
    
    

    public ArrayList<card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<card> deck) {
        this.deck = deck;
    }

}
