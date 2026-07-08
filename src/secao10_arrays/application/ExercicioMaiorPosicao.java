package secao10_arrays.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1- Tamanho do vetor
        System.out.println();
        System.out.println("===== Início =====");
        System.out.println();
        System.out.print("Quantos números você vai digitar? ");
        int quantidadeNumeros = sc.nextInt();

        // 2- Criar o vetor
        double[] numeros = new double[quantidadeNumeros];
        System.out.println();

        // 3- Entrada
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número "  + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        double maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        // 4- Saída
        System.out.println();
        System.out.println("===== Resultado =====");
        System.out.println();
        System.out.printf("Maior: %.2f\n", maior);
        System.out.println();
        System.out.println("====== Fim =====");

        sc.close();
    }
}
