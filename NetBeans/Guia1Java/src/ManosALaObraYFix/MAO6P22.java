package ManosALaObraYFix;
import java.util.Scanner;

public class MAO6P22 {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("write 2 numbres");
    int num1 = read.nextInt();
    int num2 = read.nextInt();
    if  (num1 > 25 && num2 > 25){
        System.out.println("both of them are bigger than 25");
    }else if (num1 > 25  || num2 > 25){
        System.out.println("One of them is bigger than 25");
    }else{
        System.out.println("None of them are bigger than 25");  
    } 
    }
}
