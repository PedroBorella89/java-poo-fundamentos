package secao10_arrays.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1-Tamanho do vetor
        System.out.print("Quantos números você vai digitar? ");
        int quantidadeNumeros = sc.nextInt();

        // 2-Criar o vetor
        double[] numeros = new double[quantidadeNumeros];

        // 3-Entrada de dados
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        // 4-Processamento de dados
        double soma = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        double media = soma / quantidadeNumeros;

        // 5-Saída de dados
        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%.2f | ", numeros[i]);
        }

        System.out.printf("\nSOMA: %.2f%n", soma);
        System.out.printf("MEDIA: %.2f%n", media);

        sc.close();
    }
}
