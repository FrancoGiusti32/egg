package e2p22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class E2P22 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String selecction = "";
        List<String> dogRace = new ArrayList();
        do {
            System.out.println("Add an dog race to the list");
            dogRace.add(read.next());
            System.out.println("Do you want to add another dog race?  [yes]/[no]");
            selecction = read.next();
        } while (!selecction.toLowerCase().equals("no"));
        System.out.println("The dog races inserted are:");
        for (String aux : dogRace) {
            System.out.print(aux + ",");
        }
        System.out.println("");
        System.out.println("Select a race to erace of the list");
        String x = read.next();
        boolean c = false;
        Iterator<String> it = dogRace.iterator();
        while (it.hasNext()) {
            if (it.next().equals(x)) {
                it.remove();
                c = true;
            }
        }

        if (c) {
            System.out.println("the race was found and eliminated");
        } else {
            System.out.println("the race wasn´t found");
        }
        for (String aux : dogRace) {
            System.out.print(aux + ",");
        }
        System.out.println("");
    }

}
