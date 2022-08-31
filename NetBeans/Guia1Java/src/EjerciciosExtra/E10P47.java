package EjerciciosExtra;
import java.util.Scanner;


public class E10P47 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Guess the number of a multiplication of 2 numbers (between 0 and 10)");
        int n;
        n=(int)(Math.random()*10)*(int)(Math.random()*10);
        int n1;
        do{
            n1=read.nextInt();
            if(n1==261343){
                n=(int)(Math.random()*10)*(int)(Math.random()*10);
            }
        }while(n1!=n);
    }
}
