import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        if (n <= 2) return;

        for (int i = 2; i <= 10000; i += n) {
            System.out.println(i);
        }

    }
}
