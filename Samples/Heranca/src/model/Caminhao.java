package model;

public class Caminhao extends Veiculo {
    private int nroEixos;

    public Caminhao() {
    }

    public Caminhao(String placa, String modelo, String cor, int ano, int nroEixos) {
        super(placa, modelo, cor, ano);
        this.nroEixos = nroEixos;
    }

    public int getNroEixos() {
        return nroEixos;
    }

    public void setNroEixos(int nroEixos) {
        this.nroEixos = nroEixos;
    }
}
