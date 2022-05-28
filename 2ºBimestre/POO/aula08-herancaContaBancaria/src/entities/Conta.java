package entities;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;

    protected double limite;

    // sobrecarga de construtores
    public Conta() {
    }



    public Conta(int numero, String nome, double valor) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0.0;
        this.limite = valor;
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

    public double getLimite(){
        return limite;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.printf("\nO depósito de R$%f foi concluído.\n", getSaldo());
        }else {
            System.out.println("Valor inválido. Tente outra vez!");
        }
    }


    // projetar melhor
//    public void sacar(double valor){
//        if(valor <= (getSaldo() + getLimite())){
//            if (getSaldo() == 0)
//            this.saldo = (getSaldo() + getLimite()) - valor;
//            System.out.printf("\nO saque de R$%f foi concluído.\n", getSaldo());
//        }else {
//            System.out.println("Saldo insuficiente :(");
//        }
//    }



    // Sobreescrita do método ToString() da Classe String
    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
