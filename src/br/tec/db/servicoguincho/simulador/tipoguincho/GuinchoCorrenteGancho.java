package br.tec.db.servicoguincho.simulador.tipoguincho;

import br.tec.db.servicoguincho.simulador.TrajetoBairro;
import br.tec.db.servicoguincho.simulador.interfaces.Guincho;
import br.tec.db.servicoguincho.simulador.interfaces.Trajeto;

public class GuinchoCorrenteGancho implements Guincho {
    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return trajeto.getDistanciaEmKM() * 2.00;
    }
}

