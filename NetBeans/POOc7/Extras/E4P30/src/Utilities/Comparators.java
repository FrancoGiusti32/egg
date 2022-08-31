package Utilities;

import Entity.NIF;
import java.util.Comparator;

public class Comparators {

    public static Comparator<NIF> OrderForDNI = new Comparator<NIF>() {
        @Override
        public int compare(NIF t, NIF t1) {
           return (t.getDNI().compareTo(t1.getDNI()));
        }
    };
}
