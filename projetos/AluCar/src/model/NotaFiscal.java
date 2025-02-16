package model;

public class NotaFiscal {

    private double custoBase;
    private double impostos;

    public NotaFiscal(double custoBase, double impostos) {
        this.custoBase = custoBase;
        this.impostos = impostos;
    }

    public NotaFiscal() {
    }

    public double getCustoBase() {
        return custoBase;
    }

    public void setCustoBase(double custoBase) {
        this.custoBase = custoBase;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public double getTotal() {
        return custoBase + impostos;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "custoBase=" + custoBase +
                ", impostos=" + impostos +
                ", total=" + getTotal() +
                '}';
    }
}
