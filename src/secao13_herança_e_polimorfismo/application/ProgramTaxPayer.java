package secao13_herança_e_polimorfismo.application;

import secao13_herança_e_polimorfismo.entities.Company;
import secao13_herança_e_polimorfismo.entities.Individual;
import secao13_herança_e_polimorfismo.entities.TaxPayer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTaxPayer {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income ($): ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i' || ch == 'I') {
                System.out.print("Health expenditures ($): ");
                double healthExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else if (ch == 'c' || ch == 'C') {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                taxPayers.add(new Company(name, anualIncome, employees));
            }
        }

        System.out.println();
        System.out.println("=== TAXES PAID ===");
        for (TaxPayer taxPayer : taxPayers) {
            System.out.println(taxPayer.getName() + ": " +  String.format("$%.2f", taxPayer.taxesPay()));
        }

        System.out.println();
        double total = 0.0;
        for (TaxPayer taxPayer : taxPayers) {
            total += taxPayer.taxesPay();
        }
        System.out.printf("TOTAL: $%.2f", total);

        sc.close();
    }
}
