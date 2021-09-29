package padroesestruturais.facade;

import java.text.Normalizer;

public class AgenciaViagem {

    public boolean pagar() {
        return AgenciaViagemFacade.verificarPendenciasPagamento(this);
    }
}
