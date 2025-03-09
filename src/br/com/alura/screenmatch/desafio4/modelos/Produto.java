package br.com.alura.screenmatch.desafio4.modelos;

import br.com.alura.screenmatch.desafio4.interfaces.Vendavel;

public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    // Construtor e outros métodos

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100.0);
    }
}
