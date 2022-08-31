package Service;

import Entitty.movie;
import utilities.comparators;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class movieService {

    public List<movie> ml = new ArrayList();

    public void createStudent() {
        Scanner read = new Scanner(System.in);
        Scanner read2 = new Scanner(System.in);
        String answer;
        do {
            System.out.println("///////////////////////////////////////////////");
            System.out.println("What is the name of the movie?");
            String name = read2.nextLine();
            System.out.println("What is the name of the director?");
            String directorName = read2.nextLine();
            System.out.println("How long does it is?");
            Double time = read.nextDouble();
            movie m = new movie(name, directorName, time);
            ml.add(m);
            System.out.println("///////////////////////////////////////////////");
            System.out.println("do your want to add another movie?(in hours)");
            answer = read.next();
        } while (!answer.toLowerCase().equals("no"));
        System.out.println("[+]///////////////////////////////////////////////[+]");
        System.out.println("                   Showing all the movies                    ");
        System.out.println("[+]///////////////////////////////////////////////[+]");
        for (int i = 0; i < ml.size(); i++) {
            System.out.println((ml.get(i)).getName());
        }
        System.out.println("[+]/////////////////////////////////////////////////////[+]");
        System.out.println("Showing all the movies that are more long than 1 h");
        System.out.println("[+]//////////////////////////////////////////////////////[+]");
        for (int i = 0; i < ml.size(); i++) {
            if (ml.get(i).getTime() > 1) {
                System.out.println((ml.get(i)).getName());
            }
        }
        System.out.println("[+]/////////////////////////////////////////////////////[+]");
        System.out.println("   Showing all the movies in ascendent time order     ");
        System.out.println("[+]/////////////////////////////////////////////////////[+]");
        Collections.sort(ml, comparators.orderByATime);
        for (int i = 0; i < ml.size(); i++) {
            System.out.print((ml.get(i)).getName());
            System.out.println("["+(ml.get(i)).getTime()+" hs]");
        }
        System.out.println("[+]/////////////////////////////////////////////////////[+]");
        System.out.println("   Showing all the movies in descendent time order     ");
        System.out.println("[+]/////////////////////////////////////////////////////[+]");
        Collections.sort(ml, comparators.orderByDTime);
        for (int i = 0; i < ml.size(); i++) {
            System.out.print((ml.get(i)).getName());
            System.out.println("["+(ml.get(i)).getTime()+" hs]");
        }
        System.out.println("[+]/////////////////////////////////////////////////////[+]");
        System.out.println("           Showing all the movies in name order            ");
        System.out.println("[+]/////////////////////////////////////////////////////[+]");
        Collections.sort(ml, comparators.orderByName);
        for (int i = 0; i < ml.size(); i++) {
            System.out.print((ml.get(i)).getName());
            System.out.println("["+(ml.get(i)).getTime()+" hs]");
        }
        System.out.println("[+]/////////////////////////////////////////////////////[+]");
        System.out.println("    Showing all the movies in Director name order     ");
        System.out.println("[+]/////////////////////////////////////////////////////[+]");
        Collections.sort(ml, comparators.orderByName);
        for (int i = 0; i < ml.size(); i++) {
            System.out.print((ml.get(i)).getName());
            System.out.println("["+(ml.get(i)).getTime()+" hs] by:"+(ml.get(i).getDirectorName()));
        }

    }

}
