package Entitty;


public class movie {
    public String name;
    public String directorName;
    public Double time;

    public movie(String name, String directorName, Double time) {
        this.name = name;
        this.time = time;
        this.directorName = directorName;
    }

    public String getName() {
        return name;
    }

    public String getDirectorName() {
        return directorName;
    }

    public Double getTime() {
        return time;
    }
    
}
