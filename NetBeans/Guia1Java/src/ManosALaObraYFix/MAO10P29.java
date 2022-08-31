package ManosALaObraYFix;
import java.util.Scanner;

public class MAO10P29 {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     int num;
     String chain;
     chain = "";
     do{
        System.out.println("Write the amount of dots fo your line (more than 1 and less than 20)");
        num = read.nextInt();
     }while(num < 1 || num > 20);
     for (int i = 0 ; i < num; i++){
         chain = chain + "*";
     }
        System.out.println(+num+chain);
    }

}
