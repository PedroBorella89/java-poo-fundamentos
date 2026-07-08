package secao10_arrays.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAltura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = sc.nextInt();

        double[] alturas = new double[quantidadePessoas];

        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Digite a altura " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < alturas.length; i++) {
            soma += alturas[i];
        }

        double media = soma / alturas.length;

        System.out.printf("Media: %.2f\n", media);

        sc.close();
    }
}
