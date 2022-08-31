package Main;
import Entity.Rectangle;
import Service.RectangleService;
public class E4P26 {

  
    public static void main(String[] args) {
        RectangleService rs=new RectangleService();
        Rectangle r=rs.createRectangle();
        rs.calculateArea(r);
        rs.calculateSuface(r);
        rs.soutRectangle(r);
    }
}
