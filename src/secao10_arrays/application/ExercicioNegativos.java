package secao10_arrays.application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1-Tamanho do vetor
        System.out.print("Quantos números você vai digitar? ");
        int quantidadeNumeros = sc.nextInt();

        // 2-Criar o vetor
        int[] numeros = new int[quantidadeNumeros];

        // 3-Entrada
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 4-Saída
        System.out.println();
        System.out.println("Números Negativos:");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.printf((i + 1) + " %d\n", numeros[i]);
            }
        }

        sc.close();
    }
}
