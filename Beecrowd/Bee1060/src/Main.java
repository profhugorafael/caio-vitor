import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 0;

        for (int i = 1; i <= 6; i++) {
            double valor = teclado.nextDouble();
            if (valor >= 0)
                contador++;

        }
        System.out.println(contador + " valores positivos");
    }

}


