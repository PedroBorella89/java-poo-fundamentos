package secao13_herança_e_polimorfismo.application;

import secao13_herança_e_polimorfismo.entities.Account;
import secao13_herança_e_polimorfismo.entities.BusinessAccount;
import secao13_herança_e_polimorfismo.entities.SavingsAccount;

public class ProgramAccount {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Bill", 0.0);
        BusinessAccount bacc1 = new BusinessAccount(1004, "Ratan", 1500.0, 4000.0);
        SavingsAccount sacc1 = new SavingsAccount(1006, "Doom", 500.0, 0.01);

        // UPCASTING
        Account acc2 = new BusinessAccount(1002, "Joao", 1000.0, 5000.0);
        Account acc3 = new SavingsAccount(1003, "Denao", 20000.0, 0.01);

        // DOWNCASTING
        if (acc2 instanceof BusinessAccount) {
            BusinessAccount b1 = (BusinessAccount) acc2;
            bacc1.loan(2000.0);
            System.out.println(bacc1.getHolder() + " " + bacc1.getBalance());
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount s1 = (SavingsAccount) acc3;
            s1.updateBalance();
            System.out.println(s1.getHolder() + " loan completed!" + " Balance: " + s1.getBalance());
        }

        if (acc1 instanceof BusinessAccount) {
            BusinessAccount b2 = (BusinessAccount) acc1;
            b2.loan(2000.0);
            System.out.println("Loan!");
        }
        else {
            System.out.println(acc1.getHolder() + ", loan denied!");
        }
    }
}
