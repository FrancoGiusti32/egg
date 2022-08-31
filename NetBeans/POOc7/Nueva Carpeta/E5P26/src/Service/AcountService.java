package Service;

import Entity.Acount;
import java.util.Scanner;

public class AcountService {

    public Scanner read = new Scanner(System.in);

    public Acount createAcount() {
        Acount a1 = new Acount();
        System.out.println("Write your DNI");
        a1.setDNI(read.nextLong());
        System.out.println("Write your acount number");
        a1.setAcountNumber(read.nextInt());
        System.out.println("Write your current balance");
        a1.setCurrentBalence(read.nextDouble());
        return a1;
    }

    public void insert(Acount a1) {
        System.out.println("Writhe the amount of money to get into your acount");
        a1.setCurrentBalence((a1.getCurrentBalence()) + (read.nextDouble()));
    }

    public void withdrawals(Acount a1) {
        System.out.println("Writhe the amount of money to withdrawals of your acount");
        a1.setCurrentBalence((a1.getCurrentBalence()) - (read.nextInt()));
        if (a1.getCurrentBalence() < 0) {
            a1.setCurrentBalence(0);
        }
    }

    public void fastWithdrawals(Acount a1) {
        a1.setCurrentBalence((a1.getCurrentBalence()) - ((a1.getCurrentBalence()) * 0.2));
        if (a1.getCurrentBalence() < 0) {
            a1.setCurrentBalence(0);
        }
    }

    public void consultBalance(Acount a1) {
        System.out.println(a1.getCurrentBalence());
    }

    public void consultInfo(Acount a1) {
        System.out.println(a1);
    }
}
