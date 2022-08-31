package EjerciciosExtra;
import java.util.Scanner;

public class E3P46 {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
        System.out.println("Inser a vocal");
        String v = read.nextLine();
        if(!(v.toLowerCase().equals("a")||v.toLowerCase().equals("e")||v.toLowerCase().equals("i")||v.toLowerCase().equals("o")||v.toLowerCase().equals("u"))){
            System.out.println("A vocal pls");   
        }
    }
}
