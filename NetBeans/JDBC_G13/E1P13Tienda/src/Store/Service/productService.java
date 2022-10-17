package Store.Service;

import Store.Conection.productDAO;
import Store.Entity.product;
import java.util.ArrayList;
import java.util.Scanner;

public class productService {

    public product createProduct() {
        System.out.println("///CREATIN MANUFACTERt///");
        System.out.println();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Name :");
        String name = read.next();
        System.out.println("Price :");
        Double price = read.nextDouble();
        System.out.println("Manufacturer Code :");
        int manufacterCode = read.nextInt();
        product p1 = new product(price, name, manufacterCode);
        return p1;
    }

    public void addProduc() throws Exception {
        productDAO c1 = new productDAO();
        try {
            c1.saveProduct(createProduct());
        } catch (Exception e) {
            throw e;
        }

    }

    public void editProduct() throws Exception {
        productDAO conection = new productDAO();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("id from the porduct to edit");
        Integer id = read.nextInt();
        System.out.println("///GREAT///");
        try {
            conection.modifyProduct(createProduct(),id);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void deleteProduct() throws Exception{
        try {
            Scanner read =  new Scanner(System.in).useDelimiter("\n");
            productDAO connection = new productDAO();
            System.out.println("///DELETING///");
            System.out.println("Inset ID to be deleted");
            Integer id = read.nextInt();
            connection.deleteProduct(id);
        } catch (Exception e) {
            throw e;
        }
    }

    public void consultProducts() throws Exception {
        int selection = 0;
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        productDAO conection = new productDAO();
        try {
            do {
                ArrayList<product> pl = new ArrayList();
                System.out.println("///////Consults///////");
                System.out.println("[1] Name of All Products");
                System.out.println("[2] Name and Price of All Products");
                System.out.println("[3] Spesific Price Range");
                System.out.println("[4] By Name");
                System.out.println("[5] Name and Price of the cheapest");
                System.out.println("[6] Exit");
                selection = read.nextInt();
                switch (selection) {
                    case 1:
                        showProductList(conection.consultListName());
                        break;
                    case 2:
                        showProductList(conection.consultListNamePrice());
                        break;
                    case 3:
                        System.out.println("Max Price:");
                        int max = read.nextInt();
                        System.out.println("Min Price:");
                        int min = read.nextInt();
                        showProductList(conection.consultListWherePrice(max, min));
                        break;
                    case 4:
                        System.out.println("Name: ");
                        String name = read.next();
                        showProductList(conection.consultListWhereLikeName(name));
                        break;
                    case 5:
                        showProductList(conection.consultCheapestNamePrice());
                        break;
                    case 6:
                        System.out.println("Goint to Main");
                        break;
                    default:
                        throw new Exception("Bad input type");
                }
            } while (selection != 6);
        } catch (Exception e) {
            throw e;
        }
    }

    public void showProductList(ArrayList<product> List) {
        for (product p1 : List) {
            if (p1.getCode() != null) {
                System.out.print("|" + p1.getCode() + "| ");
            }
            if (p1.getName() != null) {
                System.out.print(" " + p1.getName() + " ");
            }
            if (p1.getPrice() != null) {
                System.out.print("|" + p1.getPrice() + "$ ");
            }
            if (p1.getManufacterCode() != null) {
                System.out.print("| MC " + p1.getManufacterCode());
            }
            System.out.println("");
        }
    }
}
