package Store.Service;

import java.util.Scanner;

public class mainService {

    public void menu() throws Exception {
        try {
            Integer selection = null;
            do {
                Scanner read = new Scanner(System.in).useDelimiter("\n");
                productService ps = new productService();
                manufacturerService ms = new manufacturerService();
                System.out.println("////MENU////");
                System.out.println("[1]Consult Product");
                System.out.println("[2]Insert Profuct");
                System.out.println("[3]Edit Profuct");
                System.out.println("[4]Insert Manufacturer");
                System.out.println("[5]Show Manufacturer");
                System.out.println("[6]EXIT");
                selection = read.nextInt();
                switch (selection) {
                    case 1:
                        ps.consultProducts();
                        break;
                    case 2:
                        ps.addProduc();
                        break;
                    case 3:
                        ps.editProduct();
                        break;
                    case 4:
                        ms.addManufacturer();
                        break;
                    case 5:
                        ms.showManufacturer();
                        break;
                    case 6:
                        System.out.println("¡GOOD BAY!");
                        break;
                    default:
                        throw new Exception("BAD INPUT");
                }

            } while (selection!=6);
        } catch (Exception e) {
            throw e;
        }
    }
}
