package EjerciciosExtra;


public class E2P46 {
    public static void main(String[] args) {
     int A = 4;
     int B = 1;
     int C = 2;
     int D = 3;
     int aux = 0;
        System.out.println("A "+A);
        System.out.println("B "+B);
        System.out.println("C "+C);
        System.out.println("D "+D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("/////////////");
        System.out.println("A "+A);
        System.out.println("B "+B);
        System.out.println("C "+C);
        System.out.println("D "+D);
    }
}
