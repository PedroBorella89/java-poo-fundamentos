package secao08_poo.entities;

public class Account {

    // Atributos
    private String number;
    private String holder;
    private double balance =  0.00;

    // Construtor
    public Account(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    // Getters and Setters
    public String getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    /*
    Não temos setters para accountNumber e para balance porque
    uma vez aberta, o número da conta não pode ser alterada
    e o saldo da conta não pode ser alterado livremente.
    */

    // Metodos
    @Override
    public String toString() {
        return "Número da conta: " + number
                + " | Titular: " + holder
                + " | Saldo: " + balance;
    }

    public void updateHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount <= 0) {
            System.out.println("Saldo insuficiente!");
        }
        else {
        double tax = 5.00;
        balance -= amount + tax;
        }
    }
}
