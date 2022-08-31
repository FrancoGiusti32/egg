package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class porductService {

    public HashMap addProduct(HashMap productList) {
        Scanner read = new Scanner(System.in);
        Scanner read2 = new Scanner(System.in);
        System.out.println("///////////////Adding Product///////////////");
        System.out.println("Write the name of the product");
        String name = read.nextLine();
        System.out.println("Write the price of the product");
        Integer price = read2.nextInt();
        productList.put(name, price);
        return productList;
    }

    public HashMap modifyPrice(HashMap productList) {
        HashMap<String, Integer> productLocal = productList;
        Scanner read = new Scanner(System.in);
        Scanner read2 = new Scanner(System.in);
        System.out.println("///////////////Modify Product Price///////////////");
        System.out.println("Write the name of the product to modify");
        String name = read.nextLine();
        System.out.println("Write the new price");
        Integer price = read2.nextInt();
        for (Map.Entry<String, Integer> entry : productLocal.entrySet()) {
            String key = entry.getKey();
            if (key.equals(name)) {
                entry.setValue(price);
            }
        }
        return productLocal;
    }

    public HashMap eraseProduct(HashMap productList) {
        HashMap<String, Integer> productLocal = productList;
        Scanner read = new Scanner(System.in);
        System.out.println("///////////////Erase Product ///////////////");
        System.out.println("Write the name of the product to erase");
        String name = read.nextLine();
        if (productLocal.containsKey(name)) {
            productLocal.remove(name);
            System.out.println("Product Erased");
        } else {
            System.out.println("Product Wasn't found");
        }
        return productLocal;
    }

    public HashMap showProductList(HashMap productList) {
        HashMap<String, Integer> productLocal = productList;
        System.out.println("///////////////Show Product List///////////////");
        for (Map.Entry<String, Integer> entry : productLocal.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print("prduct:" + key);
            System.out.println(" " + value + "$");
        }
        return productLocal;
    }

    public void menu() {
        HashMap<String, Integer> productList = new HashMap();
        Scanner read = new Scanner(System.in);
        int function = 5;
        do {
            System.out.println("/////////////////////////////////////");
            System.out.println("/////////////////MENU////////////////");
            System.out.println("/////////////////////////////////////");
            System.out.println("[1] Add Product");
            System.out.println("[2] Erase Product");
            System.out.println("[3] Modify Product Price");
            System.out.println("[4] Show Product List");
            System.out.println("[0] Exit");
            System.out.println("/////////////////////////////////////");
            function = read.nextInt();
            switch (function) {
                case 1:
                    addProduct(productList);
                    break;
                case 2:
                    eraseProduct(productList);
                    break;
                case 3:
                    modifyPrice(productList);
                    break;
                case 4:
                    showProductList(productList);
                    break;
                case 0:
                    System.out.println("See you soon!!");
                    break;
                default:
                    System.out.println("That option doesn´t exist");
                    System.out.println("Try again");
                    break;
            }
        } while (0 != function);
    }
}
