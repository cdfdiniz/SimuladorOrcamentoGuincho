package br.tec.db.servicoguincho.simulador.tipoguincho;

import br.tec.db.servicoguincho.simulador.interfaces.Guincho;
import br.tec.db.servicoguincho.simulador.interfaces.Trajeto;

public class GuinchoReboqueIntegrado implements Guincho {
    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return trajeto.getDistanciaEmKM() * 10.00;
    }

}
