package Service;

import java.util.Scanner;
import Enity.Person;

public class PersonService {

    public Scanner read = new Scanner(System.in);
    public Scanner read1 = new Scanner(System.in);

    public Person createPerson(int n) {
        Person p1 = new Person();
        System.out.println("Creating person " + n);
        System.out.println("Write the name of this person");
        p1.setName(read.nextLine());
        System.out.println("Write the age");
        p1.setAge(read1.nextInt());
        do {
            System.out.println("Write the sex");
            System.out.println("[M] men");
            System.out.println("[W] women");
            System.out.println("[O] other");
            p1.setSex(read.nextLine());
        } while (!(("w".equals(p1.getSex().toLowerCase()) || ("m".equals(p1.getSex().toLowerCase())) || (("o".equals(p1.getSex().toLowerCase()))))));
        System.out.println("How much do he/she/it weight?(in kg)");
        p1.setWheight(read1.nextInt());
        System.out.println("How tall do he/she/it is?(in m)");
        p1.setHeight(read1.nextDouble());
        return p1;
    }

    public int calculateBM(Person p1) {
        int v = 0;
        if (((p1.getWheight()) / (Math.pow((p1.getHeight()), 2))) < 20) {
            v = -1;
        } else if (((p1.getWheight()) / (Math.pow((p1.getHeight()), 2))) < 25) {
            v = 0;
        } else if (((p1.getWheight()) / (Math.pow((p1.getHeight()), 2))) > 25) {
            v = 1;
        }
        return v;
    }

    public boolean isAdult(Person p1) {
        try {
            if (p1.getAge() < 18) {
                return false;
            } else if (p1.getAge() >= 18) {
                return true;
            }
        } catch (NullPointerException e) {
            System.out.println("Age not found");
        }
        return true;
    }

}
