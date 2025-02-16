import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int contadorin  = 0;
        int contadorout = 0;

        for (int i = 1; i <= 100; i++) {
            int valor = teclado.nextInt();
            if (valor >= 10 || valor <= 20) {
                contadorin++;
            } else {
                contadorout++;
            }

        }
        System.out.println(contadorin + " in");
        System.out.println(contadorout + " out");
    }

}


