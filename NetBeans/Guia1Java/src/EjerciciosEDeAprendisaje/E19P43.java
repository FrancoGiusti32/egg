package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E19P43 {
public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    int m[][] = new int[4][4];
    int tm[][] = new int[4][4]; 
    boolean AnS;
    System.out.println("Complete te 4x4 matrix");
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
             m[i][j] = read.nextInt();
        }
    }
    System.out.println("Initial Matrix:");
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            if(m[i][j]>=0){
                System.out.print(" ");
            }
            System.out.print((m[i][j])+"/");
        }
        System.out.println("");
    }
    for(int i=0;i<4;i++){  
        for(int j=0;j<4;j++){
            tm[j][i]=m[i][j];
        }
    }
    System.out.println("Iverted Matrix");
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
             if(tm[i][j]>=0){
                System.out.print(" ");
            }
            System.out.print((tm[i][j])+"/");
        }
        System.out.println("");
    }
    AnS=true;
    for(int i=0;i<4;i++){
        if(AnS==false){
            break;
        }
        for(int j=0;j<4;j++){
        if(m[i][j]==((tm[i][j])*-1)){
            AnS = true;
        }else{
           AnS=false;
           break;
        }
        } 
    }
    if (AnS == true){
        System.out.println("Rhis Matrix is an Anti Symmetric Matrix");
    }else{
        System.out.println("Rhis Matrix isn't an Anti Symmetric Matrix");    
    }
}
}
