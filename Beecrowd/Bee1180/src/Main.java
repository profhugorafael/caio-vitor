import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int anterior = 0;
        int posicao = 0;
        int valor = 0;

        Scanner teclado = new Scanner(System.in);
        int quantidade = teclado.nextInt();

        int[] vetor = new int[quantidade];

        for (int i=0; i < quantidade; i++){
            int valores[i] = teclado.nextInt();

            if (valores[i] > anterior){
                valores[i] = anterior;
            } else {
                posicao = i;
                valor = valores[i];
            }

        }
        System.out.println("Menor valor:" + valor);
        System.out.println("Posicao:" + posicao);
    }
}