import java.util.Scanner;

public class Main {

    public static String feedback(int codigoFeedback) {
        if(codigoFeedback == 1) {
            return "Rolien";
        } else if (codigoFeedback == 2) {
            return "Naej";
        } else if (codigoFeedback == 3) {
            return "Elehcim";
        } else {
            return "Odranoel";
        }
    }

    public static void apresentarFeedbackPorDias(int totalDeDias, Scanner teclado) {
        for (int i = 0; i < totalDeDias; i++) {
            int codigoFeedback = teclado.nextInt();
            String mensagemFeedback = feedback(codigoFeedback);
            System.out.println(mensagemFeedback);
        }
    }

    public static void main(String[] args) {

        // conseguir mostrar 1 feedback
        // mostrar varios dias feedback
        // mostrar grupos de dias de feedback

        Scanner teclado = new Scanner(System.in);

        int quantidadedeGruposDias = teclado.nextInt();

        for (int i = 0; i < quantidadedeGruposDias; i++) {
            int totalDeDias = teclado.nextInt();
            apresentarFeedbackPorDias(totalDeDias, teclado);
        }

    }
}