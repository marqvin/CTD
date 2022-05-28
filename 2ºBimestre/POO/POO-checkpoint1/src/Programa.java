import entities.Atendente;
import entities.Consulta;
import entities.Medico;
import entities.Paciente;

public class Programa {

    public static void main(String[] args) {

        Atendente at1 = new Atendente(45546, "juliete", 20797481, "atendeu monica");
        at1.acessarApp();
        System.out.println(at1);
        at1.marcarConsulta();
        at1.desmarcarConsulta();
        at1.marcarExame();
        at1.desmarcarExame();


        Paciente p1 = new Paciente(798787, "juju", 2799481, "13/03/2002");
        p1.acessarApp();
        System.out.println(p1);



        Medico m1 = new Medico(64643, "Dr.Vinicius", "Mastologia");
        m1.acessarApp();
        System.out.println(m1);
        m1.criarGuiaExame();


    }
}
