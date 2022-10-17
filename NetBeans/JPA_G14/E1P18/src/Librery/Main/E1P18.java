package Librery.Main;

import Librery.service.editorialService;
import java.util.Scanner;
import Librery.service.authorService;
import Librery.service.bookService;

public class E1P18 {

    public static void main(String[] args) {
        Integer selection = null;
        do {
            authorService as = new authorService();
            editorialService es = new editorialService();
            bookService bs = new bookService();
            Scanner read = new Scanner(System.in).useDelimiter("\n");
            System.out.println("////MENU////");
            System.out.println("[1]Create Author");
            System.out.println("[2]Consult Author");
            System.out.println("[3]Edit Author");
            System.out.println("[4]Create Editorial");
            System.out.println("[5]Consult Editorial");
            System.out.println("[6]Edit Editoriall");
            System.out.println("[7]Create Book");
            System.out.println("[8]Consult Book");
            System.out.println("[9]Edit Book");
            System.out.println("[10]Get Book By Author Name");
            System.out.println("[0]EXIT");
            selection = read.nextInt();
            try {
            switch (selection) {
                case 1:
                    as.addAuthor();
                    break;
                case 2:
                    as.getAuthorList();
                    break;
                case 3:
                    as.editAuthor();
                    break;
                case 4:
                    es.addEditorial();
                    break;
                case 5:
                    es.getEditorialList();
                    break;
                case 6:
                    es.editEditorial();
                    break;
                case 7:
                    bs.addBook();
                    break;
                case 8:
                    bs.getBookList();
                    break;
                case 9:
                    bs.editBook();
                    break;
                case 10:
                    bs.getBookListByAuthorName();
                    break;
                case 0:
                    System.out.println("///GOOD BYE////");
                    break;
                default:
                    throw new AssertionError();
            }         
            } catch (Exception e) {
            }
        } while (selection != 0);
    }

}
