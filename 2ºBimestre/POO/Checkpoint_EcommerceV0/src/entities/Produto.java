package entities;

public class Produto extends Administrador{

    private String nome;
    private double preco;
    private String descricao;

    public Produto(String nome, String nome1, double preco, String descricao) {
        super(nome);
        this.nome = nome1;
        this.preco = preco;
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
