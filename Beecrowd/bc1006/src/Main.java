import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();

        double nota = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

//        System.out.println("MEDIA = " + nota);
//        System.out.println("MEDIA = " + String.format("%.1f",nota));
        System.out.printf("MEDIA = %.1f\n", nota);
    }
}