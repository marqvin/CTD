package entities;

public class ContaPJ extends Conta{

    private String cnpj;

    public ContaPJ(int numero, String nome, String cnpj) {
        super(numero, nome);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", " +
                "cnpj='" + cnpj + '\'';
    }
}
