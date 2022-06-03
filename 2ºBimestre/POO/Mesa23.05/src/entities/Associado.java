package entities;

public class Associado {
    private String nome;
    private String nassoc;
    private double vMensal;
    private String ativi;

    public Associado() {
    }

    public Associado(String nassoc, String nome, String ativi) {
        this.nassoc = nassoc;
        this.nome = nome;
        this.vMensal = 100.00;
        this.ativi = ativi;
    }




    public String getnassoc() {
        return nassoc;
    }

    public void setnassoc(String nassoc) {
        this.nassoc = nassoc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getvMensal() {
        return vMensal;
    }

    public void setvMensal(double vMensal) {
        this.vMensal = vMensal;
    }

    public String getativi() {
        return ativi;
    }

    public void setativi(String ativi) {
        this.ativi = ativi;
    }


    public double custoMensal(){
         System.out.println("O custo mensal de " + getNome() + " é de : "+ getvMensal());
        return 0 ;
    }



    @Override
    public String toString() {
        return "Associado{" +
                "nassoc='" + nassoc + '\'' +
                ", nome='" + nome + '\'' +
                ", vMensal=" + vMensal +
                ", ativi='" + ativi + '\'' +
                '}';
    }
}
