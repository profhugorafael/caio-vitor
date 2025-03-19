import model.Circulo;

import static java.lang.Math.ceil;

public class App {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo();

        System.out.println(c1);
        System.out.println(args);

        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        System.out.println(Circulo.pi);
    }
}

