package EjerciciosExtra;
import java.util.Scanner;


public class E14P48 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("How meny families do you want to look?");
        int m=read.nextInt();
        System.out.println("How meny kids have each one?");
        int n=read.nextInt();
        System.out.println("Write the age of the childrens");
        int sum=0;
        for(int i=0;i<n*m;i++){
            sum+=read.nextInt();
        }
        System.out.println("The average age for the kids is "+sum/(m*n));
    }
}
