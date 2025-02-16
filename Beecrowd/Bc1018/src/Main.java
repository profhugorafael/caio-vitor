import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int valor = teclado.nextInt();
        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;

        System.out.println(valor);
        nota100 = valor / 100;
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        valor %= 100; //valor = valor % 100

        nota50 = valor / 50;
        System.out.println(nota50 +" nota(s) de R$ 50,00");
        valor %= 50;

        nota20 = valor / 20;
        System.out.println(nota20 +" nota(s) de R$ 20,00");
        valor %= 20;

        nota10 = valor / 10;
        System.out.println(nota10 +" nota(s) de R$ 10,00");
        valor %= 10;

        nota5 = valor / 5;
        System.out.println(nota5 +" nota(s) de R$ 5,00");
        valor %= 5;

        nota2 = valor / 2;
        System.out.println(nota2 +" nota(s) de R$ 2,00");
        valor %= 2;

        nota1 = valor / 1;
        System.out.println(nota1 +" nota(s) de R$ 1,00");
        valor %= 1;



//        System.out.println("MEDIA = " + nota);
//        System.out.println("MEDIA = " + String.format("%.1f",nota));
//        System.out.printf("MEDIA = %.1f\n", nota);
    }
}