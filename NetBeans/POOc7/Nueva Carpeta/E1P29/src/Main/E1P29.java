package Main;
import java.util.Date;
import java.util.Scanner;
public class E1P29 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Write the day of the date");
        int day= read.nextInt();
        System.out.println("Write the month of the date");
        int month= read.nextInt();
        System.out.println("Write the year of the date");
        int year= read.nextInt();
        Date createdDate=new Date(year-1900,month,day);
        System.out.println(createdDate);
        Date actualDate=new Date();
        System.out.println(actualDate);
        int y1=actualDate.getYear()+1900;
        int y2=createdDate.getYear()+1900;
        System.out.println("There are "+(y1-y2)+" years of difierence between these dates");
    }
    
}
