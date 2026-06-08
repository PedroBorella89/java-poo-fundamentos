package secao08_poo.util;

public class MoneyConverter {

    public static final double IOF = 0.06;

    public static double converterValue(double dollarPrice, double dollarAmount) {

        double grossAmount = dollarPrice * dollarAmount;
        double tax = grossAmount * IOF;

        return grossAmount + tax;
    }
}
