package Entity;

public class Circunference {

    public int radius;
    public double Area;
    public double Perimeter;

    public Circunference() {
    }

    public Circunference(int radius, double Area, double Perimeter) {
        this.radius = radius;
        this.Area = Area;
        this.Perimeter = Perimeter;
    }

    public Circunference(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Area;
    }

    public double getPerimeter() {
        return Perimeter;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public void setPerimeter(double Perimeter) {
        this.Perimeter = Perimeter;
    }

    @Override
    public String toString() {
        return "Circunference{" + "radius=" + radius + ", Area=" + Area + ", Perimeter=" + Perimeter + '}';
    }

}
