package Service;

import Entity.Points;
import java.util.Scanner;

public class ServicePoints {

    public Points cratePoints() {
        Scanner read = new Scanner(System.in);
        Points p1 = new Points();
        System.out.println("Write the x for the first point");
        p1.setX1(read.nextInt());
        System.out.println("Write the y for the first point");
        p1.setY1(read.nextInt());
        System.out.println("Write the x for the second point");
        p1.setX2(read.nextInt());
        System.out.println("Write the y for the second point");
        p1.setY2(read.nextInt());
        return p1;
    }
    
    public double calculateDistance(Points p1){
        double d= Math.sqrt((Math.pow((p1.getX2()-p1.getX1()),2))+(Math.pow((p1.getY2()-p1.getY1()),2)));
        return d;
    }
}
