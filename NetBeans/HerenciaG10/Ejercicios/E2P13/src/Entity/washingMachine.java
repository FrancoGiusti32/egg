package Entity;

import java.util.Scanner;

public final class washingMachine extends electrodomestic {
    
    protected Integer burden;
    
    public washingMachine() {
    }
    
    public washingMachine(Integer burden, Integer price, String color, char consumption, Integer wight) {
        super(price, color, consumption, wight);
        this.burden = burden;
    }
    
    public Integer getBurden() {
        return burden;
    }
    
    public void setBurden(Integer burden) {
        this.burden = burden;
    }
    
    public void createWahingMachine() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");        
        super.createElectrodomestic();
        System.out.println("Write the burden of the Washing Machine in kg");
        this.burden=(read.nextInt());
    }
    
    public void finalPriceWM() {
        finalPrice();
        if (this.burden> 30) {
            this.price=(this.price + 500);
        }
    }

    @Override
    public String toString() {
        return "washingMachine{" + "burden=" + burden + super.toString()+'}';
    }
      

}
