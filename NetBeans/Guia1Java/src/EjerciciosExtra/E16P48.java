package EjerciciosExtra;
import java.util.Scanner;

public class E16P48 {
    public static void main(String[] args) {
        Scanner read1=new Scanner(System.in);
        Scanner read2=new Scanner(System.in);
        System.out.println("How meny people you want to show?");
        int n=read1.nextInt();
        System.out.println("Write the name and age of each one");
        String[] name=new String[n];
        int[] age=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Person "+(i+1));
            name[i]=read2.nextLine();
            System.out.println("age");
            age[i]=read1.nextInt();
        }
        System.out.println("GREAT!");
        Show(age,name,n);
    }
    public static void Show(int a[], String n[], int x){
        Scanner read=new Scanner(System.in);
        String answer="yes";
        int i=0;
        do{
            if(i==x){
                i=0;
            }
            System.out.println(n[i]);
            System.out.println(a[i]);
             if(a[i]>17){
                System.out.println("Is adult");
            }
            System.out.println("o you want us to show another person?");
            answer=read.nextLine();
          i++;  
        }while(!(answer.toLowerCase().equals("no")));
    }
}
