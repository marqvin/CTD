import entities.Empregado;
import entities.Vendedor;

public class Programa {

    public static void main(String[] args) {
//        Vendedor v1 = new Vendedor(001, "Vinicius Marques", "20111", 2200.0, 525.0);
//
//        v1.setComissao(3);
//        v1.setTotalVendas();
//
//        System.out.println("Vendedor 1 instanciado(a): ");
//        System.out.println();
        System.out.println("Instância do primeiro empregado");
        Empregado emp1 = new Empregado(2,"EUEUEUEU", "10110", 1500.0, 220);
        System.out.println(emp1);

        System.out.println("Instância do primeiro empregado");
        Empregado emp2 = new Empregado(3,"EUEUEUEU2", "10001", 1800.0, 250);
        System.out.println(emp2);

        // Testando o objeto emp1 com o emp2
        if (emp1.equals(emp2)){
            System.out.println(emp1.toString() + "É o mesmo empregado que \n" + emp2.toString());
        }else {
            System.out.println(emp1.toString() + "Não é o mesmo empregado que \n" + emp2.toString());

        }
    }
}
