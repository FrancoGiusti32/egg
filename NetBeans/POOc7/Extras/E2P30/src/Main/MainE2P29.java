package Main;

import Entity.Points;
import Service.ServicePoints;

public class MainE2P29 {

    public static void main(String[] args) {
        ServicePoints sp=new ServicePoints();
        Points p1=sp.cratePoints();
        System.out.println(sp.calculateDistance(p1));
    }

}
