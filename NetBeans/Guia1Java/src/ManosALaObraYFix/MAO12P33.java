
package ManosALaObraYFix;
import java.util.Scanner;

public class MAO12P33 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("write 2 numbres and we are going to tell yoy if the first is multple of the second one");    
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        IsMultiple(num1 , num2);
}
public static void IsMultiple (int n1 , int n2){
    if ((n1%n2) == (0)) {
        System.out.println("The first numbres IS multiple of the second one");
    }else{
        System.out.println("The first numbre ISN`T multiple of the second one");
    }
}
}

