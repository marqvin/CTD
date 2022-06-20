package entities;

import entities.exception.MensagemException;

public class Administrador extends Login{

    private String nome;

    public Administrador(String nome) {
        this.nome = nome;
    }

    public Administrador(String usuario, String senha, String nome) {
        super(usuario, senha);
        this.nome = nome;
    }

    public void atualizaCatalogo() throws MensagemException {

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
