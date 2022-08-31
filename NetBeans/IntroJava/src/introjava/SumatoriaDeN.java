package introjava;
import java.util.Scanner;


public class SumatoriaDeN {

    public static void main(String[] args) {
    int num;
    Scanner Leer = new Scanner(System.in);
    
    do{
        System.out.println("Escriba un numero entero positivo");
        num = Leer.nextInt();
        if(num > 1000){
           System.out.println("Este programa podria tardar ¿Esta seguro? s/n");
            String confirma = Leer.next();
            if(confirma.equals ("s")){
            break;
           }              
        }
     }while(num<=0 || num > 1000);
    
    int j, Suma;
    
    for (int i = 1 ; i<=num ; i++){
        if (i%2 != 0)
            continue;   
     Suma=0;
     j = 1;
     while (j <=i){
         Suma += j;
         j++;        
     }
      System.out.println("La Suma de los"+i+"numeros naturales es "+ Suma);
    }
        
    }
}
