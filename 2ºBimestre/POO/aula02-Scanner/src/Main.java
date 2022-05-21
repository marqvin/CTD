import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n1;
        int n2;
        float n3, n4;

        Scanner ler;
        ler = new Scanner(System.in);

        System.out.println("Digite o valor de n1: ");
        n1 = ler.nextInt();
        System.out.println("Digite o valor de n2: ");
        n2 = ler.nextInt();
        //
        System.out.println("Digite o valor de n3 tipo FLOAT: ");
        n3 = ler.nextFloat();
        System.out.println("Digite o valor de n4 tipo FLOAT: ");
        n4 = ler.nextFloat();

        // CTROL + D
        System.out.println("Valor digitado para n1: " + n1);
        System.out.println("Valor digitado para n2: " + n2);
        //
        System.out.println("O valor digitado para n3 foi: " + n3);
        System.out.println("O valor digitado para n4 foi: " + n4);

        int soma, sub, mult, div;

        soma = n1 + n2;
        System.out.println("Soma de n1 + n2: " + soma);
        sub = n1 - n2;
        System.out.println("Subtração de n1 - n2: " + sub);
        mult = n1 * n2;
        System.out.println("Multiplicação de n1 * n2: " + mult);
        div = n1 / n2;
        System.out.println("Divisão de n1 / n2: " + div);
    }
}
