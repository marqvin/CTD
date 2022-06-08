package entities;

public class Container {

    private int id;
    private String descricao;
    private String paisDeOrigem;
    private boolean periculosidade;


    public Container() {

    };

    public Container(int id, String descricao, String paisDeOrigem, boolean periculosidade) {
        this.id = id;
        this.descricao = descricao;
        this.paisDeOrigem = paisDeOrigem;
        this.periculosidade = periculosidade;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getpaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setpaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public boolean ispericulosidade() {
        return periculosidade;
    }

    public void setpericulosidade(boolean periculosidade) {
        this.periculosidade = periculosidade;
    }


    public boolean origemDesconhecida() {
        if(getpaisDeOrigem() == null) {
            return true;
        }else {
            return false;
        }
    }


}
