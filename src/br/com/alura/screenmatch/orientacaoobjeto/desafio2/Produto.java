package br.com.alura.screenmatch.orientacaoobjeto.desafio2;

public class Produto {
    /* com os atributos privados nome e preco.
    Utilize métodos getters e setters para acessar e modificar esses atributos.
    Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto. */
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double descontoPercentual) {
        double valorDesconto = (this.preco * descontoPercentual) / 100;

        return this.preco - valorDesconto;
    }
}
