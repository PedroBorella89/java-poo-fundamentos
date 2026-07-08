package secao10_arrays.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAbaixoDaMedia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1- Tamanho do vetor
        System.out.println();
        System.out.println("===== Início =====");
        System.out.println();
        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidadeElementos = sc.nextInt();

        // 2- Criar o vetor
        double[] vetor = new double[quantidadeElementos];
        System.out.println();

        // 3- Entrada
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número "  + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }

        // 4- Processamento
        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        // 5- Saída
        System.out.println();
        System.out.println("===== Resultado =====");
        System.out.println();

        System.out.printf("Média do vetor: %.2f\n", media);
        System.out.println();

        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.2f\n", vetor[i]);
            }
        }

        System.out.println();
        System.out.println("===== Fim =====");
        System.out.println();

        sc.close();
    }
}
