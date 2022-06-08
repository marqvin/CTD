package entities;

import java.util.ArrayList;
import java.util.List;

public class Porto {

    private int id;
    private String nome;
    private List<Container> listaContainer = new ArrayList<>();


    public Porto() {
    }

    public Porto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void adicionarContainer(Container j) {
        listaContainer.add(j);
    }

    public void mostrarContainers() {

        for (Container jog : listaContainer) {
            System.out.println(
                    "ID: " + jog.getId() +
                            " - Descricao: " + jog.getDescricao() +
                            " - paisDeOrigem: " + jog.getpaisDeOrigem()
            );
        }
    }


    public int qntContainerpericulosidadeDesconhecido() {
        int qnt = 0;
        for (Container cont : listaContainer) {
            if (cont.origemDesconhecida() && cont.ispericulosidade()) {
                qnt++;
            }
        }
        return qnt;
    }




}
