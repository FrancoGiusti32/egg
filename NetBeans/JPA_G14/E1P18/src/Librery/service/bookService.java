package Librery.service;

import Librery.Entity.Author;
import Librery.Entity.Book;
import Librery.Entity.Editorial;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class bookService {

    private Book createBook() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("////CREATING EDITORIAL////");
        System.out.println("title:");
        String title = read.next();
        System.out.println("year:");
        int year = read.nextInt();
        System.out.println("samples:");
        Integer samples = read.nextInt();
        System.out.println("samples left:");
        Integer samplesLeft = read.nextInt();
        Book b1 = new Book(title, year, samples, samplesLeft, setAuthor(), setEditorial());
        System.out.println("////DONE////");
        return b1;
    }

    public void addBook() {
        try {
            EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
            em.getTransaction().begin();
            em.persist(createBook());
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

    public void getBookList() {
        List<Book> bookList = null;
        try {
            EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
            bookList = em.createQuery("SELECT b FROM Book b").getResultList();
        } catch (Exception e) {
            System.out.println( e.getMessage());
            throw e;
        }
        showBookList(bookList);
    }
    
    public void getBookListByAuthorName() {
        List<Book> bookList = null;
         Scanner read = new Scanner(System.in).useDelimiter("\n");
        authorService as = new authorService();
        as.getAuthorList();
        System.out.println("Select name");
        String name = read.next();
        try {
            EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
            bookList  = em.createQuery("SELECT b FROM Book b WHERE b.author.name = a AND a.name = :name1").setParameter("name1", name).getResultList();
        } catch (Exception e) {
            throw e;
        }
        showBookList(bookList);
    }

    public void editBook() throws Exception {
        EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("////EDITING BOOK////");
        System.out.println("//Slect Book//");
        getBookList();
        System.out.println("id:");
        int id = read.nextInt();
        try {
            for (Book b1 : getBookById(id)) {
                System.out.println("Edit all the fields");
                Book b2 = createBook();
                b2.setIsnb(b1.getIsnb());
                System.out.println("Status:");
                boolean status = read.nextBoolean();
                b2.setStatus(status);
                em.getTransaction().begin();
                em.merge(b2);
                em.getTransaction().commit();
            }

        } catch (Exception ex) {
        throw ex;
        }
    }

    public List<Book> getBookById(int id) throws Exception {
        List<Book> lb = null;
        try {
            EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
            lb = em.createQuery("SELECT b FROM book b WHERE b.isnb = :id").setParameter("id", id).getResultList();
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("///SELECTED///");
            showBookList(lb);
            return lb;
        }
    }

    private void showBookList(List<Book> bl) {
        String name = "              Title              ";
        System.out.print("| id |" + name + " |  Year  |  Samples  | Samples Left | Samples Gived  | Status |");
        System.out.println("");
        for (Book a : bl) {
            System.out.print("| ");
            if (a.getIsnb() < 10) {
                System.out.print("0");
            } else if (a.getIsnb() < 100) {
                System.out.print(" ");
            }
            System.out.print(a.getIsnb());
            System.out.print(" |");
            for (int i = 0; i < ((((name.length()) - (a.getTitle().length())) - 1) / 2); i++) {
                System.out.print(" ");
            }
            System.out.print(" " + a.getTitle() + " ");
            int aux = 1;
            if (a.getTitle().length() % 2 != 0) {
                aux = 2;
            }
            for (int i = 0; i < ((((name.length()) - (a.getTitle().length())) - aux) / 2); i++) {
                System.out.print(" ");
            }
            System.out.print("|  "+a.getPublishYear()+"  ");
            System.out.print("|    ");
            if (a.getSamples() < 10) {
                System.out.print("0");
            } else if (a.getSamples() < 100) {
                System.out.print("");
            }
            System.out.print(a.getSamples());
            System.out.print("    |");

            System.out.print("      ");
            if (a.getSamplesGived() < 10) {
                System.out.print("0");
            } else if (a.getSamplesGived() < 100) {
                System.out.print("");
            }
            System.out.print(a.getSamplesLeft());
            System.out.print("      |");

            System.out.print("       ");
            if (a.getSamplesLeft() < 10) {
                System.out.print("0");
            } else if (a.getSamplesLeft() < 100) {
                System.out.print("");
            }
            System.out.print(a.getSamplesGived());
            System.out.print("       |");

            System.out.print("  " + a.getStatus());
            if (a.getStatus()) {
                System.out.print(" ");
            }
            System.out.print(" |");
            System.out.println("");
            
        }
    }

    private Author setAuthor() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        authorService as = new authorService();
        Author a1 = new Author();
        System.out.println("//author//");
        System.out.println("[1]Select");
        System.out.println("[2]Create");
        Integer selection = read.nextInt();
        switch (selection) {
            case 1:
                System.out.println("//select one//");
                as.getAuthorList();
                System.out.println("Select id:");
                int id = read.nextInt();
                for (Author aux : as.getAuthorById(id)) {
                    a1 = aux;
                }
                break;
            case 2:
                a1 = as.addAuthor();
                break;
            default:
                throw new AssertionError();
        }
        return a1;
    }

    private Editorial setEditorial() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        editorialService es = new editorialService();
        Editorial e1 = new Editorial();
        System.out.println("//Editorial//");
        System.out.println("[1]Select");
        System.out.println("[2]Create");
        Integer selection = read.nextInt();
        switch (selection) {
            case 1:
                System.out.println("//select one//");
                es.getEditorialList();
                System.out.println("Select id:");
                int id = read.nextInt();
                for (Editorial aux : es.getEditorialById(id)) {
                    e1 = aux;
                }
                break;
            case 2:
                e1 = es.addEditorial();
                break;
            default:
                throw new AssertionError();
        }
        return e1;
    }
}
