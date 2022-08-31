package Main;
import Entity.Chain;
import Service.ChainService;
import java.util.Scanner;
public class E8P28 {

    public static void main(String[] args) {
        Chain  chain= new Chain();
        ChainService cs=new ChainService();
        Scanner read=new Scanner(System.in);
        System.out.println("Write the sentence: ");
        chain.setChain(read.nextLine());
        chain.setLenght((chain.getChain().length()));
        cs.showVocals(chain);
        cs.invertChain(chain);
        cs.linkChains(chain);
        cs.compareLength(chain);
        System.out.println("What letter do you want to find?");
        System.out.println(cs.find(chain, read.nextLine()));
         cs.replace(chain);
    }
    
}
