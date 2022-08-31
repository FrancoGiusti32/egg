package ManosALaObraYFix;
import java.util.Scanner;

public class MAO11P31 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String Finish = "";
        String vocal = "";
        String character = ".";
        System.out.println("write a secuence of characters that you want to convert into a codified sencente, and end it whit a point"); 
        do{
        character = read.next();
        switch (character){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                vocal =  Code(character);
                break;
            default:
                vocal = (character);
            break;
        }
           Finish = Finish + vocal;
        }while (!(character.equals (".")));
        System.out.println(Finish);
    }
    
    public static String Code (String c) {
        String x;
        x = "";
        switch (c){
            case "a":
                x="@";
                break;
            case "e":
                x="#";
                break;
            case "i":
                x="$";
                break;
            case "o":
                x="%";
                break;
            case "u":
                x="*";
                break;
            default:
                System.out.println("ERROR, RESTART PROGRAM");
        }   
    return x ;
    }
}
