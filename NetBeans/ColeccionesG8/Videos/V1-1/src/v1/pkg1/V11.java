package v1.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

public class V11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        System.out.println("Write a list of names");
        String x;
        do {
            x = read.nextLine();
            if (!(x.equals(""))) {
                a.add(x);
            }
        } while (!(x.equals("")));
        System.out.println(a);
    }
}
