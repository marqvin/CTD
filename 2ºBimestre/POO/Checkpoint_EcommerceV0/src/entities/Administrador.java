package entities;

import entities.exception.MensagemException;

import java.util.*;

public class Administrador extends Login{

    private String nome;
    private ArrayList<Produto> listaProduto = new ArrayList<>();

    // Construtor padrão e outro com sobrecarga
    public Administrador() {

    }

    public Administrador(String usuario, String senha, String nome) {
        super(usuario, senha);
        this.nome = nome;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    // Altera o ADM
    public void alterarAdm(String nome) throws Exception{
        if (nome.length() != 0){
            this.nome = nome;
        }else {
            throw new MensagemException("{\n" +
                    "Error: Insira o nome do Administrador válido." +
                    "\n}");
        }
    }

    // remove produto da loja
    public void excluirProduto(String nomeProduto){

        for(int i = 0; i < listaProduto.size(); i++)
        {
            Produto p = listaProduto.get(i);

            if(p.getNome().equals(nomeProduto))
            {
                // Encontrou um produto com o nome dentro da variável nomeProduto.
                // Remove.
                listaProduto.remove(p);

                // Sai do loop.
                break;
            }
        }
        System.out.print("\nLista após remoção:\n");
        for(int i = 0; i < listaProduto.size(); i++)
        {
            System.out.print(listaProduto.get(i).getNome() + " R$" + listaProduto.get(i).getPreco() + " " + listaProduto.get(i).getDescricao() + "\n");
        }

    }

    // add produto na loja
    public void adicionarProduto(String nomeProduto, double precoProduto, String descricaoProduto){
        // Add os valores do parâmetro à ArrayList
        listaProduto.add(new Produto(nomeProduto, precoProduto, descricaoProduto));

        for (Produto produto : listaProduto){
            System.out.println(produto.getNome() + " R$" + produto.getPreco() + " " + produto.getDescricao());
        }
    }

    // Sobrescrita
    @Override
    public String toString() {
        return "Administrador{" +
                "nome='" + nome + '\'' +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
