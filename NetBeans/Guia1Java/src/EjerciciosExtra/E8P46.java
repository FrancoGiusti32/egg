package EjerciciosExtra;
import java.util.Scanner;

public class E8P46 {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
        System.out.println("write a secuense of numbers and stopot whit a multiply of 5");
        int count=0;
        int pair=0;
        int odd=0;
        int n;
        do{
            n = read.nextInt();
            if(n<0){
                System.out.println("ERROR NUMBER MUST BE POSITIVE");
                continue;
            }
            if(n%2==0){
                pair += 1;
            }
            if(n==5){
                break;
            }
            if(n%2!=0){
                odd+=1;
            }
            count+=1;
        }while(n%5!=0);
        System.out.println(count+" numbers");
        System.out.println(pair+" pair numbers");
        System.out.println(odd+" odd numbers");
    }
}
