package EjerciciosExtra;
import java.util.Scanner;

public class E18P48 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Write the sice of your vector");
        int n=read.nextInt();
        int[] x=new int[n];
        int sum=0;
        System.out.println("Write the numbers");
        for(int i=0;i<n;i++){
            x[i]=read.nextInt();
        }
        System.out.print("The sum is ");
        for(int i=0;i<n;i++){
            sum+=x[i];
        }
        System.out.print(sum);
        System.out.println("");
    }
}
