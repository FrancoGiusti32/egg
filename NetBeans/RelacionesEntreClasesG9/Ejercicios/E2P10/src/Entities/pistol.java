package Entities;

public class pistol {

    public Integer actualPosition;
    public Integer water;

    public void fillChamber() {
        this.actualPosition = 1;
        Integer number;
        do {
            number = ((int) (Math.random() * 10));
        } while (number < 0 || number > 6);
        this.water = number;
    }

    public boolean splash() {
        if (this.actualPosition == this.water) {
            return true;
        } else {
            return false;
        }
    }

    public void nextPosition() {
        this.actualPosition++;
    }

    @Override
    public String toString() {
        return "actual position " + actualPosition + ", water=" + water;
    }

}
