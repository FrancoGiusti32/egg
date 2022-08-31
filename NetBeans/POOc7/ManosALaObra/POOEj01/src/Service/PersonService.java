package Service;
import Entity.PersonEntity;
import java.util.Scanner;
public class PersonService {
    public PersonEntity CreatePerson(){
        Scanner read=new Scanner(System.in);
        PersonEntity p1=new PersonEntity();
        System.out.println("Write the name of your person");
        p1.setName(read.next());
        return p1;
    }
}
