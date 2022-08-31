package Entities;

public class card {

    public String mark;
    public Integer number;

    public card(String mark, Integer number) {
        this.mark = mark;
        this.number = number;
    }
    
    

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  number+" of "+mark;
    }
    
    
}
