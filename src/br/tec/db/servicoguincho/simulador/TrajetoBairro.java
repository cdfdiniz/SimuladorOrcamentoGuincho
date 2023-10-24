package br.tec.db.servicoguincho.simulador;

import br.tec.db.servicoguincho.simulador.interfaces.SimuladorDeOrcamento;
import br.tec.db.servicoguincho.simulador.interfaces.Trajeto;
import br.tec.db.servicoguincho.simulador.interfaces.Veiculo;
import br.tec.db.servicoguincho.simulador.veiculos.Carro;

public class TrajetoBairro implements Trajeto {
    private final Integer distanciaEmKM;

    public TrajetoBairro(Integer distanciaEmKM) {
        this.distanciaEmKM = distanciaEmKM;
    }

    @Override
    public Integer getDistanciaEmKM() {
        return distanciaEmKM;
    }

    public double calcularTrajeto(SimuladorDeOrcamento simulador, Veiculo veiculo){
        double custoTotal = simulador.calcularCustoTotal(veiculo, this);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Trajeto - Custo Total do Serviço: R$" + custoTotal);

        return custoTotal;
    }

        /*
        Veiculo carroNovo = new Carro();
        Trajeto trajeto = new TrajetoBairro(0); // Exemplo: Trajeto de 10 km entre bairros
        SimuladorDeOrcamento simulador = new SimuladorDeOrcamentoImp();
        //double custoTotal = simulador.calcularCustoTotal(carroNovo, trajeto);

        Trajeto centroParaBairroA = new TrajetoBairro(10);
        trajeto = centroParaBairroA;
        //double custoCenario1 = simulador.calcularCustoTotal(carroNovo, trajeto);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Trajeto 1 - CENTRO PARA BAIRRO A - Custo Total do Serviço: R$" + trajeto);

        Trajeto centroParaBairroB = new TrajetoBairro(15);
        trajeto = centroParaBairroB;
        //double custoCenario2 = simulador.calcularCustoTotal(carroNovo, centroParaBairroB);
        System.out.println("Trajeto 2 - CENTRO PARA BAIRRO B - Custo Total do Serviço: R$" + trajeto);

        Trajeto bairroAParaBairroB = new TrajetoBairro(8);
        trajeto = bairroAParaBairroB;
        //double custoCenario3 = simulador.calcularCustoTotal(carroNovo, bairroAParaBairroB);
        System.out.println("Trajeto 3 - BAIRRO A PARA BAIRRO B - Custo Total do Serviço: R$" + trajeto);

        Trajeto centroParaCentro = new TrajetoBairro(5);
        trajeto = centroParaCentro;
        //double custoCenario4 = simulador.calcularCustoTotal(carroNovo, centroParaCentro);
        System.out.println("Trajeto 4 - CENTRO PARA CENTRO - Custo Total do Serviço: R$" + trajeto);

        //double orcamentoTotal = custoCenario2 + custoCenario3 + custoCenario4;
        System.out.println("--------------------------------------------------------------------");
        //System.out.println("Custo total do orçameto R$: " + orcamentoTotal);
        System.out.println(custoTotal);
        return custoTotal;
    }*/


}
