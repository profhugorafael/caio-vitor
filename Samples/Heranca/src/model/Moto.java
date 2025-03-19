package model;

public class Moto extends Veiculo {
    public int cilindrada;
    private boolean pezinhoLevantado;

    public Moto() {
    }

    public Moto(String placa, String modelo, String cor, int ano, int cilindrada, boolean pezinhoLevantado) {
        super(placa, modelo, cor, ano);
        this.cilindrada = cilindrada;
        this.pezinhoLevantado = pezinhoLevantado;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isPezinhoLevantado() {
        return pezinhoLevantado;
    }

    public void setPezinhoLevantado(boolean pezinhoLevantado) {
        this.pezinhoLevantado = pezinhoLevantado;
    }

    @Override
    public void ligar() {
        System.out.println("passou aqui");
        if(isPezinhoLevantado()){
            super.ligar();
        }
    }
}
