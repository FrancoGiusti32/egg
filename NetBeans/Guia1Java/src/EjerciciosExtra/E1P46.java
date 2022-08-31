package EjerciciosExtra;
import java.util.Scanner;

public class E1P46 {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
        System.out.println("How much time do you want to convert?(In minutes)");
        int time = read.nextInt();
        System.out.println("this is "+(time/60/24)+" days and "+((time/60))%24+" hours");
    }
}
