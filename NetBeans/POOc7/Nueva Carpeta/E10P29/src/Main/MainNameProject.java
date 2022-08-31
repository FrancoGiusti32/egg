package Main;

    import java.util.Arrays;

public class MainNameProject {

    public static void main(String[] args) {
        double j[]=new double[20];
        double x[] = new double[50];
        for (int i=0;i<20;i++){
            j[i]=0;
        }
        for (int i = 0; i < 50; i++) {
            x[i] = (int) (Math.random()*10);
            System.out.print(x[i] + "/");
            if ((i%10)==0 && i !=0) {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("///////////////////////////////////////////");
        Arrays.sort(x);
        j = Arrays.copyOf(x,20);
        for (int i = 10; i < 20; i++) {
            j[i] = 0.5;
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(x[i] + "/");
            if (i % 10 == 0&& i !=0) {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("/////////////////////////////////////");
        for (int i = 0; i < 20; i++) {
            System.out.print(j[i] + "/");
            if (i % 10 == 0&& i !=0) {
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("//");
    }
}   
