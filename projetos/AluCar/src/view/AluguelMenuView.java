package menu;

import enums.Momento;
import model.Aluguel;
import model.Veiculo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class AluguelMenu {

    private DateTimeFormatter formatter;
    private Scanner teclado;

    public AluguelMenu() {
        this.teclado = new Scanner(System.in);
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    }

    public int escolherOpcao() {
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

    public LocalDateTime solicitarDataHora(Momento momento) {
        System.out.print("Digite um horario de " + momento.getValue() + " (DD/MM/AAAA hh:mm): ");
        String horaEmString = teclado.nextLine();
        return LocalDateTime.parse(horaEmString, formatter);
    }

    public double solicitarCustoPorHora() {
        System.out.print("Custo por hora: ");
        double custoPorHora = teclado.nextDouble();
        teclado.nextLine();
        return custoPorHora;
    }

    public double solicitarCustoPorDia() {
        System.out.print("Custo por dia: ");
        double custoPorDia = teclado.nextDouble();
        teclado.nextLine();
        return custoPorDia;
    }

    public String solicitarPlaca() {
        System.out.print("Placa: ");
        return teclado.nextLine();
    }

    public Veiculo solicitarNovoVeiculo() {
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

    public void mostrarVeiculo(Veiculo veiculo) {
        System.out.println(veiculo);
    }

    public void listarVeiculos(List<Veiculo> veiculos) {
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println("#" + (i+1) + " - " + veiculos.get(i));
        }
    }

    public Veiculo escolherVeiculo(List<Veiculo> veiculos) {
        System.out.println("Escolha um dos veiculo abaixo");
        listarVeiculos(veiculos);

        int indexVeiculoEscolhido = teclado.nextInt();
        teclado.nextLine();
        return veiculos.get(indexVeiculoEscolhido - 1);
    }
}
