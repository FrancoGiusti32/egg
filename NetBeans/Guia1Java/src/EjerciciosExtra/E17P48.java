package EjerciciosExtra;
import java.util.Scanner;

public class E17P48 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Write a number, and the program will tell you if it is prime");
        int n=read.nextInt();
        System.out.println(IsPrime(n));
    }
    public static boolean IsPrime(int x) {
        boolean y=false;
        int count=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count+=1;
            }
        }
        if(count>2){
            y=false;
        }else{
            y=true;
        }
        return y;
    }
}
