import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double ddd = teclado.nextInt();

        if (ddd == 11)
            System.out.println("Sao Paulo");
        else if (ddd == 21 )
            System.out.println("Rio de Janeiro");
        else if (ddd == 32)
            System.out.println("Juiz de Fora");
        else if (ddd == 19)
            System.out.println("Campinas");
        else if (ddd == 27)
            System.out.println("Vitoria");
        else if (ddd == 31)
            System.out.println("BH");
        else if (ddd == 61)
            System.out.println("Brasilia");
        else if (ddd == 71)
            System.out.println("Salvador");
        else
            System.out.println("DDD nao cadastrado");

//        System.out.printf("Total: R$ %.2f\n", conta);




//        System.out.println("MEDIA = " + nota);
//        System.out.println("MEDIA = " + String.format("%.1f",nota));
//        System.out.printf("MEDIA = %.1f\n", nota);
    }
}