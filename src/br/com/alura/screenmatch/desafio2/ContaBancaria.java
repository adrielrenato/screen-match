package br.com.alura.screenmatch.desafio2;

public class ContaBancaria {
    /* atributos: numeroConta (privado), saldo (privado) e titular (publico).
    Implemente métodos getters e setters para os atributos privados. */
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
