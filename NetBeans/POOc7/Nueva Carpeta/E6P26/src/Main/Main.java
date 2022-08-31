package Main;

import Entity.CoffeeMaker;
import Service.CoffeeMakerService; 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CoffeeMakerService as = new CoffeeMakerService(); 
        CoffeeMaker a1 = new CoffeeMaker();
        int n = 0;
        do {
            System.out.println("What do you want to do?");
            System.out.println("[1]Fill Coffe Maker");
            System.out.println("[2]Fill Cup");
            System.out.println("[3]Empty Coffe Maker");
            System.out.println("[4]Add Coffe");
            System.out.println("[5]Consult Coffe Maker");
            System.out.println("[6]Exit");
            n = read.nextInt();
            switch (n) {
                case 1:
                    as.fillCM(a1);
                    break;
                case 2:
                    as.fillCup(a1);
                    break;
                case 3:
                    as.emptyCM(a1);
                    break;
                case 4:
                    as.addCoffe(a1);
                    break;
                case 5:
                    System.out.println(a1.getActualCapacity()+" of "+a1.getMaxCapacity());
                    break;
                case 6:
                    System.out.println("Thank you for using our Coffe Maker, see you later!");
                    break;
                default:
                     System.out.println("Wrong number try again");
                     break;
            }
        } while (n != 6);
    }

}
