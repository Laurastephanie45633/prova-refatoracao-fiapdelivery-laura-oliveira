package br.com.fiapdelivery.model;

//Superclasse Veículo no sistema de logística

public class Veiculo {

    private String placa;
    private double capacidadeCarga;

    //Construtor do Veículo
    public Veiculo(String placa, double capacidadeCarga) {
        this.setPlaca(placa);
        this.setCapacidadeCarga(capacidadeCarga);
    }

    // Getters públicos para leitura segura
    public String getPlaca() {
        return this.placa;
    }

    public double getCapacidadeCarga() {
        return this.capacidadeCarga;
    }

    // Setters privados com validação de regras de negócio
    private void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Erro: Placa não pode ser nula ou vazia!");
            this.placa = "INDETERMINADA";
        }
    }

    private void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga >= 0) {
            this.capacidadeCarga = capacidadeCarga;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir capacidade de carga negativa (" + capacidadeCarga + " kg) foi bloqueada!");
            this.capacidadeCarga = 0.0;
        }
    }
}
