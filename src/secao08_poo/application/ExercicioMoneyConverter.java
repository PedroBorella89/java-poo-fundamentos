package secao08_poo.application;

import secao08_poo.util.MoneyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMoneyConverter {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("What is the dollar amount? ");
        double dollarAmount = sc.nextDouble();

        double total = MoneyConverter.converterValue(dollarPrice, dollarAmount);
        System.out.printf("Amount to be paid in Real: %.2f%n", total);

        sc.close();
    }
}
