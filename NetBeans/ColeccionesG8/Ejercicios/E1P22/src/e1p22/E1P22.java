package e1p22;
import java.util.ArrayList;
import java.util.Scanner;
public class E1P22 {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String selecction;
        ArrayList<String>dogRace= new ArrayList();
        do {            
            System.out.println("Add an dog race to the list");
            dogRace.add(read.next());
            System.out.println("Do you want to add another dog race?  [yes]/[no]");
            selecction= read.next();
        } while (!selecction.toLowerCase().equals("no") );
        System.out.println("The dog races inserted are:");
          for (String aux : dogRace) {
              System.out.print(aux+",");
        }
    }
    
}
