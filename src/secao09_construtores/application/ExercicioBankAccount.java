package secao09_construtores.application;

import secao09_construtores.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBankAccount {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        String accountNumber = sc.nextLine();
        System.out.print("Informe o Titular: ");
        String name = sc.nextLine();
        Account account = new Account(accountNumber, name);
        System.out.println(account);
        System.out.println();

        System.out.print("Deseja realizar um depósito inicial? (s/n) ");
        String opcao = sc.nextLine();
        if (opcao.equalsIgnoreCase("s")) {
            System.out.print("Digite o valor do depósito: ");
            double dep = sc.nextDouble();
            account.deposit(dep);
            System.out.println("Dados da conta atualizados: ");
            System.out.println(account);
            System.out.println();
        }
        else {
            System.out.println("Dados da conta atualizados: ");
            System.out.println(account);
            System.out.println();
        }

        int opc;

        do {
            mostrarMenu();
            System.out.print("Opção selecionada: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    System.out.println("Dados da conta atualizados: ");
                    System.out.println(account);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();
                    account.withdraw(saque);
                    System.out.println("Dados da conta atualizados: ");
                    System.out.println(account);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Digite o novo nome do titular: ");
                    String nome = sc.nextLine();
                    account.updateHolder(nome);
                    System.out.println(account);
                    System.out.println();
                    break;
            }

        } while (opc != 0);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("Selecione uma opção: 1-Depositar | 2-Sacar | 3- Atualizar titular | 0-Sair:");
    }
}
