package padroesestruturais.facade;

public class AgenciaViagemFacade {

    public static boolean verificarPendenciasPagamento(AgenciaViagem agenciaViagem) {
        if (Passagem.getInstancia().verificarAgenciaViagemComPendencia(agenciaViagem)) {
            return false;
        }
        if (Hotel.getInstancia().verificarAgenciaViagemComPendencia(agenciaViagem)) {
            return false;
        }
        if (Pagamento.getInstancia().verificarAgenciaViagemComPendencia(agenciaViagem)) {
            return false;
        }
        return true;
    }
}
