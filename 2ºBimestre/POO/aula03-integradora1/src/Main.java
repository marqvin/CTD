import java.util.Locale;
import java.util.Scanner;

public class Main {
    //Tipo de retorno INTEIRO
    public static int quantosPacotes(float qtde){ // Escopo Local
        Scanner entrada = new Scanner(System.in);
        float kilo = 0.0f;
        int pacotes = 0;

        while(kilo < qtde){
            System.out.print("Digite o peso do pacote: ");
            float peso = entrada.nextFloat();
            kilo = kilo + peso; // kilo += peso;
            pacotes = pacotes + 1;
        }
        entrada.close();

        return pacotes;
    } // retorno diferente de void, precisa de um "return"
    public static void main(String[] args){

        // Escopo global
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do cão: ");
        String nome = ler.nextLine();
        System.out.print("Digite a quantidade de ração: ");
        float quantidade = ler.nextFloat();

        int valor = quantosPacotes(quantidade); // 10
        System.out.printf("Seu cão precisará de %d pacotes.", valor);

        ler.close();

    }
}
