package Librery.service;

import Librery.Entity.Author;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class authorService {

    private Author createAuthor() {
        Scanner read = new Scanner(System.in);
        System.out.println("////CREATING AUTOR////");
        System.out.println("name:");
        String name = read.nextLine();
        System.out.println("a");
        Author a1 = new Author(name, true);
        System.out.println("////DONE////");
        return a1;
    }

    public Author addAuthor() {
        Author a1;
        try {
            EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
             a1 = createAuthor();
            em.getTransaction().begin();
            em.persist(a1);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }
        return a1;
    }

    public void getAuthorList() {
        List<Author> authroList = null;
        try {
            EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
            authroList = em.createQuery("SELECT a FROM Author a").getResultList();
        } catch (Exception e) {
            throw e;
        }
        showAuthorList(authroList);
    }

    private void showAuthorList(List<Author> al) {
        String name = "      Name      ";
        System.out.print("| id |" + name + "|  Status |");
        System.out.println("");
        for (Author a : al) {
            System.out.print("| " );
            if(a.getId()<10){
                System.out.print("0");
            }else if (a.getId()<100){
                System.out.print(" ");
            }
            System.out.print(a.getId());
            System.out.print(" |");
            for (int i = 0; i < ((((name.length()) - (a.getName().length()))-1) / 2); i++) {
                System.out.print(" ");
            }
            System.out.print(" " + a.getName() + " ");
            int aux = 1;
            if( a.getName().length() % 2 !=0){
                aux = 2;
            }
            for (int i = 0; i < ((((name.length()) - (a.getName().length()))-aux) / 2); i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("  " + a.getStatus());
            if(a.getStatus()){
                System.out.print(" ");
            }
            System.out.print("  |");
            System.out.println("");
        }
    }

    public void editAuthor() throws Exception{
        EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("////EDITING AUTHOR////");
        System.out.println("//Slect Author//");
        getAuthorList();
        System.out.println("id:");
        int id = read.nextInt();
        try {
            for (Author a1 : getAuthorById(id)) {
                System.out.println("Edit all the fields");
                Author a2 = createAuthor();
                a2.setId(a1.getId());
                System.out.println("Status:");
                boolean status = read.nextBoolean();
                a2.setStatus(status);
                em.getTransaction().begin();
                em.merge(a2);
                em.getTransaction().commit();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    protected List<Author> getAuthorById(int id) {
        List<Author> authroList = null;
        try {
            EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
            authroList = em.createQuery("SELECT a FROM Author a WHERE a.id  = :id").setParameter("id", id).getResultList();
        } catch (Exception e) {
            throw e;
        }
        showAuthorList(authroList);
        return authroList;
    }
}
