package menu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AluguelMenu {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private static Scanner teclado;

    public static LocalDateTime solicitarHoraInicio() {
        System.out.print("Digite o inicio (DD/MM/AAAA hh:mm): ");
        String inicioTexto = teclado.nextLine();
        LocalDateTime inicio = LocalDateTime.parse(inicioTexto, formatter);
        return inicio;
    }
}
