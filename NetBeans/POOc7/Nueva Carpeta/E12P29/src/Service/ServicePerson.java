package Service;

import Entity.Person;
import java.util.Date;
import java.util.Scanner;

public class ServicePerson {

    public Person createPerson() {
        Scanner read = new Scanner(System.in);
        Person p1 = new Person();
        System.out.println("Write the name of your person");
        p1.setName(read.nextLine());
        System.out.println("Write the birthday of your person, in this order");
        System.out.println("Year");
        int year = read.nextInt();
        System.out.println("month");
        int month = read.nextInt();
        System.out.println("Day");
        int day = read.nextInt();
        Date birthDay = new Date(year - 1900, month-1, day);
        p1.setBirthDay(birthDay);
        return p1;
    }

    public void calculateAge(Person p1) {
        Date actual = new Date();
        int year = ((actual.getYear()) - (p1.getBirthDay().getYear())) - 1;
        int month = ((actual.getMonth()) - (p1.getBirthDay().getMonth()) + 11);
        int day = ((actual.getDay()) - (p1.getBirthDay().getDay())) + 29;
        if (day == 30) {
            day = 0;
            month += 1;
        }
        if (month == 12) {
            month = 0;
            year += 1;
        }
        System.out.println("The age of your person is  " + year + " years " + month
                + " months and " + day + " days");
    }

    public boolean youngerThan(Person p1, int a1) {
        Date actual = new Date();
        int year = ((actual.getYear()) - (p1.getBirthDay().getYear())) - 1;
        int month = ((actual.getMonth()) - (p1.getBirthDay().getMonth()) + 11);
        int day = ((actual.getDay()) - (p1.getBirthDay().getDay())) + 29;
        if (day == 30) {
            day = 0;
            month += 1;
        }
        if (month == 12) {
            month = 0;
            year += 1;
        }
        boolean v;
        if (year > a1) {
            v = true;
        } else {
            v = false;
        }
        return v;
    }

    public void soutPerson(Person p1) {
        System.out.println(p1.getName());
        System.out.println(p1.getBirthDay());
    }
}
