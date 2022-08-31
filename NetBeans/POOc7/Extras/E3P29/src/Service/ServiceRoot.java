package Service;

import java.util.Scanner;
import Entity.Root;

public class ServiceRoot {

    public Root createRoot() {
        Scanner read = new Scanner(System.in);
        Root r1 = new Root();
        System.out.println("Write a");
        r1.setA(read.nextInt());
        System.out.println("Write b");
        r1.setB(read.nextInt());
        System.out.println("Write c");
        r1.setC(read.nextInt());
        return r1;
    }

    public double getDiscriminating(Root r1) {
        double d;
        d = (Math.pow(r1.getB(), 2)) - 4 * r1.getA() * r1.getC();
        return d;
    }

    public boolean hasRoots(Root r1) {
        boolean d = false;
        if (getDiscriminating(r1) >= 0) {
            d = true;
        }
        return d;
    }

    public boolean hasRoot(Root r1) {
        boolean d = false;
        if (getDiscriminating(r1) == 0) {
            d = true;
        }
        return d;
    }

    public void getRoots(Root r1) {
        if (hasRoots(r1)) {
            System.out.println("x1 = " + ((-(r1.getB()) + Math.sqrt(((Math.pow(r1.getB(), 2)) - (4 * (r1.getA()) * (r1.getC()))))) / (2 * r1.getA())));
            System.out.println("x2 = " + ((-(r1.getB()) - Math.sqrt(((Math.pow(r1.getB(), 2)) - (4 * (r1.getA()) * (r1.getC()))))) / (2 * r1.getA())));
        } else {
            System.out.println("This ecuations have not roots");
        }
    }

    public void getRoot(Root r1) {
        if (hasRoot(r1)) {
            System.out.println("x = " + (-(r1.getB()) + Math.sqrt(((Math.pow(r1.getB(), 2)) - (4 * (r1.getA()) * (r1.getC())))) / (2 * (r1.getA()))));
        } else {
            System.out.println("This ecuations have not roots");
        }
    }

    public void calculateRoot(Root r1) {
        if (hasRoot(r1)) {
            System.out.println("It has one root and it is:");
            getRoot(r1);
        } else if (hasRoots(r1)) {
            System.out.println("it has 2 roots and they are;");
            getRoots(r1);
        } else {
            System.out.println("This quadratic equation has no roots");
        }
    }
    
    public void graphFunction(Root r1){
        int a=r1.getA();
        int b=r1.getB();
        int c=r1.getC();
                for (int y = -29; y < 30; y++) {
            for (int x = -29; x < 30; x++) {
                if(-y==a*(Math.pow(x, 2) )+b*x+c||-y+1==a*(Math.pow(x, 2) )+b*x+c||-y-1==a*(Math.pow(x, 2) )+b*x+c){
                    if(x>0){
                        System.out.print(" X");
                    }else{
                        System.out.print(" X");
                    }
                }else if(y==0 && x==0){
                    System.out.print(" +");
                }else if (y == 0 ) {
                    System.out.print(" -");
                }else if(x == 0){
                    System.out.print(" |");
                } else {
                    System.out.print(" .");
                }

            }
            System.out.println("");
        }
    }
}
