package Service;

import Entity.Mathematics;

public class ServiceMathematics {
    public int returnHigher(Mathematics m){
        return Math.max(m.getN1(), m.getN2());
    }
    public double power(Mathematics m){
        return Math.pow((Math.round(Math.max(m.getN1(), m.getN2()))), (Math.round(Math.min(m.getN1(), m.getN2()))));
    }
    public double square(Mathematics m){
        return Math.sqrt(Math.abs(Math.min(m.getN1(), m.getN2())));
    }
}
