package entities;

import java.util.List;
import java.util.ArrayList;

public class Empresa {

    private String cnpj;
    private List<Empregado> listaEmpregado = new ArrayList<>();

    public Empresa (String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
