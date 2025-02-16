import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int m = teclado.nextInt();
        int n = teclado.nextInt();
        while (m > 0 && n > 0){
            int maior = Math.max(m, n);
            int menor = Math.min(m, n);

            int acumulador =0;


            for (int i = menor; i <= maior; i++){
                acumulador += i;
                System.out.print(i + " ");
            }

            System.out.println("Sum=" + acumulador);
            m = teclado.nextInt();
            n = teclado.nextInt();
        }

    }
}


        //        if (m > n){
//            menor = n;
//            maior = m;
//        }else{
//            menor = m;
//            maior = n;
//        }

//        if (m < n) {
//            for (int i = m; i <= n; i++){
//                acumulador += i;
////                System.out.println("VER o ACUMULADOR" + acumulador);
//                System.out.print(i + " ");
//            }
//        }else {
//            for (int i = n; i <= m; i++){
//                acumulador += i;
////                System.out.println("VER o ACUMULADOR" + acumulador);
//                System.out.print(i +" ");
//            }
//        }





