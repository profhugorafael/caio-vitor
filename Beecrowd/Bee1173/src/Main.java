import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int conta =0;
        int[] vetor = new int[10];

        Scanner teclado = new Scanner(System.in);
        vetor[0] = teclado.nextInt();

        System.out.println("N[" + 0 + "] = " + vetor[0]);

        for (int i=1; i < 10; i++){
//            vetor[i] = teclado.nextInt();

            vetor[i] = vetor[i-1] * 2;

            System.out.println("N[" + i + "] = " + vetor[i]);

        }
    }
}

