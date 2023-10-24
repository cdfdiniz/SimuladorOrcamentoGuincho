package br.tec.db.servicoguincho.simulador.veiculos;

import br.tec.db.servicoguincho.simulador.interfaces.Veiculo;
import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;

public class Carro implements Veiculo {
    private TipoVeiculo tipo;
    private EstadoConservacao estado;
    public Carro(EstadoConservacao estado) {
        this.tipo = TipoVeiculo.CARRO;
        this.estado = estado;

    }

    @Override
    public TipoVeiculo getTipo() {
        return TipoVeiculo.CARRO;
    }

    @Override
    public EstadoConservacao getEstado() {
        return EstadoConservacao.NOVO;
    }

    @Override
    public EstadoConservacao setEstado(EstadoConservacao estadoConservacao) {
        return null;
    }

    @Override
    public EstadoConservacao setEstado() {
        return null;
    }
}
