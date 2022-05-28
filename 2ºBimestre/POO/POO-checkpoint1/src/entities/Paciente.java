package entities;

public class Paciente extends Usuario{

    private int idPaciente;
    private String nome;
    private int celular;
    private String dataNasc;

    public Paciente() {

    }

    public Paciente(int idPaciente, String nome, int celular, String dataNasc) {

        this.idPaciente = idPaciente;
        this.nome = nome;
        this.celular = celular;
        this.dataNasc = dataNasc;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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

    public void verificarExame(){
        Exame exame = new Exame();
        if(exame.isStatusExame() != false){
            System.out.println("Exame Marcado");
        }else {
            System.out.println("Exame Desmarcado");
        }

        System.out.println("Data do Exame: " + exame.getDataExame());
        System.out.println("Tipo de Exame: " + exame.getTipoExame());
        System.out.println("Data do Exame: " + exame.getDataExame());
    }

    public void verificarConsulta(){
        Consulta consulta = new Consulta();
        if(consulta.isStatusConsulta() != false){
            System.out.println("Consulta Marcada");
        }else {
            System.out.println("Consulta Desmarcada");
        }

        System.out.println("Data da consulta: " + consulta.getDataConsulta());
        System.out.println("Especialidade: " + consulta.getEspecialidade());
        System.out.println("Nome do médico: " + consulta.getNomeMedico());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Paciente{" +
                "idPaciente=" + idPaciente +
                ", nome='" + nome + '\'' +
                ", celular=" + celular +
                ", dataNasc='" + dataNasc + '\'' +
                '}';
    }
}
