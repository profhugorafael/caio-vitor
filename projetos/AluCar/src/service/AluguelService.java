package service;

import enums.Momento;
import menu.AluguelMenu;
import model.Aluguel;
import model.Veiculo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class AluguelService {

    // SOLID

    private static double calcularCustoBase(Aluguel aluguel, double custoPorHora, double custoPorDia) {
        Duration duracao = Duration.between(aluguel.getInicio(), aluguel.getFim());
        double horas = Math.ceil(duracao.toMinutes()/60.0);
        double dias = Math.ceil(duracao.toHours()/24.0);

        if(horas <= 12.0) {
            return horas * custoPorHora;
        }

        return  dias * custoPorDia;
    }

    private static double calcularImposto(double custoBase) {
        double TAXA_IMPOSTO = 0.1;
        return custoBase * TAXA_IMPOSTO;
    }

    public static void simularAluguel(List<Veiculo> veiculos) {

        Veiculo veiculoEscolhido = AluguelMenu.escolherVeiculo(veiculos);

        double custoPorHora = AluguelMenu.solicitarCustoPorHora();
        double custoPorDia = AluguelMenu.solicitarCustoPorDia();

        LocalDateTime inicio = AluguelMenu.solicitarDataHora(Momento.INICIO);
        LocalDateTime termino = AluguelMenu.solicitarDataHora(Momento.TERMINO);

        Aluguel aluguelSimulado = new Aluguel(inicio, termino, veiculoEscolhido);

        // ate 12h: custo na hora e depois custo na diaria
        double custoBase = calcularCustoBase(aluguelSimulado, custoPorHora, custoPorDia);
        // imposto fixo de 10%
        double imposto = calcularImposto(custoBase);

        aluguelSimulado.preencherNotaFiscal(custoBase, imposto);

        System.out.println(aluguelSimulado);
    }
}
