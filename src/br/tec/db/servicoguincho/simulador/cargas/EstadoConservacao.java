package br.tec.db.servicoguincho.simulador.cargas;

public enum EstadoConservacao {
    NOVO(1), QUEBRADO(2);

    private int estado;

    private EstadoConservacao(int estado){
        this.estado = estado;
    }

    public int getEstado(){
        return estado;
    }

}
