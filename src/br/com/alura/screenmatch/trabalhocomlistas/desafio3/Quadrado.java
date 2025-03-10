package br.com.alura.screenmatch.trabalhocomlistas.desafio3;

public class Quadrado implements Forma {
    public double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
