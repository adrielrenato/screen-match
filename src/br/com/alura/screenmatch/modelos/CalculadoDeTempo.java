package br.com.alura.screenmatch.modelos;

public class CalculadoDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui (Filme filme) {
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }

//    public void inclui (Serie serie) {
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
