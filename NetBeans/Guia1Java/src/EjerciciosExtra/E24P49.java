package EjerciciosExtra;
import java.util.Scanner;

public class E24P49 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Write the lenght of your vector and we will fill it whit the fibonacci secuence");
        int n=read.nextInt();
        int x[]=new int[n];
        int sum=1;
        int lastnum=0;
        int aux=0;
        for(int i=0;i<n;i++){
            aux=lastnum;
            sum+=lastnum;
            aux=sum;
        }
       
        System.out.println(sum);
    }
}
