package EjerciciosEDeAprendisaje;


public class E13P43 {
    public static void main(String[] args) {
     int elements = 10;
        
        for(int i = 0; i < elements; i++){
            System.out.print("*");
        }
         System.out.println("");
        for(int i = 0; i < elements-2; i++){
             System.out.print("*");
            for (int j = 0; j < elements-2; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for(int i = 0; i < elements; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
