package Main;

import Entity.Mathematics;
import Service.ServiceMathematics;

public class Main {

    public static void main(String[] args) {
        ServiceMathematics sm=new ServiceMathematics();
        Mathematics m1=new Mathematics();
        int x=(int) (Math.random()*10);
        m1.setN1(x);
        x=(int) (Math.random()*10);
        m1.setN2(x);
        System.out.println( sm.returnHigher(m1));
        System.out.println(sm.power(m1));
        System.out.println(sm.square(m1));
    }

}
