package entities;

public class Exame extends Paciente{

    private boolean statusExame;
    private String tipoExame;
    private String dataExame;

    public Exame() {

    }

    public Exame(boolean statusExame, String tipoExame, String dataExame) {
        this.statusExame = statusExame;
        this.tipoExame = tipoExame;
        this.dataExame = dataExame;
    }

    public boolean isStatusExame() {
        return statusExame;
    }

    public void setStatusExame(boolean statusExame) {
        this.statusExame = statusExame;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getDataExame() {
        return dataExame;
    }

    public void setDataExame(String dataExame) {
        this.dataExame = dataExame;
    }
}
