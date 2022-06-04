import entities.ImpressoraCannon;
import entities.ImpressoraEpson;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {

        ImpressoraEpson epson = new ImpressoraEpson(
                "LX-3000", "USB", LocalDate.now(), // get hora real
                5, 20.0);
        System.out.println(epson);
        epson.imprimir();

        ImpressoraCannon cannon = new ImpressoraCannon(
                "300-LX", "WIFI", LocalDate.now(),
                5, 10.0);

        System.out.println(cannon);
        cannon.imprimir();
    }

}
