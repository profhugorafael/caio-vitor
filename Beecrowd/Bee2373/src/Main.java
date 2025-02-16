import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static int quantidadeQuebrados(int latas, int copos) {

        if (latas > copos) {
            return copos;
        }

        return 0;
    }

    public static void main(String[] args) {

        int resultadoQuebrados = 0;

        Scanner teclado = new Scanner(System.in);

        int bandejas = teclado.nextInt();

        for (int i = 0; i < bandejas; i++) {

            int latas = teclado.nextInt();
            int copos = teclado.nextInt();

            int coposQuebrados = quantidadeQuebrados(latas, copos);

            resultadoQuebrados += coposQuebrados;
//            System.out.println("copos" + copos);
//            System.out.println("resultadoQuebrados" + resultadoQuebrados);
//            System.out.println(coposQuebrados);

        }

          System.out.println(resultadoQuebrados);
//        System.out.println(copos);
    }

}