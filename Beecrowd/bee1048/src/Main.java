import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double salario = teclado.nextDouble();
        double reajuste = 0;
        double salnovo  = 0;
        int percentual =0;

        if (salario <= 400.00 ) {
            reajuste = salario * (15.00 / 100.0);
            salnovo = salario + reajuste;
            percentual = 15;
//            System.out.println("Novo salario: "+String.format("%.2f",salnovo));
//            System.out.println("Reajuste ganho: "+String.format("%.2f",reajuste));
//            System.out.println("Em percentual: 15 %");
        } else if (salario >= 400.01 && salario <= 800.00) {
            reajuste = salario * (12.00 / 100.0);
            salnovo = salario + reajuste;
            percentual = 12;
//            System.out.println("Novo salario: "+String.format("%.2f",salnovo));
//            System.out.println("Reajuste ganho: "+String.format("%.2f",reajuste));
//            System.out.println("Em percentual: 12 %");
        } else if (salario >= 800.01 && salario <= 1200.00) {
            reajuste = salario * (10.00 / 100.0);
            salnovo = salario + reajuste;
            percentual = 10;
//            System.out.println("Novo salario: "+String.format("%.2f",salnovo));
//            System.out.println("Reajuste ganho: "+String.format("%.2f",reajuste));
//            System.out.println("Em percentual: 10 %");
        } else if (salario >= 120.01 && salario <= 2000.00) {
            reajuste = salario * (7.00 / 100.0);
            salnovo = salario + reajuste;
            percentual = 7;
//            System.out.println("Novo salario: "+String.format("%.2f",salnovo));
//            System.out.println("Reajuste ganho: "+String.format("%.2f",reajuste));
//            System.out.println("Em percentual: 7 %");
        } else {
            reajuste = salario * (4.00 / 100.0);
            salnovo = salario + reajuste;
            percentual = 4;
//            System.out.println("Novo salario: "+String.format("%.2f",salnovo));
//            System.out.println("Reajuste ganho: "+String.format("%.2f",reajuste));
//            System.out.println("Em percentual: 4 %");
        }

        System.out.println("Novo salario: " + String.format("%.2f",salnovo));
        System.out.println("Reajuste ganho: " + String.format("%.2f",reajuste));
        System.out.println("Em percentual: " + percentual + " %");




//        System.out.println("MEDIA = " + nota);
//        System.out.println("MEDIA = " + String.format("%.1f",nota));
//        System.out.printf("MEDIA = %.1f\n", nota);
    }
}