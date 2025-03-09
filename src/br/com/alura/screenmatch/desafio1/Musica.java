package br.com.alura.screenmatch.desafio1;

public class Musica {
    /* titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
     e métodos para exibir a ficha técnica, avaliar a música e
     calcular a média de avaliações. */
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao = 0;
    int numAvaliacoes = 0;

    void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação" + avaliacao);
        System.out.println("Número de Avaliações" + numAvaliacoes);
    }

    void avaliar(int nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return avaliacao / numAvaliacoes;
    }
}
