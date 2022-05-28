
public class Main {

    public static void main(String[] args) {
	// write your code here
        Vendedor novoVendedor= new Vendedor("Jose","1111");
        novoVendedor.setSalario(45000);
        novoVendedor.setDesconto(5000);
        novoVendedor.setComissao(3);
        novoVendedor.setTotalVendas(300000);
        System.out.println(novoVendedor.toString());

        Empregado empregado1=new Empregado("Juan","1112");
        Empregado empregado2=new Empregado("Matias","1113");
        Empregado empregado3=new Empregado("Juan Carlos","1112");

        if (empregado1.equals(empregado2))
            System.out.println(empregado1.toString() + " é o meso empregado que \n" +
            empregado2.toString());
        else
            System.out.println(empregado1.toString() + " não é o meso empregado que \n" +
            empregado2.toString());

        if (empregado1.equals(empregado3))
            System.out.println(empregado1.toString() + " é o meso empregado que \n" +
            empregado3.toString());
        else
            System.out.println(empregado1.toString() + " não é o meso empregad que \n " +
            empregado3.toString());

    }
}
