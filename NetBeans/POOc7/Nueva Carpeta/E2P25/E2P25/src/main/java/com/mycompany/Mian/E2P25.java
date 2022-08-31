package com.mycompany.Mian;
import Service.CircunferenceService;
import Entity.Circunference;
public class E2P25 {

    public static void main(String[] args) {
        CircunferenceService cs=new CircunferenceService();
        Circunference c1=cs.createCircunference();
        cs.calculateArea(c1);
        cs.calculatePerimeter(c1);
        System.out.println(c1);
    }
}
