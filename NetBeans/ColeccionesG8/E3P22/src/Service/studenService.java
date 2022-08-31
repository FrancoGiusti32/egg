package Service;

import Entitty.student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studenService {

    public List<student> sl = new ArrayList();

    public void createStudent() {
        Scanner read = new Scanner(System.in);
        String answer;
        do {
            System.out.println("///////////////////////////////////////////////");
            System.out.println("What is the name of the student?");
            String name = read.next();
            List<Integer> notes = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Write the 3 notes of the student");
                notes.add(read.nextInt());
            }
            student st = new student(name, notes);
            sl.add(st);
            System.out.println("///////////////////////////////////////////////");
            System.out.println("do your want to add another student?");
            answer = read.next();
        } while (!answer.toLowerCase().equals("no"));
    }

    public int finalNote() {
        int fn = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Which student do you want to know the final note");
        String name = read.next();
        for (int i = 0; i < sl.size(); i++) {
            if (name.equals((sl.get(i).name))) {
                fn = (sl.get(i).notes.get(0) + sl.get(i).notes.get(1) + sl.get(i).notes.get(2)) / 3;
            }
        }
        return fn;
    }

}
