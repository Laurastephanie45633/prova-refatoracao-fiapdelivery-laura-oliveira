package br.com.fiapdelivery.model;

public class Moto extends Veiculo {

    private boolean temBau;

    //construtor
    public Moto(String placa, double capacidadeCarga, boolean temBau) {
        super(placa, capacidadeCarga); // repassa placa e capacidade para a superclasse
        this.temBau = temBau;
    }

    public boolean isTemBau() {
        return this.temBau;
    }

    public void setTemBau(boolean temBau) {
        this.temBau = temBau;
    }
}
