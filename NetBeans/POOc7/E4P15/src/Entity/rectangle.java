package Entity;

import Interface.Calculator;

public class rectangle extends figure implements Calculator {

    public Integer base;
    public Integer height;

    public rectangle(Integer base, Integer height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void CalculateArea() {
        this.area = this.base * this.height;
    }

    @Override
    public void CalculateSurface() {
        this.perimeter = (this.base + this.height) * 2;
    }

}
