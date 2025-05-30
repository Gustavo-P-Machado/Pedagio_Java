package model;

import util.RelatorioPedagio;

public class Caminhao implements Veiculo{

    private static final double valorBase = 10.00;
    private static final double valorPorEixo = 2.00;

    private final int eixos;

    @Override
    public double calcularPedagio() {
        return valorBase + (valorPorEixo * eixos);
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }

    public Caminhao(int eixos) {
        this.eixos = eixos;
    }
}
