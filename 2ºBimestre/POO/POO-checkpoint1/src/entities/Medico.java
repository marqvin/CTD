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
        System.out.println("Guia de Exame criado com Sucesso");

    }

    @Override
    public String toString() {
        return super.toString() +
                "Medico{" +
                "CRM=" + CRM +
                ", nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
