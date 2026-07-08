package secao10_arrays.application;

import secao10_arrays.entities.Hospede;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPensionato {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criar o vetor
        System.out.println();
        System.out.println("========== Início ==========");
        System.out.println();
        System.out.print("Quantos quartos serão alugados? ");
        int quantidadeQuartos = sc.nextInt();
        Hospede[] hospedes = new Hospede[10];
        sc.nextLine();

        // Entrada
        System.out.println();
        System.out.println("========== Cadastro ==========");
        System.out.println();
        for (int i = 0; i < quantidadeQuartos; i++) {
            System.out.print("Nome do Hospede " + (i + 1) + ": ");
            String nome = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Número do quarto: ");
            int numeroQuarto = sc.nextInt();
            sc.nextLine();
            hospedes[numeroQuarto] = new Hospede(nome, email);
            System.out.println();
        }

        // Saida
        System.out.println();
        System.out.println("========== Quartos Alugados ==========");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (hospedes[i] != null) {
                System.out.println(i + ": " + hospedes[i]);
            }
        }

        System.out.println();
        System.out.println("========== Fim ==========");
        System.out.println();
        sc.close();
    }
}
