package Service;

import Entity.electrodomestic;
import Entity.television;
import Entity.washingMachine;
import java.util.ArrayList;

public class ArrayService {

    public void llenar() {
        ArrayList<electrodomestic> electrodomesticList = new ArrayList<electrodomestic>();
        electrodomestic e1 = new television(41, true, 1000.0, "red", 'a', 90);
        electrodomesticList.add(e1);
        electrodomestic e2 = new television(25, false, 1000.0, "black", 'o', -3);
        electrodomesticList.add(e2);
        electrodomestic e3 = new washingMachine(30, 1000.0 , "grey", 'b', 50);
        electrodomesticList.add(e3);
        electrodomestic e4 = new washingMachine(31, 1000.0 , "j", 'c', 40);
        electrodomesticList.add(e4);
         double televisionPrice=0;
         double washingMachingPrice=0;
         double total = 0;
        for (electrodomestic aux : electrodomesticList) {
            aux.finalPrice();
            if(aux.getClass().getName().equals("Entity.television")){
                televisionPrice += aux.getPrice();
            }else{
                washingMachingPrice += aux.getPrice();
            }
        }
        total = televisionPrice + washingMachingPrice;
        System.out.println("tv price "+ televisionPrice);
        System.out.println("wm price "+ washingMachingPrice);
        System.out.println("total"+ total);
    }

}
