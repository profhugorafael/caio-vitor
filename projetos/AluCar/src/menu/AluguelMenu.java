package menu;

import enums.Momento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AluguelMenu {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private static Scanner teclado = new Scanner(System.in);;

    public static void mostrarMenu() {
        System.out.println("1 - Novo Veiculo");
        System.out.println("2 - Buscar pela Placa");
        System.out.println("3 - Listar TODOS");
        System.out.println("4 - Simular aluguel de veiculo");
        System.out.println("0 - Sair do MENU");
        System.out.print("Digite sua OPÇÃO ? ");
    }

    public static LocalDateTime solicitarDataHora(Momento momento) {
        System.out.print("Digite um horario de " + momento.getValue() + " (DD/MM/AAAA hh:mm): ");
        String horaEmString = teclado.nextLine();
        return LocalDateTime.parse(horaEmString, formatter);
    }
}
