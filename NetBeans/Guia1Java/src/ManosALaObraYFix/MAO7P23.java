package ManosALaObraYFix;
import java.util.Scanner;

public class MAO7P23 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Selec the tipe of motor you want:");
        System.out.println("[1]Weater Bomb");
        System.out.println("[2]Gasoline Bomb");
        System.out.println("[3]Concrete Bomb");
        System.out.println("[4]Food Paste Bomb");
        int motorTipe = read.nextInt();
        switch (motorTipe){
            case 1:
                System.out.println("the bomb is a wheater bomb");
            break;
            case 2:
                System.out.println("the bomb is a gasoline bomb");
            break;
            case 3:
                System.out.println("the bomb is a concrete bomb");
            break;
            case 4:
                System.out.println("the bomb is a Foo paste(?) bomb");
            break;
            default:
                System.out.println("Tha value do not exist for a bomb tipe, please restart the program and select a real value");
            break;
        }
    }
}
