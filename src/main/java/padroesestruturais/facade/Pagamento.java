package padroesestruturais.facade;

public class Pagamento extends Setor {

    private static Pagamento finaceiro = new Pagamento();

    private Pagamento() {};
    public static Pagamento getInstancia() {
        return finaceiro;
    }
}
