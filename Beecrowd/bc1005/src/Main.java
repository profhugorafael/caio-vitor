import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a = teclado.nextDouble();
        double b = teclado.nextDouble();

        double nota = (a * 3.5 + b * 7.5) / 11;

        System.out.println("MEDIA = " + String.format("%.5f",nota));
    }
}


//        System.out.println("MEDIA = " + nota);
//        System.out.println("MEDIA = " + String.format("%.1f",nota));
//        System.out.printf("MEDIA = %.1f\n", nota);