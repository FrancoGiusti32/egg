package EjerciciosExtra;
import java.util.Scanner;

public class E13P47 {
    public static void main(String[] args) {
     Scanner read=new Scanner(System.in);
        System.out.println("Insert the height for your NUMBER STAIR");
        int n=read.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            if (i==0) {
                System.out.println("1");
            }else{
                System.out.println(num*10+i+1);
                num=num*10+i+1;
            }
        }
    }
}
