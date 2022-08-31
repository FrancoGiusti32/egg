/*
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E14P43 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Slect the divisa you want to convert [Dolar,Yenes,Libras]");
        String divisa = read.nextLine();
        System.out.println("How much € do you want to convert");
        int value = read.nextInt();
        convert(value,divisa);
    }
    public static void convert(int v, String d){
        if (d.toLowerCase().equals("libra")){
            System.out.println(v*0.86+" libras");
        }
        if (d.toLowerCase().equals("dolar")){
            System.out.println(v*1.28611+" Dolars");
        }
        if (d.toLowerCase().equals("yen")){
            System.out.println(v*129.852+" Yenes");
        }
    }
}
