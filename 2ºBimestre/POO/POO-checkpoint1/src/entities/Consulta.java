package entities;

public class Consulta extends Paciente{

    private boolean statusConsulta;
    private String dataConsulta;
    private String especialidade;
    private String nomeMedico;

    public Consulta() {

    }

    public Consulta(boolean statusConsulta, String dataConsulta, String especialidade, String nomeMedico) {
        this.statusConsulta = statusConsulta;
        this.dataConsulta = dataConsulta;
        this.especialidade = especialidade;
        this.nomeMedico = nomeMedico;
    }

    public boolean isStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(boolean statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }


}
