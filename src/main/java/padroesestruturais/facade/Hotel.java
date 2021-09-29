package padroesestruturais.facade;

import java.util.ArrayList;

public class Hotel extends Setor {

    private static Hotel Hotel = new Hotel();

    private Hotel() {};
    public static Hotel getInstancia() {
        return Hotel;
    }
}
