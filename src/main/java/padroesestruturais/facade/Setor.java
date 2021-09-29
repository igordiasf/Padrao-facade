package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<AgenciaViagem> AgenciaViagemsComPendencia = new ArrayList<AgenciaViagem>();

    public void addAgenciaViagemPendente(AgenciaViagem agenciaViagem) {
        this.AgenciaViagemsComPendencia.add(agenciaViagem);
    }

    public boolean verificarAgenciaViagemComPendencia(AgenciaViagem agenciaViagem) {
        return AgenciaViagemsComPendencia.contains(agenciaViagem);
    }

}

