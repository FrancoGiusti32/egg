package Main;

import java.util.Scanner;

public class E3P10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("1° number");
        String n1 = read.next();
        System.out.println("2° number");
        String n2 = read.next();
        numberDivicion(Integer.parseInt(n1), Integer.parseInt(n2));
    }

    public static void numberDivicion(int n1, int n2) {
        Integer a = null;
        a = n1 / n2;
        System.out.println(a);
    }

}
