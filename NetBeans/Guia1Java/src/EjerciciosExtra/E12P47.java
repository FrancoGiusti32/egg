package EjerciciosExtra;


public class E12P47 {
    public static void main(String[] args) {
        String a;
        String b;
        String c;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int h=0;h<10;h++){
                    a=String.valueOf(i);
                    b=String.valueOf(j);
                    c=String.valueOf(h);
                    if(i==3){
                        a="E";
                    }
                    if(j==3){
                        b="E";
                    }
                    if(h==3){
                        c="E";
                    }
                    System.out.println(a+"-"+b+"-"+c);
                }
            }
        }
    }
}
