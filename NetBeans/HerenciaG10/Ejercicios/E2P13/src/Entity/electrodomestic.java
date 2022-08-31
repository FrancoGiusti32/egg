package Entity;
//Electrodoméstico con los siguientes atributos: precio, color,
//consumo energético (letras entre A y F) y peso.

import java.util.Scanner;

public class electrodomestic {

    protected double price;
    protected String color;
    protected char consumption;
    protected Integer weight;

    public electrodomestic() {
    }

    public electrodomestic(double price, String color, char consumption, Integer wight) {
        this.price = price;
        this.color = color;
        this.consumption = consumption;
        this.weight = wight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumption() {
        return consumption;
    }

    public void setConsumption(char consumption) {
        this.consumption = consumption;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void checkConsumption(char consumption) {
        switch (Character.toUpperCase(consumption)) {
            case 'A':
                this.consumption='A';
                break;
            case 'B':
                this.consumption='B';
                break;
            case 'C':
                this.consumption='C';
                break;
            case 'D':
                this.consumption='D';
                break;
            case 'E':
                this.consumption='E';
                break;
            case 'F':
                this.consumption='F';
                break;
            default:
                this.consumption = 'F';
        }
    }

    public void checkColor(String color) {
        switch (color.toLowerCase()) {
            case "white":
                this.color=color;
                break;
            case "black":
                this.color=color;
                break;
            case "red":
                this.color=color;
                break;
            case "blue":
                this.color=color;
                break;
            case "grey":
                this.color=color;
                break;
            default:
                this.color = "white";
        }
    }

    public void createElectrodomestic() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("How much it consume?");
        this.consumption = read.next().charAt(0);
        System.out.println("Witch color?");
        this.color = read.next();
        System.out.println("How much it weight?");
        this.weight = read.nextInt();
        if (this.weight < 1) {
            this.weight = 1;
        }
        this.price = 1000;
        checkColor(color);
        checkConsumption(this.consumption);
    }

    public double finalPrice() {
        switch (Character.toUpperCase(this.consumption)) {
            case 'A':
                this.price += 1000;
                break;
            case 'B':
                this.price += 800;
                break;
            case 'C':
                this.price += 600;
                break;
            case 'D':
                this.price += 500;
                break;
            case 'E':
                this.price += 300;
                break;
            case 'F':
                this.price += 100;
                break;
            default:
                this.price += 100;
        }
        if (this.weight > 0 && this.weight < 20) {
            this.price += 100;
        } else if (this.weight > 19 && this.weight < 50) {
            this.price += 500;
        } else if (this.weight > 49 && this.weight < 80) {
            this.price += 800;
        } else if (this.weight > 79) {
            this.price += 1000;
        }
        return this.price;
    }

    @Override
    public String toString() {
        return "electrodomestic{" + "price=" + this.price + ", color=" + this.color + ", consumption=" + consumption + ", weight=" + weight + '}';
    }



}
