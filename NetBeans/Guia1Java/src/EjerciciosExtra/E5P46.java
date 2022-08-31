package EjerciciosExtra;
import java.util.Scanner;

public class E5P46 {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
        System.out.println("whitch tipe of plan do you have? /[A] 50%OFF/[B] 35%OFF/[C] 0%OFF");
        String p = read.next();
        System.out.println("What is the cost for the treatment?");
        int c = read.nextInt();
        switch(p.toLowerCase()){
            case "a":
                System.out.println("you have to pay "+(c*0.5)+"$");
            break;
            case "b":
                System.out.println("you have to pay "+(c*0.35)+"$");
            break;
            case "c":
                System.out.println("you have to pay "+c+"$");
            break;
            
        }
    }
}
