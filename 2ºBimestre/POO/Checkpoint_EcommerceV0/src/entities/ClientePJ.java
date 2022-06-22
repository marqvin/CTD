package entities;

import entities.exception.MensagemException;

public class ClientePJ extends Login implements Cliente{

    private String nomeFantasia;
    private String CNPJ;
    private String endereco;

    // Construtor padrão e outro com sobrecarga
    public ClientePJ() {

    }

    public ClientePJ(String usuario, String senha, String nomeFantasia, String CNPJ, String endereco) {
        super(usuario, senha);
        this.nomeFantasia = nomeFantasia;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
    }


    //getters e setters
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método da interface e altera dados com Exception
    public void alterarCadastro(String nomeFantasia, String endereco) throws MensagemException {
        if (nomeFantasia.length() != 0 || endereco.length() != 0) {
            this.nomeFantasia = nomeFantasia;
            this.endereco = endereco;
            System.out.println("Dados alterados com sucesso!");
        } else {
            throw new MensagemException("{\n" +
                    "Error: Insira nome Fantasia e endereço válidos." +
                    "\n}");
        }
    }
    // Sobrescrita
    @Override
    public String toString() {
        return "ClientePJ{" +
                "nomeFantasia='" + nomeFantasia + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", endereco='" + endereco + '\'' +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
