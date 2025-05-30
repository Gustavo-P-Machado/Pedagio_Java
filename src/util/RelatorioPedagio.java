package util;

public class RelatorioPedagio {
    private static int totalVeiculos = 0;
    private static double totalArrecadado = 0.0;

    public static void registrarPassagem(double valor) {
        totalVeiculos++;
        totalArrecadado += valor;
    }

    public static void exibirRelatorio() {

        String mensagemFinal = """
                ========== RELATÓRIO DO PEDÁGIO ==========
                Total de Veículos: %s
                Total Arrecadado: %s
                """.formatted(totalVeiculos, totalArrecadado);

        System.out.println(mensagemFinal);
    }
}
