package Main;

import Entity.NIF;
import Service.ServiceNIF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Utilities.Comparators;

public class E4P30 {

    public static void main(String[] args) {
        List<NIF> nifList = new ArrayList<>();
        ServiceNIF sn = new ServiceNIF();
        nifList.add(sn.crateNIF());
        nifList.add(sn.crateNIF());
        for (NIF nif : nifList) {
            System.out.println(nif);
        }
        Collections.sort(nifList, Comparators.OrderForDNI);
        for (NIF nif : nifList) {
            System.out.println(nif);
        }
    }

}
