package entities;

import java.util.Scanner;

public class Usuario {



    protected String email;
    protected String senha;

    public Usuario() {
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public void acessarApp(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu email: ");
        this.email = entrada.nextLine();
        System.out.print("Digite sua senha: ");
        this.senha = entrada.nextLine();

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
