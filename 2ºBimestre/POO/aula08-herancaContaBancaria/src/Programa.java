import entities.Conta;
import entities.ContaPF;
import entities.ContaPJ;

public class Programa {

    public static void main(String[] args) {

//        Conta c1 = new Conta(446565,"Vinicius Marques");
//        System.out.println(c1);

        ContaPF cPF1 = new ContaPF(25111,"ZUZE", "640.456.464-46");
        System.out.println(cPF1);

        ContaPJ cPJ1 = new ContaPJ(1133123,"Vibrom", "50.465.3312.0001-9");
        System.out.println(cPJ1);


    }
}
