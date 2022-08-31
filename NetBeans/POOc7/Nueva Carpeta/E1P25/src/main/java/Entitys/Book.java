package Entitys;

public class Book {

    public int ISBN;
    public int Pages;
    public String Title;
    public String Autor;

    public Book() {
    }

    public Book(int ISBN, int Pages, String Title, String Autor) {
        this.ISBN = ISBN;
        this.Pages = Pages;
        this.Title = Title;
        this.Autor = Autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getPages() {
        return Pages;
    }

    public String getTitle() {
        return Title;
    }

    public String getAutor() {
        return Autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPages(int Pages) {
        this.Pages = Pages;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", Pages=" + Pages + ", title=" + Title + ", autor=" + Autor + '}';
    }

}
