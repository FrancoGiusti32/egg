package utilities;

import Entitty.movie;
import java.util.Comparator;

public class comparators {

    public static Comparator<movie> orderByDirectorName = (movie t, movie t1) -> t.getDirectorName().compareTo(t1.getDirectorName());
    public static Comparator<movie> orderByName = (movie t, movie t1) -> t.getName().compareTo(t1.getName());
    public static Comparator<movie> orderByATime = (movie t, movie t1) -> t.getTime().compareTo(t1.getTime());
    public static Comparator<movie> orderByDTime = (movie t, movie t1) -> t1.getTime().compareTo(t.getTime());

}
