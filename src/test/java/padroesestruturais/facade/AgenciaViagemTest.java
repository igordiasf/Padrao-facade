package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgenciaViagemTest {

    @Test
    void deveRetornarPendenciaHotelPagamento() {
        AgenciaViagem agenciaViagem = new AgenciaViagem();
        Hotel.getInstancia().addAgenciaViagemPendente(agenciaViagem);

        assertEquals(false, agenciaViagem.pagar());
    }

    @Test
    void deveRetornarPendenciaPassagemPagamento() {
        AgenciaViagem agenciaViagem = new AgenciaViagem();
        Passagem.getInstancia().addAgenciaViagemPendente(agenciaViagem);

        assertEquals(false, agenciaViagem.pagar());
    }

    @Test
    void deveRetornarPendenciaPagamentoPagamento() {
        AgenciaViagem agenciaViagem = new AgenciaViagem();
        Pagamento.getInstancia().addAgenciaViagemPendente(agenciaViagem);

        assertEquals(false, agenciaViagem.pagar());
    }

    @Test
    void deveRetornarAgenciaViagemSemPendenciaPagamento() {
        AgenciaViagem agenciaViagem = new AgenciaViagem();

        assertEquals(true, agenciaViagem.pagar());
    }

}