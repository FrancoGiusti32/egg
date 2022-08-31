package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E7P42 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a sentence [eureka]");
        String line = read.nextLine();
        if (line.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
