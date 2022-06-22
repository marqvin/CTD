import entities.ClientePF;
import entities.ClientePJ;
import entities.exception.MensagemException;

public class Programa {

    public static void main(String[] args) throws MensagemException {

        // Cliente PF
        ClientePF cpf1 = new ClientePF("mar454656", "4hfghfgh5", "Vinicius", 20,"51597579888", "Rua das boas noites, 8898");
        cpf1.verificarLogin();
        System.out.println("Nome: " + cpf1.getNome() + " Idade: " + cpf1.getIdade() + " Endereço: " + cpf1.getEndereco());

        cpf1.alterarCadastro("vini", 11, "rua das tardes boas");
        System.out.println("Nome: " + cpf1.getNome() + " Idade: " + cpf1.getIdade() + " Endereço: " + cpf1.getEndereco());

        // Cliente CNPJ
        ClientePJ cnpj1 = new ClientePJ("cnpjmarqvin", "cnpjsenha", "SodaNerd", "45.713.913/0001-00", "Rua das taaal");
        cnpj1.verificarLogin();

        cnpj1.alterarCadastro("marqvinCNPJ", "Taaal da Ruuua");
        System.out.println("Nome Fantasia: " + cnpj1.getNomeFantasia() + " Endereço: " + cnpj1.getEndereco());













    }

}
