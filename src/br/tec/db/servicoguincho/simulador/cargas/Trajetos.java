package br.tec.db.servicoguincho.simulador.cargas;

import br.tec.db.servicoguincho.simulador.interfaces.Trajeto;

public enum Trajetos implements Trajeto {
    CENTRO_BAIRRO_B(15),
    CENTRO_BAIRRO_A(10),
    BAIRROA_BAIRROB(8),
    CENTRO_CENTRO(5);

    private Integer distancia;

    Trajetos(Integer distancia){
        this.distancia = distancia;
    }


    @Override
    public Integer getDistanciaEmKM() {
        return distancia;
    }
}
