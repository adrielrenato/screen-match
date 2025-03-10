package br.com.alura.screenmatch.trabalhocomlistas.desafio4;

public class Titulo implements Comparable<Titulo> {
    String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}
