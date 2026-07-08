package secao10_arrays.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNumerosPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1- Ler a quantidade
        System.out.println();
        System.out.println("===== Início =====");
        System.out.println();

        System.out.print("Quantos números você vai digitar? ");
        int quantidadeNumeros = sc.nextInt();

        // 2- Criar o vetor
        int[] numeros = new int[quantidadeNumeros];
        System.out.println();

        // 3- Entrada
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();

        // 4- Saída
        System.out.println("===== Números pares =====");
        int qtdePares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf("%d ", numeros[i]);
                qtdePares++;
            }
        }

        System.out.println();
        System.out.printf("\nQuantidade de pares: %d%n", qtdePares);
        System.out.println();
        System.out.println("===== Fim =====");

        sc.close();
    }
}
