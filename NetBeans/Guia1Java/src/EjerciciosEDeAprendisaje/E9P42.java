package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E9P42 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a sentence that start whiot an [a]");
        String line = read.nextLine();
        String red = line.substring(0, 1);
        if (red.equals("a")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
