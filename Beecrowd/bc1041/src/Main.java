import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double x = teclado.nextDouble();
        double y = teclado.nextDouble();


        if (x > 0 && y > 0)
            System.out.println("Q1");
        else if (y > 0 && x < 0 )
            System.out.println("Q2");
        else if (y < 0 && x < 0)
            System.out.println("Q3");
        else if (y < 0 && x > 0)
            System.out.println("Q4");
        else if (y == 0 && x ==0)
            System.out.println("Origem");
        else if (x == 0)
            System.out.println("Eixo Y");
        else
            System.out.println("Eixo X");

//        System.out.printf("Total: R$ %.2f\n", conta);




//        System.out.println("MEDIA = " + nota);
//        System.out.println("MEDIA = " + String.format("%.1f",nota));
//        System.out.printf("MEDIA = %.1f\n", nota);
    }
}