package entities;

public class Cliente {

    private int numeroCliente;
    private String nome;
    private double divida;

    public Cliente() { // construtor padrão

    }

    public Cliente(int numeroCliente, String nome) { // construtor com parâmetros
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0.0;
    }


    public int getNumeroCliente() {  // retorna informação
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {  // Envia informação
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    @Override // Iste é uma anotação, como se fosse um método.. sobrescrita
    public String toString() {
        return "Cliente{" +
                "numeroCliente=" + numeroCliente +
                ", nome='" + nome + '\'' +
                ", divida=" + divida +
                '}';
    }
}
