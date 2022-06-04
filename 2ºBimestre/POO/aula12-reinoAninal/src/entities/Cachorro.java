package entities;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void correr(){
        System.out.println("Corre enquanto late");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late");
    }
}


