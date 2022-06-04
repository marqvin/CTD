import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Main {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro("Milu", 5);
        System.out.println(cao);
        cao.emitirSom();
        cao.correr();

        Cavalo cavalo = new Cavalo("Richard", 10);
        System.out.println(cavalo);
        cavalo.emitirSom();
        cavalo.correr();

        Preguica preguica = new Preguica("JUJU", 6);
        preguica.emitirSom();
        preguica.subir();
    }
}
