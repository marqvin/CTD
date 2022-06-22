package entities;

import entities.exception.MensagemException;

public class ClientePF extends Login implements Cliente{

    private String nome;
    private int idade;
    private String CPF;
    private String endereco;

    // Construtor padrão e outro com sobrecarga
    public ClientePF() {
    }

    public ClientePF(String usuario, String senha, String nome, int idade,String cpf, String endereco) {
        super(usuario, senha);
        this.nome = nome;
        this.idade = idade;
        this.CPF = cpf;
        this.endereco = endereco;
    }
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    // Método da interface e altera dados com Exception
    public void alterarCadastro(String nome, int idade, String endereco) throws MensagemException {
        if (nome.length() != 0 || endereco.length() != 0){
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
            System.out.println("Dados alterados com sucesso!");
        }else {
            throw new MensagemException("{\n" +
                    "Error: Insira nome e endereço válidos" +
                    "\n}");
        }

    }

    // Sobrescrita
    @Override
    public String toString() {
        return "ClientePF{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", CPF='" + CPF + '\'' +
                ", endereco='" + endereco + '\'' +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
