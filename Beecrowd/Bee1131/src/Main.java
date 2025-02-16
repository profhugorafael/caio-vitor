import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int empate = 0;
        int vitInter = 0;
        int vitGremio = 0;
        int jogos = 0;
        int opcao = 0;
        String vencedor = " ";

        do {
            int inter = teclado.nextInt();
            int gremio = teclado.nextInt();

            if (inter == gremio) {
                empate++;
            } else if (inter < gremio) {
                vitGremio++;
            } else {
                vitInter++;
            }

            jogos++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = teclado.nextInt();


        } while (opcao == 1);

//        if (inter == gremio) {
//            empate++;
//        } else if (inter < gremio) {
//            vitGremio++;
//        } else {
//            vitInter++;
//        }
//
//        jogos++;
//
//        System.out.println("Novo grenal (1-sim 2-nao)");
//        int opcao = teclado.nextInt();
//
////        System.out.println("JOGO" + opcao);
//
//        while (opcao == 1) {
//            inter = teclado.nextInt();
//            gremio = teclado.nextInt();
//
//            if (inter == gremio) {
//                empate++;
//            } else if (inter < gremio) {
//                vitGremio++;
//            } else {
//                vitInter++;
//            }
//
//            jogos++;
//
//            opcao = teclado.nextInt();
//            if (opcao == 1) {
//                System.out.println("Novo grenal (1-sim 2-nao)");
//            }
//
////        System.out.println("JOGO WHILE" + opcao);
//
//        }

        if (vitGremio < vitInter) {
            vencedor = "Inter";
        } else {
            vencedor = "Gremio";
        }

//        System.out.println("Novo grenal (1-sim 2-nao)");
        System.out.println(jogos + " grenais");
        System.out.println("Inter:" + vitInter);
        System.out.println("Gremio:" + vitGremio);
        System.out.println("Empates:" + empate);
        System.out.println(vencedor + " venceu mais");

    }
}