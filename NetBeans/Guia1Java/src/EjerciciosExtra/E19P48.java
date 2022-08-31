package EjerciciosExtra;
import java.util.Scanner;

public class E19P48 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Write the sice of your 2 vectors");
        int n=read.nextInt();
        int[] x1=new int[n];
        int[] x2=new int[n];
        int count=0;
        System.out.println("Fill the first vector");
        for(int i=0;i<n;i++){
            x1[i]=read.nextInt();
        }
        System.out.println("Fill the seconf vector");
        for(int i=0;i<n;i++){
            x2[i]=read.nextInt();
        }
        for (int i=0;i<n;i++){
            if(x1[i]!=x2[i]){
            count++;
            }
        }
        if (count==0){
            System.out.println("The 2 vectors are equals");
        }else{
            System.out.println("The 2 vectors aren´t equals");
        }
    }
}
