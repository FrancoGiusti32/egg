package ManosALaObraYFix;
import java.util.Scanner;

public class MAO8P25 {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     int note = -2;
     while (note < 0 || note > 10){
        System.out.println("Write a note between 0 and 10");
        note = read.nextInt();
    }
    }
}

