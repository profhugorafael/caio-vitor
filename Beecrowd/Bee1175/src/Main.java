import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[20];

        Scanner teclado = new Scanner(System.in);

        for (int i=0; i < 20; i++){   // 0 1 2 3 4
            vetor[i] = teclado.nextInt();
        }

        for (int i=19; i >= 0; i--){

            System.out.println("N["  + (19-i) + "] = " + vetor[i] );
        }

    }
}



