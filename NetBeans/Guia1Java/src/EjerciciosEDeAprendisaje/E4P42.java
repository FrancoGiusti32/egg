package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E4P42 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("What tempeture is en Celcius?");
        int t = read.nextInt();
        System.out.println("The temperature un Farenheit is "+(32+(9*t/5)));
    }
}
