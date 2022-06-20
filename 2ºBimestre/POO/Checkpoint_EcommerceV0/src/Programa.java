import entities.Cliente;
import entities.Login;
import entities.Administrador;
import entities.exception.MensagemException;

public class Programa {

    public static void main(String[] args) throws MensagemException {
        Cliente c1 = new Cliente("mar454656", "4hfghfgh5", "Vinicius", 20, "Rua das boas noites, 8898");
        c1.verificarLogin();


        System.out.println("Nome: " + c1.getNome() + " Idade: " + c1.getIdade() + " Endereço: " + c1.getEndereco());

        c1.alterarCadastro("vini", 11, "rua das tardes boas");
        System.out.println("Nome: " + c1.getNome() + " Idade: " + c1.getIdade() + " Endereço: " + c1.getEndereco());






    }

}
