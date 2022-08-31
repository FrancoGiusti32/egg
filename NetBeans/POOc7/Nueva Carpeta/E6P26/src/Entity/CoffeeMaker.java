package Entity;

public class CoffeeMaker {
       public int maxCapacity=1000;
       public int actualCapacity=0;

    public CoffeeMaker(int maxCapacity, int actualCapacity) {
        this.maxCapacity = maxCapacity;
        this.actualCapacity = actualCapacity;
    }

    public CoffeeMaker() {
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getActualCapacity() {
        return actualCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setActualCapacity(int actualCapacity) {
        this.actualCapacity = actualCapacity;
    }
       
       
}
