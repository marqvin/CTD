package entities;

import entities.exception.MensagemException;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Login{

    private String nome;
    public Administrador(String nome) {
        this.nome = nome;
    }

    public Administrador(String usuario, String senha, String nome) {
        super(usuario, senha);
        this.nome = nome;
    }

    public void alterarAdm(String nome) throws Exception{
        if (nome.length() != 0){
            this.nome = nome;
        }else {
            throw new MensagemException("{\n" +
                    "Error: Insira o nome do Administrador válido." +
                    "\n}");
        }
    }

    public void atualizaCatalogo(String nomeProduto, double precoProduto, String descricaoProduto) throws MensagemException {

    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nome='" + nome + '\'' +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
