package entities;

public class ContaPF extends Conta{

    private String cpf;

    public ContaPF(int numero, String nome, String cpf) {
        super(numero, nome);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", " +
                "cpf='" + cpf + '\'';
    }
}
