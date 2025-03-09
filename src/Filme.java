public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes = 0;
    int totalDeAvaliacao = 0;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println(nome);
        System.out.println(anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
