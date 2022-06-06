public class Programa {

    public static void main(String[] args) {


        String[] nomes = new String[5];

        nomes[0] = "Fernando";
        nomes[1] = "Sara";
        nomes[2] = "Vinicius";
        nomes[3] = "Marcelo";
        nomes[4] = "Sandra";

        System.out.println(nomes[3]);
        System.out.println(nomes[9]);

        // Utilizando FOR
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        //Utilizando WHILE
        int j = 0;
        while(j < nomes.length){
            System.out.println("Indice ["+ j + "]: " + nomes[j]);

            j++;

        }

        // Utilizando FOR EACH
        for (String n : nomes){
            System.out.println("Nomes: " + n);
        }
    }
}
