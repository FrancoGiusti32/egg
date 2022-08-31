package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E16P43 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the lenght of your vector");
        int n = read.nextInt();
        int v[] = new int[n];
        for (int i=0; i<n ; i++){
            v[i]=(int)(Math.random()*10);
        }
        System.out.println("What is the number you want to search in this matrix?");
        n = read.nextInt();
        System.out.println("the number you want to search, apears in the positions:");
        for (int i=0; i<n ; i++){
            if (v[i]==n){
                System.out.println(i);
            }
        }
    }
}
