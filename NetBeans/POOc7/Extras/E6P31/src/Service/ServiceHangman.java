package Service;

import Entity.Hangman;
import java.util.Scanner;

public class ServiceHangman {

    public Hangman crateHangman() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Write the size of your word");
        int n = read.nextInt();
        System.out.println("Write the amount of max atempts");
        int n1 = read.nextInt();
        Hangman hm = new Hangman(n, n1, 0);
        for (int i = 0; i < n; i++) {
            System.out.println("Write the letter " + i + " of your word");
            hm.word[i] = read.next();
        }
        return hm;
    }

    public void lenght(Hangman hm) {
        System.out.println("The lenght of the word is " + hm.getWord().length);
    }

    public void serch(String letter, Hangman hm) {
        boolean v = false;
        for (int i = 0; i < hm.getWord().length; i++) {
            if (hm.word[i].equals(letter)) {
                v = true;
                break;
            }
        }
        if (v == true) {
            System.out.println("The letter was found in the word");
        } else {
            System.out.println("The letter wasn't found in the word :(");
        }
    }

    public boolean found(String letter, Hangman hm) {
        boolean v = false;
        int count = 0;
        for (int i = 0; i < hm.getWord().length; i++) {
            if (hm.word[i].equals(letter)) {
                v = true;
                count++;
                hm.word[i] = "";
            }
        }
        hm.setLettersFound(hm.getLettersFound() + count);
        System.out.println("found/Not found yet" + hm.getLettersFound() + "/" + ((hm.getWord().length) - hm.getLettersFound()));
        return v;
    }

    public void showTrys(Hangman hm) {
        System.out.println("you have " + hm.getMaxAttempts() + " trys");
    }

    public void game(Hangman hm) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ServiceHangman sh = new ServiceHangman();
        for (int i = 0; i < 50; i++) {
            System.out.println("//////////////////////////////");
        }
        System.out.println("[GAME START]");
        while (hm.getMaxAttempts() > 0 && hm.getLettersFound() != (hm.getWord().length)) {
            boolean v = false;
            System.out.println("Write a letter");
            String l = read.next();
            sh.lenght(hm);
            sh.serch(l, hm);
            v = sh.found(l, hm);
            if (v == false) {
                hm.setMaxAttempts(hm.getMaxAttempts() - 1);
            }
            sh.showTrys(hm);
            System.out.println("+//////////////////////////////+");
        }
        if (hm.getLettersFound() == hm.getWord().length) {
            System.out.println("YOU WON!!! :D");
        }
        if (hm.getMaxAttempts() == 0) {
            System.out.println("you lose :(");
        }

    }
}
