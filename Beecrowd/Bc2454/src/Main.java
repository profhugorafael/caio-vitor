import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double p = teclado.nextInt();
        double r = teclado.nextInt();

        if (p == 0)
            System.out.println("C");
        else if (r == 0)
            System.out.println("B");
        else
            System.out.println("A");





//        System.out.println("MEDIA = " + nota);
//        System.out.println("MEDIA = " + String.format("%.1f",nota));
//        System.out.printf("MEDIA = %.1f\n", nota);
    }
}