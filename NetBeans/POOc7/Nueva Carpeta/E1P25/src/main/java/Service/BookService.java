package Service;
import Entitys.Book;
import java.util.Scanner;
public class BookService {
    public Book CreateBook(){
    Scanner read=new Scanner(System.in);
    Scanner read1=new Scanner(System.in);
    Book b1=new Book();
        System.out.println("Write the title of the book");
        b1.setTitle(read.nextLine());
        System.out.println("Write the number of pages of your book");
        b1.setPages(read.nextInt());
        System.out.println("Write the Autor name");
        b1.setAutor(read1.nextLine());
        System.out.println("Write the ISBN code of the book");
        b1.setISBN(read.nextInt());
    return b1;
    }
}
