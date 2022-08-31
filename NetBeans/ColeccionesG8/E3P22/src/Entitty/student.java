package Entitty;

import java.util.ArrayList;
import java.util.List;

public class student {
    public String name;
    public List<Integer>notes;

    public student(String name, List<Integer> notes) {
        this.name = name;
        this.notes = new ArrayList();
        this.notes.addAll(notes);
    }
    
}
