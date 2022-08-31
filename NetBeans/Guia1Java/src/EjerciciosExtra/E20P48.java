package EjerciciosExtra;


public class E20P48 {
    public static void main(String[] args) {
        int[] x=new int[5];
        rellenar(x);
        imprimir(x);
    }
    public static int[] rellenar(int x[]){
        for(int i=0;i<5;i++){
            x[i]=(int)(Math.random()*10);
        }
        return x;
    }
    public static void imprimir(int x[]){
        for(int i=0;i<5;i++){
            System.out.println(x[i]);
        }
    } 
}
