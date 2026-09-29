package br.com.fiapdelivery.model;

//associa um pacote a um veiculo (aceita caminhao, moto ou qualquer outra subclasse de Veiculo)

public class Rota {

    private Pacote pacote;
    private Veiculo veiculoDesignado;

    // o construtor que exige tanto o pacote quanto o veículo para que a rota exista

    public Rota(Pacote pacote, Veiculo veiculoDesignado) {
        if (pacote == null || veiculoDesignado == null) {
            throw new IllegalArgumentException("Erro: Uma Rota exige um Pacote e um Veículo válidos!");
        }
        this.pacote = pacote;
        this.veiculoDesignado = veiculoDesignado;
    }

    public Pacote getPacote() {
        return this.pacote;
    }

    public Veiculo getVeiculoDesignado() {
        return this.veiculoDesignado;
    }

    //executa a rota exibindo as informações 

    public void executarRota() {
        System.out.println("Executando Rota: Levando pacote " + this.pacote.getCodigoRastreio() + " (Peso: " + this.pacote.getPeso() + " kg) no veículo de placa " 
         + this.veiculoDesignado.getPlaca()  + " [Capacidade: " + this.veiculoDesignado.getCapacidadeCarga() + " kg]");
    }
}