package Service;

import Entities.card;

public class cardService {

    public card crateCard(Integer number, Integer marck) {
        card c1 = null;

        switch (marck) {
            case 1:
                c1 = new card("hearts", number);
                break;
            case 2:
                c1 = new card("diamonds", number);
                break;
            case 3:
                c1 = new card("clubs", number);
                break;
            case 4:
                c1 = new card("spades", number);
                break;
            default:
                System.out.println("Error this number isn't a card number");
        }

        return c1;
    }
}
