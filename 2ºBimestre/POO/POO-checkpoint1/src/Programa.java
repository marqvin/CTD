import entities.Atendente;
import entities.Medico;
import entities.Paciente;

public class Programa {

    public static void main(String[] args) {

        Atendente at1 = new Atendente(45546, "juliete", 20797481, "atendeu monica");
        Paciente p1 = new Paciente(798787, "juju", 2799481, "13/03/2002");
        Medico m1 = new Medico(64643, "Dr.Vinicius", "Mastologia");

        System.out.println("Acesso como Atendente");
        at1.acessarApp();
        System.out.println(at1);
        at1.marcarExame(true, "01/06/2002", "Exame de Sangue");

        System.out.printf("\nAcesso como Paciente\n");
        p1.acessarApp();
        System.out.println(p1);
        p1.verificarConsulta();

        System.out.println("\nAcesso como Médico");
        m1.acessarApp();
        System.out.println(m1);
        m1.criarGuiaExame();


    }
}
