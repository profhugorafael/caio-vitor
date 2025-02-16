import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();


        for (int i = 2; i <= valor; i += 2) {
            System.out.println(i + "^2 = " + (i * i));
        }

    }
}



