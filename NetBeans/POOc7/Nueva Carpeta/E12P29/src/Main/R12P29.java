package Main;

import Entity.Person;
import Service.ServicePerson;
import java.util.Scanner;

public class R12P29 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ServicePerson sp = new ServicePerson();
        Person p1 = sp.createPerson();
        sp.calculateAge(p1);
        System.out.println("Write the age of the person to compare");
        System.out.println(sp.youngerThan(p1, read.nextInt()));
        sp.soutPerson(p1);
    }

}
