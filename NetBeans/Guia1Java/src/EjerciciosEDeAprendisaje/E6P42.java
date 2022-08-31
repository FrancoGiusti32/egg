package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E6P42 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a number");
        int num = read.nextInt();
        if (num%2 == 0){
            System.out.println("This number is pair");
        }else{
            System.out.println("This number is odd");
        }
    }
}
