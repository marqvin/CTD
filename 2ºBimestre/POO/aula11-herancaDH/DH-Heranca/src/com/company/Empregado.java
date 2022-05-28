
public class Empregado {
    private String nome;
    private String arquivo;
    protected  double salario;
    protected double desconto;

    public Empregado(String nome,String arquivo)
    {
        this.nome=nome;
        this.arquivo=arquivo;
    }

    public String getNome() {
        return nome;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public double calcularSalario()
    {
        return salario-desconto;
    }
    public double calcularSalario(double premio)
    {
        return salario+premio-desconto;
    }

    @Override
    public String toString() {
        return  "Nome= " + nome + '\n' +
                "arquivo= " + arquivo + '\n' ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empregado empregado = (Empregado) o;
        return this.getArquivo().equals(empregado.getArquivo());
    }

    @Override
    public int hashCode() {
        int hash=31;
        hash= hash* nome.hashCode();
        hash= hash* arquivo.hashCode();
        return hash;
    }
}
