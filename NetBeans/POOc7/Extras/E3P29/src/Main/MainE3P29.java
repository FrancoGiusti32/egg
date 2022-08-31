package Main;

import Entity.Root;
import Service.ServiceRoot;

public class MainE3P29 {

    public static void main(String[] args) {
        ServiceRoot sr = new ServiceRoot();
        Root r = sr.createRoot();
        sr.calculateRoot(r);
        sr.graphFunction(r);
    }

}
