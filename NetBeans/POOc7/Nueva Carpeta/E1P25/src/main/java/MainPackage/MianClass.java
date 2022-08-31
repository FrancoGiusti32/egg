package MainPackage;

import Service.BookService;
import Entitys.Book;

public class MianClass {

    public static void main(String[] args) {
        BookService SB = new BookService();
        Book b1 = SB.CreateBook();
        SoutBook(b1);
    }
    public static void SoutBook(Book b1) {
        System.out.println(b1);
    }
}
