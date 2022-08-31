package Service;

import Entities.game;
import Entities.player;

public class gameService {
    
    public void game( game game){
        for (player aux : game.getPlayerList()) {
            System.out.println(game.pistol+" "+aux.getName());
            aux.shoot(game.pistol);
            if(game.round(aux)){
                System.out.println("PLAYER SPLASHED ");
                break;
            }
            System.out.println(game.pistol);
            game.pistol.nextPosition();
        }
    }
}
