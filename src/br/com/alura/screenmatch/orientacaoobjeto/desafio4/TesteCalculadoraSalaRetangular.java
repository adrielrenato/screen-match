package br.com.alura.screenmatch.orientacaoobjeto.desafio4;

import br.com.alura.screenmatch.orientacaoobjeto.desafio4.modelos.CalculadoraSalaRetangular;

public class TesteCalculadoraSalaRetangular {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5, 8); // Exemplo com altura e largura
        calculadora.calcularPerimetro(5, 8);
    }
}
