import entities.Cliente;

public class Programa {


    public static void main(String[] args) {

        Cliente c1 = new Cliente(); // construtor sem parâmetro

        c1.setNumeroCliente(001);
        c1.setNome("Vinícius Marques");


        System.out.println("Número do cliente: " + c1.getNumeroCliente());
        System.out.println("Nome do cliente: " + c1.getNome());
        System.out.println("Dívida do cliente: " + c1.getDivida());

//        System.out.println(c1.toString());
//        System.out.println(c1);

        Cliente c2 = new Cliente(002,"Sara"); // construtor com parâmetro
        System.out.println(c2);

        c2.aumentarDivida(250.0);
        System.out.println(c2);

        c2.pagarDivida(191.56);
        System.out.println(c2);

    }
}
