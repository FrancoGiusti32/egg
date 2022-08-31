package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E12P43 {
    public static void main(String[] args) {
        String chain;
        Scanner read = new Scanner(System.in);
        int correct=0;
        int incorrect=0;
        System.out.println("pls insert a secuens of chains that respect the format of a device RS232 and stop it whit a [&&&&&] chain");
       do{
        chain = read.nextLine();
        if(chain.equals("&&&&&")){
            break;
        }
        if((chain.length()==5)&&( chain.substring(0, 1).equals("X"))&&(chain.substring(4,5).equals("O"))){
              correct += 1;
        }else{
            incorrect += 1;
        }
       }while(!(chain.equals("&&&&&")));
        System.out.println(correct+" Corrects");
        System.out.println(incorrect+" Incorrects");
    }
}
