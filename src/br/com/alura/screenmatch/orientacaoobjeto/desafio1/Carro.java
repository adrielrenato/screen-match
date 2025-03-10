package br.com.alura.screenmatch.orientacaoobjeto.desafio1;

import java.time.LocalDate;

public class Carro {
    /* modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro. */
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - ano;
    }
}
