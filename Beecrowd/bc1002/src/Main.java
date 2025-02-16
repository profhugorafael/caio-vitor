import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double raio = teclado.nextDouble();
        double n = 3.14159;

        double area = n * Math.pow(raio, 2);

        System.out.println("A=" + String.format("%.4f",area));
    }
}


//        System.out.println("MEDIA = " + nota);
//        System.out.println("MEDIA = " + String.format("%.1f",nota));
//        System.out.printf("MEDIA = %.1f\n", nota);