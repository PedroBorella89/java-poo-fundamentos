package secao10_arrays.application;

import secao10_arrays.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPeso {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1-Ler a quantidade
        System.out.print("Quantas pessoas serão digitadas: ");
        int quantidadePessoas = sc.nextInt();
        sc.nextLine();

        // 2-Criar o vetor
        Pessoa[] pessoas = new Pessoa[quantidadePessoas];

        // 3-Cadastrar as pessoas
        System.out.println();
        System.out.println("=== Cadastro de Pessoas ===");
        System.out.println();

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = sc.nextInt();
            System.out.print("Digite a peso da pessoa " + (i + 1) + ": ");
            double peso = sc.nextDouble();
            sc.nextLine();
            pessoas[i] = new Pessoa(nome, idade, peso);
            System.out.println();
        }

        // 4-Processamento

        // Peso médio
        double soma = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            soma += pessoas[i].getPeso();
        }
        double media = soma / quantidadePessoas;

        // Percentual de pessoas com menos de 75 kg
        double pmenor = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getPeso() < 75.0) {
                pmenor ++;
            }
        }

        double percentualMenor = (pmenor / quantidadePessoas) * 100;

        // 5-Saída
        System.out.println();
        System.out.println("=== Resultado ===");
        System.out.println();

        System.out.printf("Peso Médio: %.2f%n", media);
        System.out.printf("Pessoas com peso menor de 75kg: %.2f%%\n", percentualMenor);

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getPeso() < 75.0) {
                System.out.printf("%s\n", pessoas[i].getNome());
            }
        }

        System.out.println();
        System.out.println("=== Fim ===");
        System.out.println();
        sc.close();
    }
}
