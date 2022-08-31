package EjerciciosEDeAprendisaje;
public class E18P43 {
    public static void main(String[] args) {
        int m[][] = new int[4][4];
        int tm[][] = new int[4][4];
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               m[i][j]=(int)(Math.random()*10);
           }
       }
        System.out.println("Initial Matrix:");
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
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
               System.out.print((tm[i][j])+"/");
           }
           System.out.println("");
       }
}
}