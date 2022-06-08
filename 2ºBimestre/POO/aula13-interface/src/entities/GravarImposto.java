package entities;

public interface GravarImposto {

    void sacar(double valor, double perc);


    // dentro da INTERFACE, não precisa declarar abstract
    public double imposto(double perc);
}
