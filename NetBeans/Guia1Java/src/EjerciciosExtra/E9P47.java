package EjerciciosExtra;
import java.util.Scanner;

public class E9P47 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Write the Dividend");
        int dividend=read.nextInt();
        System.out.println("Now your Divider");
        int divider=read.nextInt();
        int divition=0;
        while(dividend>=divider){
            dividend-=divider;
            divition+=1;
        }
        System.out.println(divition);
        System.out.println("rest "+dividend);
    }
}
