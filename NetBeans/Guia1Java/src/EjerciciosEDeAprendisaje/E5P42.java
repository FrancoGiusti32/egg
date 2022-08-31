package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E5P42 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a number");
        int num = read.nextInt();
        System.out.println("The doble is:"+(num*2));
        System.out.println("The triple is:"+(num*3));
        System.out.println("The triple is:"+(Math.sqrt(num))*1);
    }
}
