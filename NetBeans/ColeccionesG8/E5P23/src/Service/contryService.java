package Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class contryService {

    public void addToList() {
        Scanner read = new Scanner(System.in);
        Scanner read2 = new Scanner(System.in);
        String selecction;
        HashSet<String> cl = new HashSet();
        do {
            System.out.println("Add a country to the list");
            cl.add(read2.nextLine());
            System.out.println("Do you want to add country race?  [yes]/[no]");
            selecction = read.next();            
        } while (!selecction.toLowerCase().equals("no"));
        ArrayList<String> clo = new ArrayList(cl);
        Collections.sort(clo);
        for (int i = 0; i < clo.size(); i++) {
                   System.out.println(clo.get(i));
        }
        System.out.println("Write a country to erase of the list");
        String cToErace = read.next();
        boolean erased = true;
        for (Iterator iterator = clo.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            if (next.equals(cToErace)) {
                iterator.remove();
                erased = false;
            }
        }
        if (erased){
            System.out.println(" the country wasn´t found");
        }
        for (int i = 0; i < clo.size(); i++) {
                   System.out.println(clo.get(i));
        }
    }
}
