import entities.Pessoa;
import entities.Pet;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Dana", new Pet("Fila"));
        System.out.println(p1);

        Pessoa p2 = new Pessoa("Sara", new Pet("Poddle"));
        System.out.println(p2);

    }
}
