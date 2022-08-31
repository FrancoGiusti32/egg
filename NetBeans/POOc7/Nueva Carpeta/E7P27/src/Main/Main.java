package Main;

import Enity.Person;
import Service.PersonService;

public class Main {

    public static void main(String[] args) {
        PersonService ps = new PersonService();
        int wSum[] = new int[3];
        int aSum = 0;
        for (int i = 0; i < 4; i++) {
            Person p1 = ps.createPerson((i+1));
            switch (ps.calculateBM(p1)) {
                case -1:
                    wSum[0]++;
                    break;
                case 0:
                    wSum[1]++;
                    break;
                case 1:
                    wSum[2]++;
                    break;
                default:
                    break;
            }
            if (ps.isAdult(p1) == false) {
            } else {
                aSum++;
            }
        }
        System.out.println("There are "+aSum+" adutls");
        System.out.println("There are "+wSum[0]+" with under weight");
        System.out.println("There are "+wSum[1]+" with normal weight");
        System.out.println("There are "+wSum[2]+" with over weight");

    }

}
