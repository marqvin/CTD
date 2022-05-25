import entities.UsuarioJogo;

public class Programa {

    public static void main(String[] args) {

        UsuarioJogo u1 = new UsuarioJogo();

        u1.setNome("Vinicius Marques");
        u1.setNickName("Inivini");
        u1.setPontuacao(3);
        u1.setNivel(10);


        System.out.println(u1);
        System.out.println("Nome do Usuário: " + u1.getNome());

        UsuarioJogo u2 = new UsuarioJogo("Sara","fliperonnn", 0,0);
        u2.aumentarPontuacao(1);
        u2.bonus(2);
        u2.subirNivel(5);
        System.out.println(u2);

    }
}
