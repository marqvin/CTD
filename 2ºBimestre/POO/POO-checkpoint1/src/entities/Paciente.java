package entities;
import entities.Atendente;

public class Paciente extends Atendente{

    private int cpf;
    private String nome;
    private int celular;
    private String dataNasc;

    public Paciente() {

    }

    public Paciente(int cpf, String nome, int celular, String dataNasc) {

        this.cpf = cpf;
        this.nome = nome;
        this.celular = celular;
        this.dataNasc = dataNasc;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int idPaciente) {
        this.cpf = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void verificarExame() {
        System.out.printf("\nDados da exame do(a) Paciente " + this.nome + "\n");
        System.out.println(isStatusExame());
        System.out.println(getDataExame());
        System.out.println(getTipoExame() + "\n");

    }

    public void verificarConsulta(){

        System.out.printf("\nDados da consulta do(a) Paciente " + this.nome + "\n");
        System.out.println(isStatusConsulta());
        System.out.println(getEspecialidade());
        System.out.println(getDataConculta());
        System.out.println(getNomeMedico() + "\n");


    }

    @Override
    public String toString() {
        return "Paciente{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", celular=" + celular +
                ", dataNasc='" + dataNasc + '\'' +
                '}';
    }
}
