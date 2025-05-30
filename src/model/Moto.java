package model;

import util.RelatorioPedagio;

public class Moto implements Veiculo{

    private static final double valorBase = 2.50;

    @Override
    public double calcularPedagio() {
        return valorBase;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }

    public Moto() {
    }
}
