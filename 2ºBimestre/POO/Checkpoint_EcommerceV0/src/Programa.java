import entities.Administrador;
import entities.ClientePF;
import entities.ClientePJ;
import entities.Produto;
import entities.exception.MensagemException;

import java.util.ArrayList;
import java.util.Collections;

public class Programa {

    public static void main(String[] args) throws Exception {

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


        // Administrador
        Administrador adm1 = new Administrador("ADM1234","senhaADM1234","Vinicius Marques");
        adm1.verificarLogin();

        adm1.alterarAdm("Marques Vinicius");
        System.out.println("ADM: " + adm1.getNome());

        adm1.adicionarProduto("mochila", 10.0, "mochila para as costas");
        adm1.adicionarProduto("estojo", 7.5, "estojo para as mãos");
        adm1.adicionarProduto("touca", 15.0, "touca para a cabeça");

        // Produto método contador

        adm1.excluirProduto("mochila");




    }

}
