package EjerciciosExtra;
import java.util.Scanner;

public class E6P46 {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     int hight;
     int average1=0;
     int average2=0;
     int d1=0;
     int d2=0;
    System.out.println("How meni pepole's heigth do you want to average?");
    int n = read.nextInt();
    System.out.println("insert the height for "+n+" persons (in centimeters)");
    for(int i=0;i<n;i++){
    int n1 = read.nextInt();
        if(n1<160){
            average1+=n1;
            d1 += 1; 
        }
        average2+=n1;
        d2 += 1;
    }
        System.out.println("The averege for poeple under 160 is "+average1/d1);
        System.out.println("Ande for all the heights in general is "+average2/d2);
    }
}
