package EjerciciosEDeAprendisaje;
import java.util.Scanner;

public class E20P45 {
public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    int m[][] = new int[3][3];
    System.out.println("write numbers to complete the MAGIC MATRIX");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            do{
                m[i][j]=read.nextInt();
                if(!(m[i][j]<10&&m[i][j]>0)){
                System.out.println("wrong number it has to be below 9 and above 0");
                }
            }while(!(m[i][j]<10&&m[i][j]>0));
         }
    }
    System.out.println("Initial Matrix:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print((m[i][j])+"/");
        }
        System.out.println("");}
    check(m);
}
public static void check(int m[][]){
    int columns=columns(m);
    int rows=rows(m);
    int diagonal=diagonal(m);
    int conterDiagonal=conterDiagonal(m);
    if(columns==rows && rows==diagonal && diagonal==conterDiagonal && conterDiagonal!=0){
        System.out.println("This matrix is MAGIC");
    }else{
        System.out.println("This matrix ISN´T magic :(");
    }
}
public static int diagonal(int m[][]){
    int c=0;
    for(int i=0;i<3;i++){
        c+= m[i][i];
    }
    return c;
}
public static int conterDiagonal(int m[][]){
    int c=0;
    for(int i=0;i<3;i++){
        c+= m[i][2-i];
    }
    return c;
}
public static int rows(int m[][]){
    int c=0;
     int sum[] = new int[3];
    for(int j=0;j<3;j++){
    for(int i=0;i<3;i++){
        sum[j] += m[j][i];
    }}
    for(int i=1;i<2;i++){
    if(sum[i]==sum[i-1]){
        c=sum[i];
    }else{
        c=0;
        break;
    }
    }    
    return c;
}
public static int columns(int m[][]){
    int c=0;
    int sum[] = new int[3];
    for(int j=0;j<3;j++){
    for(int i=0;i<3;i++){
        sum[j] += m[i][j];
    }}
    for(int i=1;i<2;i++){
    if(sum[i]==sum[i-1]){
        c=sum[i];
    }else{
        c=0;
        break;
    }
    }    
    return c ;
}
}
