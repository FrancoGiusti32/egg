package ManosALaObraYFix;
import java.util.Scanner;

public class MAO9P27 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int suma = 0;
        int cont = 0;
        do {
            cont = cont+1;
            System.out.println("write a number");
            int num = read.nextInt();
            if (num < 1 && num > -1){
                break;
            }else {
                if(num<0){
                    continue;
                }
            }
            suma = suma + num;       
     } while(cont != 20);    
        System.out.println(+suma);
}
}