package entities;

public class CarrinhoComprasPF extends ClientePF{

    private double cupomDesconto;

    // construtores, padrão e com sobrecarga
    public CarrinhoComprasPF() {
    }

    public CarrinhoComprasPF(double cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }

    public double getCupomDesconto() {
        return cupomDesconto;
    }

    public void setCupomDesconto(double cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }

    public void adicionarCarrinho(){
    }

    public void removerCarrinho(){
    }

    // sobrescrita
    @Override
    public String toString() {
        return "CarrinhoComprasPF{" +
                "cupomDesconto=" + cupomDesconto +
                '}';
    }
}
