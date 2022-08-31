package Service;
import Entity.Circunference;
import java.util.Scanner;
public class CircunferenceService {
    public Circunference createCircunference(){
        Scanner read=new Scanner(System.in);
        System.out.println("What is the radius of your circunference?");
        int r=read.nextInt();
        Circunference c1=new Circunference(r);
        return c1;
    }
     public void calculateArea(Circunference c1){
         c1.setArea((Math.pow(c1.getRadius(), 2))*Math.PI);
    }
     public void calculatePerimeter(Circunference c1){
         c1.setPerimeter(((c1.getRadius()* 2))*Math.PI);
    }
}
