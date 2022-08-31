package Service;

import Entity.NIF;
import java.util.Scanner;

public class ServiceNIF {

    public NIF crateNIF() {
        Scanner read = new Scanner(System.in);
        String x[] = new String[23];
        x[0] = "T";
        x[1] = "R";
        x[2] = "W";
        x[3] = "A";
        x[4] = "G";
        x[5] = "M";
        x[6] = "Y";
        x[7] = "F";
        x[8] = "P";
        x[9] = "D";
        x[10] = "X";
        x[11] = "B";
        x[12] = "N";
        x[13] = "J";
        x[14] = "Z";
        x[15] = "S";
        x[16] = "Q";
        x[17] = "V";
        x[18] = "H";
        x[19] = "L";
        x[20] = "C";
        x[21] = "K";
        x[22] = "E";
        NIF nif = new NIF();
        System.out.println("Write your DNI");
        nif.setDNI(read.nextInt());
        nif.setLetter(x[((Integer)(nif.getDNI())%23)]);
        return nif;
    }
    
    public void soutNIF(NIF nif){
        System.out.println(nif.getDNI()+"-"+nif.getLetter());
    }

}
