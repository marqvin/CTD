package entities;

import java.util.Scanner;

public class Atendente extends Usuario{



    private int idAtendente;
    private String nome;
    private int telefone;
    private String historicoAtend;



    public Atendente(){

    }

    public Atendente(int idAtendente, String nome, int telefone, String historicoAtend) {

        this.idAtendente = idAtendente;
        this.nome = nome;
        this.telefone = telefone;
        this.historicoAtend = historicoAtend;
    }

    public int getIdAtendente() {
        return idAtendente;
    }

    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
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

    public String getHistoricoAtend() {
        return historicoAtend;
    }

    public void setHistoricoAtend(String historicoAtend) {
        this.historicoAtend = historicoAtend;
    }


    public void marcarConsulta(){
        Scanner entrada = new Scanner(System.in);
        Consulta consulta = new Consulta();

        consulta.setStatusConsulta(true);

        System.out.print("Digite a data da próxima consulta do Paciente:");
        consulta.setDataConsulta(entrada.nextLine());

        System.out.print("Digite a especialidade do médico:");
        consulta.setEspecialidade(entrada.nextLine());

        System.out.print("Digite o nome do médico: ");
        consulta.setNomeMedico(entrada.nextLine());



    }

    public void desmarcarConsulta(){
        Consulta consulta = new Consulta();

        consulta.setStatusConsulta(false);
        consulta.setDataConsulta(null);
        consulta.setEspecialidade(null);
        consulta.setNomeMedico(null);

    }

    public void marcarExame(){

    }

    public void desmarcarExame(){
        
    }

    @Override
    public String toString() {
        return super.toString() +
                "Atendente{" +
                "idAtendente=" + idAtendente +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", historicoAtend='" + historicoAtend + '\'' +
                '}';
    }
}
