package entities;

import java.util.Scanner;

public class Atendente extends Usuario{



    private int matriAtendente;
    private String nome;
    private int telefone;
    private String historicoAtendimento;
    private boolean statusConsulta;
    private String especialidade;
    private String dataConculta;
    private String nomeMedico;
    private boolean statusExame;
    private String dataExame;
    private String tipoExame;



    public Atendente(){

    }

    public Atendente(int matriAtendente, String nome, int telefone, String historicoAtendimento) {
        this.matriAtendente = matriAtendente;
        this.nome = nome;
        this.telefone = telefone;
        this.historicoAtendimento = historicoAtendimento;
    }



    public int getMatriAtendente() {
        return matriAtendente;
    }

    public void setMatriAtendente(int matriAtendente) {
        this.matriAtendente = matriAtendente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getHistoricoAtendimento() {
        return historicoAtendimento;
    }

    public void setHistoricoAtendimento(String historicoAtendimento) {
        this.historicoAtendimento = historicoAtendimento;
    }

    public boolean isStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(boolean statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getDataConculta() {
        return dataConculta;
    }

    public void setDataConculta(String dataConculta) {
        this.dataConculta = dataConculta;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public boolean isStatusExame() {
        return statusExame;
    }

    public void setStatusExame(boolean statusExame) {
        this.statusExame = statusExame;
    }

    public String getDataExame() {
        return dataExame;
    }

    public void setDataExame(String dataExame) {
        this.dataExame = dataExame;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public void marcarConsulta(boolean statusConsulta, String especialidade, String dataConculta, String nomeMedico){
        this.statusConsulta = statusConsulta;
        this.especialidade = especialidade;
        this.dataConculta = dataConculta;
        this.nomeMedico = nomeMedico;

        System.out.printf("\nConsulta Marcada\n");
        System.out.println("Especialidade da consulta: "+ this.especialidade);
        System.out.println("Data da Consulta: " + this.dataConculta);
        System.out.printf("Nome do médico: " + this.nomeMedico + "\n");

    }

    public void desmarcarConsulta(boolean statusConsulta, String especialidade, String dataConculta, String nomeMedico){
        setStatusConsulta(false);
        setEspecialidade(null);
        setDataConculta(null);
        setNomeMedico(null);
        System.out.println("Consulta Desmarcada");

    }

    public void marcarExame(boolean statusExame, String dataExame, String tipoExame){
        this.statusExame = statusExame;
        this.dataExame = dataExame;
        this.tipoExame = tipoExame;

        System.out.printf("\nExame Marcado\n");
        System.out.println("Data do Exame: " + this.dataExame);
        System.out.println("Exame: " + this.tipoExame);

    }

    public void desmarcarExame(){
        setStatusExame(false);
        setDataExame(null);
        setTipoExame(null);
        System.out.println("Exame Desmarcado");
        
    }

    @Override
    public String toString() {
        return "Atendente{" +
                "matriAtendente=" + matriAtendente +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", historicoAtendimento='" + historicoAtendimento + '\'' +
                '}';
    }
}
