package Entities;

public class player {

    public Integer ID;
    public String name;
    public boolean splashed;

    public String getName() {
        return name;
    }

    public player(Integer ID) {
        this.ID = ID;
        this.name = "Player " + ID;
        this.splashed = false;
    }

    public void shoot(pistol P) {
        if (P.splash()) {
            this.splashed = true;
        } else {
            P.nextPosition();
        }
    }

}
