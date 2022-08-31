package Main;

import Entity.circle;
import Entity.rectangle;

public class MainNameProject {

    public static void main(String[] args) {
        rectangle rectangle1= new rectangle(2, 3); 
        circle circule1= new circle(3); 
        rectangle1.CalculateArea();
        rectangle1.CalculateSurface();
        circule1.CalculateArea();
        circule1.CalculateSurface();
        System.out.println("circle {superface ="+circule1.perimeter+"} , area= {"+circule1.area+"}");
        System.out.println("rectangle {superface ="+rectangle1.perimeter+"} , area= {"+rectangle1.area+"}");
        
    }

}
