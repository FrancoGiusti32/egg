package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E17P43 {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
        System.out.println("Inser lenght of your vector");
        int n = read.nextInt();
        int v[] = new int[n];
        System.out.println("Write numbers whit a lenght max of 5 figure until you fill te vector");
        for (int i=0 ; i<n ; i++){
           v[i]=read.nextInt();
        }    
        int figure1 = 0;
        int figure2 = 0;
        int figure3 = 0;
        int figure4 = 0;
        int figure5 = 0;
        for (int i=0 ; i<n ; i++){
           String nc = String.valueOf(v[i]);
           switch (nc.length()){
               case 1:
                   figure1 +=1;
                   break;
               case 2:
                   figure2 +=1;
                   break;
               case 3:
                   figure3 +=1;
                   break;
               case 4:
                   figure4 +=1;
                   break;
               case 5:
                   figure5 +=1;
                   break;
           }
        }
        System.out.println("1 "+figure1);
        System.out.println("2 "+figure2);
        System.out.println("3 "+figure3);
        System.out.println("4 "+figure4);
        System.out.println("5 "+figure5);
    }
}
