package br.com.alura.screenmatch.orientacaoobjeto.desafio4.modelos;

import br.com.alura.screenmatch.orientacaoobjeto.desafio4.interfaces.Vendavel;

public class Servico implements Vendavel {
    private String descricao;
    private double precoHora;

    // Construtor e outros métodos

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}
