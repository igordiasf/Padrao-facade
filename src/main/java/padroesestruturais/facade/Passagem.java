package padroesestruturais.facade;

public class Passagem extends Setor {

    private static Passagem Passagem = new Passagem();

    private Passagem() {};
    public static Passagem getInstancia() {
        return Passagem;
    }

}
