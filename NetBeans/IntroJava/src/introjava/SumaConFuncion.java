
package introjava;
import java.util.Scanner;

public class SumaConFuncion {


    public static void main(String[] args) {
       System.out.println("Escriba el numero a y b para sumar");
       Scanner leer = new Scanner(System.in);
       int a = leer.nextInt();
       int b = leer.nextInt();
       System.out.println(suma(a,b));
       System.out.println("Escriba su nombre");
       String nombre = leer.next();
       saludo(nombre);
    }
    
    public static int suma(int a, int b){
        int resultado = a + b;
        return resultado;
    } 
    public static void saludo(String nombre){
        System.out.println("Hasta luego "+nombre);
        
    }
}
