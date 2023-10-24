package br.tec.db.servicoguincho.simulador.tipoguincho;

import br.tec.db.servicoguincho.simulador.interfaces.Trajeto;

public class TrajetoImp implements Trajeto {
    private String saida;
    private String chegada;

    private Integer distanciaEmKM;

    public TrajetoImp(Integer distanciaEmKM){
        this.distanciaEmKM = distanciaEmKM;
    }

    @Override
    public Integer getDistanciaEmKM() {
        return distanciaEmKM;
    }
}
