package Store.Service;

import Store.Conection.manufacturerDAO;
import Store.Entity.manufacturer;
import java.util.ArrayList;
import java.util.Scanner;

public class manufacturerService {

    public manufacturer createManofacturer() {
        System.out.println("////CREATING MANUFACTURER////");
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Name: ");
        String name = read.next();
        manufacturer m1 = new manufacturer(name);
        return m1;
    }

    public void addManufacturer() throws Exception {
        try {
            manufacturerDAO conecction = new manufacturerDAO();
            conecction.saveManufacturer(createManofacturer());
        } catch (Exception e) {
            throw e;
        }
    }

    public void showManufacturer() throws Exception {
        manufacturerDAO conetion = new manufacturerDAO();
        try {
            showManufacturerList(conetion.consultList());
        } catch (Exception e) {
            throw e;
        }
    }

    public void showManufacturerList(ArrayList<manufacturer> List) {
        for (manufacturer m1 : List) {
            if (m1.getCode() != null) {
                System.out.print("|" + m1.getCode() + "| ");
            }
            if (m1.getName() != null) {
                System.out.print(" " + m1.getName() + " ");
            }
            System.out.println("");
        }
    }
}
