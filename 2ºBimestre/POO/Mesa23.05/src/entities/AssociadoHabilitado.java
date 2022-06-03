package entities;

public class AssociadoHabilitado  extends Associado{

private double custPis;
    private boolean habili;

    public AssociadoHabilitado() {
    }

    public AssociadoHabilitado(String nassoc, String nome, String ativi, boolean habili) {
        super(nassoc, nome, ativi);
        this.custPis = 50.00;
        this.habili = habili;
    }


    public double getcustPis() {
        return custPis;
    }

    public void setcustPis(double custPis) {
        this.custPis = custPis;
    }

    public boolean ishabili() {
        return habili;
    }

    public void sethabili(boolean habili) {
        this.habili = habili;
    }



    public double custoMensal(){
        double soma = (double) (getvMensal() + getcustPis());
        System.out.println("O custo mensal de " + getNome() + " é de : " + soma);
        return 0 ;
    }

    public void VerificaHabilitacao(){
        if(!this.habili){
            System.out.println("Aluno : "+ getNome()+ " Não está habili");
        } else {
            System.out.println("Aluno : "+ getNome()+ " está habili");}
    }


    @Override

    public String toString() {
        return super.toString() +
                "Associadohabili{" +
                "custPis=" + custPis +
                ", habili=" + habili +
                '}';
    }



}
