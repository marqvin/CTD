package entities;

import java.util.Scanner;

public class Medico extends Usuario{

    private int CRM;
    private String nome;
    private String especialidade;

    public Medico() {

    }

    public Medico(int CRM, String nome, String especialidade) {

        this.CRM = CRM;
        this.nome = nome;
        this.especialidade = especialidade;
    }


    public void criarGuiaExame(){
        Exame exame = new Exame();
        Scanner entrada = new Scanner(System.in);

        exame.setStatusExame(true);

        System.out.println("Digite o tipo de exame ao Paciente: ");
        exame.setTipoExame(entrada.nextLine());

        System.out.println("Digite a data do Exame: ");
        exame.setDataExame(entrada.nextLine());




    }
}
