package Main;

import Entity.Acount;
import Service.AcountService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        AcountService as = new AcountService();
        Acount a1 = as.createAcount();
        int n = 0;
        do {
            System.out.println("What do you want to do?");
            System.out.println("[1]Insert");
            System.out.println("[2]Extract");
            System.out.println("[3]Fast Extract");
            System.out.println("[4]Consult Balance");
            System.out.println("[5]Consult Info");
            System.out.println("[6]Exit");
            n = read.nextInt();
            switch (n) {
                case 1:
                    as.insert(a1);
                    break;
                case 2:
                    as.withdrawals(a1);
                    break;
                case 3:
                    as.fastWithdrawals(a1);
                    break;
                case 4:
                    as.consultBalance(a1);
                    break;
                case 5:
                    as.consultInfo(a1);
                    break;
                case 6:
                    System.out.println("Thank you for using our bank, see you later!");
                    break;
                default:
                     System.out.println("Wrong number try again");
                     break;
            }
        } while (n != 6);
    }

}
