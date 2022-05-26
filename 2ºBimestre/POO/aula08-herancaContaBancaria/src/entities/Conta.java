package entities;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;

    // sobrecarga de construtores
    public Conta() {
    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0.0;
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

    public double getSaldo() {
        return saldo;
    }

    // Sobreescrita do método ToString() da Classe String
    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
