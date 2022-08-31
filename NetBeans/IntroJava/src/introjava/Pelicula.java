
package introjava;
import java.util.Scanner;


public class Pelicula {

   
    public static void main(String[] args) {
     
      int opinion;
      Scanner Leer = new Scanner(System.in);
      System.out.println("Califique la Plei de 1 a 5 estrellas");
      opinion = Leer.nextInt();
     
      if (opinion >=1 && opinion <= 5)  {
      switch (opinion){
          case 1:
          case 2:
              System.out.println ("Nos sentimos apenados que no hayas disfrutado al peli");
              break;
          case 3:
              System.out.println("Has clasificado la peli como buena");
              break;
          case 4:
              System.out.println("Has clasificaod la peli como MUY BUENA");
              break;
          case 5: 
              System.out.println("Fnatastico que hayas disfrutado el entretenimiento!!!");
              break;
      }
      
      } else if(opinion < 0){
              System.out.println("Respuesta negativa?? tan mala fue? :((((");
      } else if(opinion == 0){
              System.out.println("El valor "+ opinion + ". No es valido asi que no se tendra en cuenta");
      } else {
              System.out.println("!Wow! se te fue la mano con la calificacion :D");
              }
      System.out.println("Hasta la proxima!");
    }     
 }

    

