package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {

    private int quantidadeEixos;
    
    public Caminhao(String placa, double capacidadeCarga, int quantidadeEixos) {
        super(placa, capacidadeCarga); // chama o construtor da superclasse Veiculo
        this.setQuantidadeEixos(quantidadeEixos);
    }

    public int getQuantidadeEixos() {
        return this.quantidadeEixos;
    }

    private void setQuantidadeEixos(int quantidadeEixos) {
        if (quantidadeEixos > 0) {
            this.quantidadeEixos = quantidadeEixos;
        } else {
            System.out.println("Erro: A quantidade de eixos deve ser maior que zero!");
            this.quantidadeEixos = 2; // valor padrão mínimo 
        }
    }
}