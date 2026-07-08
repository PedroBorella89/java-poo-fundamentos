package secao10_arrays.entities;

public class PessoaIdade {

    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public PessoaIdade(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
