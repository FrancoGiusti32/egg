package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E5P10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Integer num = null;
        Integer x = null;
        Integer count = 0;
        do {
            x = (int) (Math.random() * 1000);
        } while (x > 500);

        do {
            try {
                System.out.println("Gues the number!");
                num = read.nextInt();
                if (num < x) {
                    System.out.println("The number is biger");
                } else if (num > x) {
                    System.out.println("The number is smaller");
                }
                count++;
            } catch (InputMismatchException e) {
                System.out.println("That's not a number");
                read.next();
            }
        } while (num != x);

        System.out.println("Trys = " + count);
    }
}
