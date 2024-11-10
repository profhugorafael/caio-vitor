import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer maior = null;
        int pos = -1;

        for (int i = 0; i < 100; i++) {
            int valorLido = teclado.nextInt();

            if(maior == null || valorLido > maior) {
                maior = valorLido;
                pos = i + 1;
            }
        }

        System.out.println(maior);
        System.out.println(pos);
    }
}