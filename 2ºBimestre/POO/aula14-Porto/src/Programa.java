import entities.Container;
import entities.Porto;

public class Programa {

    public static void main(String[] args) {

        Container cont1 = new Container(01,"Apple","USA",false);
        Container cont2 = new Container(02,"Amazon","Brazil",false);
        Container cont3 = new Container(03,"Microsoft","Germany",false);
        Container cont4 = new Container();
        cont4.setpericulosidade(true);

        Porto Porto = new Porto(01, "Buenos Aires");

        Porto.adicionarContainer(cont1);
        Porto.adicionarContainer(cont2);
        Porto.adicionarContainer(cont3);
        Porto.adicionarContainer(cont4);

        Porto.mostrarContainers();
        System.out.print("Containers periculosidades e desconhecidos: ");
        System.out.print(Porto.qntContainerpericulosidadeDesconhecido());
    }
}