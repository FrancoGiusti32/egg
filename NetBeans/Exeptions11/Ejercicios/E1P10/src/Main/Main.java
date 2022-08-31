package Main;

import Enity.Person;
import Service.PersonService;

public class Main {

    public static void main(String[] args) {
        PersonService ps = new PersonService();
        Person p = new Person();
        ps.isAdult(p);
    }

}
