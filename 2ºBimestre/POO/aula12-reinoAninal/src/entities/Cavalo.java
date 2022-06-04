package entities;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public void correr(){
        System.out.println("Corre enquanto relincha");
    }

    @Override
    public void emitirSom(){
        System.out.println("O cavalo relincha");
    }
}
