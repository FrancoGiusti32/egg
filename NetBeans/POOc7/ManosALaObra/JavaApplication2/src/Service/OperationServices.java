package Service;

import Entity.Operation;
import java.util.Scanner;

public class OperationServices {

    public Operation createOperation() {;
        Scanner read = new Scanner(System.in);
        Operation op = new Operation();
        System.out.println("Write the first number of your operation");
        op.setNumber1(read.nextInt());
        System.out.println("Write the second number of your operation");
        op.setNumber2(read.nextInt());
        return op;
    }
    public void sum(Operation op){
        System.out.println("the sum is "+(op.getNumber1()+op.getNumber2()));
    }
    public void rest(Operation op){
        System.out.println("the rest is "+(op.getNumber1()-op.getNumber2()));
    }
    public void multiply(Operation op){
        if((op.getNumber1()==0) || op.getNumber2()==0 ){
            System.out.println("[ERROR]One of the terms was 0 so the program will shout 0");
        }
        System.out.println("the multiply is "+(op.getNumber1()*op.getNumber2()));
    }
    public void divide(Operation op){
        if((op.getNumber1()==0) || op.getNumber2()==0 ){
            System.out.println("[ERROR]One of the terms was 0 so the program will shout 0");
        }
        System.out.println("the divide is "+(op.getNumber1()/op.getNumber2()));
    }

}
