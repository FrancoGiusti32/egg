package Entities;

import java.util.ArrayList;

public class game {

    public ArrayList<player> playerList;
    public pistol pistol;

    public ArrayList<player> getPlayerList() {
        return playerList;
    }
    
    public void fillGame(ArrayList<player> playerList, pistol pistol) {
        this.playerList = playerList;
        this.pistol = pistol;
    }

    public boolean round(player p) {
        if (p.splashed) {
            return true;
        }
        return false;
    }

}
