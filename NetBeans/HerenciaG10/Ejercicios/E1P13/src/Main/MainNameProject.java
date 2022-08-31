package Main;

import Entity.animal;
import Entity.cat;
import Entity.dog;
import Entity.horse;

public class MainNameProject {

    public static void main(String[] args) {
        animal dog1 = new dog("Stich","Carnivoro","Doberman",15);
        dog1.food();
        animal dog2 = new dog("Teddy","Croquetas","Chihuahua",10);
        dog2.food();
    animal cat1 = new cat("Pelusa","Galletas","Siamés",15);
    cat1.food();
    animal  horse1 = new horse("Spark","Pasto","Fino",25);
    horse1.food();
    }

}
