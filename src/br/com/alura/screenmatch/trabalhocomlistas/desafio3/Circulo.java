package br.com.alura.screenmatch.trabalhocomlistas.desafio3;

public class Circulo implements Forma {
    public double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
