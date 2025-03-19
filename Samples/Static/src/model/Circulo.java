package model;

public class Circulo {
    private double raio;
    private String cor;
    public static final double pi = 3.14;

    public Circulo() {
    }

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getArea() {
        return pi * raio * raio;
    }

    public double getPerimetro() {
        return 2 * pi * raio;
    }

    public static void hello() {
        System.out.println("hello");
    }

    public static double calcularArea(double raio) {
        return pi * raio * raio;
    }

    // area = pi * r^2
    // perimetro = 2 * pi * r
}
