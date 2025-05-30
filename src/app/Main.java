package app;

import model.Caminhao;
import model.Carro;
import model.Moto;
import model.Veiculo;
import util.RelatorioPedagio;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Carro();
        Veiculo v2 = new Moto();
        Veiculo v3 = new Caminhao(4); // Caminhão de 4 eixos

        processarPedagio(v1);
        processarPedagio(v2);
        processarPedagio(v3);

        RelatorioPedagio.exibirRelatorio();
    }

    public static void processarPedagio(Veiculo veiculo) {
        double valor = veiculo.calcularPedagio();
        System.out.printf("Veículo: %s | Valor do Pedágio: R$ %.2f%n", veiculo.getTipo(), valor);
        RelatorioPedagio.registrarPassagem(valor);
    }

}
