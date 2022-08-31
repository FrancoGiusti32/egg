package Service;

import java.util.Scanner;
import Entity.CoffeeMaker;

public class CoffeeMakerService {
    
    Scanner read = new Scanner(System.in);
    
    public void fillCM(CoffeeMaker cm) {
        cm.setActualCapacity(cm.getMaxCapacity());
    }
    
    public void fillCup(CoffeeMaker cm) {
        System.out.println("Waht is the capacity of your cup?");
        int cup = read.nextInt();
        if (cup > cm.getActualCapacity()) {
            System.out.println("The cup hasn't been filled");
            
        } else {
            System.out.println("the cup has been filled");
        }
        cm.setActualCapacity((cm.getActualCapacity()) - cup);
        if (cm.getActualCapacity() < 0) {
            cm.setActualCapacity(0);
        }
    }

    public void emptyCM(CoffeeMaker cm) {
        cm.setActualCapacity(0);
    }

    public void addCoffe(CoffeeMaker cm) {
        System.out.println("Write the amount of coffe to add");
        int coffe = read.nextInt();
        if ((cm.getActualCapacity() + coffe) > cm.getMaxCapacity()) {
            System.out.println("The coffe maker will overflow, so whi fill it just to the top");
            cm.setActualCapacity(cm.getMaxCapacity());
        } else {
            cm.setActualCapacity(cm.getActualCapacity() + coffe);
        }
        
    }
}

