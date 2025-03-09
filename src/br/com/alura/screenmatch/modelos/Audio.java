package br.com.alura.screenmatch.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.totalDeReproducao++;
    }
}
