package br.com.alura.screenmatch.orientacaoobjeto.desafio4.modelos;

import br.com.alura.screenmatch.orientacaoobjeto.desafio4.interfaces.Calculavel;

public class ProdutoFisico extends Produto implements Calculavel {
    public double calcularPrecoFinal() {
        return getPrecoUnitario() * 1.05;
    }
}
