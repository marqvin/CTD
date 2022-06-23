package entities;

public class CarrinhoComprasPJ {

    private double atacado;
    private double desconto;


    // construtores, padrão e com sobrecarga
    public CarrinhoComprasPJ() {
    }

    public CarrinhoComprasPJ(double atacado, double desconto) {
        this.atacado = atacado;
        this.desconto = desconto;
    }

    public double getAtacado() {
        return atacado = 100 / 5;
    }

    public double getDesconto() {
        return desconto = 100;
        // 100 reais de desconto
    }

    public void adicionarCarrinho(){
    }

    public void removerCarrinho(){
    }

    // sobrescrita
    @Override
    public String toString() {
        return "CarrinhoComprasPJ{" +
                "atacado=" + atacado +
                ", desconto=" + desconto +
                '}';
    }
}
