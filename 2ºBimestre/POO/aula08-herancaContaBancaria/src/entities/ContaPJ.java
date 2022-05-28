package entities;

public class ContaPJ extends Conta{

    private String cnpj;

    public ContaPJ(int numero, String nome, String cnpj, double valor) {
        super(numero, nome, valor);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", " +
                "cnpj='" + cnpj + '\'';
    }
}
