import entities.Associado;
import entities.AssociadoHabilitado;
import entities.AssociadoHabilitado;

public class Programa {
    public static void main(String[] args) {
        Associado Humano1 = new Associado("abcd","Julia","musculação");
        Humano1.custoMensal();

        AssociadoHabilitado humano2 = new AssociadoHabilitado("jkkkk", "Carla", "natação e musculação",true);
        humano2.custoMensal();
        humano2.VerificaHabilitacao();


    }
}