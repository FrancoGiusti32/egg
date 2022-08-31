package Service;

import Entities.card;
import Entities.deck;
import java.util.ArrayList;
import java.util.Collections;

public class deckService {

    public deck crateDeck() {
        deck d1 = new deck();
        ArrayList<card> cardList = new ArrayList();
        cardService cs = new cardService();
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 13; j++) {
                if (j == 8 || j == 9) {
                    continue;
                } else {
                    cardList.add(cs.crateCard(j, i));
                }

            }
        }
        d1.setDeck(cardList);
        return d1;
    }

    public deck nextCard(deck deck) {
        Integer dp = deck.getPosition();
        if (dp == 39 || dp > 39) {
            System.out.println("There isn´t more cards");
            return deck;
        }
        System.out.println(deck.getDeck().get(dp));
        deck.setPosition(dp + 1);
        return deck;
    }

    public deck giveCards(deck deck, Integer amount) {
        if (amount > availableCards(deck)) {
            System.out.println("There isn´t enough cards");
            return deck;
        }
        for (int i = 0; i < amount; i++) {
            Integer dp = deck.getPosition();
            System.out.println(deck.getDeck().get(dp));
            deck.setPosition(dp + 1);
        }
        return deck;
    }

    public Integer availableCards(deck deck) {
        System.out.println("there is " + (Math.abs(deck.getPosition() - 40) + " cards"));
        return (Math.abs(deck.getPosition() - 40));
    }
     
    public void cardsPile(deck deck){
        if(deck.getPosition()<1){
            System.out.println("There isn´t a card pile");
        }else{
            for (int i = deck.getPosition(); i > -1; i--) {
                System.out.println(deck.getDeck().get(i));
            }
        }
    }
    
    public void showDeck(deck deck){
        if(deck.getPosition()==40||deck.getPosition()>40){
            System.out.println("There isn't more cards in the deck");
        }else{
            for (int i = deck.getPosition(); i < 40; i++) {
                System.out.println(deck.getDeck().get(i));
            }
        }
    }
    
    public deck shuffleDeck(deck deck1) {
        Collections.shuffle(deck1.getDeck());
        return deck1;
    }

}
