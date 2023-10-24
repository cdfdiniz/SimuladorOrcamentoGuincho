package br.tec.db.servicoguincho.simulador;

import br.tec.db.servicoguincho.simulador.cargas.Trajetos;
import br.tec.db.servicoguincho.simulador.interfaces.SimuladorDeOrcamento;
import br.tec.db.servicoguincho.simulador.interfaces.Trajeto;
import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.interfaces.Veiculo;
import br.tec.db.servicoguincho.simulador.tipoguincho.GuinchoCorrenteGancho;
import br.tec.db.servicoguincho.simulador.tipoguincho.GuinchoPlataforma;
import br.tec.db.servicoguincho.simulador.veiculos.Carro;


public class Main {

    public static void main(String[] args) {
        GuinchoCorrenteGancho guinchoCorrenteGancho = new GuinchoCorrenteGancho();
        SimuladorDeOrcamento simulador = new SimuladorDeOrcamentoImp(guinchoCorrenteGancho);


        GuinchoPlataforma guinchoPlataforma = new GuinchoPlataforma();
        SimuladorDeOrcamento simulador2 = new SimuladorDeOrcamentoImp(guinchoPlataforma);


        Veiculo carroNovo = new Carro(EstadoConservacao.NOVO);
        Veiculo carroQuebrado = new Carro(EstadoConservacao.QUEBRADO);

        Trajeto centroParaBairroA = Trajetos.CENTRO_BAIRRO_A;
        Trajeto centroParaBairroB = Trajetos.CENTRO_BAIRRO_B;

        double custoCenario1 = simulador.calcularCustoTotal(carroNovo, centroParaBairroA);
        double custoCenario2 = simulador2.calcularCustoTotal(carroQuebrado,centroParaBairroB);
        System.out.println("Cenário 1 - Custo Total do Serviço: R$" + custoCenario1);
        System.out.println("Cenário 2 - Custo Total do Serviço: R$" + custoCenario2);




    }

}



/*
        Trajeto trajeto = new TrajetoBairro(0); // Exemplo de trajeto de Centro para Bairro A
        Carro carro = new Carro();
        carro.setEstado(EstadoConservacao.QUEBRADO);



        SimuladorDeOrcamento simulador = new SimuladorDeOrcamentoImp();


        double custoTotal = simulador.calcularCustoTotal(carro, trajeto);

        System.out.println("Custo Total do Serviço de Guincho: R$" + custoTotal);



        //TO DO

        Cenário 1 -  carro novo - do centro para o bairro A
        SimuladorDeOrcamento simulador; // instanciar implementação de simulaodr
        Veiculo carroNovo; // instanciar implementação de veiculo
        Trajeto centroParaBairroA; // instanciar trajeto
        double custoCenario1 = simulador.calcularCustoTotal(carroNovo, centroParaBairroA);
        System.out.println("Cenário 1 - Custo Total do Serviço: R$" + custoCenario1);
        System.out.println("Custo total do orçamento: R$ " + custoTotal);

*/