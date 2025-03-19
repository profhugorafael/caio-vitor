package entity;

public class Carro {

    // atributos (tem...)
    private String modelo;
    private String fabricante;
    private int ano;
    private String placa;
    private String dono;

    public Carro() {
    }

    public Carro(String modelo, String fabricante, int ano, String placa, String dono) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.placa = placa;
        this.dono = dono;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        String aux = "";

        aux += "Fabricante: " + fabricante + ", Modelo: " + modelo + " " + ano + "\n";
        aux += "Placa: " + placa + ", Dono: " + dono + "\n";

        return aux;
    }
}
