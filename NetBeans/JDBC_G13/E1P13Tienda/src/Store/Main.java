package Store;


import Store.Service.mainService;

public class Main {

    public static void main(String[] args) {
        try {
            mainService ps = new mainService();
            ps.menu();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
