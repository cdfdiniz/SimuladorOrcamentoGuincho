package br.tec.db.servicoguincho.simulador;

import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.interfaces.Guincho;
    import br.tec.db.servicoguincho.simulador.interfaces.SimuladorDeOrcamento;
    import br.tec.db.servicoguincho.simulador.interfaces.Trajeto;
    import br.tec.db.servicoguincho.simulador.interfaces.Veiculo;

    public class SimuladorDeOrcamentoImp implements SimuladorDeOrcamento{


    private Guincho guincho;

    public SimuladorDeOrcamentoImp(Guincho guincho){
        this.guincho = guincho;
    }

    @Override
    public double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto){
        double custoDeslocamento = guincho.calcularCustoDeslocamento(trajeto);

        if(veiculo.getEstado() == EstadoConservacao.NOVO){
            return custoDeslocamento;
        }else{
            custoDeslocamento = custoDeslocamento + 100.00;
        }
        return custoDeslocamento;

    }


}