package PettApp;
import Entity.Pet;
import Entity.services.PetService;

public class PettAppE1V1 {

    public static void main(String[] args) {
        PetService ps=new PetService();
        Pet m1=ps.createPet();
        System.out.println(m1);

    }
}
