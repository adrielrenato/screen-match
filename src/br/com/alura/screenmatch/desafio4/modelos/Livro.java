package br.com.alura.screenmatch.desafio4.modelos;

import br.com.alura.screenmatch.desafio4.interfaces.Calculavel;

public class Livro extends Produto implements Calculavel {
    private String autor;

    public double calcularPrecoFinal() {
        return getPrecoUnitario() * 0.9;
    }
}
