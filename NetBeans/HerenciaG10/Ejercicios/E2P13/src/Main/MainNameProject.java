package Main;


import Entity.television;
import Entity.washingMachine;

public class MainNameProject {

    public static void main(String[] args) {
        television tv = new television();
        tv.createTV();
        washingMachine wm =new washingMachine();    
        wm.createWahingMachine();
        tv.finalPricetv();
        wm.finalPrice();
        System.out.println(tv.toString());
        System.out.println(wm.toString());
    }

}
//3230