package Service;

import Entity.Rectangle;
import java.util.Scanner;

public class RectangleService {

    public Rectangle createRectangle() {
        Scanner read = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println("Write the base of your rectangle");
        r1.setBase(read.nextInt());
        System.out.println("Write the height of your rectangle");
        r1.setHeight(read.nextInt());
        return r1;
    }

    public void calculateArea(Rectangle r) {
        System.out.println("Area: " + ((r.getBase()) * (r.getHeight())));
    }

    public void calculateSuface(Rectangle r) {
        System.out.println("Surface: " + ((r.getBase()) + (r.getHeight())) * 2);
    }

    public void soutRectangle(Rectangle r) {
        for (int i = 0; i < (r.getBase()); i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int j = 0; j < r.getHeight(); j++) {
            for (int i = 0; i < r.getBase(); i++) {
                if (i == 0 || i == ((r.getBase()) - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println("");
        }
        for (int i = 0; i < (r.getBase()); i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
