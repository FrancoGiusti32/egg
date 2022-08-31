package Entity.services;

import Entity.Pet;
import java.util.Scanner;

public class PetService {

    private Scanner read = new Scanner(System.in);

    public Pet createPet() {
        System.out.println("Insert name");
        String name = read.nextLine();
        System.out.println("Inser Type");
        String type = read.nextLine();
        System.out.println("Inser nickname");
        String nickname = read.nextLine();
        return new Pet(name, nickname, type);
    }
}
