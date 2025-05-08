package menu;

import enums.Momento;
import model.Veiculo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class AluguelMenu {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private static Scanner teclado = new Scanner(System.in);;

    public static int escolherOpcao() {
        System.out.println("1 - Novo Veiculo");
        System.out.println("2 - Buscar pela Placa");
        System.out.println("3 - Listar TODOS");
        System.out.println("4 - Simular aluguel de veiculo");
        System.out.println("0 - Sair do MENU");
        System.out.print("Digite sua OPÇÃO ? ");

        int opcao = teclado.nextInt();
        teclado.nextLine();

        return opcao;
    }

    public static LocalDateTime solicitarDataHora(Momento momento) {
        System.out.print("Digite um horario de " + momento.getValue() + " (DD/MM/AAAA hh:mm): ");
        String horaEmString = teclado.nextLine();
        return LocalDateTime.parse(horaEmString, formatter);
    }

    public static double solicitarCustoPorHora() {
        System.out.print("Custo por hora: ");
        double custoPorHora = teclado.nextDouble();
        teclado.nextLine();
        return custoPorHora;
    }

    public static double solicitarCustoPorDia() {
        System.out.print("Custo por dia: ");
        double custoPorDia = teclado.nextDouble();
        teclado.nextLine();
        return custoPorDia;
    }

    public static String solicitarPlaca() {
        System.out.print("Placa: ");
        return teclado.nextLine();
    }

    public static Veiculo solicitarNovoVeiculo() {
        System.out.print("Placa: ");
        String placa = teclado.nextLine();
        System.out.print("Modelo: ");
        String modelo = teclado.nextLine();
        System.out.print("ano: ");
        int ano = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Cor: ");
        String cor = teclado.nextLine();
        System.out.print("Observacoes: ");
        String observacoes = teclado.nextLine();

        return new Veiculo(placa, modelo, ano, cor, observacoes);
    }

    public static void mostrarVeiculo(Veiculo veiculo) {
        System.out.println(veiculo);
    }

    public static void listarVeiculos(List<Veiculo> veiculos) {
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println("#" + (i+1) + " - " + veiculos.get(i));
        }
    }

    public static Veiculo escolherVeiculo(List<Veiculo> veiculos) {
        System.out.println("Escolha um dos veiculo abaixo");
        listarVeiculos(veiculos);

        int indexVeiculoEscolhido = teclado.nextInt();
        teclado.nextLine();
        return veiculos.get(indexVeiculoEscolhido - 1);
    }
}
