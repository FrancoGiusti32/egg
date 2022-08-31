package EjerciciosExtra;
import java.util.Scanner;

public class E21P48 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int n=2;
        int[][] x=new int[n][4];
        double[] note=new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Write the 4 notes for your "+(i+1)+" alumn");
            for(int j=0;j<4;j++){
                switch (j){
                    case 0:
                    case 1:
                        System.out.println("write the note for the practical worck "+(j+1));
                        break;
                    case 2:
                    case 3:
                        System.out.println("write the note integrator "+(j+1));
                        break;
                }
                System.out.println("note "+(j+1));
                x[i][j]=read.nextInt();
            }
        }
        //calculo
        for(int i=0;i<n;i++){
            note[i]=(x[i][0]*0.1+x[i][1]*0.15+x[i][2]*0.25+x[i][3]*0.5);
        }
        //presentacion
        for(int i=0;i<n;i++){
            if(note[i]<7){
                System.out.println("Alumn "+(i+1)+" disapprove");
            }else{
                System.out.println("Alumn "+(i+1)+" approve");
            }
        }
    }
}
