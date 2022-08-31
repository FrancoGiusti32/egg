
package introjava;
import java.util.Scanner;


public class ProductoDeVectorPorMatris {   
public static void main(String[] args) {
    int [] vector = new int[2];
    int [] producto = new int[3];
        //segundo metodo de declaracion de varialble
    int[][] matriz = {{4, 8, 6}, {2, 1, 7}};
    
    System.out.println("Escriba los valores del vector de tamaño "+vector.length+":");
    Scanner Leer = new Scanner(System.in);
    for (int i = 0; i < vector.length; i++){
        System.out.print("v["+i+"]=");
        vector[i]=Leer.nextInt();
    }
    int suma;
    for (int j = 0; j < matriz[0].length; j++ ){
        suma = 0;
        for (int i = 0; i < vector.length; i++){
            suma += vector[i]*matriz[i][j];
        }
    producto[j]=suma;
    }
    String aux = "";
    System.out.println("*Vector;");
    for (int elemento: vector){
    aux = aux + "/" + elemento;
    }
    System.out.println(aux);
    aux="";
    System.out.println("\n* matriz");
    for (int[] fila: matriz){
        aux="";
        for(int elemento: fila){
        aux += "/" + elemento;    
        }
    System.out.println(aux);
    }
    System.out.println("\n* Vector X MatriZ");
    aux = " ";
    for(int elemento: producto){
        aux += "/" + elemento;
    }
    System.out.println(aux);
}}
