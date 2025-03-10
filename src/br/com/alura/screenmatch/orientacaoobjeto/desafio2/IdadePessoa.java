package br.com.alura.screenmatch.orientacaoobjeto.desafio2;

public class IdadePessoa {
    /* com os atributos privados nome e idade.
    Utilize métodos getters e setters para acessar e modificar esses atributos.
    Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não. */

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade() {
        if (this.idade >= 18) {
            System.out.println("O " + this.nome + " é maior de idade");
        } else {
            System.out.println("O " + this.nome + " é menor de idade");
        }
    }
}
