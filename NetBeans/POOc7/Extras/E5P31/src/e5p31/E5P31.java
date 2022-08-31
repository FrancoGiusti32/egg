
package e5p31;
import java.util.Scanner;
import e5p31.month;
public class E5P31 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        month m1= new month();
        System.out.println("Write a mounth in lowercase");
        String m=read.next();
        while(!m.equalsIgnoreCase(m1.crateMonth(1))){
            System.out.println("Try again");  
          m=read.next();
        }
        System.out.println("great job!");
    }
    
}
