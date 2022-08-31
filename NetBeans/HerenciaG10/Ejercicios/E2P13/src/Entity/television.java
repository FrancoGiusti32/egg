package Entity;

import java.util.Scanner;

public final class television extends electrodomestic {

    protected Integer resolution;
    protected boolean tunerTDT;

    public television() {
    }

    public television(Integer resolution, boolean tunerTDT, double  price, String color, char consumption, Integer wight) {
        super(price, color, consumption, wight);
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
    }

    public Integer getResolution() {
        return resolution;
    }

    public void setResolution(Integer resolution) {
        this.resolution = resolution;
    }

    public boolean isTunerTDT() {
        return tunerTDT;
    }

    public void setTunerTDT(boolean tunerTDT) {
        this.tunerTDT = tunerTDT;
    }

    public void createTV() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        super.createElectrodomestic();
        System.out.println("How much resolution it have?in inches");
        this.resolution=(read.nextInt());
        System.out.println("Has tuner TDT?");
        String option = read.next();
        if (option.toLowerCase().equals("yes") || option.toLowerCase().equals("y")) {
            this.tunerTDT=(true);
        } else {
            this.tunerTDT=(false);
        }
    }


    public void finalPricetv() {
        double price2 = super.finalPrice();
        if (this.resolution > 30) {
            this.price=(((price2*0.3))+price2);
            price2 = this.price;
        }
        
        if(this.tunerTDT){
            this.price=(price2+500);
        }
    }

    @Override
    public String toString() {
        return "television{" + "resolution=" + resolution + ", tunerTDT=" + tunerTDT + super.toString()+ '}';
    }


        
}

//2060