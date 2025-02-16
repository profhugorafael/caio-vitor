package model;

import java.time.LocalDateTime;

public class Aluguel {
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Veiculo veiculo; // tem um veiculo associado ao aluguel
    private NotaFiscal notaFiscal;

    public Aluguel(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo) {
        this.inicio = inicio;
        this.fim = fim;
        this.veiculo = veiculo;
    }

    public Aluguel() {
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void preencherNotaFiscal(double custoBase, double imposto) {
        this.notaFiscal = new NotaFiscal(custoBase, imposto);
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "inicio=" + inicio +
                ", fim=" + fim +
                ", veiculo=" + veiculo +
                ", Nota Fiscal=" + notaFiscal +
                '}';
    }

}
