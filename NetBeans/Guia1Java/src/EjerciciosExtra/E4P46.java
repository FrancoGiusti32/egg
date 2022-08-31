package EjerciciosExtra;
import java.util.Scanner;

public class E4P46 {
    public static void main(String[] args) {
     Scanner read=new Scanner(System.in);
        System.out.println("Givme a number between 1  and 10");
        int n = read.nextInt();
        System.out.println("In Roman is:");
        if (n%10==0) {
            System.out.println("X");
        }else if(n==9){
            System.out.println("IX");
        }else if(n>=5){
            System.out.print("V");
            for(int i=5;i<n;i++){
                System.out.print("I");
            }
             System.out.println("");
        }else{
            for(int i=0;i<n;i++){
                System.out.print("I");
            }
            System.out.println("");
        }   
    }
}
