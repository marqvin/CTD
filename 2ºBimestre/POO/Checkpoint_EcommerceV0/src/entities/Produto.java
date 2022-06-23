package entities;

import java.util.ArrayList;

public class Produto extends Administrador{

    private String nome;
    private double preco;
    private String descricao;

    // Construtor padrão e outro com sobrecarga
    public Produto() {

    }

    public Produto(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    // Sobrescrita
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
