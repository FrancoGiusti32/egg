package Service;

import java.util.Scanner;
import Entity.Chain;

public class ChainService {

    public void showVocals(Chain c) {
        int sum = 0;
        for (int i = 0; i < c.getLenght(); i++) {
            switch (c.getChain().substring(i, i + 1)) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    sum++;
                    break;
                default:
                    break;
            }

        }
        System.out.println("vocals " + sum);
    }

    public void invertChain(Chain c) {
        for (int i = c.getLenght(); i > 0; i--) {
            System.out.print(c.getChain().substring(i - 1, i));
        }
        System.out.println("");
    }

    public void repeatedLetters(Chain c) {
        Scanner read = new Scanner(System.in);
        int sum = -1;
        System.out.println("Write the letter to see if it repeat");
        String l = read.nextLine();
        for (int i = 0; i < c.getLenght(); i++) {
            if (l.equals(c.getChain().substring(i, i + 1))) {
                sum++;
            }
        }
        System.out.println("it is repeated " + sum + " times");
    }

    public void compareLength(Chain c) {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a new phrase to compare the length ");
        String p = read.nextLine();
        System.out.println("they have " + ((c.getLenght()) - (p.length())) + " charachters in diference");
    }

    public void linkChains(Chain c) {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the new phrase to link ");
        String p = read.nextLine();
        System.out.println(c.getChain() + p);
    }

    public void replace(Chain c) {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the letter to replace the {a}");
        String l = read.nextLine();
        for (int i = 0; i < c.getLenght(); i++) {
            if ("a".equals(c.getChain().substring(i, i + 1))) {
                c.setChain(((c.getChain().substring(0, i)) + l + c.getChain().substring(i + 1, c.getLenght())));
            }
        }
        System.out.println(c.getChain());
    }
    public boolean find
        (Chain c, String l) {
        boolean x=false;
        for (int i = 0; i < c.getLenght(); i++) {
            if (l.equals(c.getChain().substring(i, i + 1))) {
                x=true;
                break;
            }
        }
        
        return x;
    }
}
