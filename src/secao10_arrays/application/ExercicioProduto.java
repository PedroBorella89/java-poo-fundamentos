package secao10_arrays.application;

import secao10_arrays.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProduto {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1- Determinar o tamanho do vetor
        System.out.print("Digite a quantidade de produtos: ");
        int quantidadeProdutos = sc.nextInt();

        // 2- Criar o vetor
        Produto[] produtos = new Produto[quantidadeProdutos];

        // 3- Entrada
        for (int i = 0; i < produtos.length; i++) {
            sc.nextLine(); // limpar o buffer
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            double preco = sc.nextDouble();
            produtos[i] = new Produto(nome, preco);
        }

        // 4- Processamento
        double soma = 0.0;
        for (int i = 0; i < produtos.length; i++) {
            soma += produtos[i].getPreco();
        }

        double media = soma / quantidadeProdutos;

        // 5- Saída
        System.out.printf("Média de preços: %.2f%n", media);

        sc.close();
    }
}
