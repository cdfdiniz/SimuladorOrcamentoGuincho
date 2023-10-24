package br.tec.db.servicoguincho.simulador.cargas;

public enum TipoVeiculo {
    CARRO(1), MINIVAN(2), ONIBUS(3), CAMINHAO(4);

    private int tipo;

    private TipoVeiculo(int tipo){
        this.tipo = tipo;
    }

    public int getTipo(){
        return tipo;
    }
}
