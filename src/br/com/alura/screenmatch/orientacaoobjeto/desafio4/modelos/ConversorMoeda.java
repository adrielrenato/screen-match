package br.com.alura.screenmatch.orientacaoobjeto.desafio4.modelos;

import br.com.alura.screenmatch.orientacaoobjeto.desafio4.interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
