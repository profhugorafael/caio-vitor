import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double codigo = teclado.nextInt();
        double quantidade = teclado.nextInt();
        double conta = 0;

        if (codigo == 1)
            conta = ( 4 * quantidade);
        else if (codigo ==2)
            conta = (4.5 * quantidade);
        else if (codigo == 3)
            conta = (5 * quantidade);
        else if (codigo == 4)
            conta = (2 * quantidade);
        else
            conta = (1.5 * quantidade);

        System.out.printf("Total: R$ %.2f\n", conta);




//        System.out.println("MEDIA = " + nota);
//        System.out.println("MEDIA = " + String.format("%.1f",nota));
//        System.out.printf("MEDIA = %.1f\n", nota);
    }
}