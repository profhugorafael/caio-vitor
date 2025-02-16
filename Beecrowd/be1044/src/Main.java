import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int conta = 0;
        int resto = 0;
        int restob = 0;
        int contab = 0;

        conta = a * 100;

        resto = conta / 3;

        conta = b * 100;

        restob = contab / 3;

        if (resto == 0 && restob 0){
            System.out.println("Sao Multiplos");
        }   else {
            System.out.println("Nao sao Multiplos");
        }

//        valor %= 100; //valor = valor % 100
//
//        nota50 = valor / 50;
//        System.out.println(nota50 +" nota(s) de R$ 50,00");
//        valor %= 50;

//        System.out.println(valor);
//        nota100 = valor / 100;
//        System.out.println(nota100 + " nota(s) de R$ 100,00");
//        valor %= 100; //valor = valor % 100



//        System.out.println("MEDIA = " + nota);
//        System.out.println("MEDIA = " + String.format("%.1f",nota));
//        System.out.printf("MEDIA = %.1f\n", nota);
    }
}

