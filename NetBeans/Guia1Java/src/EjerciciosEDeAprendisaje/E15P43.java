package EjerciciosEDeAprendisaje;


public class E15P43 {
    public static void main(String[] args) {
     int matrix[] = new int[100];
     for (int i=0; i<100; i++){
         matrix[i]=i+1;
     }
     for (int i=99; i>-1; i--){
         System.out.println(matrix[i]);
     }
    }
}
