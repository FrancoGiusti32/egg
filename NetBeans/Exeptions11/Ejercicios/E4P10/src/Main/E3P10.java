package Main;

import java.util.Scanner;

public class E3P10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("1° number");
        String n1 = read.next();
        System.out.println("2° number");
        String n2 = read.next();
        try{
        numberDivicion(Integer.parseInt(n1), Integer.parseInt(n2));
        }catch(IllegalArgumentException e){
            System.out.println("Those aren't numbers");
        }
    }

    public static void numberDivicion(int n1, int n2) {
        Integer a=null;
        try {
            a = n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("Imposible Divicion");
        }
        System.out.println(a);
    }

}
