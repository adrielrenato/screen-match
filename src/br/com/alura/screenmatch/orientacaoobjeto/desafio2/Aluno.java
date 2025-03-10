package br.com.alura.screenmatch.orientacaoobjeto.desafio2;

public class Aluno {
    /* com os atributos privados nome e notas.
    Utilize métodos getters e setters para acessar e modificar esses atributos.
    Adicione um método calcularMedia que retorna a média das notas do aluno. */

    // Não usar array, listas, construtor ou dicionarios por enquanto
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }
}
