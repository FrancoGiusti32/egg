package EjerciciosExtra;
import java.util.Scanner;

public class E7P46 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);        
        System.out.println("Slect your metod");
        System.out.println("[1]while");
        System.out.println("[2]do--while");
        int n=read.nextInt();
        switch(n){
            case 1:
                WhileType();
                break;
            case 2:
                DoWhileType();
                break;
            default:
                System.out.println("ERROR THE NUMBER INS'T VALID");
                break;
        }
    }
    public static void DoWhileType(){
        Scanner read = new Scanner(System.in);
        int i=0;
        int Max=0;
        int Min=0;
        int sum=0;
        System.out.println("How many numbners do you want to inser in hour program?");
        int n=read.nextInt();
        System.out.println("Write the numbers");    
        do{
        int n1 = read.nextInt();
        if (n1<0){
            System.out.println("ERROR the number must be positive");
            continue;
        }
        if(i==0){
            Min=n1;
        }
        Max =(int) (Math.max(Max, n1));
        Min =(int)(Math.min(Min, n1)); 
        sum +=n1;
        i += 1;
        }while (i<n);  
        System.out.println("The averege of altt the numbers is "+(sum/n));
        System.out.println("The maximun is "+Max);
        System.out.println("The minimun is "+Min);
    }
    public static void WhileType(){
        Scanner read = new Scanner(System.in);
        int i=0;
        int Max=0;
        int Min=0;
        int sum=0;
        System.out.println("How many numbners do you want to inser in hour program?");
        int n=read.nextInt();
        System.out.println("Write the numbers");    
        while (i<n){
        int n1 = read.nextInt();
        if (n1<0){
            System.out.println("ERROR the number must be positive");
            continue;
        }
        if(i==0){
            Min=n1;
        }
        Max =(int) (Math.max(Max, n1));
        Min =(int)(Math.min(Min, n1)); 
        sum +=n1;
        i += 1;
        }  
        System.out.println("The averege of altt the numbers is "+(sum/n));
        System.out.println("The maximun is "+Max);
        System.out.println("The minimun is "+Min);
    }
}
