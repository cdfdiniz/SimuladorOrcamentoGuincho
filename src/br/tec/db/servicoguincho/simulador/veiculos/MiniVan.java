package br.tec.db.servicoguincho.simulador.veiculos;

import br.tec.db.servicoguincho.simulador.interfaces.Veiculo;
import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;

public class MiniVan implements Veiculo {
    private TipoVeiculo tipo;
    private EstadoConservacao estado;

    public MiniVan(EstadoConservacao estado){
        this.tipo = TipoVeiculo.MINIVAN;
        this.estado = estado;
    }
    @Override
    public TipoVeiculo getTipo() {
        return TipoVeiculo.MINIVAN;
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
