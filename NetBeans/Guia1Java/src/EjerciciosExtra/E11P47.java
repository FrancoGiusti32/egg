package EjerciciosExtra;
import java.util.Scanner;

public class E11P47 {
    public static void main(String[] args) {
     Scanner read=new Scanner(System.in);
        System.out.println("Writ the number that you want to insert");
        int n=read.nextInt();
        int count=0;
        do{
           n=n/10;
           count+=1;
        }while(n!=0);
        System.out.println("This number has "+count+" digit/s ");
    }
}
