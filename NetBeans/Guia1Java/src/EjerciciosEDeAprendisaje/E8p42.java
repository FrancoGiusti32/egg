package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E8p42 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a sentence of 8 character");
        String line = read.nextLine();
        if (line.length()== 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
