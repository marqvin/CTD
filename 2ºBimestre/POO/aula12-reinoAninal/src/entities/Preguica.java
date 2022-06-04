package entities;

public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void subir(){
        System.out.println("Sobe árvores");
    }

    @Override
    public void emitirSom(){
        System.out.println("A preguiça grita (inaudivel para humanos)");
    }
}
