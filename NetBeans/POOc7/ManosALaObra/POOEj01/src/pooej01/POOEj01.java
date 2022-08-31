package pooej01;
import Entity.PersonEntity;
import Service.PersonService;


public class POOEj01 {
    public static void main(String[] args) {
        PersonService PS=new PersonService();
        PersonEntity p1=PS.CreatePerson();
        System.out.println(p1.getName());
    }
}
