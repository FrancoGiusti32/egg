package EjerciciosEDeAprendisaje;
import java.util.Scanner;
public class E11P43 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Write 2 numbers with which do operetions");
        int n1 = read.nextInt();
        int n2 = read.nextInt();
        menu(n1,n2,read);
    } 
    public static void menu(int n1,int n2, Scanner read){
        
        System.out.println("[1]Add");
        System.out.println("[2]Subtract");
        System.out.println("[3]Multiply");
        System.out.println("[4]Divide");
        System.out.println("[5]Exit");
        System.out.println("[Chose an option]");
        int choice = read.nextInt(); 
        switch(choice){
            case 1:
                addition(n1,n2,read);
                break;
            case 2:
                 Subtraction(n1,n2,read);
                break;
            case 3:
                 Multiplication(n1,n2,read);
                break;
            case 4:
                Division(n1,n2,read);
                break;
            case 5:
                System.out.println("Are you sure that you want to exit the program? y/n");
                String answer = read.next();
                if(answer.equals("y")){
                    break;
                }else{
                 menu(n1,n2,read);   
                }
            default:
                System.out.println("Elecction incompatible");
                menu(n1,n2,read);
                 break;
        }
    }
    public static void addition(int n1,int n2,Scanner read){
        System.out.println("The adition of "+n1+" and "+n2+" is "+(n1+n2));
    menu(n1,n2,read);   
    }
    public static void Subtraction(int n1,int n2,Scanner read){
        System.out.println("The Subtraction of "+n1+" and "+n2+" is "+(n1-n2));
    menu(n1,n2,read);   
    }
    public static void Multiplication(int n1,int n2,Scanner read){
        System.out.println("The Multiplication of "+n1+" and "+n2+" is "+(n1*n2));
    menu(n1,n2,read);   
    }
    public static void Division(int n1,int n2,Scanner read){
        double division = n1/n2;
        System.out.println("The Division of "+n1+" and "+n2+" is "+division);
    menu(n1,n2,read);   
    }
}
