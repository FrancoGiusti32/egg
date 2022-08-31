package e2p10;

import Entities.game;
import Entities.pistol;
import Entities.player;
import Service.gameService;
import java.util.ArrayList;
import java.util.Scanner;

public class E2P10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList playerList = new ArrayList();
        game game = new game();
        System.out.println("How meny players do you want to play?");
        int numOfPlayers = read.nextInt();
        if (numOfPlayers > 6) {
            numOfPlayers = 6;
        }
        if (numOfPlayers < 1) {
            numOfPlayers = 1;
        }

        for (int i = 0; i < numOfPlayers; i++) {
            playerList.add(new player(i));
        }
        pistol pistol = new pistol();
        pistol.fillChamber();
        
        game.fillGame(playerList, pistol);
        
        gameService gs = new gameService();

        gs.game(game);
    }

}
