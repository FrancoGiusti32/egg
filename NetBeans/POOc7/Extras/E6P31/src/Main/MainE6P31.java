package Main;

import Entity.Hangman;
import Service.ServiceHangman;

public class MainE6P31 {

    public static void main(String[] args) {    
        
        ServiceHangman sh=new ServiceHangman();
        Hangman  hm =sh.crateHangman();
        sh.game(hm);
    }

}
