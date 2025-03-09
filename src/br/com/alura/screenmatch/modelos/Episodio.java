package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.interfaces.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeVisualizacao;

    public int getTotalDeVisualizacao() {
        return totalDeVisualizacao;
    }

    public void setTotalDeVisualizacao(int totalDeVisualizacao) {
        this.totalDeVisualizacao = totalDeVisualizacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (this.totalDeVisualizacao > 100) {
            return 4;
        }

        return 2;
    }
}
