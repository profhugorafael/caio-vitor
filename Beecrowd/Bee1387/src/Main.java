import java.util.Scanner;

public class Main {

    public static void contaFilhos(int l, int r) {
        int soma = l + r;
        System.out.println(soma);
    }

    public static void main(String[] args) {

        // soma e mostrar os filhos
        // repetir ate digitar 0 0

        Scanner teclado = new Scanner(System.in);

        int l = teclado.nextInt();
        int r = teclado.nextInt();

        while(l != 0 && r != 0) {
            contaFilhos(l, r);

            l = teclado.nextInt();
            r = teclado.nextInt();
        }

    }
}