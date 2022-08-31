package EjerciciosExtra;


public class E22P49 {
    public static void main(String[] args) {
        int x[][]=new int[3][3];
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;i<3;i++){
                x[i][j]=(int)(Math.random()*10);
            }
        }
         for(int i=0;i<3;i++){
            for(int j=0;i<3;i++){
               sum+=x[i][j];
            }
        }
         System.out.println(sum);
    }
}
