package EjerciciosExtra;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

public class E23P49 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String x[][]=new String[5][5];
        //fill the big matrix 
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                x[i][j]=String.valueOf((int)((Math.random()/2)*10));
            }
        }
        System.out.println("Write the words for your soup letter");
        System.out.println("More than 3 letters and less tha 5");
        for(int i=0;i<3;i++){
            String word=read.nextLine();
                int num=(int)(Math.random()*10);
                if(num>5){
                    num=num/2;
                }
            for(int j=0;j<5;j++){
                x[num][j]=word.substring(j,j+1);
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(x[i][j]+"/");
            }
            System.out.println("");
        }
    }
}
