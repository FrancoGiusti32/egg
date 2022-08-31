package Entity;

import Interface.Calculator;

public class circle extends figure implements Calculator {
    
    public Integer radio;

    public circle(Integer radio) {
        this.radio = radio;
    }
            
    @Override
    public void CalculateArea() {
        this.area = pi * Math.pow(this.radio, 2);
    }

    @Override
    public void CalculateSurface() {
        this.perimeter = pi * this.radio * 2;
    }

}
