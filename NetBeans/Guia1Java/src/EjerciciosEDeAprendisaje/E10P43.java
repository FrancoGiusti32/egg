package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E10P43 {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
        System.out.println("Write the number limit of your sum");
        int limit = read.nextInt();
        int sum = 0;
        while (sum<limit){
            System.out.println("Write a number to add");
            sum += read.nextInt();
        } 
        System.out.println("Limit "+limit+" /sum "+sum);
    }
}
