package Librery.service;

import Librery.Entity.Editorial;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class editorialService {

    private Editorial createEditorial() {
        Scanner read = new Scanner(System.in);
        System.out.println("////CREATING EDITORIAL////");
        System.out.println("name:");
        String name = read.nextLine();
        Editorial e1 = new Editorial(name, true);
        System.out.println("////DONE////");
        return e1;
    }

    public Editorial addEditorial() {
        EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
        Editorial e1 = createEditorial();
        em.getTransaction().begin();
        em.persist(e1);
        em.getTransaction().commit();
        return e1;
    }

    public void getEditorialList() {
        List<Editorial> editorialList = null;
        try {
            EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
            editorialList = em.createQuery("SELECT e FROM Editorial e").getResultList();
        } catch (Exception e) {
            throw e;
        }
        showEditorialList(editorialList);
    }

    private void showEditorialList(List<Editorial> al) {
        String name = "      Name      ";
        System.out.print("| id |" + name + "|  Status |");
        System.out.println("");
        for (Editorial a : al) {
            System.out.print("| ");
            if (a.getId() < 10) {
                System.out.print("0");
            } else if (a.getId() < 100) {
                System.out.print(" ");
            }
            System.out.print(a.getId());
            System.out.print(" |");
            for (int i = 0; i < ((((name.length()) - (a.getName().length())) - 1) / 2); i++) {
                System.out.print(" ");
            }
            System.out.print(" " + a.getName() + " ");
            int aux = 1;
            if (a.getName().length() % 2 != 0) {
                aux = 2;
            }
            for (int i = 0; i < ((((name.length()) - (a.getName().length())) - aux) / 2); i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("  " + a.getStatus());
            if (a.getStatus()) {
                System.out.print(" ");
            }
            System.out.print("  |");
            System.out.println("");
        }
    }

    public void editEditorial() throws Exception{
        EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("////EDITING EDITORIAL////");
        System.out.println("//Slect Editorial//");
        getEditorialList();
        System.out.println("id:");
        int id = read.nextInt();
        try {
            for (Editorial e1 : getEditorialById(id)) {
                System.out.println("Edit all the fields");
                Editorial e2 = createEditorial();
                e2.setId(e1.getId());
                System.out.println("Status:");
                boolean status = read.nextBoolean();
                e2.setStatus(status);
                em.getTransaction().begin();
                em.merge(e2);
                em.getTransaction().commit();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    protected List<Editorial> getEditorialById(int id) {
        List<Editorial> editorialList = null;
        try {
            EntityManager em = Persistence.createEntityManagerFactory("LIBRERYC1").createEntityManager();
            editorialList = em.createQuery("SELECT e FROM Editorial e WHERE e.id  = :id").setParameter("id", id).getResultList();
        } catch (Exception e) {
            throw e;
        }
        showEditorialList(editorialList);
        return editorialList;
    }
}
