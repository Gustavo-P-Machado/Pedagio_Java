package model;

import util.RelatorioPedagio;

public class Carro implements Veiculo{

    private static final double valorBase = 5.00;

    @Override
    public double calcularPedagio() {
        return valorBase;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    public Carro() {
    }

}
