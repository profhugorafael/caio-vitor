import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        Scanner teclado = new Scanner(System.in);

        for (int i=0; i < 10; i++){
            vetor[i] = teclado.nextInt();

            if (vetor[i] <= 0){
                vetor[i] = 1;
            }

            System.out.println("X[" + i + "] = " + vetor[i]);
        }
    }
}

