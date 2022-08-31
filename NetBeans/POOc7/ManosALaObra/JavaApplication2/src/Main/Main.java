package Main;
import Entity.Operation;
import Service.OperationServices;

public class Main {

    public static void main(String[] args) {
            OperationServices os=new OperationServices();
        Operation op=os.createOperation(); 
        os.sum(op);
        os.rest(op);
        os.multiply(op);
        os.divide(op);
    }
    }
    
