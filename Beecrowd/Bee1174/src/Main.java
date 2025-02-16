import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int conta =0;
        double[] vetor = new double[100];

        Scanner teclado = new Scanner(System.in);

        for (int i=0; i < 100; i++){
            vetor[i] = teclado.nextDouble();

            if (vetor[i] <= 10){
                System.out.println("A[" + i + "] = " + vetor[i]);
            }

        }
    }
}

