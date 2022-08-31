package e3p11;

import Entities.deck;
import Service.deckService;
import java.util.Scanner;

public class E3P11 {

    public static void main(String[] args) {
        deckService ds = new deckService();
        Scanner read = new Scanner(System.in);
        deck deck = null;
        int selecction;
        do {
            System.out.println("///////////////////////////////////////");
            System.out.println("////////////////menu/////////////////");
            System.out.println("///////////////////////////////////////");
            System.out.println("[1]Create Deck");
            System.out.println("[2]Shufle Deck");
            System.out.println("[3]Next Cards");
            System.out.println("[4]Avalible Cards");
            System.out.println("[5]Give Cards");
            System.out.println("[6]Pile of Cards");
            System.out.println("[7]Show  Deck");
            System.out.println("[8]Exit");
            selecction = read.nextInt();
            switch (selecction) {
                case 1:
                    deck = ds.crateDeck();
                    break;
                case 2:
                    ds.shuffleDeck(deck);
                    break;
                case 3:
                    ds.nextCard(deck);
                    break;
                case 4:
                    ds.availableCards(deck);
                    break;
                case 5:
                    System.out.println("Write the amount of cards to give");
                    int num = read.nextByte();
                    ds.giveCards(deck, num);
                    break;
                case 6:
                    ds.cardsPile(deck);
                    break;
                case 7:
                    ds.showDeck(deck);
                    break;
                default:
                    System.out.println("This number isn´t an option");
            }
        } while (selecction!=8);
    }

}
