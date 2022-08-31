package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E3P42 {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
        System.out.println("Write a phrase to show it in Up case and Lowe case");
        String phrase = read.nextLine();
        System.out.println("In Up Case :"+ phrase.toUpperCase());
        System.out.println("In Up Case :"+ phrase.toLowerCase());
    }

}
