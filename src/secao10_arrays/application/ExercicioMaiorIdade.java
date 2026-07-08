package secao10_arrays.application;

import secao10_arrays.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaiorIdade{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Tamanho do vetor
        System.out.println();
        System.out.println("===== Início =====");
        System.out.println();
        System.out.print("Quantas pessoas você vai digitar? ");
        int quantidadePessoas = sc.nextInt();
        sc.nextLine();
        System.out.println();

        // Criar o vetor
        Pessoa[] pessoas = new Pessoa[quantidadePessoas];

        // Entrada
        for(int i = 0; i < pessoas.length; i++){
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = sc.nextInt();
            System.out.print("Digite o peso da pessoa " + (i + 1) + ": ");
            double peso = sc.nextDouble();
            pessoas[i] =  new Pessoa(nome, idade, peso);
            sc.nextLine();
            System.out.println();
        }

        // Processamento
        Pessoa pessoaMaisVelha = pessoas[0];
        for(int i = 1; i < pessoas.length; i++){
            if (pessoas[i].getIdade() > pessoaMaisVelha.getIdade())  {
                pessoaMaisVelha = pessoas[i];
            }
        }

        // Saída
        System.out.println();
        System.out.println("===== Resultado =====");
        System.out.println();
        System.out.printf("Pessoa mais velha: %s\n", pessoaMaisVelha.getNome());
        System.out.println();
        System.out.println("===== Fim =====");
        System.out.println();

        sc.close();
    }
}
