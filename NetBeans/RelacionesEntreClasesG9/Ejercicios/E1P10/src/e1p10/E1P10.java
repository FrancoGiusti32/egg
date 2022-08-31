package e1p10;
import Entity.Dog;
import Entity.Human;
public class E1P10 {

    public static void main(String[] args) {
        Dog d1 = new Dog("Rogwailer", " Kuma ", 2 ,30);
        Human h1 = new Human("Richard", "Lazzaro", 35 , 45765983 , d1);
        Dog d2 = new Dog("Schnawser", " riford", 3 ,10);
        Human h2 = new Human("Martincito", "Belgarn", 15 , 45757283 , d2);
        System.out.println("///////////////////////////////////////////////");
        System.out.println(h1);
        System.out.println("///////////////////////////////////////////////");
        System.out.println(h2);
        System.out.println("///////////////////////////////////////////////");
    }

}
