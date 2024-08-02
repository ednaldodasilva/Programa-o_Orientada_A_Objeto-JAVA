//@author Ednaldo Júnior
package model;

/**
 * Esta é uma classe simples que representa uma pessoa.
 */
public class Pessoa {

    private String nome;
    private int idade;

    /**
     * Construtor para a classe Pessoa.
     *
     * @param nome O nome da pessoa.
     * @param idade A idade da pessoa.
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param nome O nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a idade da pessoa.
     *
     * @return A idade da pessoa.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade da pessoa.
     *
     * @param idade A idade da pessoa.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
