public class Aluno {
    String nome;
    int idade;

    void exibeInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Adriel";
        aluno.idade = 25;

        aluno.exibeInformacoes();
    }
}
