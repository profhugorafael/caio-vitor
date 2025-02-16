import menu.AluguelMenu;
import model.Aluguel;
import model.NotaFiscal;
import model.Veiculo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static Veiculo lerVeiculo(Scanner teclado) {
        System.out.print("Placa: ");
        String placa = teclado.nextLine();
        System.out.print("Modelo: ");
        String modelo = teclado.nextLine();
        System.out.print("ano: ");
        int ano = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Cor: ");
        String cor = teclado.nextLine();


        return new Veiculo(placa, modelo, ano, cor);
    }

    public static boolean buscarVeiculoPelaPlaca(Veiculo[] veiculos, String placa) {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null) {
                if (placa.equals(veiculos[i].getPlaca())) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void listarTodos(Veiculo[] veiculos) {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null) {
                System.out.println("#" + (i+1) + " - " + veiculos[i]);
            }
        }
    }

    public static double calcularCustoBase(Aluguel aluguel, double custoPorHora, double custoPorDia) {
        Duration duracao = Duration.between(aluguel.getInicio(), aluguel.getFim());
        double horas = Math.ceil(duracao.toMinutes()/60.0);
        double dias = Math.ceil(duracao.toHours()/24.0);

        if(horas <= 12.0) {
            return horas * custoPorHora;
        }

        return  dias * custoPorDia;
    }

    public static double calcularImposto(double custoBase) {
        double TAXA_IMPOSTO = 0.1;
        return custoBase * TAXA_IMPOSTO;
    }

    public static void simularAluguel(Scanner teclado, Veiculo[] veiculos) {
        // TODO: escolher um dos veiculos disponiveis
        System.out.println("Escolha um dos veiculo abaixo");
        listarTodos(veiculos);

        System.out.print("Digite o numero do veiculo que deseja alugar: ");
        int indexVeiculoEscolhido = teclado.nextInt();
        teclado.nextLine();
        Veiculo veiculoEscolhido = veiculos[indexVeiculoEscolhido - 1];

        // TODO: informar o custo por hora e por diaria
        System.out.print("Custo por hora: ");
        double custoPorHora = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("Custo por dia: ");
        double custoPorDia = teclado.nextDouble();
        teclado.nextLine();

        // TODO: informar hora de inicio e termino esperadas
        // dd/MM/YYYY hh:mm

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime inicio = AluguelMenu.solicitarHoraInicio();

        System.out.print("Digite o termino (DD/MM/AAAA hh:mm): ");
        String terminoTexto = teclado.nextLine();
        LocalDateTime termino = LocalDateTime.parse(terminoTexto, formatter);

        // TODO: criar objeto aluguel

        Aluguel aluguelSimulado = new Aluguel(inicio, termino, veiculoEscolhido);

        // TODO: calcular o custo base do aluguel
        // ate 12h: custo na hora e depois custo na diaria
        double custoBase = calcularCustoBase(aluguelSimulado, custoPorHora, custoPorDia);
        // imposto fixo de 10%
        double imposto = calcularImposto(custoBase);

        // TODO: colocar nota fiscal no aluguel
        aluguelSimulado.preencherNotaFiscal(custoBase, imposto);

        System.out.println(aluguelSimulado);
    }

    public static void menu() {
        System.out.println("1 - Novo Veiculo");
        System.out.println("2 - Buscar pela Placa");
        System.out.println("3 - Listar TODOS");
        System.out.println("4 - Simular aluguel de veiculo");
        System.out.println("0 - Sair do MENU");
        System.out.print("Digite sua OPÇÃO ? ");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Veiculo[] veiculos = new Veiculo[1000];
        Aluguel[] alugueis = new Aluguel[1000];

        int posicaoVazia = 0;

        menu();
        int opcao = teclado.nextInt();
        teclado.nextLine();

        while (opcao != 0) {
            switch (opcao) {
                case 1 -> {
                    veiculos[posicaoVazia] = lerVeiculo(teclado);
                    posicaoVazia++;
                }
                case 2 -> {
                    System.out.print("Placa: ");
                    String placa = teclado.nextLine();

                    if (buscarVeiculoPelaPlaca(veiculos, placa)) {
                        System.out.println("Placa encontrada no SISTEMA !!! ");
                    } else {
                        System.out.println("Placa Não Encontrado no SISTEMA !!! ");
                    }
                }
                case 3 -> listarTodos(veiculos);
                case 4 -> simularAluguel(teclado, veiculos);
            }

            menu();
            opcao = teclado.nextInt();
            teclado.nextLine();

        }
    }
}

//        String placa = teclado.nextLine();
//        Veiculo v1 = lerVeiculo(teclado);

//        boolean encontrado = false;

//        veiculos[0] = lerVeiculo(teclado);
//        veiculos[1] = lerVeiculo(teclado);
//        veiculos[2] = lerVeiculo(teclado);

//       Veiculo[] veiculos = {
////               new Veiculo("ABC","Fusca",1960,"Branco"),
////               new Veiculo("DEF","Kombi",1970,"Preta"),
////               new Veiculo("ZXM","KA",1999,"Azul"),
//       };


//       for (int i=0;i<veiculos.length;i++) {
//           if (veiculos[i] != null) {
//                if (placa.equals(veiculos[i].getPlaca()) ) {
//                    encontrado = true;
//                }
//           }
//       }

//       if (buscarVeiculoPelaPlaca(veiculos, placa)) {
//           System.out.println("Placa encontrada no SISTEMA !!! ");
//       } else {
//           System.out.println("Placa Não Encontrado no SISTEMA !!! ");
//       }
