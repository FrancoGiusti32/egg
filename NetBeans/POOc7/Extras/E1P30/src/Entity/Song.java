package Entity;

public class Song {

    public String title;
    public String autor;
    
    public Song() {
    }

    public Song(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
